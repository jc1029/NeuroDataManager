package com.base01.proyecto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base01.proyecto1.entity.Game;

public interface GameRepository extends JpaRepository <Game,Long>{

}
