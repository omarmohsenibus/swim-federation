package it.unimore.ingmo.swimfederation.league;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/leagues")
public class LeagueController {
    private final LeagueService service;

    public LeagueController(LeagueService service) {
        this.service = service;
    }
}
