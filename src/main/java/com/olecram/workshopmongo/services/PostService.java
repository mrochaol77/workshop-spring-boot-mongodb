package com.olecram.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olecram.workshopmongo.domain.Post;
import com.olecram.workshopmongo.repositories.PostRepository;
import com.olecram.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	PostRepository repository;
	
	public List<Post> findAll() {
		return repository.findAll();
	}	
	
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id = " + id));
	}
	
}
