package model;

import java.util.ArrayList;

public class Mahasiswa extends User {
    private final int LIMIT_PINJAM = 2;

    public Mahasiswa(String nim, String nama) {
        super(nim, nama);
    }

    @Override
    public boolean bisaPinjam() {
        return koleksiPinjaman.size() < LIMIT_PINJAM;
    }

    // Method baru untuk mengembalikan buku
    public boolean kembalikanBuku(Buku buku) {
        if (koleksiPinjaman.contains(buku)) {
            koleksiPinjaman.remove(buku);
            return true;
        }
        return false;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Tipe: Mahasiswa] NIM: " + id + " | Nama: " + nama);
    }
}