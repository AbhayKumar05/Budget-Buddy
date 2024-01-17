package pt.iade.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import pt.iade.models.Budget;

@Repository
public interface BudgetRepository extends CrudRepository<Budget,Integer> {

} 
