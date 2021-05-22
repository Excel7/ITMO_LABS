package Main;

import Commands.*;
import Core.*;


import java.util.Scanner;

public class Main {
    //static final String FILE_PATH = "src/main/java/Files/";
    static String filename;


    public static void main(String[] args) {
        try{
            filename = args[0];
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Insert file input using COMMAND LINE ARGUMENT");
            System.exit(-1);
        }
        System.out.println("Welcome to the collection store :) ");
        System.out.println("To know the available commands, write 'help'");
        CollectionManager collectionManager = new CollectionManager();
        collectionManager.readInputFromJSONFile(filename);
        InputChecker inputChecker = new InputChecker();
        CommandAsker commandAsker = new CommandAsker(inputChecker);
        CommandManager commandManager = new CommandManager(
                new Add(collectionManager, commandAsker),
                new AddIfMax(collectionManager, commandAsker),
                new AddIfMin(collectionManager, commandAsker),
                new Clear(collectionManager),
                new CountByManufacturer(collectionManager, inputChecker),
                new Exit(),
                new FilterContainsName(collectionManager, inputChecker),
                new Help(),
                new Info(collectionManager),
                new PrintFieldDescendingManufacturer(collectionManager),
                new RemoveById(collectionManager, inputChecker),
                new Save(collectionManager),
                new Show(collectionManager),
                new Update(collectionManager, inputChecker, commandAsker)
        );
        Commander commander = new Commander(commandManager, new Scanner(System.in), filename);
        commander.interactiveMode();
    }
}
