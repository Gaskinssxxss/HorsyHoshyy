package LinkedList;

public class Peternak {
    public String name;
    public String namaJob;
    public int waktuJob;

    public Peternak(String name, String namaJob, int waktuJob) {
        this.name = name;
        this.namaJob = namaJob;
        this.waktuJob = waktuJob;
    }

    public void SetNama(String nama) {
        this.name = nama;
    }

    public String getNama() {
        return name;
    }

    public void setjob(String namaJob) {
        this.namaJob = namaJob;
    }

    public String getNamaJob() {
        return namaJob;
    }

    public void setWaktujob(int waktuJob) {
        this.waktuJob = waktuJob;
    }

    public int getWaktuJob() {
        return waktuJob;
    }
}

//