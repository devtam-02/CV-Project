package com.devTam.cvProject.Repository;

import com.devTam.cvProject.Entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AwardRepository extends JpaRepository<Award, Integer> {
    Award findById(int id);
}
