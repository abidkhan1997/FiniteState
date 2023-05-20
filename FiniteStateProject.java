import java.util.*;
public class FiniteStateProject {
	public static void main(String[] args){
        int state0 = 0;//First State
        int state1 = 1;//Second State
        int from0to1 = 0;//Number of the transition to state 0 from state 1
        int from1to0 = 0;//Number of the transition to state 1 from state 0
        int State0counter = 0;//How many times it states in State 0
        int State1counter = 0;//How many times it states in State 1
        int counter = 0;
        int currentstate = 0;//Which State it is right now
        Random random = new Random();
        
        //Loop of numbers
        for (int i =0; i<10000; i++){
            int x = random.nextInt(3);
            //In state 0
            if(currentstate == state0){
                if(x==1){
                	State0counter+=counter;
                    counter = 0;//Counter returns to 0
                    currentstate = 1;//State will change to 1
                    from0to1++;//Counts how many times it changes from state 0 to state 1
                }
                else{
                    counter++;
                }
            }
            //In state 1
            else if(currentstate==state1){
                if(x==0){
                	State1counter +=counter;
                    counter=0;//Counter returns to 0
                    currentstate = 0;//State will change to 0
                    from1to0++;//Counts how many times it changes from state 1 to state 0
                }
                else{
                    counter++;
                }
            }
        }
        int average0 = Math.round((float)State0counter/from0to1);
        int average1 = Math.round((float)State1counter/from1to0);
        
		System.out.println("Average for State 0 to State 1: "+ average0);
		System.out.println("Average for State 1 to State 0: "+ average1);
    }
}
