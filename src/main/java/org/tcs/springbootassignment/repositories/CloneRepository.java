package org.tcs.springbootassignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tcs.springbootassignment.models.Clone;

public interface CloneRepository extends JpaRepository<Clone, Long> {
}
