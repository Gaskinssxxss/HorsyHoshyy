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
}