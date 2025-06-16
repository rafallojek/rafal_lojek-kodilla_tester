package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

class BookControllerTest2 {

    @Test
    void shouldAddBook() {
        // given
        BookService bookService = mock(BookService.class);
        BookController bookController = new BookController(bookService);
        BookDto bookDto = new BookDto("Tytuł", "Autor");

        // when
        bookController.addBook(bookDto);

        // then
        ArgumentCaptor<BookDto> captor = ArgumentCaptor.forClass(BookDto.class);
        verify(bookService, times(1)).addBook(captor.capture());
        BookDto capturedBook = captor.getValue();
        assert capturedBook.getTitle().equals("Tytuł");
        assert capturedBook.getAuthor().equals("Autor");
    }
}
