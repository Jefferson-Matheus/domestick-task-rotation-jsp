package model;

public enum StatusDomestickTask {
	
	EM_ANDAMENTO(1, "Em andamento"),
	CONCLUIDA(2, "Concluida"),
	PENDENTE(3, "Pendente");

	private final int id;
	private final String status;
	
	StatusDomestickTask(int id, String status) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public String getStatus() {
		return status;
	}
	
	public static StatusDomestickTask getStatusTaskFromDescription(String description) {
		
		for (StatusDomestickTask taskDescription : values()) {
			
			if (taskDescription.status.equalsIgnoreCase(description)) {
				return taskDescription;
			}
		}
		
		return EM_ANDAMENTO;
	}
	
	
	
}
