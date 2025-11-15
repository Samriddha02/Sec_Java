class InhrDoctor {
    void consultationFee() {
        System.out.println("General Doctor Fee: ₹500");
    }
}

class InhrDentist extends InhrDoctor {
    void consultationFee() {
        System.out.println("Dentist Consultation Fee: ₹800");
    }
}

class InhrCardiologist extends InhrDoctor {
    void consultationFee() {
        System.out.println("Cardiologist Consultation Fee: ₹1200");
    }
}

class InhrSurgeon extends InhrDoctor {
    void consultationFee() {
        System.out.println("Surgeon Consultation Fee: ₹2000");
    }
}

public class InhrDoctorExample {
    public static void main(String[] args) {
        InhrDoctor d1 = new InhrDoctor();
        InhrDentist d2 = new InhrDentist();
        InhrCardiologist d3 = new InhrCardiologist();
        InhrSurgeon d4 = new InhrSurgeon();

        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
        d4.consultationFee();
    }
}