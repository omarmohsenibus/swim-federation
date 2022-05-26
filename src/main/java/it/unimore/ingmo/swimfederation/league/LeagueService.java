package it.unimore.ingmo.swimfederation.league;

import org.springframework.stereotype.Service;

@Service
public class LeagueService {
    private final LeagueRepository repository;


    public LeagueService(LeagueRepository repository) {
        this.repository = repository;
    }
}
