package skate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skate.beans.Skateboard;

/**
 * @author dominicwood - ddwood2@dmacc.edu
 * CIS175 - Fall 2022
 * Oct 17, 2022
 */
@Repository
public interface SkateRepository extends JpaRepository<Skateboard, Long>{
	
}
