package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Content;

public interface ContentRepository extends JpaRepository<Content, Integer> {

}
