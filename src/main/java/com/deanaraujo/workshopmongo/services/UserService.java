package com.deanaraujo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deanaraujo.workshopmongo.domain.User;
import com.deanaraujo.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired //Autowired (inj. de dependência automática) faz com que o objeto seja instanciado
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
