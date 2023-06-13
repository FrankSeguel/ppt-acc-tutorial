package cl.acc.tutorial.handler;

import cl.acc.tutorial.exception.BusinessException;
import cl.acc.tutorial.exception.ErrorTecnicoException;
import cl.acc.tutorial.model.ResponseDto;
import cl.acc.tutorial.utils.Constantes;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author fseguel
 */
@Slf4j
@ControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE)
public class ExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(HibernateException.class)
    @Order(Ordered.LOWEST_PRECEDENCE)
    public ResponseEntity<ResponseDto> manageInternalServerErrorByDefault(HibernateException exception) {
        log.error(exception.getMessage());
        ResponseDto errorDto = new ResponseDto(false, Constantes.MESSAGE_ERROR_TECNICO);
        return new ResponseEntity<>(errorDto, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @Order(Ordered.LOWEST_PRECEDENCE)
    public ResponseEntity<ResponseDto> manageInternalServerErrorByDefault(Exception exception) {
        log.error(exception.getMessage());
        ResponseDto errorDto = new ResponseDto(false, Constantes.MESSAGE_ERROR_TECNICO);
        return new ResponseEntity<>(errorDto, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class)
    @Order(Ordered.LOWEST_PRECEDENCE)
    public ResponseEntity<ResponseDto> manageInternalServerErrorByDefault(BusinessException exception) {
        log.error(exception.getDescripcion());
        ResponseDto errorDto = new ResponseDto(false, Constantes.MESSAGE_ERROR_TECNICO);
        return new ResponseEntity<>(errorDto, new HttpHeaders(), 460);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(ErrorTecnicoException.class)
    @Order(Ordered.LOWEST_PRECEDENCE)
    public ResponseEntity<ResponseDto> manageInternalServerErrorByDefault(ErrorTecnicoException exception) {
        log.error(exception.getDescripcion());
        ResponseDto errorDto = new ResponseDto(false, Constantes.MESSAGE_ERROR_TECNICO);
        return new ResponseEntity<>(errorDto, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
