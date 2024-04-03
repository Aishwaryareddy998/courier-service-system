package com.cjits.entity;
import jakarta.persistence.*;
    @Entity
    @Table(name = "Product")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long productId;
        @Enumerated(EnumType.STRING)
        @Column(name = "Type")
        private productType productType;
        @Column(name = "Volume")
        private long productVolume;
        @Column(name = "Weight")
        private long productWeight;
        @ManyToOne
        @JoinColumn(name="id")
        private User user;
        public Product() {
        }

        public Product(long productId, com.cjits.entity.productType productType, long productVolume, long productWeight) {
            this.productId = productId;
            this.productType = productType;
            this.productVolume = productVolume;
            this.productWeight = productWeight;
        }

        public long getProductId() {
            return productId;
        }

        public void setProductId(long productId) {
            this.productId = productId;
        }

        public com.cjits.entity.productType getProductType() {
            return productType;
        }

        public void setProductType(com.cjits.entity.productType productType) {
            this.productType = productType;
        }

        public long getProductVolume() {
            return productVolume;
        }

        public void setProductVolume(long productVolume) {
            this.productVolume = productVolume;
        }

        public long getProductWeight() {
            return productWeight;
        }

        public void setProductWeight(long productWeight) {
            this.productWeight = productWeight;
        }


        @Override
        public String toString() {
            return "Product{" +
                    "productId=" + productId +
                    ", productType=" + productType +
                    ", productVolume=" + productVolume +
                    ", productWeight=" + productWeight +
                    '}';
        }

    }