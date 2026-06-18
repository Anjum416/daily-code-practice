package JDBC.Basics;

import java.sql.*;

public class JD {
    private static final String url = "jdbc:mysql://localhost:3306/sms2";
    private static final String username = "root";
    private static final String password = "Anjum26";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        // String query = "Select * from Students";
        //using prepared statement//
//        PreparedStatement ps = con.prepareStatement(query);
//
//        ResultSet rs = ps.executeQuery(query);
//        while (rs.next()) {
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            String email = rs.getString("email");
//            int marks = rs.getInt("marks");
//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(email);
//            System.out.println(marks);
//      String query=String.format("insert into Students(id,name,email,marks) values (%d,'%s','%s',%d)",3,"pallavi","a",77);
//      int myRes=st.executeUpdate(query);
//      if(myRes>0){
//          System.out.println("success");
//      }
//      else{
//          System.out.println("fail");
//      }
//  }
//
//        }//
        // String query=String.format("insert into student(id,name,email,matks)values(%d,'%s','%s',%d)",2,"john","r",98);
//        int myRes=st.executeUpdate(query);
//        if(myRes>0){
//            System.out.println("success");
//        }
//        else{
//            System.out.println("failure");
//        }

        //Updating the data

//        String query=String.format("Update student set matks=%d where id=%d",90,2);
//        int res=st.executeUpdate(query);
//        if(res>0){
//            System.out.println("Success");
//        }
//        else{
//            System.out.println("failed");
//        }

        //Deleting the data

//      String query=String.format("Delete from student where id=%d",2);
//      int rowsFull=st.executeUpdate(query);
//      if(rowsFull>0){
//          System.out.println("Deleted");
//      }
//      else{
//          System.out.println("Not deleted");
//      }
//  }
//}
//        String query="insert into students(id,name,email,marks) values(?,?,?,?)";
//        PreparedStatement ps=con.prepareStatement(query);
//        ps.setInt(1,3);
//        ps.setString(2,"hnnnn");
//        ps.setString(3,"aaa");
//        ps.setInt(4,83);
//        int myRes=ps.executeUpdate();
//        if(myRes>0) {
//            System.out.println("success");
//        }
//        else{
//            System.out.println("fail");
//
//        }
//    }
//}
        //delete using prepared statement//
//        String query = "DELETE from students WHERE id = ?";
//        PreparedStatement ps = con.prepareStatement(query);
//
//        ps.setInt(1, 3);
//
//        int myRes = ps.executeUpdate();
//        if (myRes > 0) {
//            System.out.println("success");
//        } else {set
//            System.out.println("fail");
//        }
//    }
//}
//update using preparedStatement//
String query = "Update students set name = ?, email = ?, marks = ? WHERE id = ?";
PreparedStatement ps = con.prepareStatement(query);
ps.setString(1, "anjum");
ps.setString(2, "john@gmail.com");
ps.setInt(3, 90);

ps.setInt(4, 3);

int myRes = ps.executeUpdate();
if (myRes > 0) {
        System.out.println("success");
} else {
        System.out.println("fail");
}
        }
        }

