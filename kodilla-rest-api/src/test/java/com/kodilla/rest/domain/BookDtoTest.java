package com.kodilla.rest.domain;

import org.junit.jupiter.api.Test;

class BookDtoTest {
    @Test
    void testBookDto() {
        new com.kodilla.rest.domain.BookDto("title", "author");
    }
}