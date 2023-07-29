package com.devTam.cvProject.Repository;

import com.devTam.cvProject.Entity.UsersAwards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsersAwardsRepository extends JpaRepository<UsersAwards, Integer> {
    @Query(value = "SELECT u FROM UsersAwards u WHERE u.users.id = ?1")
    List<UsersAwards> findAllByUserId(int id);

    @Query(value = "SELECT u FROM UsersAwards u WHERE u.awards.id = ?1")
    List<UsersAwards> findAllByAwardId(int id);

}
