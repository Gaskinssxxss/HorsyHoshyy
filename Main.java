import LinkedList.*;
import SortingAndSearching.*;
import StackAndQueue.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HorseLinkedList horseList = new HorseLinkedList();
        KandangQueue kandangQueue = new KandangQueue();
        HorseStack horseStack = new HorseStack();
        int currentKandangNumber = 1;

        System.out.println("Kuda Kuda Kuda");

        System.out.print("Anda Seorang Peternak Kuda? Anda siap untuk Beternak sampai mati? Jika ya, Masukan nickname anda : ");
        String nickname = scanner.nextLine();
        System.out.print("Hai Mas " + nickname + " Selamat datang di Horse Stable, tempat terbaik untuk mencari makna hidup.");

        while (true) {
            System.out.println("\nPilih n Choose:");
            System.out.println("1. Ada Kuda Baru? ayo Tambahkan mas!");
            System.out.println("2. Daftar Kuda");
            System.out.println("3. Urutkan Kuda");
            System.out.println("4. Cari Kuda");
            System.out.println("5. Tugas Peternak");
            System.out.println("6. Exit");

            System.out.print("Experimental gate has opened, silahkan bersenang-senang : " );
            int choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                Kandang nomorKandang = new Kandang(currentKandangNumber++);
                System.out.print("Nama Kuda: ");
                scanner.nextLine(); // Consuming newline after entering a number
                String name = scanner.nextLine();
                System.out.print("Umur Kuda: ");
                int age = scanner.nextInt();
                System.out.print("Gender Kuda: ");
                scanner.nextLine(); // Consuming newline after entering a number
                String gender = scanner.nextLine();
            
                // Create a new Horse
                Horse newHorse = new Horse(name, age, gender, nomorKandang);
            
                horseList.addHorse(name, age, gender, nomorKandang);
                System.out.println("Kuda " + name + " Umur " + age + " Jenis Kelamin " + gender + " kandang nomor - " + nomorKandang.getNomor());
            
                // Enqueue the horse into the KandangQueue
                kandangQueue.enqueue(newHorse, nomorKandang);
            
                // Push the horse into the HorseStack
                horseStack.push(newHorse);
                break;
            
                case 2:
                    System.out.println("Koleksi Kuda:");
                    horseList.displayHorses();
                    break;
                case 3:
                    System.out.println("Urutan Kuda");
                    // Hapus input string, karena kriteria sorting sudah ditentukan (berdasarkan
                    // umur)
                    HorseSorting.bubbleSort(horseList);
                    System.out.println("Daftar kuda telah diurutkan berdasarkan umur.");
                    horseList.displayHorses(); // Menampilkan daftar kuda yang sudah diurutkan
                    break;
                   case 4:
                   System.out.print("Masukan Nama Kuda yang di Cari: ");
                   scanner.nextLine(); 
                   String searchName = scanner.nextLine();
                   Horse foundHorse = HorseSearching.searchHorseByName(horseList, searchName);
                   HorseSearching.displayHorseInfoWithKandang(foundHorse);
                   break;
                case 5: // Tugas perawatan
                    System.out.println("Tugas Peternak:");

                    while (horseStack.top != null) {
                        System.out.println(horseStack.top.horse.name);
                        horseStack.pop();
                    }
                    break;
                case 6:
                    System.out.println("Exit. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Salaahhhhhh cokkk.");
            }
        }
    }
}
