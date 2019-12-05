package com.example.beenavigator.repos;

import com.example.beenavigator.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository< Message, Long> {
    List<Message> findByTag(String tag);
}
