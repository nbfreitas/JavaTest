public class Bicycle {
    String define_me(){
        return "a vehicle with pedals.";
    }
}

    class MotorCycle extends Bicycle {
        String define_me() {
            return "a cycle with an engine.";
        }

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());

            String temp = super.define_me(); // added super keyword to access superclass

            System.out.println("My ancestor is a cycle who is " + temp );
        }

    }

    class Solution{
        public static void main(String[] args){
            MotorCycle M = new MotorCycle();
    }
}


