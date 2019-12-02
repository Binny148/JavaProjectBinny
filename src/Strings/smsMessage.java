package Strings;
import java.util.Scanner;
public class smsMessage {
    public static void main(String[] args) {

        String info = " sender: <James Bond>. From Number: [202-123-3456]. + Message:{I love programming and solving problem}";

        int senderStart = info.indexOf("<") + 1;
        int senderEnd = info.indexOf(">");

        int numberStart = info.indexOf("[") + 1;
        int numberEnd = info.indexOf("]");

        int  messageStart = info.indexOf("{") + 1;
        int messageEnd = info.indexOf("}");

        String sender = info.substring(senderStart,senderEnd);
        String number = info.substring(numberStart, numberEnd);
        String message = info.substring(messageStart, messageEnd);

        System.out.println("Sender:" + sender);
        System.out.println("Number:" + number);
        System.out.println("Message:" + message);
    }
}
