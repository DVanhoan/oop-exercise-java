
import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public String[] MONTHS = {"Jan", "Fer", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean isValidDate(int year, int month, int day) {
        if (day <= 0 || month <= 0 || year <= 0) {
            return false;
        }
        if (year > 9999 || month > 12 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dow = date.getDayOfWeek();
        return dow.getValue();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        int dayMax = 31;
        if (month == 2) {
            if (isLeapYear(year)) {
                dayMax = 29;
            } else {
                dayMax = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayMax = 30;
        }
        if (day < 1 || day > dayMax) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return getDayOfWeek(year, month, day) + " " + day + " " + month + " " + year;
    }

    public MyDate nextDay() {
        int dayMax = 31;
        if (month == 2) {
            if (isLeapYear(year)) {
                dayMax = 29;
            } else {
                dayMax = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayMax = 30;
        }
        if (day == dayMax) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        int dayMax = 31;
        if (month == 2) {
            if (isLeapYear(year)) {
                dayMax = 29;
            } else {
                dayMax = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayMax = 30;
        }
        if (day > dayMax) {
            day = dayMax;
        }
        return this;
    }

    public MyDate nextYear() {
        if (year == 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        int dayMax = 31;
        if (month == 2) {
            if (isLeapYear(year + 1)) {
                dayMax = 29;
            } else {
                dayMax = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayMax = 30;
        }
        if (day > dayMax) {
            day = dayMax;
        }
        year++;
        return this;
    }

    public MyDate previousDay()
    {
        int dayMin = 1;
        if (month == 2) {
            if (isLeapYear(year)) {
                dayMin = 29;
            } else {
                dayMin = 28;
            }
        } else if (month == 3 || month == 5 || month == 7 || month == 10 || month == 12) {
            dayMin = 30;
        }
        if (day == dayMin) {
            day = 31;
            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }
        } else {
            day--;
        }
        return this;
    }
    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        int dayMax = 31;
        if (month == 2) {
            if (isLeapYear(year)) {
                dayMax = 29;
            } else {
                dayMax = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayMax = 30;
        }
        if (day > dayMax) {
            day = dayMax;
        }
        return this;
    }
    public MyDate previousYear() {
        if (year == 1) {
            throw new IllegalStateException("Year out of range!");
        }
        int dayMax = 31;
        if (month == 2) {
            if (isLeapYear(year - 1)) {
                dayMax = 29;
            } else {
                dayMax = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayMax = 30;
        }
        if (day > dayMax) {
            day = dayMax;
        }
        year--;
        return this;
    }
}

