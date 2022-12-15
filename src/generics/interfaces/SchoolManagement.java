package generics.interfaces;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {

    /*Task: Okul yönetimi için öğrenci ve öğretmen kayıtlarını
   -oluşturan
   -görüntüleyen
   -güncelleyen
   -silen
    bir program yazınız.

    Her iki sinif icin ayni metodlara ihtiyacimiz var (add,delete...)
    Implement edip bu metodlari olusturabilmek icin generic tipte
    interface tanimladik.
    */

        public static void main(String[] args) {
            Student student = new Student("Tolstoy");
            StudentRepo studentRepo = new StudentRepo();
            Teacher teacher = new Teacher("Dostoyevski");
            TeacherRepo teacherRepo = new TeacherRepo();

            List<Teacher> teacherList = new ArrayList<>();


            studentRepo.add(student);
            studentRepo.update(student);
            studentRepo.get(student);
            studentRepo.delete(student);

            System.out.println();

            teacherRepo.add(teacher);
            teacherRepo.update(teacher);
            teacherRepo.get(teacher);
            teacherRepo.delete(teacher);

        }

    }








