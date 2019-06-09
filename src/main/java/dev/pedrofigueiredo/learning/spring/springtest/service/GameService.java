package dev.pedrofigueiredo.learning.spring.springtest.service;

import dev.pedrofigueiredo.learning.spring.springtest.persistence.model.Game;
import dev.pedrofigueiredo.learning.spring.springtest.persistence.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Iterable<Game> findAll() {
        return gameRepository.findAll();
    }

    public List<Game> findByPlatformName(String name) {
        return gameRepository.findAllByPlatformNameContaining(name);
    }
}
