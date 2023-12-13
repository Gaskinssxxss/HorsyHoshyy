package LinkedList;

public class NodeHorse {
    public Horse horse;
    public NodeHorse prev; // Add a previous pointer
    public NodeHorse next;

    public NodeHorse(Horse horse) {
        this.horse = horse;
        this.prev = null;
        this.next = null;
    }
}