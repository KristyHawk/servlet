package com.servletAPI.listener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.servletAPI.servlets.MainServlet;

public class MyAppListener extends GuiceServletContextListener {
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule() {
            @Override
            protected void configureServlets() {
                serve("/").with(MainServlet.class);
            }
        });
    }
}
