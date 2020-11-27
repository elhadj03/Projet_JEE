package com.masterips.ProjetJEE.Controler;

import org.springframework.web.bind.annotation.GetMapping;

public class TaskController {
	@GetMapping("list-task")
	public String listTasks() {
		return "view/list-task";
	}
	
	@GetMapping("add-task")
	public String addtask () {
		return "view/add-task";
	}
}
