package file.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="users")
public class User extends AbstractEntity {

	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	@Column(name="lang")
	private String lang;
	@Column(name="phone_number")
	private String phone_number;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name="user_role",
			joinColumns= { @JoinColumn(name = "user_id")},
			inverseJoinColumns= { @JoinColumn(name = "role_id")}
			)
	private ArrayList<Role> roles;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public ArrayList<Role> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}

}
