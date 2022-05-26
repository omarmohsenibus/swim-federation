package it.unimore.ingmo.swimfederation.pool;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pools")
public class PoolController {
    private final PoolService service;

    public PoolController(PoolService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pool> getPools(){
        return service.getPools();
    }

    @GetMapping("/{name}")
    public Pool getPoolsById(@PathVariable String name){
        return service.getPoolsById(name);
    }

    @PostMapping
    public Pool createPool(@RequestBody Pool newPool){
        return service.createPool(newPool);
    }
}
