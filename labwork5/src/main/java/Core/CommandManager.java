package Core;

import Commands.*;


public class CommandManager {
    private final ICommands Add;
    private final ICommands Clear;
    private final ICommands Exit;
    private final ICommands Help;
    private final ICommands Info;
    private final ICommands RemoveById;
    private final ICommands Show;
    private final ICommands Update;
    private final ICommands Save;
    private final ICommands AddIfMax;
    private final ICommands AddIfMin;
    private final ICommands CountByManufacturer;
    private final ICommands FilterContainsName;
    private final ICommands PrintFieldDescendingManufacturer;

    public CommandManager( ICommands add, ICommands addIfMax, ICommands addIfMin, ICommands clear, ICommands countByManufacturer,
                           ICommands exit, ICommands filterContainsName, ICommands help, ICommands info, ICommands printFieldDescendingManufacturer,
                           ICommands removeById, ICommands save, ICommands show, ICommands update) {
        this.Help = help;
        this.Info = info;
        this.Show = show;
        this.Add = add;
        this.Update = update;
        this.RemoveById = removeById;
        this.Clear = clear;
        this.Save = save;
        this.Exit = exit;
        this.AddIfMax = addIfMax;
        this.AddIfMin = addIfMin;
        this.CountByManufacturer = countByManufacturer;
        this.FilterContainsName = filterContainsName;
        this.PrintFieldDescendingManufacturer = printFieldDescendingManufacturer;

    }
    public  boolean help(){
        return Help.execute();
    }
    public boolean info(){ return Info.execute(); }
    public boolean show(){
        return Show.execute();
    }
    public boolean add() {return Add.execute();}
    public boolean update(String argument){return Update.execute(argument);}
    public boolean removeById(String argument){return RemoveById.execute(argument);}
    public  boolean clear(){return Clear.execute();}
    public boolean save(String filename){
        return Save.execute(filename);
    }
    public boolean exit(){return Exit.execute();}
    public boolean addIfMax(){return AddIfMax.execute();}
    public  boolean addIfMin(){return  AddIfMin.execute();}
    public boolean countByManufacturer(String argument){ return CountByManufacturer.execute(argument);}
    public boolean filterContainsName(String argument){return FilterContainsName.execute(argument);}
    public boolean printFieldDescendingManufacturer(){return PrintFieldDescendingManufacturer.execute();}



}
