package com.company;

import javax.swing.*;
import java.io.Serializable;

/**
 * Created by Mostafa shahhosseini on 15-Jun-16.
 */
public class date implements Serializable{
    String year;
    String month;
    String day;

    public date(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    @Override
    public boolean equals(Object obj){
        date other= (date) obj;
        if(!year.equals(other.year))
            return false;
        if(!month.equals(other.month))
            return false;
        if(!day.equals(other.day))
            return false;
        return true;
    }

}
