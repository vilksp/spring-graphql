package ksp.vilius.graph.service;

import ksp.vilius.graph.model.Actor;
import ksp.vilius.graph.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository repository;

    public List<Actor> getAllActors() {
        return repository.findAll();
    }
}
