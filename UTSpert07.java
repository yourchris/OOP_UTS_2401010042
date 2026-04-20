/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utspert07;

/**
 *
 * @author chrisnacaka
 */

import java.util.Scanner;

public class UTSpert07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Inisialisasi Karakter UTS ---");
        System.out.print("Nama Karakter: ");
        String nameInput = input.nextLine();
        System.out.print("Jenis Senjata: ");
        String weaponInput = input.nextLine();

        // Inisiasi Objek
        player userChar = new player(nameInput, weaponInput);

        boolean running = true;
        while (running) {
            userChar.showStatus();
            System.out.println("\nMENU AKSI:");
            System.out.println("1. Serang Lawan (Butuh 15 HP)");
            System.out.println("2. Gunakan Skill (Butuh 20 Mana)");
            System.out.println("3. Meditasi (Pulihkan HP & Mana)");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-5): ");

            int choice = input.nextInt();
            switch (choice) {
                case 1: userChar.performAttack(); break;
                case 2: userChar.castSkill(); break;
                case 3: userChar.meditate(); break;
                case 4: 
                    System.out.println("Menutup program...");
                    running = false; 
                    break;
                default: 
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
        input.close();
    }
}