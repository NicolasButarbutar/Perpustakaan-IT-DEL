package model;
import java.util.ArrayList;

public abstract class User implements Peminjam {
    protected String id;
    protected String nama;
    protected ArrayList<Buku> koleksiPinjaman; // 

    public User(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.koleksiPinjaman = new ArrayList<>();
    }

    // Materi 09: Method abstrak yang wajib diisi oleh kelas turunan
    public abstract void tampilkanInfo();

    public String getNama() { return nama; }
    public String getId() { return id; }
    public ArrayList<Buku> getKoleksi() { return koleksiPinjaman; }
}