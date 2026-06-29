package OopChallanges;

class Animals {
    void eat() {
        System.out.println("Eating");
    }
}

class Dogs extends Animals {

    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.eat();

    }
}
