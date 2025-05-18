package com.kodilla;

public class Element {
    //
    private String value;
    private Element next;
    private Element prev;

    public Element(String value) {
        this.value = value;
        this.next = null; //next i prev właściwości dla klasy Element
        this.prev = null;
    }

    public String getValue() {
        return value;
    }

    // Jest już początek. Jest konstruktor na Element
}

