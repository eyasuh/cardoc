package com.hulum.cardoc.model;

import java.time.LocalDateTime;
import java.util.UUID;

public record Review(
		UUID reviewId,
		UUID customerId,
		UUID merchantId,
		int rating ,
		String message,
		LocalDateTime createdAt
) {
}
