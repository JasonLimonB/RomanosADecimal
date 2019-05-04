package Main;

public class NRomano {

    public  NRomano(){ }


    public int RomanToInt( String s ){

        s = s.toUpperCase();//Paso a mayusculas lo que mandan por parámetro


        char[] arr = s.toCharArray();
        int len=arr.length; int result =0;
        int []arr1=new int [len];
        for (int i=0;i<arr.length;i++){
            switch(arr[i]){
                case 'I':
                    arr1[i]=1;
                    break;
                case'V':
                    arr1[i]=5;
                    break;
                case 'X':
                    arr1[i]=10;
                    break;
                case 'L':
                    arr1[i]=50;
                    break;
                case 'C':
                    arr1[i]=100;
                    break;
                case 'D':
                    arr1[i]=500;
                    break;
                case 'M':
                    arr1[i]=1000;

            }
        }

        for (int i=0;i<len-1;i++){
            if (arr1[i]<arr1[i+1]){
                arr1[i]=-arr1[i];

            }
            result+=arr1[i];
        }
        result+=arr1[len-1];
        return result;

    }

}
