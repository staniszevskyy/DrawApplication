package controller;

public class ValidateString {
    public static Boolean validate(String[] num){
        try {
//            double val = Double.parseDouble(num);
//            if (val<0) return false;
            for (String el: num){
                double val = Double.parseDouble(el);
                if (val<0) return false;
            }
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
