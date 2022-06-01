package com.prudentials.skills.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prudentials.skills.entity.Skills;

@Repository
public interface SkillsRepo extends JpaRepository<Skills,Long>{

	
}
