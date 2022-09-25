public class Process {
    public void work(){
        Input me = new Input();
        System.out.print("Enter the Year : ");
        int y = me.getYear();
        if(y % 4 == 0){
            if(y % 100 == 0){
                if(y % 400 == 0)
                    System.out.println("Leap Year");
                else
                    System.out.println("Not Leap Year");
            }
            else
                System.out.println("Leap Year");
        }
        else
            System.out.println("Not Leap Year");
    }
}
