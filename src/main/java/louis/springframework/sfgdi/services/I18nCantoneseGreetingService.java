package louis.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Random;

@Profile("CN")
@Service("i18nService")
public class I18nCantoneseGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "哈囉世界 -- 廣東話";
    }

    @Override
    public String sayBye(){
        return "再見 -- 廣東話";
    }

    @Override //take a length param and gen an array with that length
    public int[] genSortedRandomArrayWithLen(int n){
        Random rd =  new Random();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) arr[i] = rd.nextInt(Integer.MAX_VALUE )%100 + 1;

        return arr;
    }
}
