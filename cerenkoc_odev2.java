// Ceren KOÇ
// s26217

import javax.swing.JOptionPane;

public class cerenkoc_odev2 {
    public static void main(String[] args) {
        int t_ceza, b_ceza = 0;
        String input = JOptionPane.showInputDialog("Hızı giriniz: ");
        int hiz = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Tekrar sayısını giriniz: ");
        int tekrar = Integer.parseInt(input);


        if (hiz >= 111 && hiz <= 140) {
            if (tekrar >= 1 && tekrar <= 3) {
                b_ceza = 150;
            } else if (tekrar >= 4 && tekrar <= 5) {
                b_ceza = 350;
            } else if (tekrar >= 6 && tekrar <= 8) {
                b_ceza = 800;
            } else if (tekrar > 8) {
                b_ceza = 5000;
            } else {
                JOptionPane.showMessageDialog(null, "Hatalı tuşlama yaptınız!");
            }
        } else if (hiz >= 141 && hiz <= 160) {
            if (tekrar >= 1 && tekrar <= 3) {
                b_ceza = 375;
            } else if (tekrar >= 4 && tekrar <= 5) {
                b_ceza = 875;
            } else if (tekrar >= 6 && tekrar <= 8) {
                b_ceza = 2000;
            } else if (tekrar > 8) {
                b_ceza = 11000;
            } else {
                JOptionPane.showMessageDialog(null, "Hatalı tuşlama yaptınız!");
            }
        } else if (hiz >= 161 && hiz <= 180) {
            if (tekrar >= 1 && tekrar <= 3) {
                b_ceza = 720;
            } else if (tekrar >= 4 && tekrar <= 5) {
                b_ceza = 1650;
            } else if (tekrar >= 6 && tekrar <= 8) {
                b_ceza = 3800;
            } else if (tekrar > 8) {
                b_ceza = 18000;
            } else {
                JOptionPane.showMessageDialog(null, "Hatalı tuşlama yaptınız!");
            }
        } else if (hiz >= 181)  {
            if (tekrar >= 1 && tekrar <= 3) {
                b_ceza = 1200;
            } else if (tekrar >= 4 && tekrar <= 5) {
                b_ceza = 2800;
            } else if (tekrar >= 6 && tekrar <= 8) {
                b_ceza = 6500;
            } else if (tekrar > 8) {
                b_ceza = 42000;
            } else {
                JOptionPane.showMessageDialog(null, "Hatalı tuşlama yaptınız!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hatalı tuşlama yaptınız!");
        }

        int x = hiz * 2;
        t_ceza = b_ceza + x;
        JOptionPane.showMessageDialog(null, "Baz Ceza = " + b_ceza, "Baz Ceza",JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null, "Toplam Ceza = " + t_ceza, "Toplam Ceza",JOptionPane.OK_OPTION);
    }
}