package element;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOEnigme {

		private Connection cnx;
		
		@SuppressWarnings("finally")
		public boolean doConnection(String pseudoURL, String Driver)
			{
			System.out.println("url de connexion : "+ pseudoURL); 
			System.out.println("driver : "+ Driver); 
			
			Connection cnx = null;
			 
				try {
					Class.forName(Driver).newInstance();
					this.cnx = DriverManager.getConnection(pseudoURL,"root","");
					} 
				catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) 
					{
					e.printStackTrace();
					} 
				catch (SQLException e) 
					{
					e.printStackTrace();
					}
				finally 
					{
					 if (cnx==null) return false;
					 else return true;
					}
			
			 }
			 
	@SuppressWarnings("finally")
	public ResultSet doSearch(String requete)
				{
				ResultSet rst = null;
				Statement stmt;
				
				try {
					stmt = cnx.createStatement();
					rst=stmt.executeQuery(requete);
					}
				catch (SQLException e) 
					{
					e.printStackTrace();
					System.out.println("Problème dans l'exécution de la requète");
					}
				finally 
					{
					 return rst;
					}
				}


	@SuppressWarnings("finally")
	public Statement doStatement()
		{
		Statement stmt=null;
		try {
			stmt = cnx.createStatement();
			} 
		catch (SQLException e) {e.printStackTrace();}
		finally {return stmt;}
		}	

}