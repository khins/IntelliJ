package com.github.khins.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class JDBCExecutor {
    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "test","test","ters");
        try {

            long seed = System.currentTimeMillis();
            Random random = new Random(seed);
            var id = random.nextInt();
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = new Customer();
            customer.setId(id);
            customer.setFirstName("Roger");
            customer.setLastName("Waters");
            customerDAO.create(customer);

            var dbCustomer = customerDAO.findById(id);
            System.out.println(dbCustomer);

            dbCustomer.setLastName(dbCustomer.getLastName() + "ton");
            dbCustomer.setFirstName(dbCustomer.getFirstName() + "ly");
            dbCustomer = customerDAO.update(dbCustomer);
            System.out.println(dbCustomer);
            customerDAO.delete(dbCustomer.getId());

//            Customer customer = customerDAO.findById(1000);
//            System.out.println(customer.getFirstName() + " "+ customer.getLastName());
//            customer.setLastName(customer.getLastName() + "ly");
//            customer.setFirstName(customer.getFirstName() + "ia");
//            customerDAO.update(customer);
//            System.out.println(customer.getFirstName() + " "+ customer.getLastName());

//            Customer customer = new Customer();
//            customer.setFirstName("Willow");
//            customer.setLastName("Ufgood");
//            customerDAO.create(customer);

/* Sample select against the Sqlite Db
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select count(*) from customer");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
