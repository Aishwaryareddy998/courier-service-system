
package com.cjits.service;
import com.cjits.entity.Feedback;
import com.cjits.repository.FeedbackRepository;
import com.cjits.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class FeedbackServiceImpl implements FeedbackService {

        @Autowired
        private FeedbackRepository feedbackRepository;

        @Override
        public List<Feedback> getAllFeedbacks() {
            return feedbackRepository.findAll();
        }

        @Override
        public Feedback getFeedbackById(Long feedbackId) {
            Optional<Feedback> feedbackOptional = feedbackRepository.findById(feedbackId);
            return feedbackOptional.orElse(null);
        }

        @Override
        public Feedback saveFeedback(Feedback feedback) {
            return feedbackRepository.save(feedback);
        }

        @Override
        public void deleteFeedback(Long feedbackId) {
            feedbackRepository.deleteById(feedbackId);
        }
    }

