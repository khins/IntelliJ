package com.github.khins.jdbc;

import com.github.khins.jdbc.util.DataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// https://www.lynda.com/Java-tutorials/Creating-data/779748/5033996-4.html?autoplay=true
// Learning JDBC
public class CustomerDAO extends DataAccessObject<Customer> {
    private static final String INSERT = "INSERT INTO Customer (first_name, last_name) VALUES (?,?)";
    private  static final String GET_ONE = "select\n" +
            "    c.address,\n" +
            "    c.city,\n" +
            "    c.customer_id,\n" +
            "    c.email,\n" +
            "    c.first_name,\n" +
            "    c.last_name,\n" +
            "    c.phone,\n" +
            "    c.state,\n" +
            "    c.zipcode\n" +
            "from customer2 c\n" +
            "where c.customer_id = ?;";

    private static final String UPDATE = "update Customer set first_name = ?, last_name = ? where customer_id = ?";

    public CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Customer findById(long id) {
        Customer customer = new Customer();
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(GET_ONE);){
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customer.setId(resultSet.getLong("customer_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
            }
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return  customer;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer update(Customer dto) {
        Customer customer = null;
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(UPDATE);){
            preparedStatement.setString(1, dto.getFirstName());
            preparedStatement.setString(2, dto.getLastName());
            preparedStatement.setLong(3, dto.getId());
            customer = this.findById(dto.getId());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return  customer;
    }

    @Override
    public Customer create(Customer dto) {
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(INSERT);) {
            preparedStatement.setString(1, dto.getFirstName());
            preparedStatement.setString(2, dto.getLastName());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return  null;
        } catch (SQLException e){
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }

    @Override
    public void delete(long id) {

    }
}
