package program;

class Hamster extends Animal {
    public Hamster(String name) {
        super(name, "hamster");
    }
        
    @Override
    public void defineClass() {
        System.out.println("animal   " + name + "belongs to the hamster class.");
    }
}
