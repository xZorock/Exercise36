package it.develhope.exercise36;

public class Start {
    public static void main(String[] args) {

        String s1 = "x3z ? xYz ! R1 && __";
        String s2 = s1.replaceAll("[a-z]|[0-9]","*");
        System.out.println(s2);
    }
}
