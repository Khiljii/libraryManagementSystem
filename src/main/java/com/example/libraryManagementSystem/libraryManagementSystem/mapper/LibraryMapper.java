package com.example.libraryManagementSystem.libraryManagementSystem.mapper;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Library;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.BookDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.LibraryDto;
import org.springframework.stereotype.Component;

@Component
public class LibraryMapper {
    public LibraryDto toDto(Library library){
        LibraryDto libraryDto = new LibraryDto();
        libraryDto.setId(library.getId());
        libraryDto.setBookName(library.getBookName());
        libraryDto.setQuantity(library.getQuantity());

        return libraryDto;
    }

    public Library toLibrary(LibraryDto libraryDto) {
        Library library = new Library();
        library.setId(libraryDto.getId());
        library.setBookName(libraryDto.getBookName());
        library.setQuantity(libraryDto.getQuantity());

        return library;
    }
}
