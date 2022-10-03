package com.capstone.project.services;

import com.capstone.project.dtos.HomeDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface HomeService{

    @Transactional
    void addHome(HomeDto homeDto, Long userId);

    @Transactional
    void deleteHomeById(Long homeId);

    @Transactional
    void updateHomeById(HomeDto homeDto);

    List<HomeDto> getAllHomeByUserId(Long userId);

    Optional<HomeDto> getHomeById(Long homeId);
}

