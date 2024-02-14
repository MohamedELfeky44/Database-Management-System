
CREATE OR REPLACE FUNCTION ROOT.calc_courses_count(v_id NUMBER)
RETURN NUMBER
IS
   v_result NUMBER(10);
BEGIN
   SELECT COUNT(*) INTO v_result
     FROM department_courses
    WHERE DEPARTMENT_ID = v_id;

   RETURN v_result;
END;

CREATE OR REPLACE FUNCTION ROOT.calc_student_count(v_id NUMBER)
RETURN NUMBER
IS
    v_result NUMBER(10);
BEGIN
    SELECT COUNT(s.STUDENT_NAME) INTO v_result
    FROM students s
    JOIN departments d ON s.DEPARTMENT_ID = d.DEPARTMENT_ID
    WHERE d.DEPARTMENT_ID = v_id;

    RETURN v_result;
END;


CREATE OR REPLACE FUNCTION ROOT.calc_success_rate(v_id NUMBER)
RETURN NUMBER
IS
    v_success NUMBER(10);
    v_all NUMBER(10);
    v_result NUMBER(10, 2);
BEGIN
    SELECT COUNT(*) INTO v_success
    FROM student_courses
    WHERE DESCRIPTION != 'F' AND course_id = v_id;
    
    SELECT COUNT(*) INTO v_all
    FROM student_courses
    WHERE course_id = v_id;
END;

CREATE OR REPLACE FUNCTION ROOT.calc_total_courses
RETURN NUMBER
IS
    v_result NUMBER(10);
BEGIN
    SELECT COUNT(*) INTO v_result
    FROM courses;
    
    RETURN v_result;
END;

CREATE OR REPLACE FUNCTION ROOT.calc_total_depts
RETURN NUMBER
IS
    v_result NUMBER(10);
BEGIN
    SELECT COUNT(*) INTO v_result
    FROM departments;
    
    RETURN v_result;
END;



CREATE OR REPLACE FUNCTION ROOT.calc_total_students
RETURN NUMBER
IS
    v_result NUMBER(10);
BEGIN
    SELECT COUNT(*) INTO v_result
    FROM students;
    
    RETURN v_result;
END;


CREATE OR REPLACE FUNCTION ROOT.count_student_number(v_id NUMBER)
RETURN NUMBER
IS
    v_result NUMBER(10);
BEGIN
    SELECT COUNT(*) INTO v_result
    FROM student_courses
    WHERE course_id = v_id;
    
    RETURN v_result;
END;


CREATE OR REPLACE TRIGGER ROOT.STUDENT_COURSES_TRG
BEFORE INSERT OR UPDATE
ON ROOT.STUDENT_COURSES REFERENCING NEW AS New OLD AS Old
FOR EACH ROW
BEGIN
    IF :new.grade >= 97 THEN
        :new.DESCRIPTION := 'A+';
    ELSIF :new.grade >= 93 THEN
        :new.DESCRIPTION := 'A';
    ELSIF :new.grade >= 90 THEN
        :new.DESCRIPTION := 'A-';
    ELSIF :new.grade >= 87 THEN
        :new.DESCRIPTION := 'B+';
    ELSIF :new.grade >= 83 THEN
        :new.DESCRIPTION := 'B';
    ELSIF :new.grade >= 80 THEN
        :new.DESCRIPTION := 'B-';
    ELSIF :new.grade >= 77 THEN
        :new.DESCRIPTION := 'C+';
    ELSIF :new.grade >= 73 THEN
        :new.DESCRIPTION := 'C';
    ELSIF :new.grade >= 70 THEN
        :new.DESCRIPTION := 'C-';
    ELSIF :new.grade >= 67 THEN
        :new.DESCRIPTION := 'D+';
    ELSIF :new.grade >= 63 THEN
        :new.DESCRIPTION := 'D';
    ELSIF :new.grade >= 60 THEN
        :new.DESCRIPTION := 'D-';
    ELSE
        :new.DESCRIPTION := 'F';
    END IF;
END;
