
    package com.cjits.service;

import com.cjits.entity.Feedback;

import java.util.List;

    public interface FeedbackService {
        List<Feedback> getAllFeedbacks();

        Feedback getFeedbackById(Long feedbackId);

        Feedback saveFeedback(Feedback feedback);

        void deleteFeedback(Long feedbackId);
    }


