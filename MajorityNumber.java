public class MajorityNumber {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int flag [] = new int [25600];
        int max =0;
        int res=0;
        for(int i = 0; i<nums.size();i++){
            flag[nums.get(i)]++;
        }
        for(int i = 0; i<flag.length;i++){
           if( flag[i]>max){
               max =flag[i];
               res =i;
           }
        }
        return res;
    }
}