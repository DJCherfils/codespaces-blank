/**
 * This class represents time
 *
 * @author Djuensie Cherfils
 */


public class Time {
    /** The hour */
    private int hh;
    /** The Minute */
    private int mm;
    /** The Second */
    private int ss;


    /**
     * Instantiates a time object
     */
    public Time(){}
    public Time(int hh, int mm, int ss){
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
 
    /**
     * Void method that moves the time forward
     * <p>
     */
    public void tick(){
        if(hh == 23 && mm == 59 && ss == 59){
            hh = 0;
            mm = 0;
            ss = 1;


        }
        else if(ss < 59){
            ss += 1;
        }
        else if(ss == 59 && mm == 59){
            ss = 0;
            mm = 0;
            hh += 1;


        }
        else if(ss >= 59 && mm <= 59){
            mm += 1;
            ss = 0;
        }
        else if(mm == 59 && hh <= 23){
            hh += 1;
            mm = 0;
        }
        else if(hh == 23){
            hh = 1;
        }
    }
    /**
     * Getter Methods that return the instance variables
     */
    public int getH(){
        return hh;
    }


    public int getM(){
        return mm;
    }
    public int getS(){
        return ss;
    }


    /**
     * String method that return the time
     * <p>
     */
    public String info(){
        if(hh < 10 && mm < 10 && ss < 10){
            return "0"+hh + ":0" + mm + ":0" + ss;
        }
        else if(hh >= 10 && mm < 10 && ss < 10){
            return hh + ":0" + mm + ":0" + ss;
        }
        else if(hh < 10 && mm >= 10 && ss <10){
            return "0"+hh + ":" + mm + ":0" + ss;
        }
        else if(hh < 10 && mm < 10 && ss >= 10){
            return "0"+hh + ":0" + mm + ":" + ss;
        }
        else if(hh >= 10 && mm >= 10 && ss < 10){
            return hh + ":" + mm + ":0" + ss;
        }
        else if(hh < 10 && mm >= 10 && ss >=10){
            return "0"+hh + ":" + mm + ":" + ss;
        }
        else if(hh >= 10 && mm < 10 && ss >= 10){
            return hh + ":0" + mm + ":" + ss;
        }
        else {
            return hh + ":" + mm + ":" + ss;
        }
 
 
    }
    /**
     * Void method that adds two times together
     * <p>
     * @param time the other time object that is being added
     */
    public void add(Time time){
        // hh += time.getH();
        // mm += time.getM();
        // ss += time.getS();
        hh += time.hh;
        mm += time.mm;
        ss += time.ss;
       
        if(hh == 23 && mm == 59 && ss == 59){
            hh = 0;
            mm = 0;
            ss = 1;


        }
        else if(hh > 23 && mm > 59){
            hh -= 23;
            mm -= 59;
        }
        else if(ss < 59){
            ss += 1;
        }
        else if(ss >= 59){
            ss -= 59;
            mm ++;


        }
        else if(ss == 59 && mm == 59){
            ss = 0;
            mm = 0;
            hh += 1;


        }
        else if(ss >= 59 && mm <= 59){
            mm += 1;
            ss = 0;
        }
        else if(mm == 59 && hh <= 23){
            hh += 1;
            mm = 0;
        }
        else if(hh == 23){
            hh = 1;
        }
   
    }
 }
