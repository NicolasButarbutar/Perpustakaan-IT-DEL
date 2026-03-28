package driver;

import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpusITDel = new Perpustakaan();

        System.out.println("===========================================");
        System.out.println("Sistem Perpustakaan Institut Teknologi Del");
        System.out.println("===========================================");

        System.out.print("Masukkan NIM  : "); String nim = scanner.nextLine();
        System.out.print("Masukkan Nama : "); String nama = scanner.nextLine();

        User userAktif = new Mahasiswa(nim, nama);
        System.out.println("\nLogin berhasil! Selamat datang, " + userAktif.getNama());

        boolean running = true;
        while (running) {
            try {
                System.out.println("\n--- MENU LAYANAN ---");
                System.out.println("1. Lihat Katalog Buku");
                System.out.println("2. Pinjam Buku");
                System.out.println("3. Kembalikan Buku");
                System.out.println("4. Status Pinjaman Saya");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1-5): ");
                
                int pil = Integer.parseInt(scanner.nextLine());

                switch (pil) {
                    case 1: 
                        perpusITDel.tampilkanKatalog(); 
                        break;
                    
                    case 2: // PINJAM
                        System.out.print("Masukkan Judul Buku: ");
                        String judulPinjam = scanner.nextLine();
                        Buku bPinjam = perpusITDel.cariBukuBerdasarkanJudul(judulPinjam);
                        
                        if (bPinjam != null) {
                            if (userAktif.bisaPinjam() && bPinjam.getStok() > 0) {
                                userAktif.getKoleksi().add(bPinjam);
                                bPinjam.kurangiStok();
                                System.out.println("[+] Berhasil meminjam buku!");
                            } else {
                                System.out.println("[-] Gagal: Kuota penuh atau stok habis.");
                            }
                        } else {
                            System.out.println("[-] Buku tidak ditemukan.");
                        }
                        break;

                    case 3: // KEMBALIKAN (Fitur Baru)
                        System.out.print("Masukkan Judul Buku yang dikembalikan: ");
                        String judulKembali = scanner.nextLine();
                        
                        // Cari buku di koleksi user dulu
                        Buku bKembali = null;
                        for (Buku bk : userAktif.getKoleksi()) {
                            if (bk.getJudul().equalsIgnoreCase(judulKembali)) {
                                bKembali = bk;
                                break;
                            }
                        }

                        if (bKembali != null) {
                            // Panggil method di Mahasiswa untuk hapus dari list
                            ((Mahasiswa)userAktif).kembalikanBuku(bKembali);
                            bKembali.tambahStok(); // Tambah stok di katalog
                            System.out.println("[+] Buku berhasil dikembalikan. Terima kasih!");
                        } else {
                            System.out.println("[-] Anda tidak sedang meminjam buku tersebut.");
                        }
                        break;

                    case 4: // STATUS
                        userAktif.tampilkanInfo();
                        System.out.println("Daftar buku yang Anda bawa:");
                        if (userAktif.getKoleksi().isEmpty()) System.out.println("- (Kosong)");
                        for (Buku bk : userAktif.getKoleksi()) {
                            System.out.println("- " + bk.getJudul());
                        }
                        break;

                    case 5: 
                        running = false; 
                        System.out.println("Terima kasih telah mengunjungi Perpustakaan IT DEL.");
                        break;

                    default:
                        System.out.println("[!] Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[!] Masukkan angka untuk memilih menu!");
            }
        }
        scanner.close();
    }
}