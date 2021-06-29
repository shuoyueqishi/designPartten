package AbstractFactory.dataSourceUtil;

public class MysqlCommand implements ICommand{
    @Override
    public void command() {
        System.out.println("Mysql executes commands");
    }
}
