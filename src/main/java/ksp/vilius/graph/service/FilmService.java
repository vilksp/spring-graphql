package ksp.vilius.graph.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import ksp.vilius.graph.model.Film;
import ksp.vilius.graph.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService implements GraphQLQueryResolver {

    @Autowired
    private FilmRepository repository;

    public List<Film> getAllFilms() {

        return repository.findAll();
    }
}
