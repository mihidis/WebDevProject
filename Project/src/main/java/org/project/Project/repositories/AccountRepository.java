package org.project.Project.repositories;

import org.springframework.stereotype.Repository;
import org.project.Project.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
