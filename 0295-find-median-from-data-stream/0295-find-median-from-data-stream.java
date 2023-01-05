class MedianFinder {
    List<Double> list;
    double two = 2;
    double sizeOfList = -1;
    public MedianFinder() {
        this.list = new ArrayList<Double>();
    }
    
    public void addNum(double num) {
       insertion(this.list, num);
        this.sizeOfList += 1;
    }
    
    public double findMedian() {
        if (this.list.size() == 0) {
            return 0;
        } else if (this.list.size() == 1) {
            return this.list.get(0);
        } else if (this.list.size() % 2 == 0) {
            return ((this.list.get((int)Math.floor(sizeOfList/ two))) + this.list.get((int)Math.ceil(sizeOfList / two)))/ two;
        } else {
            return this.list.get((this.list.size()-1)/2);
        }
        
    }
    
    private void insertion(List<Double> listToInsert, double numToInsert) {
        int listSize = listToInsert.size();
        boolean largestNumber = true;

            for (int i = 0; i < listSize; i++) {
                
                if (numToInsert <= listToInsert.get(i)) {
                    listToInsert.add(i, numToInsert);
                    largestNumber = false;
                    break;
                }
            }
            if (largestNumber) {
                listToInsert.add(numToInsert);
            }
         
        
        //System.out.println(listToInsert);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */