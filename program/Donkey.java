package program;

class Donkey extends Animal {
    public Donkey(String name) {
        super(name, "donkey");
    }
        
    @Override
    public void defineClass() {
        System.out.println("animal   " + name + "belongs to the donket class.");
    }
}
