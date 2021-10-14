public class Electrocar {
    private int id;

    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id+ " is starting....");
        }
    }
   // статический вложенный класс
    public static class Battery{
        public void charge(){
            System.out.println(" Battery is charging....");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }

    public void start(){

        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        class SomeClass {
            public void someMethod(){

            }
        }

        System.out.println("Electrocar " + id + " is starting...");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
