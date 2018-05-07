package com.example.snapengage.services;

import com.example.snapengage.respository.ChatRepository;

import java.util.List;

import com.example.snapengage.entities.ChatEntity;

public class ChatService {
	private ChatRepository repository;

	
	public List<ChatEntity> listAllEntries() {
		return this.repository.findAll();
	}

	public void setRepository(ChatRepository repository) {
		this.repository = repository;
	}

}
