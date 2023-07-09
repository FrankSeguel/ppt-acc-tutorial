package cl.acc.tutorial.controller;

import cl.acc.tutorial.model.ResponseDto;
import cl.acc.tutorial.model.UsuarioDto;
import cl.acc.tutorial.services.UsuarioService;
import io.swagger.annotations.Api;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(value = "api", tags = {""}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, protocols = "http, https")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PutMapping("/add")
    public UsuarioDto add(@RequestBody UsuarioDto usuario) {
        log.info("UsuarioController - add: " + usuario.toString());
        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping("/{id}/get")
    public UsuarioDto getUsuario(@PathVariable("id") String id) {
        log.info("UsuarioController - get: " + id);
        return usuarioService.buscarUsuario(id);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseDto delete(@PathVariable("id") String id) {
        log.info("UsuarioController - delete: " + id);
        usuarioService.eliminarUsuario(id);
        return ResponseDto.builder().status(true).message(id).build();
    }

    @GetMapping("/getAll")
    public List<UsuarioDto> getAll() {
        log.info("UsuarioController - getAll: ");
        return usuarioService.listarUsuario();
    }

}
