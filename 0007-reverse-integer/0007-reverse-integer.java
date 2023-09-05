class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE){return 0;}
        int signHolder = x > 0 ? 1 : -1;
        x *= signHolder;
        int tempX = x;
        int answerVal = 0;
        int tempAnswerVal = 0;
        int checkedAnswer = 0;
        int zeroesAtEnd = 0;
        if (x < 10) {
            return x*signHolder;
        }
        ArrayList<Integer> numberList = new ArrayList<Integer>(); 
        ArrayList<Integer> numberListCheck = new ArrayList<Integer>(); 
        
        while (tempX > 9) { //take it apart
            numberList.add(tempX%10);
            tempX /= 10;
        } 
        numberList.add(tempX);
        int numberSize = numberList.size();
        for(int i = 0; i < numberSize; i++) { //put it back together
            if(numberList.get(i) != 0 && answerVal == Integer.MAX_VALUE ) {
                return 0;
            }
            answerVal += numberList.get(i)*Math.pow(10,numberSize-1-i);
        }
        for (int i = 0; i < numberList.size();i++) {
            if(numberList.get(i) != 0) {
                break;
            }
            zeroesAtEnd+=1;
        }
        
        tempAnswerVal = answerVal;
        while (tempAnswerVal > 9) { //take it apart
            numberListCheck.add(tempAnswerVal%10);
            tempAnswerVal /= 10;
        } 
        numberListCheck.add(tempAnswerVal);
        int numberCheckSize = numberListCheck.size();
        for(int i = 0; i < numberCheckSize; i++) { //put it back together
            checkedAnswer += numberListCheck.get(i)*Math.pow(10,numberCheckSize-1-i);
        }
        checkedAnswer*=Math.pow(10,zeroesAtEnd);
        
        System.out.println(checkedAnswer);
        System.out.println(x);
        System.out.println(answerVal);
        return checkedAnswer*signHolder == x*signHolder ? answerVal*signHolder : 0;
        
    }
}