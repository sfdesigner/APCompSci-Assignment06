public class Main {

    public static int worldTime;
    public static int trammelPhase;
    public static int feluccaPhase;

    public static void main(String[] args) {
        worldTime = 168260271;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 27364375;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 67294091;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        /*
        worldTime = 52560000;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 52574400;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 52560015;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 52588830;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 134049640;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 23672179;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 12960;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 20160;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();

        worldTime = 125280;
        setMoons();
        System.out.println("worldTime = " + worldTime);
        displayDateTime();
        displayMoons();
        System.out.println();
        */

        /*
        System.out.println(getYear());
        System.out.println(getDay());
        System.out.println(getRawTime());
        System.out.println(getTime());
        */
    }

    public static void turn() {
        worldTime++;
        setMoons();
    }

    public static void turn(int timeDelta) {
        worldTime += timeDelta;
    }

    public static void setMoons() {
        trammelPhase = worldTime / 1440 % 9;
        feluccaPhase = worldTime / 1440 % 14;
    }

    public static void displayDateTime() {
        System.out.printf("It is %d:%02d on day %d of the year %d.\n",getHour(),getMinute(),getDay()+1,getYear()+1);
    }

    public static void displayMoons() {
        System.out.printf("Trammel is in day %d of its 9 day phase.\n",trammelPhase+1);
        System.out.printf("Felucca is in day %d of its 14 day phase.\n",feluccaPhase+1);
    }

    public static int getHour() {
        return getRawTime() / 60;
    }

    public static int getMinute() {
        return getRawTime() % 60;
    }

    public static int getRawTime() {
        return worldTime - (getYear()*365*1440) - (getDay()*1440);
    }

    public static int getDay() {
        return (worldTime - (getYear()*365*1440)) / 1440;
    }

    public static int getYear() {
        return worldTime/(365*1440);
    }
}
