package AbstractFactory.dataSourceUtil;

public interface IDataSourceUtils {
    IConnection getConnection();
    ICommand getCommand();
}
