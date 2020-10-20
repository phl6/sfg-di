package louis.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }

    @Override
    public String sayBye() {
        return "Bye - Constructor";
    }

    @Override //take a length param and gen an array with that length
    public int[] genSortedRandomArrayWithLen(int n){
        Random rd =  new Random();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) arr[i] = rd.nextInt(Integer.MAX_VALUE )%100 + 1;

        return arr;
    }
}
