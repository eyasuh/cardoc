package com.hulum.cardoc.model;

public record Address(
		String street,
		String city,
		String state,
		int zipCode
) { }
