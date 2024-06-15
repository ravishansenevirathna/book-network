package com.ravishan.book.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : Book Social Network
 * Created date : 6/15/2024
 * Created time : 10:16 AM
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {

    @Id
    @GeneratedValue
    private Integer id;

//    @Column(unique = true)
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
    private LocalDateTime validatedAt;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}
