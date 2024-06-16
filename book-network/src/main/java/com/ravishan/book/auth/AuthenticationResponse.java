package com.ravishan.book.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : Book Social Network
 * Created date : 6/15/2024
 * Created time : 3:02 PM
 */
@Getter
@Setter
@Builder
public class AuthenticationResponse {
    private String token;
}
