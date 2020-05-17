package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevel() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (resultSet.next()) {
            howMany = resultSet.getInt("HOW_MANY");
        }
        Assert.assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String bestsellersUpdate = "UPDATE BOOKS SET BESTSELLER=\"0\"";
        Statement statementBestsell = dbManager.getConnection().createStatement();
        statementBestsell.executeUpdate(bestsellersUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statementBestsell.execute(sqlProcedureCall);

        //Then
        String sqlCheckTableBooks = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=\"0\"";
        ResultSet resultSet = statementBestsell.executeQuery(sqlCheckTableBooks);
        int howMany = 0;
        if (resultSet.next()) {
            howMany = resultSet.getInt("HOW_MANY");
        }
        Assert.assertEquals(2, howMany); //celowa Assercia o wartosci: 2 (5 to poprawna wartosc na chwile obecna, wtedy test przechodzi)

    }

}
