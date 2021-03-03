package ksp.vilius.graph;

import ksp.vilius.graph.model.Actor;
import ksp.vilius.graph.model.Film;
import ksp.vilius.graph.repositories.ActorRepository;
import ksp.vilius.graph.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
public class SpringGraphApplication {

    @Autowired
    private ActorRepository actorRepository;
    @Autowired
    private FilmRepository filmRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringGraphApplication.class, args);
    }

    @PostConstruct
    public void loadData() {
        actorRepository.save(Actor.builder().id(1L).filmId(3L).firstName("John").lastName("Wick").address("Brooklyn").dateOfBirth(new Date(1999, 9, 14)).build());
        actorRepository.save(Actor.builder().id(2L).filmId(4L).firstName("Mister").lastName("Bean").address("London").dateOfBirth(new Date(1994, 3, 6)).build());

        filmRepository.save(Film.builder().id(1L).film_name("Hot summer nights").releaseYear(new Date(2018)).build());
        filmRepository.save(Film.builder().id(2L).film_name("Stars in our fault").releaseYear(new Date(99)).build());
    }

}
