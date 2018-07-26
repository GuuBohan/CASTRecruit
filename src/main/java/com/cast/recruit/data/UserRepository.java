package com.cast.recruit.data;

import com.cast.recruit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created By GuuBohan.
 * On 2018/7/15
 */
public interface UserRepository extends JpaRepository<User, String>{
//    User findUserByStudentID(String studentID);
}
