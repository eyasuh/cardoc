package com.hulum.cardoc.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

public record Appointment(
		@Id
		UUID id,
		UUID customerId,
		UUID mechanicId,
		UUID serviceId,
		LocalDateTime dateTime,
		StatusEnum status
) {
}
