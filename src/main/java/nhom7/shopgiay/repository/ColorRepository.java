package nhom7.shopgiay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nhom7.shopgiay.entity.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {

}
