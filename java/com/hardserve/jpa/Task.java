package com.hardserve.jpa;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Entity
@Table(name="tasks")
public class Task {
	
	@Id
	@Column(name = "TaskID", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int taskID;
	@Column(name = "TaskDetails")
	private String taskDetails;
	@Column(name = "DateOfCretion")
	private Date dateOfCreation;
	@Column(name = "DueDate")
	private Date dueDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserID")
	private User owner;
	@Column(name="IsComplete")
	private boolean completion;
	
	protected Task() {}
	
	public Task(int taskID, String taskDetails, Date dateOfCreation, Date dueDate, User owner, boolean completion) {
		this.taskID = taskID;
		this.taskDetails = taskDetails;
		this.dateOfCreation = dateOfCreation;
		this.dueDate = dueDate;
		this.owner = owner;
		this.completion = completion;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getTaskDetails() {
		return taskDetails;
	}

	public void setTaskDetails(String taskDetails) {
		this.taskDetails = taskDetails;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public int getOwner() {
		return owner.getUserID();
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public boolean isCompletion() {
		return completion;
	}

	public void setCompletion(boolean completion) {
		this.completion = completion;
	}
	
}
