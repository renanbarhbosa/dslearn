package com.renanbarhbosa.dslearnbootcamp.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.Instant;

public class Topic {

    private Long id;
    private String title;
    private String body;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
