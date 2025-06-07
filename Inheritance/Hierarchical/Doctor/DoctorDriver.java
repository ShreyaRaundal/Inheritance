package Doctor;

public class DoctorDriver {
    public static void main(String[] args) {
        Neurologist n1 = new Neurologist("Dr. Sharma", 1000.0, "MD Neuro", 10, "AIIMS", "Neurology", "Brain");
        Cardiologist c1 = new Cardiologist("Dr. Mehta", 1200.0, "MD Cardio", 12, "Apollo", "Cardiology", "Heart");
        Orthopedic o1 = new Orthopedic("Dr. Patel", 900.0, "MS Orthopedics", 15, "Global Hospital", "Orthopedics", "Bones");

        System.out.println("---- Neurologist Details ----");
        n1.displayNeurologist();

        System.out.println("\n---- Cardiologist Details ----");
        c1.displayCardiologist();

        System.out.println("---- Orthopedic Details ----");
        o1.displayOrthopedic();

    }
}
