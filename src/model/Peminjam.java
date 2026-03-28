package model;

public interface Peminjam {
    // Kontrak: Setiap peminjam harus memiliki pengecekan kuota
    boolean bisaPinjam(); 
}