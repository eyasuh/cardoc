package com.hulum.cardoc.model;

import java.util.UUID;

public record User(
		UUID id,
		String name,
		String password,
		String email,
		String phone,
		Address address
) {
}

