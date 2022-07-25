public class OgrenciSistemMain {
    public static void main(String[] args) {

        Course math = new Course("Matematik", "MAT101", "MAT", 0.3);
        Course physics = new Course("Fizik", "FZK101", "FZK", 0.3);
        Course chemistry = new Course("Kimya", "KMY101", "KMY", 0.4);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(40, 20, 40);
        s1.addBulkExtraExamNote(60, 60, 60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkExtraExamNote(70, 60, 30);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50, 54, 40);
        s3.addBulkExtraExamNote(30, 20, 45);
        s3.isPass();


    }
}
