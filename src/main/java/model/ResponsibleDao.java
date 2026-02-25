package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ResponsibleDao {
	private Dao dao = new Dao();
	
	public List<Responsible> getAllResponsilbes(){
		String querySql = "SELECT * FROM tb_responsibles";
		List<Responsible> responsibles = new ArrayList<Responsible>(); 
		
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(querySql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				
				responsibles.add(new Responsible(id, name));
			}
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return responsibles;
	}
}
