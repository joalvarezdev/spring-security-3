package com.joalvarez.springsecurity.data.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

	@Id
	private UUID id;
	private String username;
	private String password;
	private String email;

	public User() {}

	public User(UUID id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public static Builder builder() {
		return new Builder();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static class Builder{

		private final User user;

		private Builder() {
			this.user = new User();
		}

		public Builder id(UUID id) {
			this.user.id = id;
			return this;
		}

		public Builder username(String username) {
			this.user.username = username;
			return this;
		}

		public Builder password(String password) {
			this.user.password = password;
			return this;
		}

		public Builder email(String email) {
			this.user.email = email;
			return this;
		}

		public User build() {
			if (Objects.isNull(this.user.id)) {
				this.user.id = UUID.randomUUID();
			}
			return this.user;
		}
	}
}
