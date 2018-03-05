package org.nas.qnap.qflickr.resources;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;

@ApplicationPath(HomePage.PATH)
public class HomePage {
    public static final String PATH = "qflickr";

    @GET
    public static String get() {
        return PATH;
    }
}
