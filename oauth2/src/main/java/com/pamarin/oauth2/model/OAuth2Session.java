/*
 * Copyright 2017 Pamarin.com
 */
package com.pamarin.oauth2.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2017/12/02
 */
@Getter
@Setter
@Builder
public class OAuth2Session {

    private String id;
    
    private long issuedAt;
    
    private long expiresAt;

    private User user;

    private Client client;

    @Getter
    @Setter
    @Builder
    public static class User {

        private String id;

        private String name;

        private List<String> authorities;

        public List<String> getAuthorities() {
            if (authorities == null) {
                authorities = new ArrayList<>();
            }
            return authorities;
        }

    }

    @Getter
    @Setter
    @Builder
    public static class Client {

        private String id;

        private String name;

        private List<String> scopes;

        public List<String> getScopes() {
            if (scopes == null) {
                scopes = new ArrayList<>();
            }
            return scopes;
        }
    }

}
