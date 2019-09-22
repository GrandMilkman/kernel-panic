package file.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import file.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {

}
