class student{
    int rollno;
    String name;
    int marks;
}


public class stud {
    public static void main(String[] args) {
        student s1 = new student();
        s1.marks=98;
        s1.name="Yogesh";
        s1.rollno=65;
        student s2 = new student();
        s2.marks=92;
        s2.name="ankur";
        s2.rollno=1;
        student s3 = new student();
        s3.marks=58;
        s3.name="dip";
        s3.rollno=15;
        student students[]= new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollno + " " + students[i].name+ " "+students[i].marks);
        }
        for(student n:students ){
             System.out.println(n.rollno + " " + n.name+ " "+n.marks);
        }
    }
}
