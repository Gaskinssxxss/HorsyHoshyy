package StackAndQueue;

import LinkedList.*;

public class HorseQueue {
    public NodeHorse front;
    NodeHorse rear;

    public HorseQueue() {
        front = rear = null;
    }

    public void enqueue(Horse horse) {
        NodeHorse newNode = new NodeHorse(horse);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
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

    public void insertHorse(Horse horse, int position) {
        NodeHorse newNode = new NodeHorse(horse);
        if (position == 0) {
            newNode.next = front;
            front = newNode;
            if (rear == null) {
                rear = newNode;
            }
        } else {
            NodeHorse current = front;
            int count = 0;
            while (current != null && count < position - 1) {
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