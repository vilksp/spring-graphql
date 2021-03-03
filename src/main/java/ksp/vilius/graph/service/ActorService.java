package ksp.vilius.graph.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import ksp.vilius.graph.model.Actor;
import ksp.vilius.graph.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ActorRepository repository;

    public List<Actor> getAllActors() {
        return repository.findAll();
    }

    public Optional<Actor> getActorById(Long id) {

        return repository.findById(id);
    }

    @Transactional
    public Actor updateAddress(Long id, String address) {
        Actor actor = repository.findById(id).get();
        actor.setAddress(address);
        return repository.save(actor);
    }
}
