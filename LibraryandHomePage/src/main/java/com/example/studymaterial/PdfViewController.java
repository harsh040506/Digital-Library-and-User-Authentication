package com.example.studymaterial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdfViewController {

    @GetMapping("/view")
    public String viewPdf() {
        return "viewer";// This maps to src/main/resources/templates/viewer.html
    }
}