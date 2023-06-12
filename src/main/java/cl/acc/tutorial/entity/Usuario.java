package cl.acc.tutorial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author fseguel
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name = "uuid")
    private String id;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "password")
    private String password;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "fechaNac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    @Column(name = "fechaUltLog")
    @Temporal(TemporalType.DATE)
    private Date fechaUltLog;
    
}
