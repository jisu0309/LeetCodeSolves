class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rmin = 0;
        int cmin = 0;
        int rmax = matrix.length-1;
        int cmax = matrix[0].length-1;
        
        int row = (rmax-rmin)/2;
        int col = (cmax-cmin)/2;

        boolean findrow = false;
        while(rmax>=rmin){
            //System.out.printf("r[%d_%d_%d]",rmin, row, rmax);


            // 0 <= tar <= cmax

            if(matrix[row][0]>target){ //10>16? f
                //System.out.printf(" max--\n");

                rmax = row-1;
                row = rmax-(rmax-rmin)/2;
            } else if(matrix[row][cmax]<target){ //20<16? f
                //System.out.printf(" min++\n");

                rmin = row+1;
                row = rmin+(rmax-rmin)/2;
            } else { //find row!
                //System.out.printf(" find!\n\n");

                // findrow = true;
                break;
            }
        }

        if(row<0 || row>=matrix.length) return false;

        //System.out.printf("row: %d\n",row);

        while(cmax>=cmin){
            //System.out.printf("c[%d_%d_%d]",cmin, col, cmax);

            if(matrix[row][col]>target){//11>16
                //System.out.printf(" max--\n");
                
                cmax = col-1;
                col = cmax-(cmax-cmin)/2;
            } else if(matrix[row][col]<target){ //11<16
                //System.out.printf(" min++\n");
                
                cmin = col+1;
                col = cmin+(cmax-cmin)/2;
            } else if(matrix[row][col]==target){
                //System.out.printf(" r find!\n\n");
                return true;
            } else {
                //System.out.printf(" r false!\n\n");
                return false;
            }
        }

        return false;        
    }
}