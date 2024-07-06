package abstraction;

// abstract class
public abstract class bike {
    bike() {
        System.out.println("Bike constructor");
    }
    
    // abstract method
    abstract void run();
    
    // non-abstract method
    void speed() {
        System.out.println("Bike speed method");
    }
}

// concrete class
class R15 extends bike {
    R15() {
        System.out.println("R15 constructor");
    }

    @Override
    void run() {
        System.out.println("R15 running");
    }

    public static void main(String[] args) {
        R15 myBike = new R15();
        myBike.run();
        myBike.speed();
    }
}
