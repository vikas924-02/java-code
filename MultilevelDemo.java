class Grandfather {

    void house() {
        System.out.println("Grandfather's House");
    }
}

class Father extends Grandfather {

    void car() {
        System.out.println("Father's Car");
    }
}

class Son extends Father {

    void bike() {
        System.out.println("Son's Bike");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {

        Son s = new Son();

        s.house();
        s.car();
        s.bike();
    }
}