package de.cwansart.springneo4jtest.springneo4jtest.controller;

import de.cwansart.springneo4jtest.springneo4jtest.entities.GeneVariant;
import de.cwansart.springneo4jtest.springneo4jtest.repositories.GeneVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GeneVariantController {

    private final GeneVariantRepository repository;

    @Autowired
    public GeneVariantController(GeneVariantRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/gene-variant")
    public List<GeneVariant> getAll() {
        return this.repository.findAll();
    }

    @GetMapping("/gene-variant/{name}")
    public Optional<GeneVariant> getByName(@PathVariable String name) {
        return this.repository.findById(name);
    }
}
