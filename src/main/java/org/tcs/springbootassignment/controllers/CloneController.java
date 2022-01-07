package org.tcs.springbootassignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tcs.springbootassignment.models.Clone;
import org.tcs.springbootassignment.repositories.CloneRepository;
import org.tcs.springbootassignment.services.CloneService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kamino")
public class CloneController {
    @Autowired
    private CloneRepository repository;
    @Autowired
    private CloneService cloneservice;

    @GetMapping("/")
    public List<Clone> findAll() {
        return cloneservice.findAll();
    }

    @PostMapping()
    public Clone createClone(@RequestBody Clone clone){
        return repository.save(clone);
    }

    @GetMapping("/{id}")
    public Clone findById(@PathVariable("id") Long id)  {
        return getOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        Clone clone = getOne(id);
        repository.delete(clone);
    }

    protected Clone getOne(Long id) {
        Optional<Clone> clone = repository.findById(id);
        return clone.get();
    }
}
