package org.nas.qnap.qflickr;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("services")
public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        packages("org.nas.qnap.qflickr.resources");
    }
}