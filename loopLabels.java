zapublic class loopLabels {
    public static void main(String[] args) {
        outerloop: for(int i = 0;i<4;i++){
        innerloop: for (int j = 0; j<4;j++){
            if (i==j) continue outerloop;
            System.out.println(i+ ","+ j + "-");
        
     }
    }
}
}