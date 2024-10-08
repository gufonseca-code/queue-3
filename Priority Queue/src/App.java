import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Patient> redQueue = new PriorityQueue<>();
        PriorityQueue<Patient> yellowQueue = new PriorityQueue<>();
        PriorityQueue<Patient> greenQueue = new PriorityQueue<>();
        Iterator<Patient> redIterator = redQueue.iterator();
        Iterator<Patient> yellowIterator = yellowQueue.iterator();
        Iterator<Patient> greenIterator = greenQueue.iterator(); 
        boolean run = true;
        Random rand = new Random();
        String[] names = {"Carlos", "Alan", "José", "Bianca", "Pedro", "Gustavo", "Maria", "Lucas", "Eduardo", "Catarina", "Samuel", "Victor", "Nathan"};
        int[] priorities = {2, 0, 1, 2, 1, 0};

        for (int i = 0; i < priorities.length; i++) {
            if (priorities[i] == 0) {
                redQueue.add(new Patient(names[i], priorities[i]));
            } else if (priorities[i] == 1){
                yellowQueue.add(new Patient(names[i], priorities[i]));
            } else {
                greenQueue.add(new Patient(names[i], priorities[i]));
            }
        }
    
        while (run) {                                                   // CUIDADO: while não tem condição de saída
            int p = rand.nextInt(3);                                    // Utilize crtl + c para parar           
            int i = rand.nextInt(names.length);
            while (redIterator.hasNext()) {
                System.out.println(redQueue.poll());
                    Thread.sleep(5000);
                }
        
                while (yellowIterator.hasNext()) {
                    System.out.println(yellowQueue.poll());
                    Thread.sleep(5000);
                }
        
                while (greenIterator.hasNext()) {
                    System.out.println(greenQueue.poll());
                    Thread.sleep(5000);
                }
                
                try {
                    if (p == 0) {
                        redQueue.add(new Patient(names[i], p));
                    } else if (p == 1){
                        yellowQueue.add(new Patient(names[i], p));
                    } else {
                        greenQueue.add(new Patient(names[i], p));
                    }
                    Thread.sleep(7000);
                } catch (Exception e) {
                    greenQueue.add(new Patient("Alfredo", 2));
                }
        }

    }
}