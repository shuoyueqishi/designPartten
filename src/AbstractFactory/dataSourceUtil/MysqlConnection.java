package AbstractFactory.dataSourceUtil;

public class MysqlConnection implements IConnection{
    @Override
    public void connect() {
        System.out.println("Mysql get connection");
    }
}
