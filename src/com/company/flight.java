package com.company;

import java.io.Serializable;

public class flight implements Serializable {
    date flightdate;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public com.company.date getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(com.company.date flightdate) {
        this.flightdate = flightdate;
    }

    int capacity;

    public flight(String start, String destination) {
        this.start = start;
        this.destination = destination;
    }
    @Override
    public boolean equals(Object obj){
        flight other=(flight)obj;
        if(!start.equals(other.start))
            return false;
        if(!destination.equals(other.destination))
            return false;
        return true ;
    }
    public airplane airplane;
    public boolean charter;

    public void setcharter(boolean ischarter) {
        this.charter = ischarter;
    }

    public int id;
    String start;
    String destination;

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format(start+ "--->"+destination+" date:"+flightdate.year+"/"+flightdate.month+"/"+flightdate.day);
    }

    public void setTime(int time) {
        this.time = time;
    }
    int time;
}
