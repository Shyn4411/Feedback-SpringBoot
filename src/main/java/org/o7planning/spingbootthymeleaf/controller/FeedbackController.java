package org.o7planning.spingbootthymeleaf.controller;

import org.o7planning.spingbootthymeleaf.model.Feedback;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @GetMapping("/feedback")
    public String showFeedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/feedback")
    public String submitFeedback(@ModelAttribute("feedback") Feedback feedback, Model model) {
        System.out.println("===== PHẢN HỒI KHÁCH HÀNG =====");
        System.out.println("Họ tên: " + feedback.getName());
        System.out.println("Email: " + feedback.getEmail());
        System.out.println("Dịch vụ: " + feedback.getService());
        System.out.println("Đánh giá: " + feedback.getRating());
        System.out.println("Nội dung: " + feedback.getMessage());

        model.addAttribute("feedback", feedback);
        return "feedback-success";
    }
}