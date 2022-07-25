public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int extraNote;
    double extraNotePercantage;

    public Course(String name, String code, String prefix, double extraNotePercantage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.extraNotePercantage = extraNotePercantage;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Teacher assigned to class.");
        } else {
            System.out.println(t.name + " Academician is not suitable for this course.\n");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + "----> : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " No Academician has been assigned to course.");
        }
    }
}
