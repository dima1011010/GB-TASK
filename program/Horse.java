package program;

class Horse extends Animal {
    public Horse(String name) {
        super(name, "horse");
    }
        
    @Override
    public void defineClass() {
        System.out.println("animal   " + name + "belongs to the hors class.");
    }
}
