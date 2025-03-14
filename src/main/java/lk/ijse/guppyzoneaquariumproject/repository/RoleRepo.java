package lk.ijse.guppyzoneaquariumproject.repository;

import lk.ijse.guppyzoneaquariumproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,String> {

}
