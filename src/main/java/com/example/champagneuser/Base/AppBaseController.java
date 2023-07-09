package com.example.champagneuser.Base;

import io.micrometer.common.util.StringUtils;
import org.yaml.snakeyaml.constructor.BaseConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppBaseController extends BaseAbstract {
    @Override
    Long getUserId() {
        return null;
    }

    @Override
    Long getUserToken() {
        return null;
    }

}
