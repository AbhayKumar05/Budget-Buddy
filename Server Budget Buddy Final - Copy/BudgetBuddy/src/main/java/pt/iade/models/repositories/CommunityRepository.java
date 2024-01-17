package pt.iade.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import pt.iade.models.Community;

@Repository
public interface CommunityRepository extends CrudRepository<Community,Integer> {
    
} 
