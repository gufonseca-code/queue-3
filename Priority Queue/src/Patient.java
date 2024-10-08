public class Patient implements Comparable<Patient> {
    private String name;
    private int priority;

    public Patient(String name, int priority){
        this.name = name;
        this.priority = priority;
    }
    
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\nPrioridade: " + getPriority() + "\n";
    }

    @Override
    public int compareTo(Patient patient) {
        return Integer.compare(this.priority, patient.priority);
    }
}