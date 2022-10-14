public class e4_fund_prog_class {   
    public static double iterativeE4(int n){
        double plus2 = 3, plus4 = 4, term = 0, totalTerm = 0;
        if(n < 2) return 4.0/3;
        for(int i = 1; i <= n; i ++){
            term = plus4 / plus2;
            plus2 += 2;
            plus4 += 4;
            
            totalTerm += term;
        }
       
        return totalTerm;
    }
    public static double recursiveE4(int n){
        if(n < 2) return 4.0/3;
        return recursiveE4(n - 1) + ((n * 4.0) / (n * 2.0 + 1));
       
    }
}
