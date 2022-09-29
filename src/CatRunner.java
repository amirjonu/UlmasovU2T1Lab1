public class CatRunner {
    public static void main(String[] args){
        Cat cat1= new Cat("jeff",7, 50);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2= new Cat("bob", 13, 4.5);
        cat2.introduce();
        cat2.printCatInfo();


    }
}
