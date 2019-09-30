package nhom7.shopgiay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import nhom7.shopgiay.entity.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	@Query(value = "select c from CartItem c where c.account.id = :id")
	List<CartItem> getListCart(@Param("id") long id);

}
