package com.cjits.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "feedbacks")
public class Feedback {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long feedbackId;

        @Column(nullable = false)
        private String comment;

        // Constructors
        public Feedback() {
        }

        public Feedback(String comment) {
            this.comment = comment;
        }

        // Getters and Setters
        public Long getFeedbackId() {
            return feedbackId;
        }

        public void setFeedbackId(Long feedbackId) {
            this.feedbackId = feedbackId;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

    }
