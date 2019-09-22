package file.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Table;



@Table(name="message")
public class Message extends AbstractEntity{
	
	@Column(name="body")
	private String body;
	
	@Column(name="from_id")
	Long from_user_id;
	
	@Column(name="to_id")
	Long to_user_id;
	
	@Column(name="date")
	Date date;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getFrom_user_id() {
		return from_user_id;
	}

	public void setFrom_user_id(Long from_user_id) {
		this.from_user_id = from_user_id;
	}

	public Long getTo_user_id() {
		return to_user_id;
	}

	public void setTo_user_id(Long to_user_id) {
		this.to_user_id = to_user_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
