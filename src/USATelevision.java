public class USATelevision implements IUSATelevision{
    @Override
    public void sports(){
        System.out.println("Baseball match");
    }
    @Override
    public void documentary(){
        System.out.println("Vietnam War");
    }
    @Override
    public void drama(){
        System.out.println("Stars fault");
    }
    @Override
    public void blockbuster(){
        System.out.println("Top Gun");
    }
}
