package by.hren.apps.resipeproject.repositories;

import by.hren.apps.resipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
