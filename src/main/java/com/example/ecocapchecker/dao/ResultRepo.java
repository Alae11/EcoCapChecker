package com.example.ecocapchecker.dao;

import com.example.ecocapchecker.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepo extends JpaRepository<Result,Long> {
}
