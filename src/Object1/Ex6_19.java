package Object1;

public class Ex6_19 {
    public static void main(String[] args) {
        MyTv_ t = new MyTv_();
        System.out.println(t);
        t.turnOnOff();
        t.channelDown();
        t.volumeDown();
        System.out.println(t);
        t.channelUp();
        t.volumeUp();
        t.turnOnOff();
        System.out.println(t);
        t.gotoPrevChannel();
    }
}
class MyTv_ {
    boolean isPowerOn;
    int channel;
    private int prevChannel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    public void gotoPrevChannel() {
        System.out.println("현재 채널:" + channel);
        setChannel(prevChannel);
        System.out.println("이전 채널:" + channel);
    }

    @Override
    public String toString() {
        return "전원:"+isPowerOn+", CH:"+channel+", VOL:"+volume;
    }

    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }
    void volumeUp() {
        if(isPowerOn==true) {
            if (volume < MAX_VOLUME)
                volume++;
        }
    }
    void volumeDown() {
        if(isPowerOn==true) {
            if (volume > MAX_VOLUME)
                volume--;
        }
    }

    public void setChannel(int channel) {
        if(isPowerOn==true) {
            prevChannel = channel;
            if (channel >= MAX_CHANNEL) {
                channel = MIN_CHANNEL;
            } else this.channel = channel;
        }
    }

    public void setVolume(int volume) {
        if(isPowerOn==true) {
            if (volume < MAX_VOLUME)
                this.volume = volume;
        }
    }

    void channelUp() {
        if(isPowerOn==true) {
            prevChannel = channel;
            if (channel >= MAX_CHANNEL) {
                channel = MIN_CHANNEL;
            } else channel++;
        }
    }
    void channelDown() {
        if(isPowerOn==true) {
            prevChannel = channel;
            if (channel < MIN_CHANNEL) {
                channel = MAX_CHANNEL;
            } else channel--;
        }
    }
}

