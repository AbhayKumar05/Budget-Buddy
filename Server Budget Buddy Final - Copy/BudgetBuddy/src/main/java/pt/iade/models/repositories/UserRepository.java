package pt.iade.models.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pt.iade.models.User;


@Repository
public interface UserRepository extends CrudRepository<User,Integer> { 
    User findById(int id);
    User findByEmailAndPassword(String email, String password);
    User findByEmailEquals(String email);

}






