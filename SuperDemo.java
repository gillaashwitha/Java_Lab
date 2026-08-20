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

public class SuperDemo {
    public static void main(String[] args) {
        Super obj1 = new Super();
        obj1.show();

        Sub obj2 = new Sub();
        obj2.display();
    }
}