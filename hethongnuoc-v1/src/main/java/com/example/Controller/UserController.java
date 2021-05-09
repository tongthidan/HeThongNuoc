package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.DTO.UserDTO;
import com.example.Entity.User;
import com.example.Mapper.UserMapping;
import com.example.Repository.UserRepository;

@Controller 
@RequestMapping("api")
public class UserController {
	@Autowired 
	private UserRepository userRepository;
	UserMapping userMapping = new UserMapping();
	//getAllUser -ok
	@GetMapping("/getAllUser")
	@ResponseBody
	public List<UserDTO> getAllUser(){
		List<User > listUser = userRepository.findAll();
		List<UserDTO> listUserDTO = new ArrayList<UserDTO>();
		for(User u : listUser) {
			UserDTO userDTO = userMapping.UserMapperUserDTO(u);
			listUserDTO.add(userDTO);
		}
		
		return listUserDTO;
		
	}
//	findByMaND -ok 
	 @GetMapping("/findByMaND/{maND}")
	 @ResponseBody
	 public List<UserDTO> findByMaND(@PathVariable("maND") String maND){
			List<User > listUser = userRepository.findByMaND(maND);
			List<UserDTO> listUserDTO = new ArrayList<UserDTO>();
			for(User u : listUser) {
				UserDTO userDTO = userMapping.UserMapperUserDTO(u);
				listUserDTO.add(userDTO);
			}
			
			return listUserDTO;
			
	 }
//create User
	 @PostMapping("/createUser")
	 @ResponseBody
	 public HttpStatus createNewUser(@RequestBody User user) {
		 try {
			 
			 userRepository.save(user);
			return HttpStatus.OK;
		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_ACCEPTABLE;
		}
	 }
	 
}
