class Bank{
    int rekening;
    boolean adaRekening;
    

    public Bank(int saldoAwal, boolean rekeningAda){
        rekening = saldoAwal;
        adaRekening = rekeningAda;
    }

public void cekRekening(){
    if(adaRekening){
     System.out.println("Kamu memiliki rekening sebesar Rp " + rekening);
        }else{
            System.out.println("Kamu tidak memiliki rekening.");
        }
    }

public void tarikTunai(int tarikTunai){
    if(!adaRekening){
        System.out.println("Kamu tidak memiliki Rekening.");
        return;
    }

    if(rekening < tarikTunai){
        System.out.println("Saldo di rekening mu tidak cukup.");
        }else{
            System.out.print("Kamu berhasil menarik tunai. ");
            rekening -= tarikTunai;
            System.out.println("Kamu baru saja menarik tunai sebesar Rp " + tarikTunai);
            }
        
    }
public void depositRekening(int jumlahDeposit){
    if(!adaRekening){
        System.out.println("Kamu tidak memiliki rekening.");
        }else{
            rekening = rekening + jumlahDeposit;
            System.out.println("Kamu baru saja mendepositkan sebesar Rp " + jumlahDeposit);
            }
    }

static void ucapanSalam() {
        System.out.println("Selamat datang di Bank Manrica, Senang untuk dipercaya anda.");
    }


public void pilihanMenu(int pilihan){
    switch (pilihan){
        case 1:
            cekRekening();
            break;

        case 2:
            tarikTunai(900000);
            break;
        
        case 3:
            depositRekening(2000000);
            break;
        
        case 4:
            System.out.println("Terimakasih telah menggunakan layanan bank ");
        default:
            break;
        }
    }
}


public class AkunBank {
    public static void main(String[] args){
        Bank rekeningandy = new Bank(5000000,true);

        Bank.ucapanSalam();

        rekeningandy.pilihanMenu(1);
        rekeningandy.pilihanMenu(2);
        rekeningandy.pilihanMenu(3);
        rekeningandy.pilihanMenu(4);
        rekeningandy.pilihanMenu(1);

    }
}
