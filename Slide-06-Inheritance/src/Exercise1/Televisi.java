package Exercise1;

public class Televisi {
    private String merk;
    private int jumlahChannel;
    public int channelAktif;

    public Televisi(String merk, int jumlahChannel) {
        this.merk = merk;
        this.jumlahChannel = jumlahChannel;
        this.channelAktif = 1;
    }

    public int getChannelAktif() {
        return channelAktif;
    }

    public void pindahChannel(int channelBaru) {
        if (channelBaru > 0 && channelBaru <= jumlahChannel) {
            this.channelAktif = channelBaru;
        }
    }
}
