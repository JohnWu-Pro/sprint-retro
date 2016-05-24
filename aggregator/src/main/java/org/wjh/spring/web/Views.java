package org.wjh.spring.web;

public abstract class Views {
    private static final String PREFIX_FORWARD = "forward:";
    private static final String PREFIX_REDIRECT = "redirect:";

    public static String forward(String view) {
        return PREFIX_FORWARD + view;
    }

    public static String redirect(String view) {
        return PREFIX_REDIRECT + view;
    }
}
