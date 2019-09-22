package file.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import file.entity.Message;
import file.repo.MessageRepository;

@Service
public class MessageService {

	@Autowired
	MessageRepository messageRepo;

	public List<Message> getMessages() {
		return messageRepo.findAll();
	}
	
	public void save(Message message) {
		messageRepo.saveAndFlush(message);
	}
	
}
