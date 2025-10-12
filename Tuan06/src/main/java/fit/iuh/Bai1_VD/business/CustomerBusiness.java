package fit.iuh.Bai1_VD.business;

import fit.iuh.Bai1_VD.dao.IDatabase;

public class CustomerBusiness {
    private IDatabase database;

    // Constructor Injection
    public CustomerBusiness(IDatabase database) {
        this.database = database;
    }

    public void process() {
        database.connect();
        System.out.println("Processing customer data...");
    }
}