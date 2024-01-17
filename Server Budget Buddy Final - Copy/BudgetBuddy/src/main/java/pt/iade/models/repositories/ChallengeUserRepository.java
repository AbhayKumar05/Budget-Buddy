package pt.iade.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import pt.iade.models.ChallengeUser;

@Repository
public interface ChallengeUserRepository extends CrudRepository<ChallengeUser,Integer> {
    
} 
