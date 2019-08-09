package com.epam.multy.module.module1;

import com.epam.multy.module.module2.Abonent;

public class Caller {
    public static void main(String[] args) {
System.out.println("run str");
        Abonent abonent = new Abonent();
        abonent.writeDown(args[0]);
    }
}
