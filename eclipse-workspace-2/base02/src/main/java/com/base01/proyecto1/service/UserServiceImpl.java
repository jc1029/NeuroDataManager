package com.base01.proyecto1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base01.proyecto1.entity.User;




@Service
public class UserServiceImpl implements UserService{
	
	
@Autowired 
private com.base01.proyecto1.repository.UserRepository UserRepository;



	@Override
	@Transactional(readOnly = true)
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return UserRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return UserRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return UserRepository.findById(id);
	}

	@Override
	@Transactional
	public User save(User user) {
		// TODO Auto-generated method stub
		return UserRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		UserRepository.deleteById(id);
	}

}
