package cl.acc.tutorial.controller;

import cl.acc.tutorial.model.ResponseDto;
import cl.acc.tutorial.model.UsuarioDto;
import cl.acc.tutorial.services.UsuarioService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/add")
    public UsuarioDto add(@RequestBody UsuarioDto usuario) {
        log.debug("UsuarioController - add: " + usuario.toString());
        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping("/{id}/get")
    public UsuarioDto getUsuario(String id) {
        log.debug("UsuarioController - get: " + id);
        return usuarioService.buscarUsuario(id);
    }

    @GetMapping("/{id}/delete")
    public ResponseDto delete(String id) {
        log.debug("UsuarioController - delete: " + id);
        usuarioService.eliminarUsuario(id);
        return ResponseDto.builder().status(true).message(id).build();
    }

    @GetMapping("/getAll")
    public List<UsuarioDto> getAll() {
        log.debug("UsuarioController - getAll: ");
        return usuarioService.listarUsuario();
    }

}
