package nhom7.shopgiay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nhom7.shopgiay.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findAccountByUsername(String username);
}
