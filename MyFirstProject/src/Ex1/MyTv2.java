package Ex1;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int prevChannel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int channel){
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL)
            return;
        prevChannel = this.channel;
        this.channel = channel;
    }
    void setVolume(int volume){
        if (volume < MIN_VOLUME || volume > MAX_VOLUME)
            return;
        this.volume = volume;
    }
    int getChannel(){
        return this.channel;
    }
    int getVolume(){
        return this.volume;
    }

    void gotoPrevChannel(){
        setChannel(prevChannel);
    }
}


