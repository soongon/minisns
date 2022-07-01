package kr.re.kitri.minisns.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public ErrorModel handleBSGException(BadSqlGrammarException e) {
        System.out.println("로그입니다.");
        return new ErrorModel(510, "잘못된 SQL 문법", e.getMessage());
    }



    @ExceptionHandler(value = Throwable.class)
    public ErrorModel handleAllException(Throwable e) {
        return new ErrorModel(500, "기타 알수없는 에러", e.getMessage());
    }


}
