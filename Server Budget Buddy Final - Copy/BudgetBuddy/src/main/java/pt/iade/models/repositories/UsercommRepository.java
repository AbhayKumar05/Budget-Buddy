package pt.iade.models.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import pt.iade.models.Usercomm;

@Repository
public interface UsercommRepository extends CrudRepository<Usercomm,Integer> {
Usercomm findById(int id);
   
} 
