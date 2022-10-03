package com.capstone.project.controller;

import com.capstone.project.dtos.HomeDto;
import com.capstone.project.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/homes")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/user/{userId}")
    public List<HomeDto> getHomeByIdByUser(@PathVariable Long userId) {
        return homeService.getAllHomeByUserId(userId);
    }

    @PostMapping("/user/{userId}")
    public void addHouse(@RequestBody HomeDto homeDto, @PathVariable Long userId) {
        homeService.addHome(homeDto, userId);
    }

    @DeleteMapping("/{homeId}")
    public void deleteHomeById(@PathVariable Long homeId) {
        homeService.deleteHomeById(homeId);
    }

    @PutMapping
    public void updateHome(@RequestBody HomeDto homeDto) {
        homeService.updateHomeById(homeDto);
    }

    @GetMapping("/{homeId}")
    public Optional<HomeDto> getHomeById(@PathVariable Long homeId) {
        return homeService.getHomeById(homeId);
    }
}