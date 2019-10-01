package nhom7.shopgiay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nhom7.shopgiay.entity.Size;

@Repository
@Transactional
public interface SizeRepository extends JpaRepository<Size, Long> {

}
