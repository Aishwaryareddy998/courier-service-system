
package com.cjits.repository;
import com.cjits.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    }
