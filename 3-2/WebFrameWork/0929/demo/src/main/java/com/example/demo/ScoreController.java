package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {
    @GetMapping("/input")
    public String inputForm(Model model) {
        model.addAttribute("scoreDTO", new ScoreDTO());
        return "inputForm";
    }

    @PostMapping("/result")
    public String result(@ModelAttribute ScoreDTO scoreDTO, Model model) {
        double total = 0;
        if (scoreDTO.getScore1() != null) total += scoreDTO.getScore1();
        if (scoreDTO.getScore2() != null) total += scoreDTO.getScore2();
        if (scoreDTO.getScore3() != null) total += scoreDTO.getScore3();

        double avg = total / 3;

        model.addAttribute("name", scoreDTO.getName());
        model.addAttribute("score1", scoreDTO.getScore1());
        model.addAttribute("score2", scoreDTO.getScore2());
        model.addAttribute("score3", scoreDTO.getScore3());
        model.addAttribute("total", String.format("%.2f", total));
        model.addAttribute("avg", String.format("%.2f", avg));

        return "result";
    }
}
