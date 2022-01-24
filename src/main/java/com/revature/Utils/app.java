package com.revature.Utils;

import com.revature.controllers.*;
import io.javalin.Javalin;

public class app {
    public static Javalin app;

    public static void main(String[] args) {
        app = Javalin.create();
        configure();
        app.start();
    }

    private static void configure(Controller... controllers) {
        for(Controller c: controllers){
            c.addRoutes(app);
        }
    }
}
