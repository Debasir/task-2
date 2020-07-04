package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                (new Window()).setVisible(true);
            }
        });
    }

    public static Set process(String[] arr) {
        return MyList.arrayToList(arr).findLongestWords();
    }

}
