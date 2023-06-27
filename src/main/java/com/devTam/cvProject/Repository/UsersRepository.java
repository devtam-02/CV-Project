package com.devTam.cvProject.Repository;

import com.devTam.cvProject.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    @Query("SELECT s FROM Users s WHERE s.email = ?1")
    public List<Users> findAllUsersByEmail(String email);
}
