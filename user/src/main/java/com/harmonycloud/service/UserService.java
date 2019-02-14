package com.harmonycloud.service;

import com.harmonycloud.dto.UserDto;
import com.harmonycloud.entity.User;
import com.harmonycloud.repository.UserRepository;
import com.harmonycloud.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.harmonycloud.util.StringUtil;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private JwtUtil jwtUtil = new JwtUtil();

    @Autowired
    private UserRepository userRepository;


    public Map<String, Object> login(String loginname, String password) {
        logger.info("start login......");
        Map<String, Object> result = new HashMap<>();
        try {

            User user = userRepository.findByLoginName(loginname);
           if (user == null) {
                logger.info("login failed.....can't find this user for loginname is {}", loginname);
                return null;
            }
            logger.info("we user the username:{} find this user,its info is {}", loginname, user);
            if (!(StringUtil.EncoderByMd5(password).equals(user.getPassword()))){
                logger.info("login failed....password is wrong!");
                return null;
            }
            UserDto userDto = userRepository.finduser(user.getUserId());
            logger.info("login successful.....");
            String token = jwtUtil.generateToken(userDto.getUserId(), userDto.getLoginName(),userDto.getRole());
            result.put("user", userDto);
            result.put("token", token);
            return result;

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }
}
