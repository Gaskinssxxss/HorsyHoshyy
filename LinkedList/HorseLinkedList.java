package LinkedList;

public class HorseLinkedList {
    public NodeHorse head;

    public void addHorse(String name, int age, String gender, Kandang nomorKandang) {
        Horse newHorse = new Horse(name, age, gender, nomorKandang);
        NodeHorse newNode = new NodeHorse(newHorse);

        if (head == null) {
            head = newNode;
        } else {
            NodeHorse temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

        // Assign nomor kandang to the horse
        newNode.horse.setNomorKandang(nomorKandang);
    }

    public void displayHorses() {
        NodeHorse current = head;
        while (current != null) {
            System.out.println("Name: " + current.horse.name + ", Age: " + current.horse.age + ", Gender: "
                    + current.horse.gender + ", Nomor Kandang: " + current.horse.getNomorKandang());
            current = current.next;
        }
    }
}