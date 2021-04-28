package com.example.fragmentugas4;

import java.util.ArrayList;

public class MovieData {private static String[] nama = new String[] {
        "Bucin",
        "The Night Comes for Us",
        "Headshot",
        "Love for Sale",
        "Ave Maryam",
        "A Copy of My Mind",
        "Tersanjung",
        "Cahaya dari Timur: Beta Maluku",
        "Guru-Guru Gokil",
        "Matt & Mou"};
    private static int[]thunail = new int[] {  R.drawable.bucin,
            R.drawable.thenight,
            R.drawable.headshot,
            R.drawable.loveforsale,
            R.drawable.avemaryam,
            R.drawable.acopy,
            R.drawable.tersanjung,
            R.drawable.cahayadaritimur,
            R.drawable.gurugurugokil,
            R.drawable.mattmou};
    private static String[]preview = new String[] {
            "Merasa bahwa mereka bucin, Jovial (29) mendaftarkan adiknya, Andovi (25), dan teman- temannya , Tommy (24) dan Chandra (26), untuk mengikuti kursus anti-bucin.",
            "film aksi seru dari Indonesia yang disutradarai oleh Timo Tjahjanto dan dibintangi oleh Joe Taslim.",
            "sebuah film laga Indonesia yang dirilis pada Desember 2016. Film ini disutradarai oleh Mo Brothers.",
            "Sudah terlalu lama hidup sendiri, Richard telanjur nyaman menjalani hidupnya yang datar dan tanpa tantangan.",
            "Semarang, Suster Maryam (39th), seorang biarawati yang bertugas mengurusi para suster-suster sepuh, menjelang ulang tahun nya yang ke 40th dia berusaha untuk terus memurnikan diri.",
            "sebuah film drama Indonesia tahun 2015 yang disutradarai oleh Joko Anwar serta dibintangi oleh Chicco Jerikho dan Tara Basro. ",
            "Di tahun 90-an, masa di saat tokoh-tokoh di ujung transisi menuju milenium baru. Yura (Clara Bernadeth) gadis malang yang tinggal dengan orang tua angkat",
            "Sani Tawainella (Chicco Jericho) ingin menyelamatkan anak-anak di kampungnya dari konflik agama yang terjadi di Ambon melalui sepak bola.",
            "film drama komedi Indonesia tahun 2020 yang disutradarai Sammaria Simanjuntak dan dibintangi Gading Marten, Dian Sastrowardoyo, Faradina Mufti, Boris Bokir, dan Kevin Ardilova.",
            "MATT (Maxime Bouttier) & MOU (Prilly Latuconsina), dua sahabat yang sudah berteman sejak kecil."
    };
    public static ArrayList<MovieModel> getListData(){
        MovieModel movieModel = null;
        ArrayList<MovieModel> list = new ArrayList<>();
        for (int i =0; i<nama.length; i++){
            movieModel = new MovieModel();
            movieModel.setNamaMovie(nama[i]);
            movieModel.setLogoMovie(thunail[i]);
            movieModel.setPrivew(preview[i]);
            list.add(movieModel);
        }
        return list;
    }
}
