package file.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="roles")
public class Role extends AbstractEntity{
	
	@Column(name="name")
	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
