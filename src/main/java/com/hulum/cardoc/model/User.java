package com.hulum.cardoc.model;

import java.util.UUID;

record User(UUID id, String name, String password, String email, String phone, String address) {
}

