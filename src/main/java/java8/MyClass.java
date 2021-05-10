/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;


/**
 *
 * @author kamal
 */
public class MyClass {
    
    public static void main(String[] args) {
        MyFunInterface myFunctionalInterface=(str)->{
            String result ="";
            for(int i=str.length()-1;i>=0;i--)
            {
                result+=str.charAt(i);
            }
            return result;
        };
        System.out.print("My Function Interface = "+myFunctionalInterface.rvererse("kamal"));

    }
    
}
