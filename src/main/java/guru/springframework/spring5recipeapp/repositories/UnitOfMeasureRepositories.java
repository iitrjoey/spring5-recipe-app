package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.UnitsOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepositories extends CrudRepository<UnitsOfMeasure, Long> {
}
