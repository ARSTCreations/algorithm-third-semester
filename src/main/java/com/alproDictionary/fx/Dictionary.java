package com.alproDictionary.fx;

public class Dictionary {
    int dataSize = 100, current = 0;
    String[] englishArr = new String[dataSize];
    String[] indoArr = new String[dataSize];
    String[] indoDef = new String[dataSize];
    Dictionary(){
        //init
//      format:
//      englishArr[int] = "EnglishWord"; indoArr[int] = "IndonesianWord";
//      indoDef[int] = "Definition"
//      int++

        englishArr[current]="LoremIpsum"; indoArr[current]="LoremIpsum";
        indoDef[current]="nomina\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        current++;

        englishArr[current]="Algorithm"; indoArr[current]="Algoritme";
        indoDef[current]="nomina\nprosedur sistematis untuk memecahkan masalah matematis dalam langkah-langkah terbatas";
        current++;

        englishArr[current]="Argument"; indoArr[current]="Argumen";
        indoDef[current]="nomina\nArgumen adalah cara untuk memberikan lebih banyak informasi ke suatu fungsi. Fungsi kemudian dapat menggunakan informasi itu saat berjalan, seperti variabel";
        current++;
    }
}
