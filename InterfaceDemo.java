interface A {
    void display();
}

interface B {
    void test();
}

class C implements A, B {

    public void display() {
        System.out.println("Hello from Interface A");
    }

    public void test() {
        System.out.println("Hello from Interface B");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        C obj = new C();

        obj.display();
        obj.test();
    }
}