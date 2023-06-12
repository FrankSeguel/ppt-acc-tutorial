package cl.acc.tutorial.model;

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
public class ResponseDto {

    private boolean status;
    private String message;
}
