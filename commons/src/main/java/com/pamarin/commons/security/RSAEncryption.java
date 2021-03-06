/*
 * Copyright 2017 Pamarin.com
 */
package com.pamarin.commons.security;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2017/12/02
 */
public interface RSAEncryption {

    byte[] encrypt(byte[] data, RSAPrivateKey privateKey);

    byte[] decrypt(byte[] data, RSAPublicKey publicKey);

}
