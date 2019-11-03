package hello.core;

import org.apache.commons.lang3.StringUtils;

public class Hello {

    public static String sayHello(String name) {
        if (StringUtils.isNotEmpty(name)) {
            return "Hello " + StringUtils.capitalize(name) + "!";
        } else {
            return "Hello!";
        }
    }
}
