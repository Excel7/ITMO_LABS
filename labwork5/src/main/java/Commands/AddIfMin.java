package Commands;

import Core.CollectionManager;
import Core.CommandAsker;

public class AddIfMin extends AbstractCommand{
    private final CollectionManager collectionManager;
    private final CommandAsker commandAsker;
    public AddIfMin (CollectionManager c, CommandAsker a){
        this.collectionManager = c;
        this.commandAsker = a;
    }

    @Override
    public boolean execute(){
        collectionManager.addIfMin(commandAsker.createProduct());
        return true;
    }
}
