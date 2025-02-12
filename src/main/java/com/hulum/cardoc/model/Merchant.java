package com.hulum.cardoc.model;

import java.util.List;
import java.util.UUID;

public record Merchant(
		UUID shopId,
		UUID userId,
		String shopName,
		List<Service> services,
		int rating,
		Address location
) {
}
