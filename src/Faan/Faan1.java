package Faan;

public class Faan1 {

        private int id;
        private String brandname;
        private boolean swichedOn;
        public boolean checkStatus;
        public void switchOnTheFan() {
            if (swichedOn) {
                System.out.println("Fan is already on");
            } else {
                swichedOn = true;
                System.out.println("Fan is spinning");
            }
        }
        public void switchedOff(){

            if(swichedOn){
                System.out.println("Fan has stopped");
                swichedOn=false;
            } else {
                System.out.println("Fan is already stopped");
            }
        }

        public void checkStatus(){
            if(swichedOn==true){
                System.out.println("on");
            }
            else{
                System.out.println("not");
            }
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBrandname() {
            return brandname;
        }

        public void setBrandname(String brandname) {
            this.brandname = brandname;
        }

    @Override
    public String toString() {
        return "Faan1{" +
                "id=" + id +
                ", brandname='" + brandname + '\'' +
                ", swichedOn=" + swichedOn +
                '}';
    }
}
