package com.songpyeon.groupin.User.handler.ex;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private final ErrorCode errorCode;

}
