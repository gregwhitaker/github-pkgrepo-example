package com.github.gregwhitaker.pkgrepotest;

import org.apache.commons.lang3.StringUtils;

public class Hello {

    public String sayHello(String name) {
        if (StringUtils.isNotEmpty(name)) {
            return "Hello " + StringUtils.capitalize(name) + "!";
        } else {
            return "Hello!";
        }
    }
}
