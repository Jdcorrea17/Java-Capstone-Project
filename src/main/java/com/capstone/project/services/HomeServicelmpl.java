package com.capstone.project.services;

import com.capstone.project.dtos.HomeDto;
import com.capstone.project.entities.Home;
import com.capstone.project.entities.User;
import com.capstone.project.repositories.HomeRepository;
import com.capstone.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HomeServicelmpl implements HomeService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HomeRepository homeRepository;

    @Override
    @Transactional
    public void addHome(HomeDto homeDto, Long userId){
        Optional<User> userOptional = userRepository.findById(userId);
        Home home = new Home(homeDto);
        userOptional.ifPresent(home::setUser);
        homeRepository.saveAndFlush(home);
    }

    @Override
    @Transactional
    public void deleteHomeById(Long homeId){
        Optional<Home> homeOptional = homeRepository.findById(homeId);
        homeOptional.ifPresent(home -> homeRepository.delete(home));
    }

    @Override
    @Transactional
    public void updateHomeById(HomeDto homeDto){
        Optional<Home> homeOptional = homeRepository.findById(homeDto.getId());
        homeOptional.ifPresent(home -> {
            homeRepository.saveAndFlush(home);
        });
    }

    @Override
    public List<HomeDto> getAllHomeByUserId(Long userId){
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            List<Home> homeList = homeRepository.findAllByUserEquals(userOptional.get());
            return homeList.stream().map(home -> new HomeDto(home)).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public Optional<HomeDto> getHomeById(Long homeId){
        Optional<Home> homeOptional = homeRepository.findById(homeId);
        if (homeOptional.isPresent()) {
            return Optional.of(new HomeDto(homeOptional.get()));
        }
        return Optional.empty();
    }
}
