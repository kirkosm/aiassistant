package com.chatbot.aiassistant.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sender; // "user" ή "bot"
    private String content;

    private LocalDateTime timestamp;

    @ManyToOne
    private ChatThread thread;

    @PrePersist
    public void prePersist() {
        timestamp = LocalDateTime.now();
    }

    // Getters και setters εδώ...
}
