package program;

class Camel extends Animal {
    public Camel(String name) {
        super(name, "camel");
    }
        
    @Override
    public void defineClass() {
        System.out.println("animal   " + name + "belongs to the camel class.");
    }
}
