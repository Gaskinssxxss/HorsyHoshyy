package StackAndQueue;

import LinkedList.*;

public class HorseStack {
    public NodeHorse top;

    public HorseStack() {
        top = null;
    }

    public void push(Horse horse) {
        Horse newHorse = new Horse(horse);
        NodeHorse newNode = new NodeHorse(newHorse);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {
        if (top == null) {
            return;
        }
        top = top.next;
    }

}