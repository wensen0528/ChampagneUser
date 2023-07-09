package com.example.champagneuser.Base;


import lombok.extern.slf4j.Slf4j;

/*
*
* api
* */
@Slf4j
public class ApiBaseController extends BaseAbstract{


    @Override
    Long getUserId() {
        return null;
    }

    @Override
    Long getUserToken() {
        return null;
    }



    public  Long getUserInfo(){
        return  getUserId();
    }
}
