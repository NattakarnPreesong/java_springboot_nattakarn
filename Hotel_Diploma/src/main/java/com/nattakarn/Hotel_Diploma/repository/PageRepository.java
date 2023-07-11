package com.nattakarn.Hotel_Diploma.repository;

import com.nattakarn.Hotel_Diploma.entity.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface PageRepository extends JpaRepository<Page,Integer> {


}
