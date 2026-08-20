class Super {
    void show() {
        System.out.println("I am in Super class");
    }
}

class Sub extends Super {
    void display() {
        System.out.println("I am in Sub class");
    }
}

class Intermediate extends Sub {
    void print() {
        System.out.println("I am in Intermediate class");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Intermediate obj = new Intermediate();

        obj.show();
        obj.print();
        obj.display();
    }
}
