package com.harmonycloud.repository;

import com.harmonycloud.dto.UserDto;
import com.harmonycloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByLoginName(String LoginName);

    @Query(nativeQuery = true, value = "select user.*,role.role_name from  user,role where user.user_id = user_role.user_id and role.role_id = user_role.role_id and user.user_id = ?")
    UserDto finduser(int userid);
}
