package ksp.vilius.graph.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import ksp.vilius.graph.model.Actor;
import ksp.vilius.graph.model.Film;
import ksp.vilius.graph.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService implements GraphQLResolver<Actor> {

    @Autowired
    private FilmRepository repository;


    public  Film getFilm(Actor actor){

        return repository.findById(actor.getFilmId()).get();
    }
}
