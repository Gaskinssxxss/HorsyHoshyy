package LinkedList;

public class PeternakLL {
    public NodePeternak head;

    public void addPeternak(String name, int age, String gender) {
        Peternak newPeternak = new Peternak(name, name, age);
        NodePeternak newNode = new NodePeternak(newPeternak);

        if (head == null) {
            head = newNode;
        } else {
            NodePeternak temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
