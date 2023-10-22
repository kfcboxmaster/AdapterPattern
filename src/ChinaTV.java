public class ChinaTV implements IChinaTV{
    ChinaTelevision provider = new ChinaTelevision();
    @Override
    public void broadcast(boolean check){
        if(check){
            provider.drama();
            provider.propaganda();
            provider.sports();
        }
        else{
            System.out.println("Your social rating is too low to watch TV");
        }
    }
    @Override
    public boolean checkSocialRating(int rating){
        if(rating > 0){
            return true;
        }
        return false;
    }
}
