class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j;
        for(j=0; j<nElems; j++)
            if (a[j] == searchKey)
            break;
        if(j == nElems)
            return false;
        else
            return true;
    }


}
