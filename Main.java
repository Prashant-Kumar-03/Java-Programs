interface Flying {
    void move();
}

interface Swimming {
    void move();
}

interface Running {
    void move();
}

class Animal implements Flying, Swimming, Running {
    public void move() {
        System.out.println("The animal is moving...");
    }

    public void fly() {
        System.out.println("The animal is flying...");
    }

    public void swim() {
        System.out.println("The animal is swimming...");
    }

    public void run() {
        System.out.println("The animal is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        animal.fly();
        animal.swim();
        animal.run();
    }
}