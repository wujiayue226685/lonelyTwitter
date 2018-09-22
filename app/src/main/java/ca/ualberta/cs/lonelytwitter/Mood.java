package ca.ualberta.cs.lonelytwitter;

public abstract class Mood {
    public abstract void current_mood();

    public void show(){

    }
}

class mood{
    public static void main(){
        Mood mod = new Happy();
        mod.current_mood();
        mod = new Sad();
        mod.current_mood();


    }
}


