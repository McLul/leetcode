import java.util.ArrayList;

class MyCalendar {
    ArrayList<Integer[]> calendar;
    public MyCalendar() {
        this.calendar = new ArrayList<Integer[]>();
    }
    
    public boolean book(int startTime, int endTime) {
        int currPos = this.calendar.size(); // if it doesnt come before another, put at end
        if (currPos == 0) {
            Integer[] result = {startTime, endTime};
            this.calendar.add(result);
            return true;
        }
        int currStart = 0;
        int currEnd = currPos-1;
        Integer[] booking = null;
        // here will will create a binary search to turn n into log n which will reduce our O(n^2) to O(n log n)
        while (currEnd != currStart) {
            if (this.calendar.get(currStart + ((currEnd - currStart) / 2))[0] < startTime && this.calendar.get(currStart + ((currEnd - currStart) / 2))[1] <= startTime) {
                currStart = currStart + ((currEnd - currStart) / 2) + 1;
            } else {
                currEnd = currStart + ((currEnd - currStart) / 2);
            }
        }
        booking = this.calendar.get(currStart);
        /* for (int i = 0; i <this.calendar.size(); i++) {
            Integer[] temp = this.calendar.get(i);
            System.out.println(temp[0] + ", " + temp[1]);
        }
        System.out.println("----------");
        System.out.println(booking[0] + ", " + booking[1]);
        System.out.println(startTime + ", " + endTime);
        System.out.println("----------"); */
        if(startTime >= booking[0] && startTime < booking[1]) {
            return false;
        } else if (endTime > booking[0] && endTime <= booking[1]) {
            return false;
        } else if (startTime <= booking[0] && endTime >= booking[1]) {
            return false;
        } else if (endTime > booking[1]) {
            Integer[] result = {startTime, endTime};
            this.calendar.add(currStart+1, result);
        } else {
            Integer[] result = {startTime, endTime};
            this.calendar.add(currStart, result);
        }
        return true;








        /* for (int i = 0; i <this.calendar.size(); i++) {
            Integer[] booking = this.calendar.get(i);
            // if start doesnt clear booking return false
            if(startTime >= booking[0] && startTime < booking[1]) {
                return false;
            } else if (endTime > booking[0] && endTime <= booking[1]) {
                return false;
            } else if (startTime <= booking[0] && endTime >= booking[1]) {
                return false;
            } else if (endTime <= booking[0]) { // this will ensure its sorted correctly
                currPos = i;
            } 
            
        }
        // if nothing clashes return true
        Integer[] result = {startTime, endTime};
        this.calendar.add(currPos,result);
        return true;*/
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */