package SortingAndSearching;

import LinkedList.*;

public class HorseSorting {
    public static void bubbleSort(HorseLinkedList horseList) {
        NodeHorse current = horseList.head;
        while (current != null) {
            NodeHorse nextNode = current.next;
            while (nextNode != null) {
                if (current.horse.age > nextNode.horse.age) {
                    Horse temp = current.horse;
                    current.horse = nextNode.horse;
                    nextNode.horse = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;
        }
    }
}
