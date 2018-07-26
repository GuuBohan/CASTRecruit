package com.cast.recruit.service;

import com.cast.recruit.data.UserRepository;
import com.cast.recruit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By GuuBohan.
 * On 2018/7/17
 */
@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

//    @Override
//    public User updateUser(User user) {
//        userRepository.findUserByStudentID(user.getStudentID());
//        return userRepository.save(user);
//    }

//    @Override
//    public List<User> userList() {
//        return userRepository.findAll();
//    }

}
