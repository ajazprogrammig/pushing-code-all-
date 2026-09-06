package __CompositePK_AJAZ.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import __CompositePK_AJAZ.Enity.Account1;
import __CompositePK_AJAZ.Enity.Accountpk;

public interface AcconRepository extends JpaRepository<Account1, Accountpk> {

}
