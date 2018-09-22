package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

public class Sad extends Mood{
    float x;
    float y;
    private Date date;
    private String message;

    public Sad(){
        super();
        this.date= new Date();
        this.x= 5.0f;
        this.y= 5.0f;

    }
    Sad(String message){
        this.date = new Date();
        this.message = message;
    }
    public Date getDate() {return this.date;}
    public String getMessage() {return this. message;}

    public void current_mood() {
        super.show();

    }
}
