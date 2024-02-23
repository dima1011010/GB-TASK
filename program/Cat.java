package program;

class Cat extends Animal {
    public Cat(String name) {
        super(name, "cat");
    }
    
    @Override
    public void defineClass() {
        System.out.println("animal " + name + "belongs to the cat class.");
    }
}