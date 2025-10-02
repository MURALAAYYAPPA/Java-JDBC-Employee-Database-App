import java.sql.*;
import java.util.Scanner;

public class EmployeeDB {
    static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    static final String USER = "root";
    static final String PASS = "your_password";
    Connection conn;
    Scanner sc = new Scanner(System.in);

    EmployeeDB() {
        try { conn = DriverManager.getConnection(URL, USER, PASS); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    void add() {
        try (PreparedStatement ps = conn.prepareStatement("INSERT INTO employees(name,department,salary) VALUES(?,?,?)")) {
            System.out.print("Name: "); ps.setString(1, sc.nextLine());
            System.out.print("Dept: "); ps.setString(2, sc.nextLine());
            System.out.print("Salary: "); ps.setDouble(3, sc.nextDouble()); sc.nextLine();
            ps.executeUpdate(); System.out.println("Added!");
        } catch (Exception e) { e.printStackTrace(); }
    }

    void view() {
        try (ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM employees")) {
            while (rs.next()) System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getDouble(4));
        } catch (Exception e) { e.printStackTrace(); }
    }

    void update() {
        try (PreparedStatement ps = conn.prepareStatement("UPDATE employees SET department=?, salary=? WHERE id=?")) {
            System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Dept: "); ps.setString(1, sc.nextLine());
            System.out.print("Salary: "); ps.setDouble(2, sc.nextDouble()); sc.nextLine();
            ps.setInt(3, id); ps.executeUpdate(); System.out.println("Updated!");
        } catch (Exception e) { e.printStackTrace(); }
    }

    void delete() {
        try (PreparedStatement ps = conn.prepareStatement("DELETE FROM employees WHERE id=?")) {
            System.out.print("ID: "); ps.setInt(1, sc.nextInt()); sc.nextLine();
            ps.executeUpdate(); System.out.println("Deleted!");
        } catch (Exception e) { e.printStackTrace(); }
    }

    void menu() {
        while (true) {
            System.out.println("1.Add 2.View 3.Update 4.Delete 5.Exit");
            switch (sc.nextInt()) {
                case 1 -> { sc.nextLine(); add(); }
                case 2 -> view();
                case 3 -> { sc.nextLine(); update(); }
                case 4 -> { sc.nextLine(); delete(); }
                case 5 -> { return; }
            }
        }
    }

    public static void main(String[] args) { new EmployeeDB().menu(); }
}
