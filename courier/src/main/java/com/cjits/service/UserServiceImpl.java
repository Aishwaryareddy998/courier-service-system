
    package com.cjits.service;
import com.cjits.entity.User;
import com.cjits.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

        @Override
        public User createuser(User user) {
            return userRepository.save(user);
        }

        @Override
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        @Override
        public User findUserById(long id) throws RuntimeException {
            Optional<User> user = userRepository.findById(id);
            if (user.isPresent()) {
                return user.get();
            } else {
                throw new RuntimeException("User not found with id: " + id);
            }
        }

        @Override
        public User findUserByUserName(User user, long id) throws RuntimeException {
            Optional<User> existingUser = userRepository.findById(id);
            if (existingUser.isPresent()) {
                return existingUser.get();
            } else {
                throw new RuntimeException("User not found with id: " + id);
            }
        }

        @Override
        public User updateUser(Long id, User user) {
            Optional<User> existingUser = userRepository.findById(id);
            if (existingUser.isPresent()) {
                user.setId(id);
                return userRepository.save(user);
            } else {
                throw new RuntimeException("User not found with id: " + id);
            }
        }

        @Override
        public void deleteUser(long id) {
            userRepository.deleteById(id);
        }

        public Optional<User> getUserById(Long id) {
            return userRepository.findById(id);
        }

        public Optional<User> getUserByUsername(String username) {
            return userRepository.findByUsername(username);
        }
    }

