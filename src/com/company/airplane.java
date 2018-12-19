package com.company;

import java.io.Serializable;

public class airplane implements Serializable {

    public int id;
    public String name;

    enum Class {
        Economy, Business, Vip
    };

    public int numberofseats;

}
