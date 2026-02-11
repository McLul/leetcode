
class Solution {
    int result;
    public int countStudents(int[] students, int[] sandwiches) {
        this.result = 0;
        int studentCircle = 0;
        int sandwichCircle = 0;
        int studentSquare = 0;
        int sandwichSquare = 0;
        int sandwichMinCount = 0;
        int sandwichMin = 0;
        for (int i = 0; i<students.length; i++) {
            if (students[i] == 0) {
                studentCircle += 1;
            } else {
                studentSquare += 1;
            }
        }
        for (int i = 0; i<sandwiches.length; i++) {
            if (sandwiches[i] == 0) {
                sandwichCircle += 1;
            } else {
                sandwichSquare += 1;
            }
        }
        //find the sancwiches which are greater than the students find the position of students that eat that type + 1
        if (sandwichCircle - studentCircle > 0) {
            sandwichMin = 0;
            sandwichMinCount = sandwichCircle - studentCircle;
        } else if (sandwichSquare - studentSquare > 0) {
            sandwichMin = 1;
            sandwichMinCount = sandwichSquare - studentSquare;
        } else {// edge case they are equal = all students eat

            return this.result;
        }
        for (int i = sandwiches.length -1; i >= 0; i--) {
            if (sandwiches[i] == sandwichMin) {
                sandwichMinCount -= 1;
                if (sandwichMinCount == 0) {
                    return sandwiches.length - i;
                }
            }
        }
        return this.result;

        
    }
}