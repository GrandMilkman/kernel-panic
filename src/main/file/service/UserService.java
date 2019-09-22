package file.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import file.entity.User;
import file.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public List<User> getUsers() {
		return userRepo.findAll();
	}

	public User getUser(final String name) {
		User user = new User();
		user.setName(name);
		return userRepo.findOne(Example.of(user)).get();
	}

}
