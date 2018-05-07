package com.example.snapengage.respository;
import java.util.Date;
import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.snapengage.entities.ChatEntity;

public interface  ChatRepository extends CrudRepository<ChatEntity, Long> {
     List<ChatEntity> findByCreatedAtDate(Date createdAtDate);
	 List<ChatEntity> findAll();
}
