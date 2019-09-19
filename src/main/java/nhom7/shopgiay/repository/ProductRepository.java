package nhom7.shopgiay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nhom7.shopgiay.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
