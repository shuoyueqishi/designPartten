package AbstractFactory.dataSourceUtil;

public class OracleConnection implements IConnection{
    @Override
    public void connect() {
        System.out.println("Oracle get connection");
    }
}
