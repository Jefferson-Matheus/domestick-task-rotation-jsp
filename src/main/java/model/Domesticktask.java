package model;

import java.io.Serializable;
import java.util.Date;

public class Domesticktask implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String name;
    private String instructions;
    private Date start_date_task;
    private Date end_date_task;
    private String status_task;
    private Responsible responsible;
    
    
	public Domesticktask() {
		super();
	}
	
	
	public Domesticktask(Long id, String name, String instructions, Date start_date_task, Date end_date_task,
			String status_task, Responsible responsible) {
		super();
		this.id = id;
		this.name = name;
		this.instructions = instructions;
		this.start_date_task = start_date_task;
		this.end_date_task = end_date_task;
		this.status_task = status_task;
		this.responsible = responsible;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public Date getStart_date_task() {
		return start_date_task;
	}
	public void setStart_date_task(Date start_date_task) {
		this.start_date_task = start_date_task;
	}
	public Date getEnd_date_task() {
		return end_date_task;
	}
	public void setEnd_date_task(Date end_date_task) {
		this.end_date_task = end_date_task;
	}
	public String getStatus_task() {
		return status_task;
	}
	public void setStatus_task(String status_task) {
		this.status_task = status_task;
	}
	public Responsible getResponsible() {
		return responsible;
	}
	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
