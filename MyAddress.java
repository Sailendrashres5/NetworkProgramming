import java.net.*;
public class MyAddress{
    public static void main(String [] args){
        try{
            InetAddress ne = InetAddress.getLocalHost();
            String dottedQuad = ne.getHostAddress();
            System.out.println("My address is" +dottedQuad);

        }catch(UnknownHostException ex){
            System.out.println("I'm sorry, I dont konw my own address");
        }

    }
}