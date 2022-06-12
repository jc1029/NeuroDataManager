package com.base01.proyecto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base01.proyecto1.entity.User;

@Repository 
public interface UserRepository extends JpaRepository <User,Long>{

}
