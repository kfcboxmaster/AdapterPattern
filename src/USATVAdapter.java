public class USATVAdapter extends ChinaTV implements IChinaTV{
    USATelevisionAdapter tv = new USATelevisionAdapter();
    @Override
    public void broadcast(boolean check) {
        if(check){
            tv.drama();
            tv.propaganda();
            tv.sports();
        }
        else{
            System.out.println("Your social rating is low to watch American TV");
        }
    }

    @Override
    public boolean checkSocialRating(int rating) {
        return super.checkSocialRating(rating);
    }
}
