package ddhy.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import ddhy.model.*;
/**
 * User���JPA Repository
 *
 * @author 灏�缈�
 * @version 1.0.0
 */
public interface DriverRepository extends JpaRepository<YybDriverAccount,Integer>{
	@Query("select d from YybDriverAccount d where d.yybPhone=?1")
	public YybDriverAccount findByName(String name);
	
}