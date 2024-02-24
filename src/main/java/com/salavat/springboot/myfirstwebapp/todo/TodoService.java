package com.salavat.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
	private static List<Todo> todos;

	static {
		todos.add(new Todo(1, "salavat", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "salavat", "DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "salavat", "Full Stack Development", LocalDate.now().plusYears(3), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}

}