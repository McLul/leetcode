import java.util.ArrayList;

class MyCalendar {
    ArrayList<Integer[]> calendar;
    public MyCalendar() {
        this.calendar = new ArrayList<Integer[]>();
    }
    
    public boolean book(int startTime, int endTime) {
        int currPos = this.calendar.size(); // if it doesnt come before another, put at end
        for (int i = 0; i <this.calendar.size(); i++) {
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
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */