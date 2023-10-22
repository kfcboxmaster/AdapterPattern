public class ChinaTelevision implements IChinaTelevision{
    @Override
    public void sports(){
        presidentAgitation();
        System.out.println("StarCraft League");
    }
    @Override
    public void propaganda(){
        presidentAgitation();
        System.out.println("Work more, get less");
    }
    @Override
    public void drama(){
        presidentAgitation();
        System.out.println("He died for general Xí Jìnpíng");
    }
    @Override
    public void presidentAgitation(){
        System.out.println("VOTE FOR XI JINPING");
    }
}
