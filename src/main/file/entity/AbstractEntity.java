package file.entity;

import org.springframework.data.annotation.Id;

public class AbstractEntity {
	
	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
