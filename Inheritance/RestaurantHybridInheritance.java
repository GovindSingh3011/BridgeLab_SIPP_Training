interface Worker {
    void performDuties();
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef: Cooking delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter: Serving customers.");
    }
}

public class RestaurantHybridInheritance {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 1);
        Worker waiter = new Waiter("John", 2);
        chef.performDuties();
        waiter.performDuties();
    }
}
