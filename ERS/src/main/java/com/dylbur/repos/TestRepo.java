package com.dylbur.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dylbur.model.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer> {
	
}
