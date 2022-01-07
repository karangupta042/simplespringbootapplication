package org.tcs.springbootassignment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.tcs.springbootassignment.models.Clone;
import org.tcs.springbootassignment.repositories.CloneRepository;

import java.util.List;

@Service
@CacheConfig(cacheNames={"clones"}) // tells Spring where to store cache for this class

public class CloneService {
    @Autowired
    private CloneRepository cloneRepository;

    @Cacheable // caches the result of findAll() method
    //getting all clone troops
    public List<Clone> findAll(){
        simulateSlowService();
        return this.cloneRepository.findAll();
    }
    public void save(Clone clone){
        cloneRepository.save(clone);
    }
    //to justify why i am using caching to avoid this interruption everytime
    private void simulateSlowService() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
