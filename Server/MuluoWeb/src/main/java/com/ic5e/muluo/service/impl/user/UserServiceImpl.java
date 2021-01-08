package com.ic5e.muluo.service.impl.user;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ic5e.muluo.db.entity.user.UserVO;
import com.ic5e.muluo.db.jpa.UserRepository;
import com.ic5e.muluo.dto.UserDto;
import com.ic5e.muluo.service.user.UserService;
import com.ic5e.muluo.util.beans.BeanUtils;

@Service
@Component("userService")
public class UserServiceImpl implements UserService {
	private static String[] IGNORE = { "password" };
	@Autowired
	UserRepository userRepository;

	@Override
	public void save(UserDto dto) {
		UserVO vo = new UserVO();
		if(StringUtils.isEmpty(dto.getId())) {
			BeanUtils.copyProperties(dto, vo);
		}else {
			BeanUtils.copyProperties(dto, vo,IGNORE);
		}
		userRepository.save(vo);
	}

	@Override
	public int chechUser(UserDto dto) {
		if(StringUtils.isEmpty(dto.getCode())) {
			return UserService.USER_CODE_IS_NULL;
		}
		if(StringUtils.isEmpty(dto.getPassword())) {
			return UserService.PASSWORD_IS_NULL;
		}
		UserVO user = userRepository.findByCode(dto.getCode());
		if(user==null) {
			return UserService.USER_NOT_EXIT;
		}
		if(!dto.getPassword().equals(user.getPassword())) {
			return UserService.PASSWORD_IS_WRONG;
		}
		if(user.isLocked()) {
			return UserService.USER_ISLOCKED;
		}
		return UserService.SUCCESS;
	}
	@Override
	public Page<UserDto> findAllByPage(Pageable page) {
		Page<UserVO> vos = userRepository.findAll(page);
		List<UserDto> dtos = vos.getContent().stream().map(item -> {
			UserDto dto = new UserDto();
			BeanUtils.copyProperties(item, dto, IGNORE);
			return dto;
		}).collect(Collectors.toList());
		
		Page<UserDto> result = new PageImpl<UserDto>(dtos, vos.getPageable(), vos.getTotalElements());
		return result;
	}

}
