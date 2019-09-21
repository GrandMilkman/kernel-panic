package file.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository implements JpaRepository<Message, Serializable> {

}
