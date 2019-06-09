package dev.pedrofigueiredo.learning.spring.springtest.controller;

import dev.pedrofigueiredo.learning.spring.springtest.GameService;
import dev.pedrofigueiredo.learning.spring.springtest.persistence.model.Platform;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GameController {
    private final GameService gameService;

    @GetMapping(path = "/games/platforms/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> findByPlatform(@RequestBody Platform platform) {
        return new ResponseEntity<>(gameService.findByPlatform(platform), HttpStatus.OK);
    }

    @GetMapping(path = "games/platforms/{name}")
    public ResponseEntity<?> findByPlatformName(@PathVariable String name) {
        return new ResponseEntity<>(gameService.findByPlatformName(name), HttpStatus.OK);
    }
}
