package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private String type;

    public BadCodeExample(String type) {
        this.type = type;
    }

    public static double getPi() {
        return Math.PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BadCodeExample)) return false;
        BadCodeExample that = (BadCodeExample) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
