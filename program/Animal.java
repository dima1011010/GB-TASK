package program;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
    protected String name;
    protected String type;
    protected List<String> commands = new ArrayList<>();
        
    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }
        
    public abstract void defineClass();
        
    public void showCommands(){
        System.out.print("Команды, которые выполняет животное " + name + ": ");
        for (String command : commands){
            System.out.print(command + " ");
        }
        System.out.println();
    }
        
    public void train(String newCommand){
        commands.add(newCommand);
        System.out.println("Животное " + name + " обучено новой команде: " + newCommand);
    }
}
