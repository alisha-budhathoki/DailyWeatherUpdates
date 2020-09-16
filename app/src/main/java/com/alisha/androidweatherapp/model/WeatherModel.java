package com.alisha.androidweatherapp.model;

public class WeatherModel
{
    private Current current;

    private String timezone;

    private String timezone_offset;

    private String lon;

    private Minutely[] minutely;

    private String lat;

    public Current getCurrent ()
    {
        return current;
    }

    public void setCurrent (Current current)
    {
        this.current = current;
    }

    public String getTimezone ()
    {
        return timezone;
    }

    public void setTimezone (String timezone)
    {
        this.timezone = timezone;
    }

    public String getTimezone_offset ()
    {
        return timezone_offset;
    }

    public void setTimezone_offset (String timezone_offset)
    {
        this.timezone_offset = timezone_offset;
    }

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public Minutely[] getMinutely ()
    {
        return minutely;
    }

    public void setMinutely (Minutely[] minutely)
    {
        this.minutely = minutely;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [current = "+current+", timezone = "+timezone+", timezone_offset = "+timezone_offset+", lon = "+lon+", minutely = "+minutely+", lat = "+lat+"]";
    }
}