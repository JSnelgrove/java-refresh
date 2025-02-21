public class Date {
    int day;
    int month;
    int year;

    public Date (int day,int  month, int year){
        if(day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        } 
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }  
        if(year < 1 || year > 2025) {
            throw new IllegalArgumentException("Year must be between 1 and 2025");
        } 

        this.day=day;
        this.year=year;
        this.month=month;
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        if(day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        } 
        this.day=day;
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int month){
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }  
        this.month=month;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year=year;
    }

    public String toString(){
        return String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
    }

    
}
