package com.hardserve.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
	
	List<Task> findByOwner_UserID(int userID);
}
