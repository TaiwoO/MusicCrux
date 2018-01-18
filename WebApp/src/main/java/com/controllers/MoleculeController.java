package com.controllers;

import com.services.MoleculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MoleculeController {

    @Autowired
    private MoleculeService moleculeService;
}
