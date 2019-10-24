package pkg2120180198.k01.pbo.ti20192020.pkg3.pkg4.pkg01;
public class K01PBOTI201920203401 {
    public static void main(String[] args) {
        //instansiasi/membuat objek biodata mahasiswa 1 - 5 dari kelas mahasiswa
        mahasiswa1 biodata_mely=new mahasiswa1 ();
        mahasiswa2 biodata_aeni=new mahasiswa2 ();
        mahasiswa3 biodata_yusi=new mahasiswa3 ();
        mahasiswa4 biodata_haris=new mahasiswa4 ();
        mahasiswa5 biodata_rengga=new mahasiswa5 ();
 
        //pemanggilan property nama,nim dan alamat mahasiswa1
        System.out.println(biodata_mely.nama);
        System.out.println(biodata_mely.nim);
        System.out.println(biodata_mely.alamat);
        
        //pemanggilan property nim dan alamat mahasiswa2
        System.out.println(biodata_aeni.nama);
        System.out.println(biodata_aeni.nim);
        System.out.println(biodata_aeni.alamat);
        
        //pemanggilan property nama,nim dan alamat mahasiswa3
        System.out.println(biodata_yusi.nama);
        System.out.println(biodata_yusi.nim);
        System.out.println(biodata_yusi.alamat);
        
        //pemanggilan property nama,nim dan alamat mahasiswa4
        System.out.println(biodata_haris.nama);
        System.out.println(biodata_haris.nim);
        System.out.println(biodata_haris.alamat);
        
        //pemanggilan property nama nim,dan alamat mahasiswa5
        System.out.println(biodata_rengga.nama);
        System.out.println(biodata_rengga.nim);
        System.out.println(biodata_rengga.alamat);
        
        //pemanggilan method biodata pada kelas mahasiswa1
        biodata_mely.biodata();
        //pemanggilan method biodata pada kelas mahasiswa2
        biodata_aeni.biodata();
        //pemanggilan method biodata pada kelas mahasiswa3
        biodata_yusi.biodata();
        //pemanggilan method biodata pada kelas mahasiswa4
        biodata_haris.biodata();
        //pemanggilan method biodata pada kelas mahasiswa5
        biodata_rengga.biodata();

        
    }
    
}

