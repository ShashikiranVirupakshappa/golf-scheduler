package com.javabro.resourceserver.lesson.model;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
@Setter
@ToString
public class Lesson {
    private String title;
    private String description;
    private String instructor;
    private LocalDateTime schedule;
}
