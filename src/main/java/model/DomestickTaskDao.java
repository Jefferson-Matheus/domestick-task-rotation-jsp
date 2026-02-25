package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DomestickTaskDao {
	
	private Dao dao = new Dao();
	
	public List<Domesticktask> getAllDomestickTasks(){
		
		String sqlQuery = "SELECT \n"
				+ "dmt.id,\n"
				+ "dmt.name,\n"
				+ "dmt.instructions,\n"
				+ "dmt.start_date_task,\n"
				+ "dmt.end_date_task,\n"
				+ "dmt.status_task,\n"
				+ "r.name\n"
				+ "FROM tb_dosmetick_task dmt\n"
				+ "JOIN tb_responsibles r on\n"
				+ "dmt.id_responsible = r.id";
		
		List<Domesticktask> domestickTasks = new ArrayList<Domesticktask>();
		
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Domesticktask domestickTask = new Domesticktask();
				domestickTask.setId(resultSet.getLong(1));
				domestickTask.setName(resultSet.getString(2));
				domestickTask.setInstructions(resultSet.getString(3));
				domestickTask.setStart_date_task(resultSet.getDate(4));
				domestickTask.setEnd_date_task(resultSet.getDate(5));
				domestickTask.setStatus_task(resultSet.getString(6));
				
				Responsible responsible = new Responsible();
				responsible.setName(resultSet.getString(7));
				
				domestickTask.setResponsible(responsible);
				
				domestickTasks.add(domestickTask);
				
			}
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return domestickTasks;
	}
}
