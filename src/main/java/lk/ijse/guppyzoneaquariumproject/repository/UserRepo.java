package lk.ijse.guppyzoneaquariumproject.repository;

import lk.ijse.guppyzoneaquariumproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    User findByUsername(String userName);

    boolean existsByUsername(String userName);

    int deleteByUsername(String userName);
}
