package com.hulum.cardoc.model;

import java.math.BigDecimal;
import java.util.UUID;

public record Service(
		UUID id,
		String name,
		String description,
		BigDecimal price
) {
}
