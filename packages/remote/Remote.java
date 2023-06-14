package packages.remote;

import java.util.*;

import packages.tv.Television;

public class Remote{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Television t=new Television();
        System.out.println("Enter the channel number: ");
        int cno=sc.nextInt();
        System.out.println("Enter the volume level: ");
        int vol=sc.nextInt();
        System.out.println("Enter whether the tv is on or off: ");
        boolean state=sc.nextBoolean();

        sc.close();

        t.stateOnOff(state);
        t.setChannelNumber(cno);
        t.setVolumeLevel(vol);

        t.channelUp();
        t.volumeDown();

        System.out.println(t.getChannelNumber()+" "+t.getVolumeLevel());
    }
}
