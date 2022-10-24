/*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> output = new ArrayList<>();
        
        for(int  i = d; i < a.size(); i++){
            output.add(a.get(i));
        }
        
        int diff =  a.size() - output.size();
        
        for(int j = 0; j < diff; j++){
            output.add(a.get(j));
        }
        
        return output;
    }
