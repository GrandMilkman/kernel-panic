package file.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import file.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Serializable> {

}
