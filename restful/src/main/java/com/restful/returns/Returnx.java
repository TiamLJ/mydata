package com.restful.returns;

import com.restful.pojo.User;
import lombok.Data;

@Data
public class Returnx {

    private int httpstatus;
    private String info;
    private User user;
}
