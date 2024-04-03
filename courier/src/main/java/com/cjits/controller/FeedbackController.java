
    package com.cjits.controller;

import com.cjits.entity.Feedback;
import com.cjits.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/feedbacks")
    public class FeedbackController {

        @Autowired
        private FeedbackService feedbackService;

        @GetMapping
        public List<Feedback> getAllFeedbacks() {
            return feedbackService.getAllFeedbacks();
        }

        @GetMapping("/{feedbackId}")
        public ResponseEntity<Feedback> getFeedbackById(@PathVariable Long feedbackId) {
            Feedback feedback = feedbackService.getFeedbackById(feedbackId);
            if (feedback != null) {
                return new ResponseEntity<>(feedback, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @PostMapping
        public ResponseEntity<Feedback> saveFeedback(@RequestBody Feedback feedback) {
            Feedback savedFeedback = feedbackService.saveFeedback(feedback);
            return new ResponseEntity<>(savedFeedback, HttpStatus.CREATED);
        }

        @DeleteMapping("/{feedbackId}")
        public ResponseEntity<Void> deleteFeedback(@PathVariable Long feedbackId) {
            feedbackService.deleteFeedback(feedbackId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }
