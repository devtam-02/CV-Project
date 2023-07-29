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

//    @Query("SELECT s FROM Users s INNER JOIN Award a Where s.id = ?1 and s.award_id = a.id")
//    @Query("SELECT s FROM Users s INNER JOIN users_awards ua WHERE s.id = ua.users_id and ua.awards_id = ?1")
    @Query("SELECT s FROM Users s")
    public List<Users> findAllUserInAward(int id);

    Users findById(int id);
}
