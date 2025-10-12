package fit.iuh.Bai1_VD.dao;

public class MySQLDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
