package cl.acc.tutorial.controller;

import cl.acc.tutorial.model.SistemaDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Francisco Seguel, francisco.seguel@accenture.com
 */
@Slf4j
@RestController
@RequestMapping("/sistema")
public class HealthcheckController {

    @Value("${application.name}")
    private String applicationName;

    @Value("${build.version}")
    private String buildVersion;

    @Value("${build.timestamp}")
    private String buildTimestamp;
    
    @GetMapping("/info")
    public SistemaDto getInfo() {

        log.debug("name: " + applicationName);
        log.debug("version: " + buildVersion);
        log.debug("timestamp: " + buildTimestamp);

        return SistemaDto.builder().applicationName(applicationName).buildTimestamp(buildTimestamp).buildVersion(buildVersion).build();
    }
}
