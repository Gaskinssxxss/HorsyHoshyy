import LinkedList.*;
import SortingAndSearching.*;
import StackAndQueue.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HorseLinkedList horseList = new HorseLinkedList();
        HorseQueue horseQueue = new HorseQueue();
        HorseStack horseStack = new HorseStack();

        System.out.println("Kuda Kuda Kuda");

        while (true) {
            System.out.println("\nPilih n Choose:");
            System.out.println("1. Anda Peternak? Masukan Id anda!");
            System.out.println("2. Ada Kuda Baru? ayo Tambahkan mas!");
            System.out.println("3. Daftar Kuda");
            System.out.println("4. Urutkan Kuda");
            System.out.println("5. Cari Kuda");
            System.out.println("6. Tugas Peternak");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline dari input sebelumnya

            switch (choice) {
                case 1:
                    System.out.print("Masukan Nama Peternak : ");
                    String nama = scanner.nextLine();
                    Peternak newPeternak = new Peternak(nama, nama, choice);
                    System.out.println("Hai " + newPeternak.getNama()
                            + " selamat datang peternak sukses, ayo berternak hingga mati!!!");
                    System.out.print("");
                    break;
                case 2:
                    System.out.print("Enter Horse Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Horse Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Horse Gender: ");
                    String gender = scanner.nextLine();
                    Horse newHorse = new Horse(name, age, gender);

                    // Memasukkan kuda ke dalam antrian pada posisi tertentu (misalnya, posisi 1)
                    horseQueue.insertHorse(newHorse, 1);
                    System.out.println("Horse added to the queue at position 2.");
                    break;
                case 3:
                    System.out.println("List of Horses:");
                    horseList.displayHorses();
                    break;
                case 4:
                    System.out.println("Urutan Kuda");
                    // Hapus input string, karena kriteria sorting sudah ditentukan (berdasarkan
                    // umur)
                    HorseSorting.bubbleSort(horseList);
                    System.out.println("Daftar kuda telah diurutkan berdasarkan umur.");
                    horseList.displayHorses(); // Menampilkan daftar kuda yang sudah diurutkan
                    break;
                case 5:
                    System.out.print("Enter Horse Name to Search: ");
                    String searchName = scanner.nextLine();
                    Horse foundHorse = HorseSearching.searchHorseByName(horseList, searchName);

                    if (foundHorse != null) {
                        System.out.println("Horse Found - Name: " + foundHorse.name + ", Age: " + foundHorse.age
                                + ", Gender: " + foundHorse.gender);
                    } else {
                        System.out.println("Horse with name " + searchName + " not found.");
                    }
                    break;
                case 6: // Tugas perawatan
                    System.out.println("Daily Tasks for the Horse Keeper:");

                    while (horseStack.top != null) {
                        System.out.println(horseStack.top.horse.name);
                        horseStack.pop();
                    }
                    break;
                case 7:
                    System.out.println("Exiting Program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
