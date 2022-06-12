package com.base01.proyecto1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base01.proyecto1.entity.Game;




@Service
public class GameServiceImpl implements GameService{
	
	
@Autowired 
private com.base01.proyecto1.repository.GameRepository GameRepository;



	@Override
	@Transactional(readOnly = true)
	public Iterable<Game> findAll() {
		// TODO Auto-generated method stub
		return GameRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Game> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return GameRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Game> findById(Long Llave) {
		// TODO Auto-generated method stub
		return GameRepository.findById(Llave);
	}

	@Override
	@Transactional
	public Game save(Game game) {
		// TODO Auto-generated method stub
		return GameRepository.save(game);
	}

	@Override
	@Transactional
	public void deleteById(Long Llave) {
		// TODO Auto-generated method stub
		GameRepository.deleteById(Llave);
	}

}
