class MovingAverage {
    int [] window;
    int n, sum, index, size;
    
    public MovingAverage(int size) {
        window = new int[size];
        this.size = size;
        sum = 0;
        n = 0;
        index = 0;
    }
    
    public double next(int val) {
        if (n < size) n++;       
      
        sum -= window[index];
        sum += val;
        window[index] = val;
        index = (index+1) % size;
        
        return (double) sum / n;
    }
}