import java.net.*;
public class TestingReachabilityEx{
    public static void main(String [] a){
        try{
            InetAddress net = InetAddress.getByName("33.33.33.33");
            if(net.isReachable(100)){
                System.out.println("success");
            }
            else{
                System.out.println("failed");
            }
        }
        catch(Exception e){
        }
    }
}