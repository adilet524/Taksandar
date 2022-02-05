package com.company;

/*  1ден 300го чейинки сандардын арасында 3ко, 4ко жана 5ке (баарына) калдыксыз
болунгон сандардын суммасын табыныз. */
public class Main {
    public static void main(String[] args) {
        System.out.println("sum: "+numbers());
    }

    static int numbers() {
        int counter = 0;
        for (int i = 0; i < 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
                counter+=i;
            }
        }
        return counter;
    }

}
