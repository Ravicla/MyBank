package com.ravicla.mybank.util;


import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class JsonUtil {
    private static Gson gson = new Gson();
    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }


}




