package Week1.공통.두원사이의_정수쌍;
/*
7:17 ~
1. 왜 파라미터가 long이지?
 */

public class suhyun {
    public long solution(long r1, long r2) {
        long answer = 0;

        for(int i=1; i<r2; i++){
            if (i < r1){
                answer += getMaxY(i, r2, "r2") - getMaxY(i, r1, "r1");
            } else {
                answer += getMaxY(i, r2, "r2");
            }
        }

        answer *= 4;
        answer += (r2 - r1 + 1) * 4;

        return answer;
    }

    // x^2 + y^2 = r^2
    private int getMaxY(long x, long r, String rName){
        double max = Math.sqrt(r * r - x * x);
        int maxToInt = (int) max;
        if(rName.equals("r1") && max - maxToInt == 0.0){
            return maxToInt - 1;
        } else {
            return maxToInt;
        }
    }
}
