package com.wcs.checkpoint2.portfolio.repository;

import com.wcs.checkpoint2.portfolio.model.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ToolRepository extends JpaRepository<Tool, UUID> {

}
