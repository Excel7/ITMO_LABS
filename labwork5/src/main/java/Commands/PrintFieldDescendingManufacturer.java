package Commands;

import Core.CollectionManager;
import Data.Organization;
import java.util.ArrayList;


public class PrintFieldDescendingManufacturer extends AbstractCommand {
    private final CollectionManager collectionManager;

    public  PrintFieldDescendingManufacturer(CollectionManager c){
        this.collectionManager = c;
    }
    public boolean execute() {
        ArrayList<Organization> orgArray = collectionManager.getOrgArray();
        orgArray.forEach(System.out::println);
        return true;
    }
}
