public class Student {
    String name, stuNo;
    int grade;
    Course math;
    Course physics;
    Course chemistry;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.grade = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.math.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.physics.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.chemistry.note = kimya;
        }

    }

    public void addBulkExtraExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.math.extraNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.physics.extraNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.chemistry.extraNote = kimya;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Error ! ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.avarage);
            if (this.isPass) {
                System.out.println("Passed. ");
            } else {
                System.out.println("Failed.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physics.note * (1 - this.physics.extraNotePercantage) + this.physics.extraNote * this.physics.extraNotePercantage
                + this.chemistry.note * (1 - this.chemistry.extraNotePercantage) + this.chemistry.extraNote * this.chemistry.extraNotePercantage
                + this.math.note * (1 - this.math.extraNotePercantage) + this.math.extraNote * this.math.extraNotePercantage) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.note + "\t Extra note: " + this.math.extraNote);
        System.out.println("Physics Note : " + this.physics.note + "\t Extra note: " + this.physics.extraNote);
        System.out.println("Chemistry Note : " + this.chemistry.note + "\t Extra noet: " + this.chemistry.extraNote);
    }

}
