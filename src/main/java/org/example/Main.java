package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {

    private static String checkArguments(String firstName, String lastName) {
        if (StringUtils.isAlpha(firstName) && StringUtils.isAlpha(lastName)) {
            return checkUp(firstName, lastName);
        } else {
            throw new BadRequestException("Не соответсвует форме");
        }
    }

    private static String checkUp(String firstName, String lastName) {
        firstName = StringUtils.capitalize(firstName);
        lastName = StringUtils.capitalize(lastName);
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        System.out.println(checkArguments("ivan", "ivanov"));
    }
}