package file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import file.repo.RoleRepository;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepo;

}
