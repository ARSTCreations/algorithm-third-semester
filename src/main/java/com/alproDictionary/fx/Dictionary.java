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
        indoDef[current]="nomina\n\nprosedur sistematis untuk memecahkan masalah matematis dalam langkah-langkah terbatas.";
        current++;

        englishArr[current]="Argument"; indoArr[current]="Argumen";
        indoDef[current]="nomina\n\nArgumen adalah cara untuk memberikan lebih banyak informasi ke suatu fungsi. Fungsi kemudian dapat menggunakan informasi itu saat berjalan, seperti variabel.";
        indoDef[current]="nomina\n\nprosedur sistematis untuk memecahkan masalah matematis dalam langkah-langkah terbatas";
        current++;

        englishArr[current]="Argument"; indoArr[current]="Argumen";
        indoDef[current]="nomina\n\nArgumen adalah cara untuk memberikan lebih banyak informasi ke suatu fungsi. Fungsi kemudian dapat menggunakan informasi itu saat berjalan, seperti variabel";
        current++;

        //upi Start
        englishArr[current]="Analysis"; indoArr[current]="Analisis";
        indoDef[current]="nomina\n\npenyelidikan terhadap suatu peristiwa (karangan, perbuatan, dan sebagainya) untuk mengetahui keadaan yang sebenarnya (sebab-musabab, duduk perkaranya, dan sebagainya).";
        current++;

        englishArr[current]="Chat"; indoArr[current]="Obrolan";
        indoDef[current]="nomina\n\npercakapan ringan dan santai; omong kosong:";
        current++;

        englishArr[current]="Connection"; indoArr[current]="Sambungan";
        indoDef[current]="nomina\n\nkomunikasi yang terjadi apabila gagasan dan perasaan yang disampaikan pembawa pesan dapat menggugah dan menggerakkan hati penerima pesan; kontak antara pihak yang satu dan pihak yang lain; kontak batin.";
        current++;

        englishArr[current]="Copy"; indoArr[current]="Salin";
        indoDef[current]="nomina\n\nmengutip (tulisan); menulis kembali; meniru.";
        current++;

        englishArr[current]="Communicate"; indoArr[current]="\tBerkomunikasi/Menyampaikan";
        indoDef[current]="nomina\n\npengiriman dan penerimaan pesan atau berita antara dua orang atau lebih sehingga pesan yang dimaksud dapat dipahami; hubungan; kontak; 2 perhubungan.";
        current++;

        englishArr[current]="Computer"; indoArr[current]="Komputer";
        indoDef[current]="nomina\n\nalat elektronik otomatis yang dapat menghitung atau mengolah data secara cermat menurut yang diinstruksikan, dan memberikan hasil pengolahan, serta dapat " +
                         "menjalankan sistem multimedia (film, musik, televisi, faksimile, dan sebagainya), biasanya terdiri atas unit pemasukan, unit pengeluaran, unit penyimpanan, serta unit pengontrolan.";
        current++;

        englishArr[current]="Creator"; indoArr[current]="Pembuat";
        indoDef[current]="nomina\n\nsekumpulan orang yang merupakan kesatuan untuk mengerjakan sesuatu.";
        current++;

        englishArr[current]="Database"; indoArr[current]="Kumpulan data\n";
        indoDef[current]="nomina\n\npenampung yang menyimpan data yang Anda upload ke Analytics.";
        current++;

        englishArr[current]="Device"; indoArr[current]="Piranti/alat/perangkat";
        indoDef[current]="nomina\n\nbenda yang dipakai untuk mengerjakan sesuatu: perkakas; perabot(an).";
        current++;

        englishArr[current]="Interface"; indoArr[current]="Antarmuka";
        indoDef[current]="nomina\n\nhubungan atau batasan umum antara dua unit atau alat.";
        current++;

        englishArr[current]="Maintanance"; indoArr[current]="Pemeliharaan";
        indoDef[current]="nomina\n\nuang yang dikeluarkan untuk mengadakan (mendirikan, melakukan, dan sebagainya) sesuatu; ongkos; belanja; pengeluaran.";
        current++;

        englishArr[current]="Monitor"; indoArr[current]="Memantau";
        indoDef[current]="nomina\n\nmengamati atau mengecek dengan cermat, terutama untuk tujuan khusus; mengawasi; memonitor.";
        current++;

        englishArr[current]="Network"; indoArr[current]="Jaringan";
        indoDef[current]="nomina\n\nSekelompok komputer yang terhubung yang bisa saling berbagi sumber daya (seperti printer atau modem) dan data.";
        current++;

        englishArr[current]="Programming"; indoArr[current]="Pemrograman";
        indoDef[current]="nomina\n\nrancangan mengenai asas serta usaha (dalam ketatanegaraan, perekonomian, dan sebagainya) yang akan dijalankan.";
        current++;

        englishArr[current]="Project"; indoArr[current]="Proyek";
        indoDef[current]="nomina\n\nrencana pekerjaan dengan sasaran khusus (pengairan, pembangkit tenaga listrik, dan sebagainya) dan dengan saat penyelesaian yang tegas.";
        current++;
        //upi End

        //mangat hania
        englishArr[current]="Recurtion"; indoArr[current]="Pengulangan";
        indoDef[current]="nomina\n\nsebuah perintah pada yang memerintahkan code untuk mengulang sebuah proses sampai proses tersebut dihentikan oleh kondisi semula.";
        current++;

        englishArr[current]="Sitemap"; indoArr[current]="Peta Situs";
        indoDef[current]="nomina\n\nsebuah model atau kerangka konten  pada sebuah situs web yang dirancang untuk membantu penggunan dan mesin pencari menavigasi situs tersebut.";
        current++;

        englishArr[current]="User Interface"; indoArr[current]="Antarmuka Pengguna";
        indoDef[current]="nomina\n\nsebuah bentuk tampilan grafis dibuat sedemikian rupa yang berhubungan langsung dengan pengguna dan berfungsi sebagai penghubung antara pengguna." +
                         " dengan sistem operasi sehingga aplikasi atau program dapat beroperasi sebagaimana mestinya. ";
        current++;

        englishArr[current]="User Flow"; indoArr[current]="Alur Pengguna";
        indoDef[current]="nomina\n\nalur yang diambil oleh pengguna dari awal memasuki aplikasi atau website hingga keluar dari aplikasi atau website tersebut.";
        current++;

        englishArr[current]="User Experience"; indoArr[current]="Pengalaman Pengguna";
        indoDef[current]="nomina\n\nebuah proses meningkatkan kepuasan pengguna (pengguna aplikasi, pengunjung website) dalam meningkatkan kegunaan dan kesenangan yang " +
                         "diberikan dalam interaksi antara pengguna dan produk.";
        current++;

        englishArr[current]="Wireframe"; indoArr[current]="Mockup/Rancangan";
        indoDef[current]="nomina\n\nrancangan awal sebuah desain web atau protoype secara full dan detail yang dibuat secara manual menggunakan software editing gambar seperti Photoshop/Figma/Adobe XD.";
        current++;

        englishArr[current]="jQuery"; indoArr[current]="Kamus JavaScript";
        indoDef[current]="nomina\n\nkumpulan fungsi-fungsi JavaScript yang memudahkan penulisan kode JavaScript";
        current++;

        englishArr[current]="Library"; indoArr[current]="Kumpulan fungsi";
        indoDef[current]="nomina\n\nsebuah kumpulan fungsi yang dapat digunakan untuk memudahkan pembuatan sebuah aplikasi.";
        current++;

        englishArr[current]="Bug"; indoArr[current]="Kesalahan Kode";
        indoDef[current]="nomina\n\nsebuah program cacat atau kesalahan  dalam kode,  sehingga menyebabkan tampilan, grafis, karakter, sistem dan lainnya membuat " +
                         "sebuah website atau program tidak bekerja seperti seharusnya.";
        current++;

        englishArr[current]=""; indoArr[current]="";
        indoDef[current]="nomina\n\n";
        current++;

        englishArr[current]=""; indoArr[current]="";
        indoDef[current]="nomina\n\n";
        current++;

        englishArr[current]=""; indoArr[current]="";
        indoDef[current]="nomina\n\n";
        current++;

        englishArr[current]=""; indoArr[current]="";
        indoDef[current]="nomina\n\n";
        current++;

        englishArr[current]=""; indoArr[current]="";
        indoDef[current]="nomina\n\n";
        current++;

        englishArr[current]=""; indoArr[current]="";
        indoDef[current]="nomina\n\n";
        current++;
        // end Hania

        //M A U D Y
        englishArr[current]="Cancel"; indoArr[current]="Membatalkan";
        indoDef[current]="nomina\n\nTidak jadi dilangsungkan; ditunda; urung.";
        current++;

        englishArr[current]="Data"; indoArr[current]="Data";
        indoDef[current]="nomina\n\nKeterangan atau bahan nyata yang dapat dijadikan dasar kajian (analisis atau kesimpulan).";
        current++;

        englishArr[current]="Software"; indoArr[current]="Perangkat Lunak";
        indoDef[current]="nomina\n\nPerangkat program, prosedur, dan dokumen yang berkaitan dengan suatu sistem (misalnya sistem komputer).";
        current++;

        englishArr[current]="Disconnect"; indoArr[current]="Memutuskan";
        indoDef[current]="nomina\n\nMenghentikan (tentang arus atau sesuatu yang sedang bekerja).";
        current++;

        englishArr[current]="Link"; indoArr[current]="Tautan";
        indoDef[current]="nomina\n\nSambungan atau koneksi dari sebuah sumber ke sumber yang lain.";
        current++;

        englishArr[current]="Keyboard"; indoArr[current]="Papan Tombol";
        indoDef[current]="nomina\n\nSebuah papan yang terdiri atas tombol-tombol seperti huruf alfabet untuk mengetikkan kalimat.";
        current++;

        englishArr[current]="Router"; indoArr[current]="Perute";
        indoDef[current]="nomina\n\nSebuah alat yang mengirimkan paket data melalui sebuah jaringan atau Internet menuju tujuannya.";
        current++;

        englishArr[current]="Save"; indoArr[current]="Menyimpan";
        indoDef[current]="nomina\n\nPerintah di menu File pada sebagian besar aplikasi untuk menyimpan data kembali ke file dan folder asalnya.";
        current++;

        englishArr[current]="Feedback"; indoArr[current]="Umpan Balik";
        indoDef[current]="nomina\n\nTanggapan atau respon yang diberikan oleh seorang penerima kepada pengirim pesan.";
        current++;

        englishArr[current]="Ethernet"; indoArr[current]="Eternet";
        indoDef[current]="nomina\n\nStandar umum yang digunakan untuk menghubungkan kabel ke jaringan komputer";
        current++;

        englishArr[current]="Paste"; indoArr[current]="Tempel";
        indoDef[current]="nomina\n\nMenempelkan Objek yang telah disalin";
        current++;

        englishArr[current]="Font"; indoArr[current]="Fon";
        indoDef[current]="nomina\n\nSebuah huruf yang memiliki ukuran, berat, dan gaya tertentu.";
        current++;

        englishArr[current]="Touch screen"; indoArr[current]="Layar Sentuh";
        indoDef[current]="nomina\n\nSebuah perangkat input komputer yang bekerja dengan adanya sentuhan tampilan layar menggunakan jari atau pena digital.";
        current++;

        englishArr[current]="Compiler"; indoArr[current]="Kompilator";
        indoDef[current]="nomina\n\nsebuah program komputer yang berguna untuk menerjemahkan program komputer yang ditulis" +
                "dalam bahasa pemrograman tertentu menjadi program yang ditulis dalam bahasa pemrograman lain.";
        current++;

        englishArr[current]="Proxy"; indoArr[current]="Proksi";
        indoDef[current]="nomina\n\nSuatu sistem yang mengakses jaringan internet menggunakan IP yang berbeda.";
        current++;
        //M A U D Y End

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
