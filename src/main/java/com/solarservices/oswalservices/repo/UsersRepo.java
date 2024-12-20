package com.solarservices.oswalservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solarservices.oswalservices.entity.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

}
