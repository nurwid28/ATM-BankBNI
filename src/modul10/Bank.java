/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;

import javax.swing.JOptionPane;
import java.io.*;

class Bank {
    public static void main(String[]args){
        String str, strl;
        int choice, z, pin=1234, counter=0, a=3;
        int t,s,tab=50000;
        
        JOptionPane.showMessageDialog(null,"Selamat Datang\n ANJUNGAN TUNAI MANDIRI"
                + "\n BNI SYARIAH - BOJONEGORO\n\n Masukkan 4 Digit PIN Anda! ","WELCOME",1);
        
        try{
            do{
                str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda : ",
                        "ATM BNI SYARIAH - BOJONEGORO",0);
                pin = Integer.parseInt(str);
                counter += 1; //menghitung kesempatan login
                
                if(pin == 1234) //cek pin
                    do{
                        str = JOptionPane.showInputDialog(null, "[1] INFORMASI SALDO "
                                + "\n[2] PENYETORAN \n[3] PENARIKAN \n[4] PETUNJUK"
                                + "\n[5] KELUAR \n\n Masukkan Pilihan Menu : ",
                                "Pilih Transaksi",3);
                        choice=Integer.parseInt(str);
                        switch(choice){
                            case 1 : JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : "
                            + tab); //inp=formasi saldo
                            
                            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?",
                                    "ATM BNI SYARIAH - BOJONEGORO",JOptionPane.YES_NO_OPTION,3);
                            if(z==0)
                                break;
                            else
                                JOptionPane.showMessageDialog(null, "Terimakasih telah "
                                        + "menggunakan ATM BRI SYARIAH - BOJONEGORO, "
                                        + "ambil kartu ATM Anda.");
                            System.exit(0);
                            
                            case 2 :
                                strl=JOptionPane.showInputDialog(null,"Masukkan jumlah "
                                        + "penyetoran : "); //menabung
                                s = Integer.parseInt(strl);
                                setor hasil = new setor();
                                hasil.menabung(tab, s);
                                tab = hasil.getsaldo();
                                
                                z= JOptionPane.showConfirmDialog(null,"Melanjutkan transakssi lain?",
                                        "ATM BNI SYARIAH - BOJONEGORO",JOptionPane.YES_NO_OPTION,3); //konfirmasi transaksi lain
                                if (z==0)
                                    break;
                                else
                                    
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan"
                                            + "ATM BN, ambil kartu ATM Anda.");
                            System.exit(0);
                            
                            case 3:
                                strl = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " ); //penarikan
                                t=Integer.parseInt(strl);
                                tarik mengambil = new tarik();
                                mengambil.ambil(tab,t);
                                tab = mengambil.getsaldo();
                                
                                z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?",
                                        "ATM BNI SYARIAH - BOJONEGORO",JOptionPane.YES_NO_OPTION,3); //konfirmasi transaksi lain
                                if(z==0)
                                    break;
                                else
                                    JOptionPane.showMessageDialog(null,"Terimakasih telah "
                                            + "menggunakan ATM BNI, ambil kartu ATM Anda,");
                                System.exit(0);
                                
                            case 4:
                                JOptionPane.showMessageDialog(null,"Cara Penggunaan Aplikasi"
                                        + "\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah"
                                        + "dengan benar sesuai pilihan\n[3] Gunakan uang sesuai "
                                        + "kebutuhan dan rajinlah menabung\n","INFO",1);
                                break;
                                
                            case 5:
                                z=JOptionPane.showConfirmDialog(null, "Anda ingin keluar?","Keluar",
                                        JOptionPane.YES_NO_OPTION,0);
                                if(z==0){
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan"
                                            + "ATM BNI, ambil kartu ATM anda.");
                                    System.exit(0);
                                }
                                else
                                    break;
                            default:JOptionPane.showMessageDialog(null,"Pilihan menu tidak tersedia "
                                    + "\nSilahkan ulangi lagi","ERROR",0);
                        }
                    }
                    
                    while(1==1);
                else if (counter <3) {
                    a--; //menghitung kesalaham login dan memberikan kesempatan login
                    JOptionPane.showMessageDialog(null,"PIN SALAH! \nPastikan PIN yang "
                            + "anda masukkan benar","ERROR",0);
                    JOptionPane.showMessageDialog(null,"\nKesempatan Login"+a+" kali lagi"+"\n");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Untuk bantuan nasabah, \nSilahkan menghubungi call"
                            + "center 555123 (Gratis)","Kartu ATM anda diblokir!",0);
                    System.exit(0);
                }}
                
                while (1==1);
            }  catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Kesalahan! \nPastikan kode yang anda "
                                + "masukkan berformat benar! \nPROGRAM KELUAR! \nTerimakasih","ERROR",0);
        }
        }
    }

