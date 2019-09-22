package file.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Table;



@Table(name="message")
public class Message extends AbstractEntity{
	
	@Column(name="body")
	private String body;
	
	@Column(name="from")
	User from;
	
	@Column(name="to")
	User to;
	
	@Column(name="date")
	Date date;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public User getTo() {
		return to;
	}

	public void setTo(User to) {
		this.to = to;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
