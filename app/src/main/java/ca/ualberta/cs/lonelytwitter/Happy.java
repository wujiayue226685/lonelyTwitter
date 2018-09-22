package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

public class Happy extends Mood{
    float x;
    float y;
    private Date date;
    private String message;

    public Happy(){
        super();
        this.date= new Date();
        this.x= 5.0f;
        this.y= 5.0f;

    }

    Happy(String message){
        this.date = new Date();
        this.message = message;
    }
    public Date getDate() {return this.date;}
    public String getMessage() {return this. message;}



    public void current_mood() {
        super.show();

    }
}


