package com.joalvarez.springsecurity.data.domain;

import com.joalvarez.springsecurity.data.type.ERole;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	public static Builder builder() {
		return new Builder();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class Builder {

		private final Role role;

		private Builder() {
			this.role = new Role();
		}

		public Builder id(Long id) {
			this.role.id = id;
			return this;
		}

		public Builder name(String name) {
			this.role.name = name;
			return this;
		}

		public Role build() {
			return this.role;
		}
	}
}
