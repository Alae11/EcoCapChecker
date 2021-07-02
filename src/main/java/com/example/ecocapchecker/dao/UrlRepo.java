package com.example.ecocapchecker.dao;

import com.example.ecocapchecker.entities.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepo extends JpaRepository<Url,Long> {
}
