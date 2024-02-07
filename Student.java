import java.io.IOException;
import java.util.ArrayList;

public class Student extends Matheng {
    private String name;
    private String major="Matheng";
    private ArrayList<String> mylessons;
    public Student(String name){
        
        this.name=name;
        mylessons=new ArrayList<String>();
    }
    public void chooseLessons(String lesson) throws IOException{
        int k=mylessons.size();
        for(String a:Lessons.mathLessons){
            if(lesson.equals(a)){
                mylessons.add(lesson);
            }

        }
        if(k==mylessons.size()){
            throw new IOException("the lesson you choose is not one of math engineering lesson");
        }
        
    }
    
}
