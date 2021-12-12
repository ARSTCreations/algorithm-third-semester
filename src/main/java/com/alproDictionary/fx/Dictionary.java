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
        indoDef[current]="nomina\n\n.";
        current++;

        englishArr[current]="Algorithm"; indoArr[current]="Algoritme";
        indoDef[current]="nomina\n\nprosedur sistematis untuk memecahkan masalah matematis dalam langkah-langkah terbatas";
        current++;

        englishArr[current]="Argument"; indoArr[current]="Argumen";
        indoDef[current]="nomina\n\nArgumen adalah cara untuk memberikan lebih banyak informasi ke suatu fungsi. Fungsi kemudian dapat menggunakan informasi itu saat berjalan, seperti variabel";
        current++;

        //upi Start
        englishArr[current]="Analysis"; indoArr[current]="Analisis";
        indoDef[current]="nomina\n\npenyelidikan terhadap suatu peristiwa (karangan, perbuatan, dan sebagainya) untuk mengetahui keadaan yang sebenarnya (sebab-musabab, duduk perkaranya, dan sebagainya)";
        current++;

        englishArr[current]="chat"; indoArr[current]="obrolan";
        indoDef[current]="nomina\n\npercakapan ringan dan santai; omong kosong:";
        current++;

        englishArr[current]="connection"; indoArr[current]="sambungan";
        indoDef[current]="nomina\n\nkomunikasi yang terjadi apabila gagasan dan perasaan yang disampaikan pembawa pesan dapat menggugah dan menggerakkan hati penerima pesan; kontak antara pihak yang satu dan pihak yang lain; kontak batin;";
        current++;

        englishArr[current]="copy"; indoArr[current]="Salin";
        indoDef[current]="nomina\n\nmengutip (tulisan); menulis kembali; meniru:";
        current++;

        englishArr[current]="Communicate"; indoArr[current]="\tBerkomunikasi/Menyampaikan";
        indoDef[current]="nomina\n\npengiriman dan penerimaan pesan atau berita antara dua orang atau lebih sehingga pesan yang dimaksud dapat dipahami; hubungan; kontak; 2 perhubungan;";
        current++;

        englishArr[current]="Computer"; indoArr[current]="Komputer";
        indoDef[current]="nomina\n\nalat elektronik otomatis yang dapat menghitung atau mengolah data secara cermat menurut yang diinstruksikan, dan memberikan hasil pengolahan, serta dapat menjalankan sistem multimedia (film, musik, televisi, faksimile, dan sebagainya), biasanya terdiri atas unit pemasukan, unit pengeluaran, unit penyimpanan, serta unit pengontrolan";
        current++;

        englishArr[current]="Creator"; indoArr[current]="Pembuat";
        indoDef[current]="nomina\n\nsekumpulan orang yang merupakan kesatuan untuk mengerjakan sesuatu:";
        current++;

        englishArr[current]="Database"; indoArr[current]="Kumpulan data\n";
        indoDef[current]="nomina\n\npenampung yang menyimpan data yang Anda upload ke Analytics";
        current++;

        englishArr[current]="device"; indoArr[current]="Piranti/alat/perangkat";
        indoDef[current]="nomina\n\nbenda yang dipakai untuk mengerjakan sesuatu: perkakas; perabot(an):";
        current++;

        englishArr[current]="interface"; indoArr[current]="antarmuka";
        indoDef[current]="nomina\n\nubungan atau batasan umum antara dua unit atau alat;.";
        current++;

        englishArr[current]="Maintanance"; indoArr[current]="Pemeliharaan";
        indoDef[current]="nomina\n\nuang yang dikeluarkan untuk mengadakan (mendirikan, melakukan, dan sebagainya) sesuatu; ongkos; belanja; pengeluaran:";
        current++;

        englishArr[current]="Monitor"; indoArr[current]="Memantau";
        indoDef[current]="nomina\n\nmengamati atau mengecek dengan cermat, terutama untuk tujuan khusus; mengawasi; memonitor;";
        current++;

        englishArr[current]="Network"; indoArr[current]="Jaringan";
        indoDef[current]="nomina\n\nSekelompok komputer yang terhubung yang bisa saling berbagi sumber daya (seperti printer atau modem) dan data. .";
        current++;

        englishArr[current]="Programming"; indoArr[current]="Pemrograman";
        indoDef[current]="nomina\n\nrancangan mengenai asas serta usaha (dalam ketatanegaraan, perekonomian, dan sebagainya) yang akan dijalankan:";
        current++;

        englishArr[current]="Project"; indoArr[current]="Proyek";
        indoDef[current]="nomina\n\nrencana pekerjaan dengan sasaran khusus (pengairan, pembangkit tenaga listrik, dan sebagainya) dan dengan saat penyelesaian yang tegas";
        current++;
        //upi End

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
