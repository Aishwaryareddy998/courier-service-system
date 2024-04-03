
    package com.cjits.service;
import com.cjits.entity.User;
import java.util.List;
    public interface UserService {

        public User createuser(User user);
        public List<User> getAllUsers();
        public User findUserById(long id) throws RuntimeException;
        public User findUserByUserName(User user,long id) throws RuntimeException;
        public User updateUser(Long id, User user);
        public void deleteUser(long id);
}
