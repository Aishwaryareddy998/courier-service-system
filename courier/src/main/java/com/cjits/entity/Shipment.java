
    package com.cjits.entity;

import jakarta.persistence.*;
import java.util.Date;

    @Entity
    @Table(name = "Shipment")
    public class Shipment {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long shipment_id;
        @Column(name = "start_date")
        private Date start_date;
        @Column(name = "recieve_date")
        private Date recieve_date;
        @Enumerated(EnumType.STRING)
        @Column(name = "shipment_status")
        private shipment_status shipment_status;
        @Column(name = "distance")
        private long distance;
        @Column(name = "shipment_volume")
        private String shipment_volume;
        @Column(name = "weight")
        private long weight;
        public Shipment() {
        }

        public Shipment(Date start_date, Date recieve_date, long started_by, long recieved_by, com.cjits.entity.shipment_status shipment_status, long distance, String shipment_volume, long weight) {
            super();
            this.start_date = start_date;
            this.recieve_date = recieve_date;
            this.shipment_status = shipment_status;
            this.distance = distance;
            this.shipment_volume = shipment_volume;
            this.weight = weight;
        }

        public long getShipment_id() {
            return shipment_id;
        }

        public void setShipment_id(long shipment_id) {
            this.shipment_id = shipment_id;
        }

        public Date getStart_date() {
            return start_date;
        }

        public void setStart_date(Date start_date) {
            this.start_date = start_date;
        }

        public Date getRecieve_date() {
            return recieve_date;
        }

        public void setRecieve_date(Date recieve_date) {
            this.recieve_date = recieve_date;
        }

        public com.cjits.entity.shipment_status getShipment_status() {
            return shipment_status;
        }

        public void setShipment_status(com.cjits.entity.shipment_status shipment_status) {
            this.shipment_status = shipment_status;
        }

        public String getShipment_volume() {
            return shipment_volume;
        }

        public void setShipment_volume(String shipment_volume) {
            this.shipment_volume = shipment_volume;
        }

        public long getDistance() {
            return distance;
        }

        public void setDistance(long distance) {
            this.distance = distance;
        }


        public long getWeight() {
            return weight;
        }

        public void setWeight(long weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return shipment_id +
                    "," + start_date +
                    "," + recieve_date +
                    "," + shipment_status + '\'' +
                    "," + distance +
                    "," + shipment_volume + '\'' +
                    "," + weight;
        }
    }

