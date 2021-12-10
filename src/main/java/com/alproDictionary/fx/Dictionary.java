package com.alproDictionary.fx;

public class Dictionary {
    int dataSize = 100,current = 0,
    voidReturn = 0,arrLen = 0;

    public int getArrLen() {
        return arrLen;
    }
    public int getVoidReturn() {
        return voidReturn;
    }
    public void setVoidReturn(int voidReturn) {
        this.voidReturn = voidReturn;
    }
    String[] englishArr = new String[dataSize];
    String[] indoArr = new String[dataSize];
    String[] indoDef = new String[dataSize];
    void sort(){
        boolean stop=false; String swap;
        for (String arrCount:englishArr) {
            if (arrCount!=null) arrLen++;
        }
        System.out.println("arrlen="+arrLen);
        while (!stop){
            stop=true;
            for(int i=0; i<arrLen-1; i++){
                System.out.println(englishArr[i]+".compareTo("+englishArr[i+1]+")");
                if (englishArr[i].compareTo(englishArr[i+1])>0){
                    swap=englishArr[i+1]; //SwapStr
                    englishArr[i+1]=englishArr[i];
                    englishArr[i]=swap;
                    swap=indoArr[i+1]; //SwapStr
                    indoArr[i+1]=indoArr[i];
                    indoArr[i]=swap;
                    swap=indoDef[i+1]; //SwapStr
                    indoDef[i+1]=indoDef[i];
                    indoDef[i]=swap;
                    stop=false;
                }
            }// check
        }
    }
    Dictionary(){
        //init
//      format:
//      englishArr[int] = "EnglishWord"; indoArr[int] = "IndonesianWord";
//      indoDef[int] = "Definition"
//      int++

        englishArr[current]="LoremIpsum"; indoArr[current]="LoremIpsum";
        indoDef[current]="Cicero\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        current++;

        englishArr[current]="Algorithm"; indoArr[current]="Algoritme";
        indoDef[current]="nomina\n\nprosedur sistematis untuk memecahkan masalah matematis dalam langkah-langkah terbatas";
        current++;

        englishArr[current]="Argument"; indoArr[current]="Argumen";
        indoDef[current]="nomina\n\nArgumen adalah cara untuk memberikan lebih banyak informasi ke suatu fungsi. Fungsi kemudian dapat menggunakan informasi itu saat berjalan, seperti variabel";
        current++;

        sort();
    }
    public void search(String forThis,int awal,int akhir){
        int tengah = (awal+akhir)/2;
        if (forThis.equals(englishArr[tengah])) {
            setVoidReturn(tengah);
            return;
        }
        else if(awal==tengah||akhir==tengah){
            if (forThis.equals(englishArr[tengah+1])) {
                setVoidReturn(tengah+1);
                return;
            }
            else if (forThis.equals(englishArr[tengah-1])) {
                setVoidReturn(tengah-1);
                return;
            }
            System.out.println("\nngga nemu broh");
            setVoidReturn(-1);
            return;
        }
        if (forThis.compareTo(englishArr[tengah])<0) {
            awal = 0;
            akhir = tengah-1;
        }else if(forThis.compareTo(englishArr[tengah])>0) awal = tengah+1;
        search(forThis,awal,akhir);
    }
}
