package AbstractFactory.dataSourceUtil;

public class Test {
    public static void main(String[] args) {
        MysqlUtils mysqlUtils = new MysqlUtils();
        mysqlUtils.getConnection().connect();
        mysqlUtils.getCommand().command();

        OracleUtils oracleUtils = new OracleUtils();
        oracleUtils.getConnection().connect();
        oracleUtils.getCommand().command();
    }
}
