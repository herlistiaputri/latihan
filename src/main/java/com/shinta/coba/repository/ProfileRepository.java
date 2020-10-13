package com.shinta.coba.repository;

import com.shinta.coba.model.ProfileEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Integer> {
    
}
