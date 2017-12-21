package com.orient.sso;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by panduanduan on 21/12/2017.
 */
public class OrientPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return PasswordUtil.generatePassword(charSequence.toString());
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return PasswordUtil.validatePassword(s, charSequence.toString());
    }
}
