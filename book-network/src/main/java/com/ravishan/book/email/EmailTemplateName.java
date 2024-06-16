package com.ravishan.book.email;

import lombok.Getter;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : Book Social Network
 * Created date : 6/15/2024
 * Created time : 2:13 PM
 */
@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account")
    ;


    private final String name;
    EmailTemplateName(String name) {
        this.name = name;
    }
}
