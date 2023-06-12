package cl.acc.tutorial.services;

import cl.acc.tutorial.model.UsuarioDto;
import java.util.List;

/**
 *
 * @author Francisco Seguel, francisco.seguel@accenture.com
 */
public interface UsuarioService {

    public UsuarioDto crearUsuario(UsuarioDto usuario);

    public UsuarioDto buscarUsuario(String id);

    public void eliminarUsuario(String id);

    public List<UsuarioDto> listarUsuario();

}
