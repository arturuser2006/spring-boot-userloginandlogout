package com.example.demo.tables;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="people")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long id;
	@Column
	private String password;
	@Column
	private String email;
	@Column(unique = true)
	private String username;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Post> posts;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public User() {
		
	}
	
	public User(String password, String email, String username) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
}
