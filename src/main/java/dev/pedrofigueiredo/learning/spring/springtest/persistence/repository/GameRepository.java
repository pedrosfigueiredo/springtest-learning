package dev.pedrofigueiredo.learning.spring.springtest.persistence.repository;

import dev.pedrofigueiredo.learning.spring.springtest.persistence.model.Developer;
import dev.pedrofigueiredo.learning.spring.springtest.persistence.model.Game;
import dev.pedrofigueiredo.learning.spring.springtest.persistence.model.Platform;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface GameRepository extends PagingAndSortingRepository<Game, Long> {

    List<Game> findAllByPlatformOrderByReleaseDateDesc(Platform platform);

    List<Game> findAllByPlatformName(String name);

    @Query("select g from Game g where xid_developer = :developer")
    List<Game> findByDeveloper(Developer developer);
}
