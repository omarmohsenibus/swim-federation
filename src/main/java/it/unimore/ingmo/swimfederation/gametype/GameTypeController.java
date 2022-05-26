package it.unimore.ingmo.swimfederation.gametype;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gameType/")
public class GameTypeController {
    private final GameTypeService service;

    public GameTypeController(GameTypeService service) {
        this.service = service;
    }
}
