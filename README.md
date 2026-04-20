# 🎮 Java OOP: RPG Character Simulator

Proyek ini adalah simulasi karakter game RPG berbasis teks (CLI) yang dikembangkan menggunakan Java. Proyek ini dibuat untuk memenuhi tugas Ujian Tengah Semester (UTS) mata kuliah *Object-Oriented Programming* (OOP), dengan fokus pada implementasi *state management* dan arsitektur kelas yang bersih.

## 🚀 Fitur Utama

- **Interactive CLI:** Pengguna dapat membuat karakter sendiri dengan nama dan senjata pilihan melalui interaksi terminal.
- **Dynamic State Management:** Aksi seperti menyerang, menggunakan *skill*, dan bermeditasi akan secara dinamis memengaruhi *Health Points* (HP), *Mana*, dan *Experience* (EXP) karakter.
- **Leveling System:** Sistem progres otomatis di mana batas EXP (target *level up*) akan meningkat setiap kali karakter naik level, disertai dengan pemulihan dan penambahan bonus atribut.

## 🧠 Konsep OOP yang Diimplementasikan

Proyek ini mendemonstrasikan praktik terbaik dari pilar OOP:

1. **Class & Object:** Pemisahan antara *Blueprint* entitas (`player.java`) dan *Driver Class* utama untuk alur program (`UTSpert07.java`).
2. **Encapsulation:** Penggunaan modifier `private` pada seluruh properti (HP, Mana, Level, dll) untuk mencegah modifikasi data ilegal dari luar kelas.
3. **Constructor:** Menginisialisasi nilai *default* dengan aman saat objek karakter pertama kali diinstansiasi di dalam memori.
4. **Private Helper Methods:** Penggunaan method `private checkLevelUp()` yang hanya berjalan secara internal untuk memisahkan logika pengecekan level dari *public methods* utama.

## 🛠️ Prasyarat (Prerequisites)

- Java Development Kit (JDK) versi 8 atau lebih baru.
- Terminal atau Command Prompt.

## 💻 Cara Menjalankan Program

1. *Clone* repositori ini ke komputer lokal Anda:
   ```bash
   git clone [https://github.com/username-anda/nama-repo-anda.git](https://github.com/username-anda/nama-repo-anda.git)
Buka terminal dan arahkan ke direktori file.

Compile source code Java:

Bash
javac UTSpert07.java player.java
Jalankan program utama:

Bash
java UTSpert07
🎮 Panduan Aksi (Cara Bermain)
Saat program berjalan, Anda akan diminta memasukkan nama dan senjata. Setelahnya, Anda bisa memilih 4 aksi utama:

1: Serang Lawan (Mengorbankan 15 HP, mendapat 40 EXP).

2: Gunakan Skill (Mengorbankan 20 Mana, mendapat 60 EXP).

3: Meditasi (Memulihkan 30 HP dan 15 Mana).

4: Keluar dari simulator.

Pastikan untuk memantau status Anda; aksi tidak bisa dilakukan jika HP/Mana berada di bawah syarat minimum!

Author: Chrisna Caka
