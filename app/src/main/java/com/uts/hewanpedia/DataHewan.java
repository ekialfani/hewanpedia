package com.uts.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.uts.hewanpedia.jenis.Tikus;
import com.uts.hewanpedia.jenis.Burung;
import com.uts.hewanpedia.jenis.Hewan;
import com.uts.hewanpedia.jenis.Paus;
import com.uts.hewanpedia.jenis.Hiu;

public class DataHewan {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Tikus> initDataTikus(Context ctx) {
        List<Tikus> mouses = new ArrayList<>();
        mouses.add(new Tikus("Acomys", "Afrika",
                "Acomys adalah sebuah genus dari spesies hewan pengerat. Berpenampilan mirip dengan tikus dari genus Mus, genus tersebut adalah mamalia kecil dengan ekor pucat.", R.drawable.tikus_acomys));
        mouses.add(new Tikus("Tikus Ladang Bergaris", "Eropa Timur sampai Asia Timur",
                "Tikus ladang bergaris (Apodemus agrarius) adalah sebuah jenis tikus dalam keluarga Muridae. Persebaran spesies tersebut terbentang dari Eropa Timur sampai Asia Timur.", R.drawable.tikus_apodemus_agrarius));
        mouses.add(new Tikus("Tikus Rumput Sudan", "Daerah Afrika",
                "Tikus rumput Sudan (Arvicanthis ansorgei) adalah sebuah spesies tikus dalam keluarga Muridae. Spesies tersebut ditemukan di Burkina Faso, Guinea-Bissau, Mali, Niger, Senegal, Benin, Pantai Gading, Ghana, Guinea, dan  Togo.", R.drawable.tikus_arvicanthis));
        mouses.add(new Tikus("Gerbil", "Afrika Utara",
                "Gerbil adalah salah satu sub-keluarga dari keluarga hewan pengerat Muridae. Sempat disebut sebagai tikus gurun, sub-keluarga tersebut meliputi sekitar 110 spesies hewan pengerat Afrika, India dan Asia, yang meliputi tikus pasir dan jird, semuanya beradaptasi pada habitat kering.", R.drawable.tikus_gerbil));
        mouses.add(new Tikus("Tikus Hutan", "Eropa",
                "Tikus hutan (Apodemus sylvaticus) adalah sebuah jenis tikus Muridae yang berasal dari Eropa dan barat laut Afrika. Spesies tersebut berkerabat dengan tikus leher kuning (Apodemus flavicollis) namun berbeda dalam hal tak memiliki bulu kuning di sekitaran leher, memiliki telinga yang lebih kecil, dan biasanya memiliki tubuh yang lebih kecil: panjang sekitar 90 mm (3.54 in) dan berat 23 g.", R.drawable.tikus_hutan));
        mouses.add(new Tikus("Petromyscus", "Afrika Barat",
                "Petromyscus adalah genus hewan pengerat dalam keluarga Nesomyidae. Sangat berbeda dari hewan pengerat lain sehingga ditempatkan sebagai satu-satunya genus di subfamili Petromyscinae.", R.drawable.tikus_harvest_mouse));
        return mouses;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> birds = new ArrayList<>();
        birds.add(new Burung("Beo", "Srilanka, india, Filipina dan Sunda Kecil",
                "Beo, mamiang, atau tiong emas (Gracula) adalah sejenis burung anggota suku Sturnidae (jalak dan kerabatnya). Wilayah persebaran alaminya adalah mulai dari Sri Lanka, India, Himalaya, ke timur hingga Filipina, jawa hingga kepulauan sunda kecil. Burung ini dapat ditemukan di dataran rendah hingga dataran tinggi lebih dari 2000m.", R.drawable.burung_beo));
        birds.add(new Burung("Cenderawsih", "Papua, Indonesia",
                "Burung Cenderawasih merupakan anggota famili Paradisaeidae dari ordo Passeriformes. Cendrawasih biasanya ditemukan di Indonesia seperti di bagian Timur Papua, Papua Nugini, pulau-pulau selat Torres, dan Australia timur. Burung anggota keluarga ini dikenal karena bulu burung jantan pada banyak jenisnya, terutama bulu yang sangat memanjang dan rumit yang tumbuh dari paruh, sayap atau kepalanya.", R.drawable.burung_cenderawasih));
        birds.add(new Burung("Burung Hantu", "Tersebar di seluruh dunia kecuali Antartika",
                "Burung hantu adalah kelompok burung yang merupakan anggota ordo Strigiformes. Burung ini termasuk golongan burung buas (karnivora, pemakan daging) dan merupakan hewan malam (nokturnal). Seluruhnya, terdapat sekitar 222 spesies yang telah diketahui, yang menyebar di seluruh dunia kecuali Antarktika, sebagian besar Greenland, dan beberapa pulau-pulau terpencil.", R.drawable.burung_hantu));
        birds.add(new Burung("Burung Unta", "Afrika Utara dan Arab",
                "Burung unta merupakan burung terbesar yang masih hidup. Dengan ketinggian hingga 2,5 meter (8 kaki), ia cukup besar seukuran orang dewasa berbadan kecil menunggang mereka dan telah digunakan di sebagian Afrika Utara dan Arab sebagai hewan tunggangan perlombaan. Burung ini tidak dapat terbang dan termasuk dalam kumpulan primitif yang kurang dikenal, yaitu ratit (Palaeognaths). Nama ilmiahnya Struthio camelus.", R.drawable.burung_unta));
        birds.add(new Burung("Kakatua", "Indonesia",
                "Kakatua (suku Cacatuidae) adalah jenis burung hias yang memiliki bulu yang indah dengan lengkingan suara yang cukup nyaring. Spesies ini termasuk salah satu burung dengan kecerdasan yang cukup bagus, sehingga sering digunakan untuk acara-acara hiburan di kebun binatang atau tempat hiburan lainnya.", R.drawable.burung_kakatua));
        birds.add(new Burung("Jalak Bali", "Bali, Indonesia",
                "Jalak Bali (Leucopsar rothschildi) adalah sejenis burung pengicau berukuran sedang, dengan panjang lebih kurang 25cm,[1] dari suku Sturnidae. Ia turut dikenali sebagai Curik Ketimbang Jalak.[2] Jalak Bali hanya ditemukan di hutan bagian barat Pulau Bali dan merupakan hewan endemik Indonesia.", R.drawable.burung_jalak_bali));
        return birds;
    }

    private static List<Paus> initDataPaus(Context ctx) {
        List<Paus> whales = new ArrayList<>();
        whales.add(new Paus("Paus Biru", "Atlantik Utara dan Pasifik Utara",
                "Paus biru dianggap sebagai hewan terbesar yang pernah hidup di Bumi. Mereka mencapai panjang hingga 100 kaki dan berat 100 hingga 150 ton. Kulit mereka berwarna biru keabu-abuan yang indah, seringkali dengan bintik-bintik cahaya.", R.drawable.paus_biru));
        whales.add(new Paus("Paus Bungkuk", "Pantai Montery, California U.S",
                "Paus bungkuk dikenal sebagai New Englander bersayap besar karena memiliki sirip dada yang panjang, atau sirip dada, dan bungkuk. Ekornya yang megah dan berbagai perilaku spektakulernya menjadikan paus ini favorit para pengamat paus. Humpback adalah paus balin berukuran sedang dengan lapisan lemak tebal.", R.drawable.paus_bungkuk));
        whales.add(new Paus("Paus Sikat Atlantik Utara", "Samudra Atlantik",
                "Paus Sikat Atlantik Utara adalah salah satu mamalia laut yang paling terancam punah, dengan hanya sekitar 400 yang tersisa. Dikenal sebagai The Right Whale bagi pemburu paus untuk berburu karena kecepatannya yang lambat, kecenderungan untuk mengapung ketika dibunuh, dan punya lapisan lemak tebal.", R.drawable.paus_sikat_atlantik_utara));
        whales.add(new Paus("Paus Bryde", "Perairan Tropis",
                "Paus Bryde (diucapkan broodus) dinamai untuk Johan Bryde, yang membangun stasiun penangkapan paus pertama di Afrika Selatan. Mereka memiliki panjang 40 hingga 55 kaki dan berat hingga 45 ton dan paling sering ditemukan di perairan tropis dan subtropis.", R.drawable.paus_bryde));
        whales.add(new Paus("Paus Beluga", "Kutub Utara",
                "Paus beluga disebut canary laut oleh pelaut karena vokalisasi yang khas, yang kadang-kadang bisa terdengar melalui lambung kapal. Warna beluga serba putih dan dahi bulat membuatnya berbeda dari spesies lain. Ia merupakan seekor ikan paus bergigi yang menemukan mangsanya menggunakan ekolokasi.", R.drawable.paus_beluga));
        whales.add(new Paus("Paus Sirip", "Atlantik Utara dan Antartika",
                "Paus sirip atau paus bersirip (Balaenoptera physalus) adalah mamalia laut yang masuk kedalam subordo paus balin. Paus, yang memiliki panjang hampir sepanjang 27 meter,[1] adalah paus terbesar kedua dan binatang terbesar kedua di dunia setelah paus biru.", R.drawable.paus_sirip));
        return whales;
    }


    private static List<Hiu> initDataHiu(Context ctx) {
        List<Hiu> sharks = new ArrayList<>();
        sharks.add(new Hiu("Hiu Biru", "Lautan Tropis dan Sub Tropis",
                "Hiu biru atau cucut biru besar (Prionace glauca) adalah spesies hiu dari famili Carcharhinidae, yang menghuni lautan tropis dan subtropis di seluruh dunia. Hiu ini menyukai air yang lebih dingin[3] dan mampu berkelana sejauh jarak New England ke Amerika Selatan. Hiu biru diklasifikasikan sebagai spesies mendekati terancam oleh IUCN.", R.drawable.blue_shark));
        sharks.add(new Hiu("Hiu Martil", "Perairan Hangat",
                "Hiu martil atau dalam bahasa Inggris disebut  Hammerhead Shark ini memiliki bentuk  kepala menyerupai martil gepeng dengan mata dan lubang hidung di ujung kepala. Bentuk kepalanya yang unik itu membuatnya mampu bermanuver di air dengan akurasi tinggi.", R.drawable.hiu_martil));
        sharks.add(new Hiu("Hiu Gergaji", "Australia, India, Afrika Selatan",
                "Hiu gergaji atau Saw Shark memiliki moncong panjang mirip mata pisau yang dilengkapi serangkaian gigi layaknya gergaji bermata dua. Ikan ini mirip pari gergaji, tapi berbeda pada letak celah insang.", R.drawable.hiu_gergaji));
        sharks.add(new Hiu("Threser Shark", "Indo-Pasifik dan Laut Cina",
                "Hiu thresher terdiri dari empat spesies yang keempatnya ditandai dengan ekor pada sirip atas yang panjangnya mencapai 50 persen dari total panjang keseluruhan. Hiu ini memiliki moncong pendek dan mata yang besar di depan kepala. Sirip punggung kedua jauh lebih pendek dari yang pertama.", R.drawable.hiu_thresher_shark));
        sharks.add(new Hiu("Hiu Zebra", "Pasifi-Indonesia",
                "Hiu Zebra, Stegostoma fasciatum, adalah hiu yang ada di perairan Indo-Pasifik yang memiliki sirip yang sangat panjang, hampir sepanjang tubuhnya. Hiu ini diberi nama hiu Zebra karena garis pada tubuhnya yang mirip garis zebra.", R.drawable.hiu_zebra));
        sharks.add(new Hiu("Hiu Greenland", "Greenland",
                "Hiu greenland (Somniosus microcephalus) merupakan perenang lambat. Kecepatan renang hiu yang hidup di perairan dingin sekitar Greenland dan Iceland ini hanya 2,7 km per jam. Menurut para ilmuwan, kondisi ini dikarenakan rendahnya suhu air di Laut Arktik.", R.drawable.hiu_greenland));
        return sharks;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataTikus(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataHiu(ctx));
        hewans.addAll(initDataPaus(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
