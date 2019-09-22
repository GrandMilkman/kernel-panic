package file.mvc;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import file.entity.Message;
import file.service.UserService;

@Component
public class MessageParser {

	@Autowired
	UserService userService;
	
	public Message parseString(String string) {
		Message message=new Message();
		message.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		message.setTo_user_id(0L);
		message.setFrom_user_id(1L);
		message.setBody(string);
		return message;
		
	}
}
