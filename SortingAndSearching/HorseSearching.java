package SortingAndSearching;

import LinkedList.*;

public class HorseSearching {
    public static Horse searchHorseByName(HorseLinkedList horseList, String name) {
        NodeHorse current = horseList.head;
        while (current != null) {
            if (current.horse.name.equals(name)) {
                return current.horse;
            }
            current = current.next;
        }
        return null;
    }

    public static void displayHorseInfoWithKandang(Horse horse) {
        if (horse != null) {
            System.out.println("Name: " + horse.name +
                    ", Age: " + horse.age +
                    ", Gender: " + horse.gender +
                    ", Nomor Kandang: " + horse.getNomorKandang());
        } else {
            System.out.println("Horse not found.");
        }
    }
}