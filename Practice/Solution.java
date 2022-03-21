import java.util.ArrayList;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minH = 0;
        int minV = 0;
        int maxH = matrix.length;
        int maxV = matrix[0].length;
        ArrayList<Integer> finalList = new Arraylist<Integer>();
        int total = matrix.length * matrix[0].length;
        while (list.size() < total) {
            //right
            for (int i = minH; i <= maxH; i++) {
                finalList.add(matrix[minV][i]);
            }
            minV++;
            //down
            for (int i = minV; i <= maxV; i++) {
                finalList.add(matrix[i][maxH]);
            }
            maxH++;
            //left
            for (int i = maxH; i >= minH; i--) {
                finalList.add(matrix[maxV][i]);
            }
            maxV--;
            //up
            for (int i = maxV; i >= minV; i--) {
                finalList.add(matrix[i][minH]);
            }
            minH++;
        }
        return finalList;
    }
}