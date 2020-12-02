package com.dailycodebuffer.user.repository;

import com.dailycodebuffer.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<User, String> { }
