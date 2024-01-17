package pt.iade.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import pt.iade.models.Challenge;

@Repository
public interface ChallengeRepository extends CrudRepository<Challenge,Integer> {
    
} 
