package com.ic5e.muluo.service.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ic5e.muluo.dto.UserDto;

public interface UserService {
	public static int SUCCESS = 1;
	public static int USER_CODE_IS_NULL = 2;
	public static int USER_NOT_EXIT = 3;
	public static int PASSWORD_IS_NULL = 4;
	public static int PASSWORD_IS_WRONG = 5;
	public static int USER_ISLOCKED = 6;

	public void save(UserDto dto);

	public int chechUser(UserDto dto);

	public Page<UserDto> findAllByPage(Pageable page);
	
}
