package pt.iade.models.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import pt.iade.models.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> { }