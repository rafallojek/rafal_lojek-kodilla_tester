package com.kodilla.homework_two;

public class StringCollection {
    private Element collectionHead;

    public StringCollection() {
        this.collectionHead = null;
    }

    public void addElement(String s) {
        Element newElement = new Element(s);
        if (collectionHead == null) {
            collectionHead = newElement;
        } else {
            Element current = collectionHead;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newElement);
            newElement.setPrev(current);
        }
    }

    public String getElement(int n) {
        int index = 0;
        Element current = collectionHead;
        while (current != null) {
            if (index == n) {
                return current.getValue();
            }
            current = current.getNext();
            index++;
        }
        return null;
    }

    public boolean removeElement(String s) {
        Element current = collectionHead;

        while (current != null) {
            if (current.getValue().equals(s)) {
                Element prev = current.getPrev();
                Element next = current.getNext();

                if (prev != null) {
                    prev.setNext(next);
                } else {
                    collectionHead = next;
                }

                if (next != null) {
                    next.setPrev(prev);
                }

                return true;
            }
            current = current.getNext();
        }

        return false;
    }
}

