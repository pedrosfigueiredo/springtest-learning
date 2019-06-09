package dev.pedrofigueiredo.learning.spring.springtest.controller;

import dev.pedrofigueiredo.learning.spring.springtest.service.GameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GameController {
    private final GameService gameService;

    @GetMapping(path = "games/")
    public ResponseEntity<?> findAllGames() {
        return new ResponseEntity<>(gameService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "games/platforms/{name}")
    public ResponseEntity<?> findByPlatformName(@PathVariable String name) {
        return new ResponseEntity<>(gameService.findByPlatformName(name), HttpStatus.OK);
    }
}
