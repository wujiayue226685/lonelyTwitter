package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jiayue on 9/18/18.
 */

public class TweetTooLongException extends Exception{
    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 charaters");
    }
}

