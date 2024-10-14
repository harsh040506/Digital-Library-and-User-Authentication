package com.example.studymaterial;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.io.IOException;

@Controller // Use @Controller for returning view names
@RequestMapping("/")
public class PdfControllerSpring {

    @GetMapping("/library")
    public String viewLibrary(Model model) {
        // You can add attributes to the model here if needed
        // For example, if you want to pass user details
        return "Library"; // Return the name of the view without the .html extension
    }
    @GetMapping("/Welcome")
    public String viewWelcome(Model model) {
        // You can add attributes to the model here if needed
        // For example, if you want to pass user details
        return "Welcome"; // Return the name of the view without the .html extension
    }

    @GetMapping("/Applied Chemistry Notes Semester 1")
    public ResponseEntity<Resource> getPdf1() throws IOException {
        Resource resource = new ClassPathResource("static/Applied Chemistry Notes Semester 1.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Applied Chemistry Notes Semester 1.pdf")
                .body(resource);
    }
    @GetMapping("/Applied Mathematics Notes Semester 1")
    public ResponseEntity<Resource> getPdf2() throws IOException {
        Resource resource = new ClassPathResource("static/Applied Mathematics Notes Semester 1.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Applied Mathematics Notes Semester 1.pdf")
                .body(resource);
    }

    @GetMapping("/Applied Physics Notes Semester 1")
    public ResponseEntity<Resource> getPdf3() throws IOException {
        Resource resource = new ClassPathResource("static/Applied Physics Notes Semester 1.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Applied Physics Notes Semester 1.pdf")
                .body(resource);
    }

    @GetMapping("/Electrical Science Notes Semester 1")
    public ResponseEntity<Resource> getPdf4() throws IOException {
        Resource resource = new ClassPathResource("static/Electrical Science Notes Semester 1.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Electrical Science Notes Semester 1.pdf")
                .body(resource);
    }

    @GetMapping("/Manufacturing Processes Notes Semester 1")
    public ResponseEntity<Resource> getPdf5() throws IOException {
        Resource resource = new ClassPathResource("static/Manufacturing Processes Notes Semester 1.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Manufacturing Processes Notes Semester 1.pdf")
                .body(resource);
    }

    @GetMapping("/Alice and Bob Meet the Wall of Fire")
    public ResponseEntity<Resource> getPdf6() throws IOException {
        Resource resource = new ClassPathResource("static/Alice and Bob Meet the Wall of Fire_ The Biggest Ideas in Science from Quanta.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Alice and Bob Meet the Wall of Fire_ The Biggest Ideas in Science from Quanta.pdf")
                .body(resource);
    }

    @GetMapping("/The Prime Number Conspiracy")
    public ResponseEntity<Resource> getPdf7() throws IOException {
        Resource resource = new ClassPathResource("static/The Prime Number Conspiracy_ The Biggest Ideas in Math from Quanta.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=The Prime Number Conspiracy_ The Biggest Ideas in Math from Quanta.pdf")
                .body(resource);
    }

    @GetMapping("/Infinite Powers")
    public ResponseEntity<Resource> getPdf8() throws IOException {
        Resource resource = new ClassPathResource("static/Infinite Powers_ How Calculus Reveals the Secrets of the Universe.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Infinite Powers_ How Calculus Reveals the Secrets of the Universe.pdf")
                .body(resource);
    }

    @GetMapping("/Sapiens")
    public ResponseEntity<Resource> getPdf9() throws IOException {
        Resource resource = new ClassPathResource("static/Sapiens_A_Brief_History_of_Humankind.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Sapiens_A_Brief_History_of_Humankind.pdf")
                .body(resource);
    }

    @GetMapping("/Immune")
    public ResponseEntity<Resource> getPdf10() throws IOException {
        Resource resource = new ClassPathResource("static/Immune A Journey Into the Mysterious System That Keeps You Alive.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Immune A Journey Into the Mysterious System That Keeps You Alive.pdf")
                .body(resource);
    }

    @GetMapping("/Atomic Habits - James Clear")
    public ResponseEntity<Resource> getPdf11() throws IOException {
        Resource resource = new ClassPathResource("static/Atomic Habits - James Clear.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Atomic Habits - James Clear.pdf")
                .body(resource);
    }

    @GetMapping("/Extraterrestrial Languages")
    public ResponseEntity<Resource> getPdf12() throws IOException {
        Resource resource = new ClassPathResource("static/Extraterrestrial Languages.pdf");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Extraterrestrial Languages.pdf")
                .body(resource);
    }
}