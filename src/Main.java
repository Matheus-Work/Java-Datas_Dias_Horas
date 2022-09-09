import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
/*Exemplo de saída:
Óla, {nome}. Hoje é {dia-da-semana}, {SAUDACOES}.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scan.next();
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao = "";
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        }else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        }else if(agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        }
        System.out.printf("Óla, %s. Hoje é %s, %s.%n",nome,diaSemana,saudacao.toUpperCase());
    }
}
