package com.orange.vac.controller;

import java.util.List;

import com.orange.vac.model.Vaccine;
import com.orange.vac.repository.VaccineRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/vaccines"})
public class VaccineController {

  private VaccineRepository repository;

  public VaccineController(VaccineRepository repository) {
    this.repository = repository;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Vaccine create(@RequestBody Vaccine vaccine) {
    return repository.save(vaccine);
  }

}
