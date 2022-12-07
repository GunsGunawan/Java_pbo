package penilaian;

public class mahasiswa {
    double tugas1, tugas2, tugas3, uts, uas, nAkhir, tugas;
    char index;
    String nama;
    String nim;
    String keterangan;

    public double gettugas1() {
        return gettugas1();
    }

    public void settugas1(double tugas1) {
        this.tugas1 = tugas1;
    }

    public double gettugas2() {
        return gettugas2();
    }

    public void settugas2(double tugas2) {
        this.tugas2 = tugas2;
    }

    public double gettugas3() {
        return gettugas3();
    }

    public void settugas3(double tugas3) {
        this.tugas3 = tugas3;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    double getnilaitugas(double tugas1, double tugas2, double tugas3) {
        tugas = (0.2 * (tugas1 + tugas2 + tugas3));
        return tugas;
    }

    double getNilaiAkhir(double tugas, double uts, double uas) {
        nAkhir = (tugas) + (0.3 * uts) + (0.5 * uas);
        return nAkhir;
    }

    public void getIndexNilai(double nAkhir) {

        if (nAkhir >= 90) {
            index = 'A';
            keterangan = "Lulus dengan nilai A";
        } else if (nAkhir >= 80) {
            index = 'B';
            keterangan = "Lulus dengan nilai B ";
        } else if (nAkhir >= 70) {
            index = 'C';
            keterangan = "Lulus dengan nilai C";
        } else if (nAkhir >= 60) {
            index = 'D';
            keterangan = "Anda tidak luluus";
        } else if (nAkhir <= 50) {
            index = 'E';
            keterangan = "Anda tidak luluus";
        }

        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + keterangan);

    }

    public double tugas() {
        return 0;
    }
}
