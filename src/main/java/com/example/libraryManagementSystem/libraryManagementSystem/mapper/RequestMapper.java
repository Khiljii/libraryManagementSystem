package com.example.libraryManagementSystem.libraryManagementSystem.mapper;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Request;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.BookDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.RequestDto;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {
    public RequestDto toDto(Request request){
        RequestDto requestDto = new RequestDto();
        requestDto.setId(request.getId());
        requestDto.setUsersid(request.getUsersid());
        requestDto.setLibraryid(request.getLibraryid());
        requestDto.setStartDate(request.getStartDate());
        requestDto.setEndDate(request.getEndDate());

        return requestDto;
    }

    public Request toRequest(RequestDto requestDto) {
        Request request = new Request();
        request.setId(requestDto.getId());
        request.setUsersid(requestDto.getUsersid());
        request.setLibraryid(requestDto.getLibraryid());
        request.setStartDate(requestDto.getStartDate());
        request.setEndDate(requestDto.getEndDate());

        return request;
    }
}
