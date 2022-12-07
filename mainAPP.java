package penilaian;

public class mainAPP {
    public static void main(String[] args) throws Exception {
        mahasiswa P = new mahasiswa();
        P.setNama("Gunawan Efendi");
        P.setNim("TI18210021");
        P.settugas1(100);
        P.settugas2(100);
        P.settugas3(100);
        P.setUts(100);
        P.setUas(100);

        System.out.println("Nama =" + P.getNama());
        System.out.println("Nim  =" + P.getNim());
        P.getnilaitugas(100, 100, 100);
        double nAkhir = P.getNilaiAkhir(P.tugas(), P.getUts(), P.getUas());

        System.out.println("Tugas1 : " + P.gettugas1());
        System.out.println("Tugas2 : " + P.gettugas2());
        System.out.println("Tugas3 : " + P.gettugas3());
        System.out.println("UTS : " + P.getUts());
        System.out.println("UAS : " + P.getUas());
        // System.out.println("\n");
        System.out.println("Nilai Akhir = " + nAkhir);
        // System.out.println("\n");
        P.getIndexNilai(nAkhir);
    }

}
