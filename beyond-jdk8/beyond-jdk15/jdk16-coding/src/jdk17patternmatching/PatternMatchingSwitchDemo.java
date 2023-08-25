package jdk17patternmatching;

import java.time.LocalDate;
import java.util.Random;

public class PatternMatchingSwitchDemo {

    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Object object = fetchObject();

        String result=  useSwitchExpressionWithPatternMatching(object);
        System.out.println(result);
    }

    private static String useSwitchExpressionWithPatternMatching(Object object) {

        return switch (object){
            case Integer a -> "integer:"+a;
            case LocalDate date -> "localdate:" +date;
            case String s -> "string:"+s;
            default -> "no val present";
        };
    }

    private static Object fetchObject() {

        if(RANDOM.nextBoolean()){
            return Integer.valueOf(23);
        }else{
            if(RANDOM.nextBoolean()){
                return "sita ram";
            }else{
                return LocalDate();
            }
        }
    }
}
