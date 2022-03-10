package lv.professer;

public class Loops {
    public void demoForLoops(){
        for (int i = 0;i<10;i++){
            System.out.println("This is Loop: i "+i);

        }

    }
    public void demoWhileLoops(){
        int Flag = 0;
        while(Flag<10){
                Flag++;
            System.out.println("This is Loop: Flag "+Flag);
        }
    }
    public void demoDoWhileLoops(){
        int Flag = 130;
        do{
            System.out.println("This is Loop: Flag "+Flag);
            Flag++;

        }
        while(Flag<131);
    }
    public static void main(String...args){
        Loops loops = new Loops();
        loops.demoForLoops();
        loops.demoWhileLoops();
        loops.demoDoWhileLoops();
    }
}
