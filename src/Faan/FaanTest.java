package Faan;

public class FaanTest {
        public static void main(String[] args){
            Faan1 f =new Faan1();
            f.setId(1);
            f.setBrandname("Orient");
            System.out.println(f);
             f.switchOnTheFan();
            // f.switchedOff();
           // System.out.println("is fan on: " +f.checkStatus());
                if(f.checkStatus){
                    f.switchOnTheFan();

                }
                else{
                    f.switchedOff();
                }

//            f.switchedOff();
//            f.switchOnTheFan();
//            f.switchOnTheFan();
//            f.switchOnTheFan();
//            f.switchedOff();
//            f.switchedOff();
//            f.checkStatus();
//            f.switchOnTheFan();

        }
    }

