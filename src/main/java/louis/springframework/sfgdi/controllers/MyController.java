package louis.springframework.sfgdi.controllers;


import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi folks";
    }

    public String sayBye(){
        System.out.println("No one is giving a fuck");

        return "Bye";
    }

    //take a length param and gen an array with that length
    public int[] genSortedRandomArrayWithLen(int n){
        Random rd =  new Random();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) arr[i] = rd.nextInt(Integer.MAX_VALUE )%100 + 1;

        return arr;
    }

}
