public class Matheng extends ScienceLetter implements Lessons {
    public Matheng(){

    }
    public void tellFaculty(){
        System.out.println("Science and Letters");
    }
    public void showLessons(){
        for(String less:Lessons.mathLessons){
            System.out.println(less);
        }
    }
    public String requirementsOf(String lesson){
        String requirement="";
        for(int i=0;i<Lessons.mathLessons.length;i++){
            if(lesson.equals(Lessons.mathLessons[i])){
                if(i==0){
                    requirement="none";
                }
                else{
                    requirement=Lessons.mathLessons[i-1];
                }
            }
        }

        return requirement;
    }
}
