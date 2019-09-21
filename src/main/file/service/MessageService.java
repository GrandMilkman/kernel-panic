package file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import file.repo.MessageRepository;

@Service
public class MessageService {

	@Autowired
	MessageRepository messageRepo;

}
