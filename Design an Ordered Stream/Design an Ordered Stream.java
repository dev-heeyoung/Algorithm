class OrderedStream {
    private int ptr;
    private String[] stream;
    
    public OrderedStream(int n) {
        ptr = 0;
        stream = new String[n];   
    }
    
    public List<String> insert(int idKey, String value) {
       
        List<String> list = new ArrayList<>();
        stream[idKey-1] = value;
        
        while(ptr < stream.length && stream[ptr]!=null)  {
            list.add(stream[ptr]);
            ptr++;
        }
        return list;
    }
}