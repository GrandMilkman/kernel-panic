package file.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;

	@Column(name="name")
	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
