package TSI.HyunJoon.professor;

public class Lamda {
    void isAlive(Animal animal,boolean air){
        if (animal.breath(air)){
            System.out.println("Alive");
        }else{
            System.out.println("DEAD");
        }
    }

//    public static void main(String... args) {
//        var lambda = new Lamda();
//        lambda.isAlive((air) -> !air,true );
///*        lambda.isAlive(new Animal() {
//            @Override
//            public boolean breath(boolean air) {
//                return True;
//            }
//*/        },True);
//
//    }

}
