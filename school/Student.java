package school;

public class Student {
    int claas;
    int age;
    String dir;

    public Student(int claas,int age,String dir){
        this.claas = claas;
        this.age = age;
        this.dir = dir;
    }
    public String toString(){
        return claas+" "+age+" "+dir;
    }


}
