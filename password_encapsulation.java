class locker{
    private final int pin = 1234;
    private boolean isopen = false;

    public void openlocker(int enterpin){
        if(enterpin == pin){
            isopen = true;
            System.out.println("locker open ");
        }else{
            System.out.println("wrong pin ");
        }
    }

    public void checkstatus(){
        if(isopen){
            System.out.println("locker open ");
        }else{
            System.out.println("locker is closed ");
        }
    }
}
public class password_encapsulation {
    public static void main(String[] args){
        locker A = new locker();
        A.checkstatus();
        A.openlocker(1111);
        A.openlocker(1234);
        
    }
}