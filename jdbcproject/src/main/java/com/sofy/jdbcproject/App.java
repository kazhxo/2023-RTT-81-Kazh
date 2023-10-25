package com.sofy.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	//optional, legacy code 
    	//will find class inside maven dependency 
    	//will connect us to the database, and it gets the driver which
    	//allows us to do that, 
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        
        //create string url
        String url= "jdbc:mysql://localhost:3306/classicmodels";
        
        //enter username and password you used for sql, to authenticate into
        //the workbench
        String user="root";
        String password="password";
        
        Connection connection = DriverManager.getConnection(url,user,password);
        
        //selecting all employeees from employee table
        
        String selectSql = "Select * from employees";
        
        //create statement and import from java.SQL package
        Statement stmt= connection.createStatement();
        
        //when this statement is executed, it query database and return records
        //from emp table and saving into result variable
        ResultSet result= stmt.executeQuery(selectSql);
        
        /*
        //store the column first name for every record, and stores into name
        while(result.next()) {
        	String firstName= result.getString("firstName");
        	String lastName= result.getString("lastName");
        	String email= result.getString("email");
        	int reportsTo = result.getInt("reportsTo");
        	System.out.println(firstName + " " + lastName + " | " + email + " | " +reportsTo);
      */
        
    
        //close database connection outside of loop 
       // connection.close();
        
        //gives connection to database, passing an id
       // getEmployeeById(1504,connection);
        
       // insertEmployee(connection);
      //  updateEmployee(connection);
        updateExtension(connection);
     
        
        
}
    //end of main method
    
    public static void getEmployeeById(int id, Connection conn) throws SQLException {
    	PreparedStatement ps = conn.prepareStatement(SqlQueries.GetEmployeeById);
    	ps.setInt(1, id);
    	
    	ResultSet result= ps.executeQuery();
    	
    	
    	while(result.next()) {
    		String firstName = result.getString("firstName");
    		String email = result.getString("email");
    		String jobTitle= result.getString("jobTitle");
    		int reportsTo= result.getInt("reportsTo");
    		System.out.println(firstName + " | " + email + " | " + jobTitle + " | " + reportsTo);
    		
    	}
    	
    	
    }
    public static void insertEmployee(Connection connection) throws SQLException {
    	String sqlQuery = "Insert into employees(officeCode, firstName, l"
    			+ "astName, email, extension, reportsTo, VacationHours, "
    			+ "employeeNumber, jobTitle" + "values (?,?,?,?,?,?,?,?,?)";
    	PreparedStatement ps= connection.prepareStatement(sqlQuery);
    	//first relates to the column, 1 is officecode, 2 is firstname, etc
    	ps.setInt(1,6);
    	ps.setString(2, "Mary");
    	ps.setString(3, "Sawyers");
    	ps.setString(4, "mary@gmail.com");
    	ps.setString(3, "");
    	ps.setString(4, "Mary");
    	ps.setString(5, "1234");
    	ps.setInt(6, 1143);
    	ps.setInt(7, 9);
    	ps.setInt(8, 1114);
    	ps.setString(9, "Developer");
    	int affectedRows= ps.executeUpdate();
    	System.out.println(affectedRows + " row(s) affected.");
    	
    }
    public static void updateEmployee(Connection connection) throws SQLException{
    	String selectSql= "UPDATE employees set firstName = ?, lastName=? where employeeNumber=?";
    		
    	PreparedStatement stmt = connection.prepareStatement(selectSql);
    	stmt.setString(1, "Ms." + "Tonya");
    	stmt.setString(2, "Thomas");
    	stmt.setInt(3,1114);
    	stmt.executeUpdate();
    }
    
    public static void updateExtension(Connection connection) throws SQLException {
    	String query= "UPDATE employees set extension=? where officeCode = ?";
    	PreparedStatement ps= connection.prepareStatement(query);
    	ps.setString(1, "5698");
    	ps.setString(2,"2");
    	ps.executeUpdate();
    	
    }
    
}
//end of app class
