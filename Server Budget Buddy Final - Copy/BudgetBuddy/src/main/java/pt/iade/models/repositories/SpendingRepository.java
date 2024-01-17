package pt.iade.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import pt.iade.models.Spending;

@Repository
public interface SpendingRepository extends CrudRepository<Spending,Integer> {

} 
