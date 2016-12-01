package com.panthers.utilities;

public class Date {

    private int year;
    private int month;
    private int date;
    
    public Date(int y, int m, int d) {
        year = y;
        month = m;
        date = d;
    }
    
    public static int getDurationInDays(Date start, Date end) {
        // NOT IMPLEMENTED YET
        return 0;
    }
    
    public static Date addDateByNumberOfDays(Date d, int days) {
        // NOT IMPLEMENTED YET (take care month and year to check 30 or 31 things)
        return new Date(d.getYear(), d.getMonth(), d.getDate() + days);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Date{" + "year=" + year + ", month=" + month + ", date=" + date + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.year;
        hash = 53 * hash + this.month;
        hash = 53 * hash + this.date;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Date other = (Date) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.date != other.date) {
            return false;
        }
        return true;
    }
}
