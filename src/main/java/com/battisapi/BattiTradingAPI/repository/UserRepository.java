package com.battisapi.BattiTradingAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.battisapi.BattiTradingAPI.entity.User;



public interface UserRepository extends JpaRepository<User,Integer> {

}
