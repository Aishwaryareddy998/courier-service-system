
    package com.cjits.entity;

import jakarta.persistence.*;

    @Entity
    public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "houseNo")
        private String houseNo;

        @Column(name = "streetNo")
        private String streetNo;

        @Column(name = "city")
        private String city;

        @Column(name = "state")
        private String state;

        @Enumerated(EnumType.STRING)
        @Column(name = "country")
        private Country country;

        public Address() {
        }

        public Address(Long id, String houseNo, String streetNo, String city, String state, Country country) {
            this.id = id;
            this.houseNo = houseNo;
            this.streetNo = streetNo;
            this.city = city;
            this.state = state;
            this.country = country;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(String houseNo) {
            this.houseNo = houseNo;
        }

        public String getStreetNo() {
            return streetNo;
        }

        public void setStreetNo(String streetNo) {
            this.streetNo = streetNo;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "id=" + id +
                    ", houseNo='" + houseNo + '\'' +
                    ", streetNo='" + streetNo + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", country=" + country +
                    '}';
        }

    }
