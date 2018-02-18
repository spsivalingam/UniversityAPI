package uncc.api.uncc.api.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by sivalingam on 2/10/2018.
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = Exception.class)
    ResponseEntity invalidUser(){
        return new ResponseEntity(new ErrorInfo("Invalid Credentails","unauthorized"),HttpStatus.UNAUTHORIZED);
    }








    class ErrorInfo{
        String message;
        String status;

        public ErrorInfo(String message,String status){
            this.message=message;
            this.status=status;
        }
    }

}
