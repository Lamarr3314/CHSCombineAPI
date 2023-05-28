package com.CHSCombine.API.controller;

import com.CHSCombine.API.entity.PermissionSlip;
import com.CHSCombine.API.service.PermissionSlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class PermissionSlipController {
    @Autowired
    private PermissionSlipService service;

    @PostMapping("/addPermissionSlip")
    public PermissionSlip addPermissionSlip(@RequestBody PermissionSlip permissionSlip) {
        return service.savePermissionSlip(permissionSlip);
    }

    @GetMapping("/permissionSlipByUser/{id}")
    public List<PermissionSlip> permissionSlipByUser(@PathVariable Integer id) {
        return service.permissionSlipByUser(id);
    }

    @PostMapping("/tallyPermissionSlips")
    public void tallyPermissionSlips() {
        service.tallyPermissionSlips();
    }
}
