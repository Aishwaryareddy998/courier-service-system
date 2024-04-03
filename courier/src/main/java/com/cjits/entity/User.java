
package com.cjits.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

    @Entity
    @Table(name="user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String username;
        private String usertype;
        private String password;
        private String email;
        private Long PhoneNumber;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Long getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(Long phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public String getUsertype() {
            return usertype;
        }

        public void setUsertype(String usertype) {
            this.usertype = usertype;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", usertype='" + usertype + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", PhoneNumber=" + PhoneNumber +
                    '}';
        }
    }

