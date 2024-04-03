
    package com.cjits.entity;

import jakarta.persistence.*;

    @Entity
    @Table(name="Bill")
    public class Bill {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long billId;


        @Enumerated(EnumType.STRING)
        @Column(name = "billStatus")
        private BillStatus billStatus;
        @Enumerated(EnumType.STRING)
        @Column(name = "paymentStatus")
        private PaymentStatus paymentStatus;
        @Enumerated(EnumType.STRING)
        @Column(name = "paymentType")
        private PaymentType paymentType;

        public Bill() {
        }

        public Bill(long billId, BillStatus billStatus, PaymentStatus paymentStatus, PaymentType paymentType) {
            this.billId = billId;
            this.billStatus = billStatus;
            this.paymentStatus = paymentStatus;
            this.paymentType = paymentType;
        }

        public long getBillId() {
            return billId;
        }

        public void setBillId(long billId) {
            this.billId = billId;
        }

        public BillStatus getBillStatus() {
            return billStatus;
        }

        public void setBillStatus(BillStatus billStatus) {
            this.billStatus = billStatus;
        }

        public PaymentStatus getPaymentStatus() {
            return paymentStatus;
        }

        public void setPaymentStatus(PaymentStatus paymentStatus) {
            this.paymentStatus = paymentStatus;
        }

        public PaymentType getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
        }

        @Override
        public String toString() {
            return "Bill{" +
                    "billId=" + billId +
                    ", billStatus=" + billStatus +
                    ", paymentStatus=" + paymentStatus +
                    ", paymentType=" + paymentType +
                    '}';
        }

    }
