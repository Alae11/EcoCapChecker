package com.example.ecocapchecker.dao;

import com.example.ecocapchecker.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepo extends JpaRepository<Application,Long> {
}
