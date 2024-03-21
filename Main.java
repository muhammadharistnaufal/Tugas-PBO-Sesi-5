/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
       
        Student student = new Student("Muhammad Harist Naufal", "Mangkalaya");
        student.addCourseGrade("Big Data", 85);
        student.addCourseGrade("Pemrograman Berbasis Flatform", 90);
        student.addCourseGrade("Cloud Computing", 80);

        Teacher teacher = new Teacher("BPK.Alun Sujjada,S.Kom,MT", "Sukabumi");
        teacher.addCourse("Pemrograman Berbasis Flatform");

        // Output informasi tentang student dan teacher
        System.out.println(student);
        System.out.println("Nilai Rata-Rata: " + student.getAverageGrade());
        System.out.println("=============================");
        System.out.println("MATAKULIAH:");
        student.printGrades();

        System.out.println("=============================");

        System.out.println(teacher);
        System.out.println("-----------------------------");
        System.out.println("DOSEN PENGAMPU MATAKULIAH:");
        for (int i = 0; i < teacher.getNumCourses(); i++) {
            System.out.println(teacher.getCourses()[i]);
        }
    }
}
