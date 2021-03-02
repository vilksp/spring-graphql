package ksp.vilius.graph.repositories;

import ksp.vilius.graph.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ActorRepository extends JpaRepository<Actor,Long> {
}
