class Bank{
    int rekening;

    public Bank(int saldoAwal){
        rekening = saldoAwal;
    }

public void cekRekening(){
     System.out.println("Kamu memiliki rekening sebesar Rp " + rekening);
    }
public void tarikTunai(int tarikTunai){
        rekening = rekening - tarikTunai;
        System.out.println("Kamu baru saja menarik tunai sebesar Rp " + tarikTunai);
    }
public void depositRekening(int jumlahDeposit){
        rekening = rekening + jumlahDeposit;
        System.out.println("Kamu baru saja mendepositkan sebesar Rp " + jumlahDeposit);
    }

static void ucapanSalam() {
        System.out.println("Selamat datang di Bank Manrica, Senang untuk dipercaya anda.");
    }
}

public class AkunBank {
    public static void main(String[] args){
        Bank rekeningandy = new Bank(30000000);

        Bank.ucapanSalam();

        rekeningandy.cekRekening();

        rekeningandy.tarikTunai(5000000);

        rekeningandy.cekRekening();

        rekeningandy.tarikTunai(900000);

        rekeningandy.cekRekening();

        rekeningandy.depositRekening(2000000);
        
        rekeningandy.cekRekening();

    }

}