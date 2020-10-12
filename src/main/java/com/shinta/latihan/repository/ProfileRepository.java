package com.shinta.latihan.repository;

import com.shinta.latihan.model.ProfileEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Integer> {
    
}
