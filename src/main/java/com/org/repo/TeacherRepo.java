package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.domain.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
