/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkingclient;


import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Networkingclient {
    static networkutil inp;
    InetAddress address=InetAddress.getLocalHost();

    public static void main(String[] args)  {

        inp=new networkutil("192.168.0.106 ",6500);
        Object o=null;
        Scanner scan=new Scanner(System.in);
        String stn=scan.next();
        boolean tf=true;
      while (tf){
          inp.write(stn);
          o=  inp.read();
          System.out.println(o);
          break;
      }




    }

}
