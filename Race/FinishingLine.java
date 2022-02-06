package Race;
public class FinishingLine {
    //Use counter to count in which place each horse end the race
        int counter = 1;
    
        public synchronized void arrive(Horse h) {
            //Print the first place
            if (counter == 1) {
                System.out.println("******************************\n====>" + h.getHorseName()
                        + " Finised First!\n******************************");
    
            } else {
                //Print all other places
                System.out.println("====>" + h.getHorseName() + ": Finised " + counter + "-th place");
            }
            counter++;
        }
    }