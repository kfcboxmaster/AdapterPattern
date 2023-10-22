public class USATV implements IUSATV{
    int channel = 1;
    USATelevision provider = new USATelevision();
    @Override
    public void broadcast(){
        switch(channel){
            case 1:
                provider.sports();
                break;
            case 2:
                provider.blockbuster();
                break;
            case 3:
                provider.documentary();
                break;
            case 4:
                provider.drama();
                break;
        }
    }
    @Override
    public void nextChannel(){
        channel++;
    }
    @Override
    public void previousChannel(){
        channel--;
    }
}
