/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspert07;

/**
 *
 * @author chrisnacaka
 */
public class player {
    // Properti (Encapsulation)
    private String name;
    private String weapon;
    private int healthPoints;
    private int manaPoints;
    private int experience;
    private int expplus;
    private int level; // Properti baru untuk Sistem Level
    

    // Constructor
    public player(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoints = 100; 
        this.manaPoints = 50;   
        this.experience = 0;
        this.level = 1; // Level awal selalu 1
        this.expplus = 100;
    }

    // Method Internal (Private Helper): Mengecek & memproses Level Up
    private void checkLevelUp() {
        if (this.experience >= this.expplus) {
            this.level++;
            this.experience = 0;// EXP bakalan reset saat naik level berikutnya
            this.healthPoints += 50; // Bonus HP saat naik level
            this.manaPoints += 20;   // Bonus Mana saat naik level
            this.expplus +=50; // saat naik level syarat naik ke level berikutnya juga bertambahh
            
            System.out.println("\n===========================");
            System.out.println("  ✨ LEVEL UP! ✨");
            System.out.println("  " + this.name + " naik ke Level " + this.level + "!");
            System.out.println("  Bonus: HP +50, Mana +20");
            System.out.println("===========================\n");
        }
    }

    // Method 1: Menyerang (Sekarang mengurangi HP dan menambah banyak EXP)
    public void performAttack() {
        if (this.healthPoints > 15) {
            this.healthPoints -= 15; // Logika pengurangan HP
            this.experience += 40;   // EXP bertambah
            
            System.out.println("\n[ATTACK] " + name + " menebas lawan menggunakan " + weapon + "!");
            System.out.println("-> HP berkurang 15 (Kelelahan/Terkena serangan balik).");
            System.out.println("-> EXP bertambah 40.");
            
            checkLevelUp(); // Cek apakah EXP sudah mencapai 100
        } else {
            System.out.println("\n[GAGAL] HP terlalu rendah (" + this.healthPoints + ") untuk menyerang! Meditasi dulu.");
        }
    }

    // Method 2: Menggunakan Skill
    public void castSkill() {
        if (this.manaPoints >= 20) {
            this.manaPoints -= 20;
            this.experience += 60; // Skill memberi EXP lebih besar
            
            System.out.println("\n[SKILL] " + name + " mengeluarkan jurus spesial!");
            System.out.println("-> Mana berkurang 20, EXP bertambah 60.");
            
            checkLevelUp(); // Cek apakah EXP sudah mencapai 100
        } else {
            System.out.println("\n[GAGAL] Mana tidak cukup untuk menggunakan skill!");
        }
    }

    // Method 3: Meditasi (Pemulihan State)
    public void meditate() {
        this.healthPoints += 30; // Pemulihan HP ditingkatkan
        this.manaPoints += 15;
        System.out.println("\n[REST] " + name + " bermeditasi. HP +30, Mana +15.");
    }

    // Method 4: Menampilkan Status
    public void showStatus() {
        System.out.println("\n======= STATUS KARAKTER =======");
        System.out.println("Nama    : " + this.name);
        System.out.println("Senjata : " + this.weapon);
        System.out.println("Level   : " + this.level);
        System.out.println("HP      : " + this.healthPoints);
        System.out.println("Mana    : " + this.manaPoints);
        System.out.println("Exp     : " + this.experience + " /"+ expplus);
        System.out.println("===============================");
    }
}
