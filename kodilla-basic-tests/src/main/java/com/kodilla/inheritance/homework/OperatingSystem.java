package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
        System.out.println("System on");
    }

    public void turnOff() {
        System.out.println("System off. You can now safely turn off your computer");
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}

class Windows extends OperatingSystem {
    public Windows(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System Windows is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("System Windows is shutting down ");
    }
}

class MacOS extends OperatingSystem {
    public MacOS(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System MacOS is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("System MacOS is shutting down");
    }
}

class Linux extends OperatingSystem {
        public Linux(int releaseYear) {
            super(releaseYear);
        }

    @Override
    public void turnOn() {
        System.out.println("System Linux is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("System Linux is shutting down");
    }
}

class OperatingSystemTest {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows(2021);
        OperatingSystem macos = new MacOS(2025);
        OperatingSystem linux = new Linux(2024);

        System.out.println("Year of system Windows last release: " + windows.getReleaseYear());
        windows.turnOn();
        windows.turnOff();

        System.out.println("Year of system MacOS last release: " + macos.getReleaseYear());
        macos.turnOn();
        macos.turnOff();

        System.out.println("Year of system Linux last release: " + linux.getReleaseYear());
        linux.turnOn();
        linux.turnOff();
    }
}
