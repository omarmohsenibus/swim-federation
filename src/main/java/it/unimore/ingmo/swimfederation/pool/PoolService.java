package it.unimore.ingmo.swimfederation.pool;

import it.unimore.ingmo.swimfederation.exception.RecordNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PoolService {
    private final PoolRepository repository;

    public PoolService(PoolRepository repository) {
        this.repository = repository;
    }

    public List<Pool> getPools(){
        return repository.findAll();
    }

    public Pool getPoolsById(String name){
        return repository.findById(name)
                .orElseThrow(() -> new RecordNotFoundException("pool not found"));
    }

    public Pool createPool(Pool newPool){
        if(repository.existsById(newPool.getName())){
            throw new RuntimeException("this pool already exists");
        }

        Pool p = new Pool();
        p.setName(newPool.getName());
        p.setAddress(newPool.getAddress());
        p.setDescription(newPool.getDescription());
        p.setNumberOfLanes(newPool.getNumberOfLanes());
        return repository.save(p);
    }
}
