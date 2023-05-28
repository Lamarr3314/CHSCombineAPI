package com.CHSCombine.API.service;

import com.CHSCombine.API.entity.PermissionSlip;
import com.CHSCombine.API.entity.User;
import com.CHSCombine.API.repository.PermissionSlipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Permission;
import java.util.List;

@Service
public class PermissionSlipService {
    @Autowired
    private PermissionSlipRepository repository;

    public PermissionSlip savePermissionSlip(PermissionSlip permissionSlip) {
        return repository.save(permissionSlip);
    }

    public List<PermissionSlip> permissionSlipByUser(Integer userId) {
        return repository.permissionSlipByUser(userId);
    }

    public void tallyPermissionSlips() {
        repository.tallyPermissionSlips();
    }

    // add in one that can change the hasPermissionSlip value in the user instance
}
