/*
 * Copyright 2017 Pamarin.com
 */

package com.pamarin.oauth2.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jittagornp <http://jittagornp.me>
 * create : 2017/09/24
 */
@SpringBootApplication
@ComponentScan("com.pamarin")
public class AppStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppStarter.class, args);
    }

}
