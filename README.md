# 📚 Sistem Perpustakaan Institut Teknologi Del (Full 13 Materi OOP)

Aplikasi berbasis teks (CLI) menggunakan Java untuk mengelola sistem peminjaman buku di perpustakaan Institut Teknologi Del. Sistem ini dirancang dengan Layered Architecture (Arsitektur Berlapis) untuk mengimplementasikan 13 materi inti Object-Oriented Programming (OOP) dan Software Engineering, termasuk penerapan Inheritance, Abstract Class, Interface, hingga penanganan Exception.

> Sebuah aplikasi *Command Line Interface* (CLI) yang menyimulasikan sistem manajemen perpustakaan kampus IT Del dengan implementasi lengkap prinsip **Object-Oriented Programming (OOP)**.

---

## ✨ Fitur Utama

1.  **Sesi Login Mahasiswa:** Masuk menggunakan NIM dan Nama untuk personalisasi sesi.
2.  **Katalog Buku Dinamis:** Menampilkan daftar buku berdasarkan kategori dan sisa stok fisik.
3.  **Peminjaman Cerdas (Borrowing):** * Validasi kuota maksimal (Mahasiswa maksimal 2 buku).
    * Validasi stok fisik (Mencegah peminjaman jika stok habis).
4.  **Pengembalian Buku (Returning):** Mengembalikan buku yang dibawa, yang secara otomatis memulihkan stok di katalog.
5.  **Status Real-time:** Memantau daftar buku yang sedang dipinjam oleh user aktif.
6.  **Keamanan Input:** Menggunakan *Exception Handling* agar program tidak *crash* saat salah memasukkan angka menu.

---

## 🛠️ Implementasi 13 Materi OOP

Proyek ini dirancang khusus untuk memenuhi seluruh capaian pembelajaran materi Java:

| Materi | Implementasi dalam Kode |
| :--- | :--- |
| **04 - Encapsulation** | Penggunaan akses `private` dan `Getter/Setter` pada kelas `Buku`. |
| **05 - Inheritance** | Kelas `Mahasiswa` mewarisi sifat dari kelas abstrak `User`. |
| **06 - Polymorphism** | *Method Overriding* pada fungsi `bisaPinjam()` dan *Casting* objek. |
| **08 - Exception Handling** | Penggunaan `try-catch` untuk menangani `NumberFormatException`. |
| **09 - Abstract Class** | Kelas `User` didefinisikan sebagai `abstract` (tidak bisa diinstansiasi). |
| **10 - Interface** | Penggunaan `interface Peminjam` sebagai kontrak standar sistem. |
| **13 - Collections** | Penggunaan `java.util.ArrayList` untuk mengelola Katalog dan Koleksi. |

---

## 📂 Struktur Proyek

```text
SistemPerpusDel/
├── bin/                         # File hasil kompilasi (.class)
└── src/
    ├── model/                   # Package Logika & Blueprint
    │   ├── Peminjam.java        (Interface - Materi 10)
    │   ├── User.java            (Abstract Class - Materi 09)
    │   ├── Mahasiswa.java       (Inheritance - Materi 05)
    │   ├── Buku.java            (Encapsulation - Materi 04)
    │   └── Perpustakaan.java    (Manager Katalog)
    └── driver/                  # Package Eksekusi
        └── Main.java            (Entry Point & Driver)
```

---

## ⚙️ Persyaratan

- Java Development Kit (JDK) 8 atau versi lebih baru.
- Shell: Command Prompt, PowerShell, Git Bash, WSL, atau terminal lain yang mendukung `make` (untuk Makefile).

Verifikasi:

```bash
javac -version
java -version
```

---

## ▶️ Cara Menjalankan Manual

1. Dari folder root proyek:

```bash
javac -d bin src/model/*.java src/driver/*.java
java -cp bin driver.Main
```

2. Jalankan dengan Makefile (direkomendasikan):

```bash
make
make run
make clean
```

---

## 🛠️ Makefile (otomatisasi build/run)

Gunakan file `Makefile` untuk:
- `make` / `make all` → compile kode Java ke `bin`
- `make run` → compile + jalankan `driver.Main`
- `make clean` → hapus hasil kompilasi

---

## 🧪 Contoh Interaksi (CLI)

<details>
<summary><b>Klik untuk membuka contoh jalannya program</b></summary>

```
===========================================
Selamat Datang di Sistem Perpustakaan IT Del
===========================================

[Sesi Login Mahasiswa]
Masukkan NIM Anda  : 11424001
Masukkan Nama Anda : Nicolas J Grace Butarbutar

Login berhasil! Selamat datang, Nicolas J Grace Butarbutar.

Menu Pilihan:
1. Lihat Katalog Buku
2. Pinjam Buku
3. Kembalikan Buku
4. Lihat Status Pinjaman Saya
5. Keluar Aplikasi
Pilih (1-5): 1

=== KATALOG BUKU PERPUSTAKAAN IT DEL ===
- [Networking] Jaringan Komputer Lanjut (Stok: 2)
- [Statistika] Probabilitas dan Statistika Terapan (Stok: 1)
- [Programming] Pemrograman Berorientasi Objek Java (Stok: 3)
========================================

Menu Pilihan:
1. Lihat Katalog Buku
2. Pinjam Buku
3. Kembalikan Buku
4. Lihat Status Pinjaman Saya
5. Keluar Aplikasi
Pilih (1-5): 2

Masukkan persis judul buku yang ingin dipinjam: Jaringan Komputer Lanjut
[+] Berhasil meminjam: Jaringan Komputer Lanjut
```

</details>

---

## 🤝 Kontribusi

1. Fork repo.
2. `git checkout -b feature/nama-fitur`.
3. Tambah fitur, test, commit.
4. Push dan buka PR.

---

## 📌 Catatan

- Jika ingin tambah fitur: denda hilang waktu keterlambatan, sistem notifikasi, atau UI GUI.
- Diutamakan clean code dan dokumentasi.
