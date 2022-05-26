package it.unimore.ingmo.swimfederation.gametype;

import org.springframework.stereotype.Service;

@Service
public class GameTypeService {
    private final GameTypeRepository repository;

    public GameTypeService(GameTypeRepository repository) {
        this.repository = repository;
    }
}
