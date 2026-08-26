public static String solve(int N, int X, int[] A) {
        String found = "NO";
        for(int i = 0 ; i < N; i++){
            if(A[i] == X){
              found = "YES";   
            }
        }
        return found;
}