
    public class quickSort {
        public static void main(String [] args){
            int [] a = {1,3,0,3,6,5,8,2};

            Sort(a, 0, a.length -1);
            for (int i = 0; i<a.length -1;i++) {
                System.out.print(a[i]+"，");
            }
            System.out.print("\n");
        }

        public static void Sort(int [] res, int start , int end){
            if(start >= end){
                return;
            }
            int mid = quickSort(res, start, end);
            Sort(res, start, mid-1);
            Sort(res, mid +1,end);
        }
        public static int quickSort(int [] res , int lift, int right){
            int tmp = res[lift];
            while(lift<right){
                while(lift<right&&res[right]>=tmp){
                    --right;
                }
                res[lift] = res[right];
                while(lift<right&&res[lift]<=tmp){
                    ++lift;
                }
                res[right] = res[lift];
            }
            res[lift] = tmp;
            return lift;
        }
    }


