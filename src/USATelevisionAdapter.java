public class USATelevisionAdapter extends ChinaTelevision implements IChinaTelevision{
    USATelevision provider = new USATelevision();
    @Override
    public void sports(){
        presidentAgitation();
        this.provider.sports();
    }
    @Override
    public void propaganda(){
        presidentAgitation();
        System.out.println("Work more, get less");
    }
    @Override
    public void drama(){
        presidentAgitation();
        this.provider.drama();
    }
    @Override
    public void presidentAgitation(){
        System.out.println("VOTE FOR XI JINPING");
    }
}
