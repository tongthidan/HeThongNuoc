package com.example.Mapper;

import com.example.DTO.UserDTO;
import com.example.Entity.User;

public class UserMapping {
	public User UserDTOMapperUser(UserDTO userDTO) {
		User user = new User();
		user.setIdUser(userDTO.getIdUser());
		user.setRole(userDTO.getDoituong());
		user.setFullName(userDTO.getFullName());
		user.setAddress(userDTO.getAddress());
		user.setGmail(userDTO.getGmail());
		user.setSdt(userDTO.getSdt());
		user.setMaND(userDTO.getMaND());
		return user;
	}
	public UserDTO UserMapperUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setIdUser(user.getIdUser());
		userDTO.setDoituong(user.getRole());
		userDTO.setFullName(user.getFullName());
		userDTO.setGmail(user.getGmail());
		userDTO.setSdt(user.getSdt());
		userDTO.setMaND(user.getMaND());
		userDTO.setAddress(user.getAddress());
		
		return userDTO;
	}
}
