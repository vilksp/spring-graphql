package ksp.vilius.graph.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import ksp.vilius.graph.model.Actor;
import ksp.vilius.graph.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService implements GraphQLQueryResolver {

    @Autowired
    private ActorRepository repository;

    public List<Actor> getAllActors() {
        return repository.findAll();
    }

    public Optional<Actor> getActorById(Long id) {

        return repository.findById(id);
    }
}
