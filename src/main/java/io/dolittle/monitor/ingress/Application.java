// Copyright (c) Dolittle. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package io.dolittle.monitor.ingress;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.dolittle.monitor.ingress.config.ping",
        "io.dolittle.monitor.ingress.config.controller",
        "io.dolittle.monitor.ingress.config.k8s"})
@Slf4j
public class Application {
    public static void main(String[] args) {
        log.info("************ Ingress Monitor App STARTED **************");
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }
}
