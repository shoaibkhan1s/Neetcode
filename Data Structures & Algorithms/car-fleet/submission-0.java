class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       double[][] result = new double[position.length][2];
        for(int i=0;i<position.length;i++){
            result[i][0] = position[i];
            result[i][1] = (double)(target-position[i])/(double)speed[i]; 
        }

        Arrays.sort(result,(a,b)-> Double.compare(b[0],a[0]));

        int count = 0;
        double prevTime = 0;

        for(double[] res: result){
            if(res[1]>prevTime){
                count++;
                prevTime = res[1];
            }
        }
        return count;
    }
}
