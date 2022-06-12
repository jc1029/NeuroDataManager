package com.base01.proyecto1.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.base01.proyecto1.entity.Game;

public interface GameService {
	public Iterable<Game> findAll();
	public Page<Game> findAll(Pageable pageable);
	public Optional<Game> findById(Long Llave);
	public Game save(Game game);
	public void deleteById(Long Llave);
}
