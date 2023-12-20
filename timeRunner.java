public class timeRunner{
    public static void main(String[] args){
        Time time1 = new Time(8, 9, 58);
        System.out.println(time1.info());
        time1.tick();
        System.out.println(time1.info());
        time1.tick();
        System.out.println(time1.info());
        time1.tick();
        System.out.println(time1.info());
        time1.tick();
        System.out.println(time1.info());
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println(time1.info());
        Time time2 = new Time(15, 59, 58);
        System.out.println(time2.info());
        time2.tick();
        System.out.println(time2.info());
        time2.tick();
        System.out.println(time2.info());





    }
}