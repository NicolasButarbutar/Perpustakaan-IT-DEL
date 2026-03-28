package model;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> katalogBuku = new ArrayList<>();

    public Perpustakaan() {
        katalogBuku.add(new Buku("Jaringan Komputer", "Jarkom", 10));
        katalogBuku.add(new Buku("Aljabar Linear", "Aljali", 1));
        katalogBuku.add(new Buku("Pemrograman Berorientasi Objek", "PBO", 29));
        katalogBuku.add(new Buku("Sistem Operasi", "SISOP", 8));
        katalogBuku.add(new Buku("UI/UX", "UIUX", 15));
        katalogBuku.add(new Buku("Analisis dan Perancangan Sistem", "Anaprancis", 14));
    }

    public Buku cariBukuBerdasarkanJudul(String judul) {
        for (Buku b : katalogBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) return b;
        }
        return null;
    }

    public void tampilkanKatalog() {
        System.out.println("\n=== KATALOG BUKU PERPUSTAKAAN IT DEL ===");
        for (Buku b : katalogBuku) {
            System.out.println("- [" + b.getKategori() + "] " + b.getJudul() + " (Stok: " + b.getStok() + ")");
        }
    }
}