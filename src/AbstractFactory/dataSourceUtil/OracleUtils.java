package AbstractFactory.dataSourceUtil;

public class OracleUtils implements IDataSourceUtils {
    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}
