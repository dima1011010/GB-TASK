package program;

class Dog extends Animal {
    public Dog(String name) {
        super(name, "dog");
    }
        
    @Override
    public void defineClass() {
        System.out.println("animal   " + name + "belongs to the dog class.");
    }
}

