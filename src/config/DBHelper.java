package config;
import java.sql.*;

public class DBHelper {

	private Connection cnx;
	private Statement stat;
	private PreparedStatement pstat;
	private int nbrows;
	private static DBHelper db;
	
	
	public static DBHelper getinstance()
	{
		if (db==null)
		{
			db=new DBHelper();
		}
		return db;
	}
	
	public void beginTransaction() throws Exception{
		try {
			cnx.setAutoCommit(true);
		}catch (Exception e) {
			throw e;
			
		}			
		
	}
	
	public void endTransaction() throws Exception{
		try {
			cnx.setAutoCommit(true);
		}catch (Exception e) {
			throw e;
			
		}			
		
	}
	
	public void commit() throws Exception {
		try {
			cnx.commit();
		}catch (Exception e) {
			throw e;
		}
	}
	
	public void rollback() throws Exception{
		try {
			cnx.rollback();
		}catch (Exception e) {
			throw e;
			
		}			
		
	}
	
	public void openConnexion() throws Exception{
		try {
			if(cnx==null || cnx.isClosed()){
				Class.forName("com.mysql.jdbcvDriver");
				String url ="jdbc:mysql://localhost:3306/geslocationv";
				String user ="root";
				String pw="";
				cnx = DriverManager.getConnection(url, user, pw);
				stat = cnx.createStatement();
			}
		}catch (Exception e) {
			throw e;
			
		}			
		
	}
	
	public int myExecuteUpdate(String sql) throws Exception
	{
		
		nbrows =0;
		try {
			openConnexion();
			nbrows= stat.executeUpdate(sql);
			
		}catch (Exception e) {
			
			throw e;
		}
		return nbrows;
		
	}
	
	public  ResultSet myExecuteQuery(String sql) throws Exception
	{
		
		ResultSet rs;
		try {
			openConnexion();
			rs=stat.executeQuery(sql);
			
		}catch (Exception e) {
			
			throw e;
		}
		return rs;
		
	}
	
	public void myPrepareStatement(String sql) throws Exception{
		try {
			openConnexion();
			if (sql.trim().toLowerCase().startsWith("insert")) {
				pstat =cnx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			}else {
				pstat=cnx.prepareStatement(sql);
			}
			
		}catch (Exception e) {
			throw e;
		}
	}
	 public void addParametres (int i,Object valeur ) throws SQLException
	 {
		 try {
			 pstat.setObject(i, valeur);
		 }catch (SQLException e) {
			 throw e;
		 }
	 }
	
	 public int myExecutePrepareUpdate() throws Exception
		{
			
			nbrows =0;
			try {
				openConnexion();
				nbrows= pstat.executeUpdate();
				
			}catch (Exception e) {
				
				throw e;
			}
			return nbrows;
			
		}
	 
	 public  ResultSet myExecutePrepareQuery() throws Exception
		{
			
			ResultSet rs;
			try {
				openConnexion();
				rs=pstat.executeQuery();
				
			}catch (Exception e) {
				
				throw e;
			}
			return rs;
			
		}
	 
	 public int[] getGeneratedKeys() throws Exception
	 {
		 int[] keys=new int [nbrows];
		 try {
			 ResultSet rs=pstat.getGeneratedKeys();
			 int i=0;
			 while(rs.next());
			 {
				 keys[i]=rs.getInt(i);
				 i++;
			 }
			 rs.close();

			}catch (Exception e) {
				throw e;
			}
		return keys;	 
	 }
	 
	 public void fermerConnexion() throws Exception
	 {
		 try {
			 if(stat!=null && !stat.isClosed());
			 {
				 stat.close();
			 }
			 if(pstat!=null && !pstat.isClosed());
			 {
				 pstat.close();
			 }
			 if(cnx!=null && !cnx.isClosed());
			 {
				 cnx.close();
			 }
		 }catch (Exception e) {
			 throw e;
		 }
	 }

}
