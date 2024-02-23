package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal_Reg {
     public static void main(String[] args) {
        Map<String, Animal> animals = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Завести новое животное");
            System.out.println("2. Определить животное в правильный класс");
            System.out.println("3. Увидеть список команд, которое выполняет животное");
            System.out.println("4. Обучить животное новым командам");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Введите имя животного: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите тип животного (dog/cat/hamster/...): ");
                    String type = scanner.nextLine();
                    Animal animal;
                    if (type.equalsIgnoreCase("dog")) {
                        animal = new Dog(name);
                    } else if (type.equalsIgnoreCase("cat")) {
                        animal = new Cat(name);
                    } else if (type.equalsIgnoreCase("hamster")) {
                        animal = new Hamster(name);
                    } else if (type.equalsIgnoreCase("camel")) {
                        animal = new Camel(name);
                    } else if (type.equalsIgnoreCase("horse")) {
                        animal = new Horse(name);
                    } else if (type.equalsIgnoreCase("donkey")) {
                        animal = new Donkey(name);
                    }else {
                        System.out.println("Данный тип животного не поддерживается.");
                        continue;
                    }
                    animals.put(name, animal);
                    break;
                    
                case 2:
                    System.out.print("Введите имя животного: ");
                    String animalName = scanner.nextLine();
                    Animal selectedAnimal = animals.get(animalName);
                    if (selectedAnimal == null) {
                        System.out.println("Животное с таким именем не найдено.");
                    } else {
                        selectedAnimal.defineClass();
                    }
                    break;
                    
                case 3:
                    System.out.print("Введите имя животного: ");
                    String commandAnimalName = scanner.nextLine();
                    Animal commandAnimal = animals.get(commandAnimalName);
                    if (commandAnimal == null) {
                        System.out.println("Животное с таким именем не найдено.");
                    } else {
                        commandAnimal.showCommands();
                    }
                    break;
                    
                case 4:
                    System.out.print("Введите имя животного: ");
                    String trainingAnimalName = scanner.nextLine();
                    Animal trainingAnimal = animals.get(trainingAnimalName);
                    if (trainingAnimal == null) {
                        System.out.println("Животное с таким именем не найдено.");
                    } else {
                        System.out.print("Введите новую команду для животного: ");
                        String newCommand = scanner.nextLine();
                        trainingAnimal.train(newCommand);
                    }
                    break;
                    
                case 5:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
                    break;
            }
        }
    }
}
