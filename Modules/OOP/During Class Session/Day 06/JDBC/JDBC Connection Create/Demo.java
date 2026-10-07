import java.sql.*;
class Demo{
	public static void main(String[] args){
		//String SQL="delete from Student where id='S0005'";
		String SQL = "select name from student where id='S0004'";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/StudentDB","root","12345");
			Statement stm=conn.createStatement();
			int res=stm.executeUpdate(SQL);
			if(res>0){
				System.out.println("Deleted...");
			}
		}catch(ClassNotFoundException ex){
			System.out.println("Driver s/w not found...");
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
	}
}
