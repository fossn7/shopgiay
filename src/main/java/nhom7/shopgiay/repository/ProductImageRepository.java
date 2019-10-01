package nhom7.shopgiay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nhom7.shopgiay.entity.ProductImage;

@Repository
@Transactional
public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {

}
