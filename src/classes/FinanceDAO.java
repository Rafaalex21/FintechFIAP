package classes;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FinanceDAO {
    private Connection connection;

    public FinanceDAO() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "OPS$RM96464", "123456");
    }

    public List<Finance> getAll() throws SQLException {
        List<Finance> finances = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM finance");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Finance finance = new Finance(
                    resultSet.getInt("id"),
                    resultSet.getString("description"),
                    resultSet.getDouble("value"),
                    resultSet.getDate("date")
            );
            finances.add(finance);
        }
        return finances;
    }

    public void insert(Finance finance) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO finance (description, value, date) VALUES (?, ?, ?)");
        statement.setString(1, finance.getDescription());
        statement.setDouble(2, finance.getValue());
        statement.setDate(3, new java.sql.Date(finance.getDate().getTime()));
        statement.executeUpdate();
    }

    public void update(Finance finance) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE finance SET description=?, value=?, date=? WHERE id=?");
        statement.setString(1, finance.getDescription());
        statement.setDouble(2, finance.getValue());
        statement.setDate(3, new java.sql.Date(finance.getDate().getTime()));
        statement.setInt(4, finance.getId());
        statement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM finance WHERE id=?");
        statement.setInt(1, id);
        statement.executeUpdate();
    }
}


