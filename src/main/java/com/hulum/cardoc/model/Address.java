package com.hulum.cardoc.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record Address(
		@NotNull(message = "Street address is required")
		@Size(min = 5, max = 100, message = "Address must be between 5 and 100 characters")
		String street,
		@NotNull(message = "City is required")
		@Pattern(regexp = "^[A-Za-z][A-Za-z\\s]{1,49}$", message = "Invalid city format")
		String city,
		String state,
		@NotNull(message = "Postal code is required")
		@Pattern(regexp = "^\\d{5}(?:[-\\s]\\d{4})?$", message = "Invalid postal code format")
		int zipCode
) { }
