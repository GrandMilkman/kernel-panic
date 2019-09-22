package file.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import file.entity.Message;
import file.service.MessageService;

@Controller
public class MessageGetterController {
	
	@Autowired
	MessageService messageService;
	
	@Autowired
	MessageParser parser;
	
	@GetMapping(path ="/get-message")
	@ResponseBody
	public Message getMessage(@RequestParam("message") String string) {
		return parser.parseString(string);
	}
	
}
