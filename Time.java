public class Time {
    private int hh;
    private int mm;
    private int ss;
    public Time(){}
    public Time(int hh, int mm, int ss){
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
 
 
    public void tick(){
        if(ss < 59){
            ss += 1;
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
    public String info(){
        if(hh < 10 && mm < 10 && ss < 10){
            return "0"+hh + ":0" + mm + ":0" + ss;
        }
        else if(hh >= 10 && mm < 10 && ss < 10){
            return "0"+hh + ":0" + mm + ":0" + ss;
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
 }
 
 