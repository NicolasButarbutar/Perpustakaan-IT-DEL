package model;

public class Buku {
    private String judul;
    private String kategori; // Tambahkan ini
    private int stok;

    // Constructor harus menerima 3 parameter: Judul, Kategori, Stok
    public Buku(String judul, String kategori, int stok) {
        this.judul = judul;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String getJudul() { return judul; }
    public String getKategori() { return kategori; } // Tambahkan ini
    public int getStok() { return stok; }

    public void kurangiStok() { if (stok > 0) stok--; }
    public void tambahStok() { stok++; }
}