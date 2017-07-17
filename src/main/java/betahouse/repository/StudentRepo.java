package betahouse.repository;

import betahouse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Yxm on 2017/7/17.
 */

public interface StudentRepo extends JpaRepository<Student, Integer>{
    @Query("select s from Student s where s.idNum = :IdNum")
    Student findByIdNum(@Param("IdNum") String IdNum);

    @Query("select s from Student s where s.examNum = :ExamNum")
    Student findByExamNum(@Param("ExamNum") String ExamNum);

//    ArrayList<Student> findAllByName(Student Name);
}
