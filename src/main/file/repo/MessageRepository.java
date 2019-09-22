package file.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import file.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Serializable> {

}
