// A television set is characterized by its channels, its volume levels and whether it is on or it is off. The instance variables are
// channel number, volume level and on/off state. The television class has a zero argument constructor, a method to turn it on or
// off, a method to set its channel, and another method to set its volume level, a method for channel up and another method for
// channel down and a method for volume up and another method for volume down. Implement the TV class in a package and
// implement a driver class in another package to test the TV class creating an object of TV class. The information about a TV is
// entered interactively through keyboard. A TV has 10000 channels and its volume may vary from level one to level ten. The
// necessary validation should be performed for change of channel and change of volume.

package packages.tv;

public class Television {
    private int channelNumber;
    private int volumeLevel;
    private boolean state;
    
    public Television() {
        this.channelNumber=1;
        this.volumeLevel=1;
        this.state=false;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        if(channelNumber>=1 && channelNumber<=50){
            this.channelNumber=channelNumber;
        }
        else{
            System.out.println("Invalid channel number");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(volumeLevel>=1 && volumeLevel<=10){
            this.volumeLevel=volumeLevel;
        }
        else{
            System.out.println("Invalid volume level");
        }
    }

    public void stateOnOff(boolean state){
        if(state==true){
            System.out.println("TV is on");
        }
        else{
            System.out.println("TV is off");
        }
    }

    public void channelUp(){
        if(this.channelNumber==50){
            this.channelNumber=1;
        }
        else{
            this.channelNumber+=1;
        }
        System.out.println("Channel changed to: "+this.channelNumber);
    }

    public void channelDown(){
        if(this.channelNumber==1){
            this.channelNumber=50;
        }
        else{
            this.channelNumber-=1;
        }
        System.out.println("Channel changed to: "+this.channelNumber);
    }

    public void volumeUp(){
        if(this.volumeLevel==10){
            this.volumeLevel=1;
        }
        else{
            this.volumeLevel+=1;
        }
        System.out.println("Volume level changes to: "+this.volumeLevel);
    }

    public void volumeDown(){
        if(this.volumeLevel==1){
            this.volumeLevel=10;
        }
        else{
            this.volumeLevel-=1;
        }
        System.out.println("Volume level changed to: "+this.volumeLevel);
    }
}
