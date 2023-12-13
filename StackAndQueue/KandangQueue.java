package StackAndQueue;

import LinkedList.*;

public class KandangQueue {
    private NodeHorse front;
    private NodeHorse rear;

    public void enqueue(Horse horse, Kandang nomorKandang) {
        NodeHorse newNode = new NodeHorse(horse);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }

        // Assign nomor kandang to the horse
        horse.setNomorKandang(nomorKandang);
    }

    public void dequeue() {
        if (front == null) {
            return;
        }
        NodeHorse temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    public void insertHorse(Horse horse, Kandang nomorKandang) {
        NodeHorse newNode = new NodeHorse(horse);
        NodeKandang newkandang = new NodeKandang(nomorKandang);
        if (nomorKandang == null) {
            newNode.next = front;
            front = newNode;
            if (rear == null) {
                rear = newNode;
            }
        } else {
            NodeHorse current = front;
            int count = 0;
            while (current != null && count < newkandang.kandang.nomorKandang) {
                current = current.next;
                count++;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
                if (newNode.next == null) {
                    rear = newNode;
                }
            }
        }
    }

    public Horse accessHorse(int position) {
        NodeHorse current = front;
        int count = 0;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        if (current != null) {
            return current.horse;
        } else {
            return null;
        }
    }

}