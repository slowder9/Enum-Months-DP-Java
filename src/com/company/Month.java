package com.company;

public enum Month {
    //Add constants Jan-Dec
    JANUARY("jan", 1), FEBRUARY("feb", 2), MARCH("mar", 3), APRIL("apr", 4), MAY("may", 5), JUNE("jun", 6), JULY("jul",7), AUGUST("aug",8), SEPTEMBER("sep",9), OCTOBER("oct",10), NOVEMBER("nov" ,11), DECEMBER("dec",12);

    //Add private variable that which should be set to Jan-Dec and a getter
    private String englishName;
    private int monthNumber;

    public static Month search(String butts) {
        //butts is the variable from the scanner
        for(Month m : Month.values()) {
            if (butts.equals(m.getEnglishName())) {
                return m;
            }
        }
        return DECEMBER;
    }

    Month(String englishName, int monthNumber) {
        this.englishName = englishName;
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }
}
