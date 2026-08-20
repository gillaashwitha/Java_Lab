class Animal {
    String name;

    void show() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Mother Dog Barks");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby Dog weeping");
    }
}

public class TestMultilevel {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();

        b.weep();
        b.bark();
        b.show();
    }
}