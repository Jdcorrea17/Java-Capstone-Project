package com.capstone.project.repositories;

import com.capstone.project.entities.Home;
import com.capstone.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
    List<Home> findAllByUserEquals(User user);
}
