package AbstractFactory.dataSourceUtil;

public class OracleCommand implements ICommand{
    @Override
    public void command() {
        System.out.println("Oracle get command");
    }
}
