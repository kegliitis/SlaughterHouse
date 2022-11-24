package via.sdj3.slaughterhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhouse.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>
{
}
