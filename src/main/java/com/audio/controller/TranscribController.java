package com.audio.controller;



import com.audio.service.GeminiContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class TranscribController {



    private final GeminiContentService geminiContentService;

    @Autowired
    public TranscribController(GeminiContentService geminiContentService) {
        this.geminiContentService = geminiContentService;
    }

    @PostMapping("/generate-content")
    public String generateContent(@RequestParam("text") String text) {
        return geminiContentService.generateContent(text);
    }

}