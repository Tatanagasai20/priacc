package com.example.backend.controller;

import com.example.backend.model.LeaveRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LeaveController {

    @PostMapping("/apply-leave")
    public String applyLeave(@RequestBody LeaveRequest leaveRequest) {
        return "Leave request received for employee: " + leaveRequest.getEmployeeId();
    }
}

