package com.ic5e.muluo.db.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.ic5e.muluo.db.entity.user.UserVO;

public interface UserRepository extends PagingAndSortingRepository<UserVO, String> {
	
	
	@Query("from User user where code =:code")
    public UserVO findByCode(@Param("code") String code);

}
