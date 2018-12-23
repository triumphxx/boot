package com.example.boot.tools;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wang on 2018/12/23.
 */
@Component
public class Utils {

    public List getList(){
        return new ArrayList();
    }

    public Map getMap(){
        return new HashMap();
    }
}
