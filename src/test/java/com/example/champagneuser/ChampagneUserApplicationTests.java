package com.example.champagneuser;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@SpringBootTest
class ChampagneUserApplicationTests {

    @Test
    void contextLoads() throws InterruptedException {


        List<String> list23= new ArrayList<>();
        list23.add("1");
        list23.add("12");
        list23.add("13");
        list23.add("14");
        list23.add("15");
        list23.add("16");
        list23.add("17");
        list23.add("18");
        list23.add("19");
        list23.add("20");
        list23.add("21");
        list23.add("22");
        list23.add("23");
        list23.add("24");
        list23.add("25");
        list23.add("26");
        list23.add("27");
        list23.add("28");
        list23.add("29");
        list23.add("30");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Integer j = 10;
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for(int i = 0 ;i < list23.size() ;i++){

            if( j != 0){
                int finalI = i;
                executorService.submit(()->{
                    try{
                        System.out.println("-"+ list23.get(finalI));
                    }catch (Exception e){

                    }finally {
                        countDownLatch.countDown();
                    }
                });
                j--;
            }else{

                countDownLatch.await();
                Thread.sleep(2000);
                j = 10;
            }


        }
    }

}
