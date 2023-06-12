package cl.acc.tutorial.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author fseguel
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SistemaDto {

    private String applicationName;
    private String buildVersion;
    private String buildTimestamp;
    
}
