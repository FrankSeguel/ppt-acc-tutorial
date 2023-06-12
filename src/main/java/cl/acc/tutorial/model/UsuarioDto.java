package cl.acc.tutorial.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Francisco Seguel, francisco.seguel@accenture.com
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {

    private String id;

    private String usuario;

    private String nombre;

    private String apellido;

    private String email;

    private Date fechaNac;

}
