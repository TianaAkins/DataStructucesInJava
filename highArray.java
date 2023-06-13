class highArray {
    private long[] a;
    private int nElems;

    //constructor
    public highArray(int max){
        a = new long[max];
        nElems = 0;
    }

    //find method that searches for key value
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

    //insert method that adds elements to array
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    //delete method that searches value to be removed and 'pushes' that element to the end then decrements array size by 1
    public boolean delete(long value){
        int j;
        for(j=0; j<nElems; j++)
            if(value == a[j])
                break;
        if(j==nElems)
            return false;
        else {
            for(int k=j; k<nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    //display method will print array 
    public void display(){
        for(int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    //getMin method will compare each element to the initialized minimum variable and replace that value if the tested element is less than
    public long getMin(){
        if (nElems == 0) 
            return -1;

        long min = a[0];
        for (int i=1; i<nElems; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }
}

class highArrayApp {
    public static void main(String[] args){
        //create array derived from HighArray class
        int maxSize = 100;
        highArray arr;
        arr = new highArray(maxSize);

        arr.display();
        //insert elements into the array
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33); 

        //display array contents
        arr.display();

        //execute find method and return respected messages 
        int searchKey = 35;
        if (arr.find(searchKey) )
            System.out.println("Found: " + searchKey);
        else
            System.out.println("Can't find: " + searchKey);

        //delete 3 items
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        //display array after executing methods
        arr.display();

        //execute getMin method
        if (arr.getMin() == -1)
            System.out.println("Array is empty");
        else
            System.out.println("Minimum Value: " + arr.getMin() );
    }
}

