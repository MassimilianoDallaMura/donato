package Backend.DonaTo.repository;

import Backend.DonaTo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCity(String city);
    List<Product> findByToBeWithdrawn(boolean toBeWithdrawn);
    List<Product> findByOwnerId(Long ownerId);


}
