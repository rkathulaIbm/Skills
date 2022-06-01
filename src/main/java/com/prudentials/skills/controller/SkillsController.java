package com.prudentials.skills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prudentials.skills.entity.Skills;
import com.prudentials.skills.reporsitory.SkillsRepo;

@RestController
@RequestMapping(value = "/prudentialSkills")
public class SkillsController {
	
	@Autowired
	private SkillsRepo skillRepo;
	
	
	@PostMapping(value = "/save-skills")
	public Skills saveAssociate(@RequestBody Skills formData) {
		System.out.println("hello");
		return skillRepo.save(formData);
	}
}

