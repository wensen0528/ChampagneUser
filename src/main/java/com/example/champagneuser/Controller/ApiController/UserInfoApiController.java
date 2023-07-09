package com.example.champagneuser.Controller.ApiController;

import com.example.champagneuser.Base.ApiBaseController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserInfoApiController extends ApiBaseController {

    public void test(){
        Long userInfo = getUserInfo();
    }
}
