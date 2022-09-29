public class restaurant {
    private int rating;
    private String name;
    private String cuisine;

    public restaurant(String resName, int resRate, String resCuisine){
        rating= resRate;
        name=resName;
        cuisine= resCuisine;

    }

    public void diningPlace(){
        System.out.println("Hello our restaurant is named "+name+" and our cuisine is "+cuisine+" and our rating is "+rating+"/5.");
    }


}
