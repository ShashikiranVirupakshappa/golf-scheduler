package com.javabro.resourceserver.lesson;

import com.javabro.resourceserver.lesson.model.Lesson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class LessonController {
    @GetMapping("/lessons")
    public List<Lesson> getLessons() {
        System.out.println("getLessons method called");
        Lesson lesson1 = new Lesson("Beginners Golf Basics", "An introduction to the fundamentals of golf", "John Doe",
                LocalDateTime.of(2025, 7, 31, 10, 0));
        Lesson lesson2 = new Lesson("Advanced Swing Techniques", "Improve your swing with advanced techniques", "Jane Smith",
                LocalDateTime.of(2025, 8, 1, 10, 0));
        System.out.println(Arrays.asList(lesson1,lesson2));
        return Arrays.asList(lesson1,lesson2);
    }
}
