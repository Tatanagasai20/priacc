
package com.example.demo.controller;

import com.example.demo.model.LeaveRequest;
import com.example.demo.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LeaveController {

    @Autowired
    private LeaveRepository leaveRepository;

    @PostMapping("/apply-leave")
    public LeaveRequest applyLeave(@RequestBody LeaveRequest request) {
        return leaveRepository.save(request);
    }

    @GetMapping("/leaves")
    public List<LeaveRequest> getAllLeaves() {
        return leaveRepository.findAll();
    }
}
