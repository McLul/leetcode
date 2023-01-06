class MedianFinder {
    List<Double> list;
    public MedianFinder() {
        this.list = new ArrayList<Double>();
    }
    
    public void addNum(double num) {
       binaryInsertion(this.list, num);
        
    }
    
    public double findMedian() {
        if (this.list.size() == 0) {
            return 0;
        } else if (this.list.size() == 1) {
            return this.list.get(0);
        } else if (this.list.size() % 2 == 0) {
            return ((this.list.get((int)Math.floor((double)(this.list.size()-1)/ 2))) + this.list.get((int)Math.ceil((double)(this.list.size()-1) / 2)))/ 2;
        } else {
            return this.list.get((this.list.size()-1)/2);
        }
        
    }
    
    private void binaryInsertion(List<Double> listToInsert, double numToInsert) {
        int listSize = listToInsert.size();
        if (listSize == 0) {
             listToInsert.add(numToInsert);
             return;
        }
        int start = 0;
        int end = listToInsert.size();
        int middle = (int)Math.floor(end/2);
        while (start < end) {
           // System.out.println(start + "start");
           // System.out.println(middle + "middle");
            //System.out.println(end + "end");
            //System.out.println(listToInsert.get(middle) + "middle item");
            //System.out.println(listToInsert+ "numIns" +  numToInsert);
            if (listToInsert.get(middle) == numToInsert) {
                //System.out.println("stuck");
                listToInsert.add(middle,numToInsert);
                break;
            } else if (numToInsert > listToInsert.get(middle)) {
                start = middle+1;
                middle = (int)Math.floor(middle + (end-middle)/2);
                if (start>=end) {
                    listToInsert.add(end,numToInsert);
                }

            } else if  (numToInsert < listToInsert.get(middle)) {
                end = middle;
                middle = (int)Math.ceil(end/2);
                if (start>=end) {
                    listToInsert.add(end,numToInsert);
                }
            }
        }
        
            
            // }
         
        
        //System.out.println(listToInsert);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */