package a1126.Hak5;

public class Grade extends Student {
    private int score;

    public int getScore() {
        return score;
    }
    
    public Grade(String name, String studentId, int score) {
        super(name, studentId);
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() +", 성적: " + score + ", 성적평가: " ;
    }

    public String evaluateGrade() {
        if(score >=90){
            return "A";
        }else if(score >=80) {
            return "B";
        }else if(score >=70) {
            return "C";
        }else if(score >=60) {
            return "D";
        }else{
            return "F";
        }
    }            
}