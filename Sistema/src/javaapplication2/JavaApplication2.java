
import java.util.Scanner;
       

public class JavaApplication2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha o pacote abaixo:");
    System.out.println("------------------------");
         System.out.print("Codigo dos Pacotes\n"
               + "1 - Adminstração de Pessoas\n"
               + "2 - Agente de Portaria\n"
               + "3 - America english file starter\n"
               + "4 - Assistente Contábil\n"
               + "5 - Assistente de Marketing\n"
               + "6 - Assistente Finaceiro\n"
               + "7 - Atendete de Farmácia\n");
         System.out.println("------------------------");
         System.out.print("Digite o Codigo:");
         
        String cod = scanner.nextLine();
      // System.out.println(cod);
        switch(cod) {
            case "1":
            System.out.println("\n"
                   + "Gestão de Administrativa\n"
                   + "Gestão de RH\n"
                   + "Departamento Pessoal\n"
                   + "Crédito, Cobrança e Atendimento\n"
                   + "Empreendedorismo\n"
                   + "Liderança Eficaz"                                      
            ); 
            System.out.print("----\n");
            System.out.print(
                    "Carga Horária: 59 Horas\n"
                    + "Total de Meses: 8 Meses\n"
                    + "Valor total do pacote: R$ 2.065,00\n"
            );
            break; 
            
            case "2":
             System.out.println("\n"
                    +  "Agente de Portaria"                                                               
            ); 
             System.out.print("----\n");
             System.out.print(
                      "Carga Horária: 5 Horas\n"
                    + "Total de Meses: 1 Meses\n"
                    + "Valor total do pacote: R$ 175,00\n"
            );
            break; 
            
            case "3":
            System.out.println("\n"
                   +"American english file starter"                                                               
            ); 
             System.out.print("----\n");
             System.out.print(
                      "Carga Horária: 96 Horas\n"
                    + "Total de Meses: 12 Meses\n"
                    + "Valor total do pacote: R$ 4.320,00\n"
            );
            break; 
            case "4":
           System.out.println("\n"
                   + "Microsoft Word \n"
                   + "Microsoft Excel \n"
                   + "Internet\n"
                   + "Armazenamento em nuvem\n"
                   + "Administrativo\n"
                   + "Assitente Contábil\n"
                   + "Matemática Financeira\n"
                   + "Gestão RH\n"
                   + "Departamento Pessoal"                                      
            ); 
            System.out.print("----\n");
            System.out.print(
                    "Carga Horária: 145 Horas\n"
                    + "Total de Meses: 18 Meses\n"
                    + "Valor total do pacote: R$ 5.075,00\n"
            );
            break; 
            case "5":
            System.out.println("\n"
                   + "CorelDraw \n"
                   + "Marketing Pessoal\n"
                   + "Marketinh Digital\n"
                   + "Mídias Socias\n"
                   + "Facebook Business\n"
                   + "Whatsapp business\n"
                   + "Canva"                                                       
            ); 
            System.out.print("----\n");
            System.out.print(
                    "Carga Horária: 114 Horas\n"
                    + "Total de Meses: 14 Meses\n"
                    + "Valor total do pacote: R$ 3.990,00\n"
            );
            break; 
            case "6":
            System.out.println("\n"
                   + "Microsoft Excel Dashboard \n"
                   + "Matemática Finaceira Com HP12C\n"
                   + "Administrativo\n"
                   + "Educação Financeira\n"
                   + "Microsoft Excel Avançado\n"
                   + "Microsoft Power BI\n"
                   + "Operador de Caixa"                                                       
            ); 
            System.out.print("----\n");
            System.out.print(
                    "Carga Horária: 90 Horas\n"
                    + "Total de Meses: 11 Meses\n"
                    + "Valor total do pacote: R$ 3.150,00\n"
            );
            break; 
            case "7":
            System.out.println("\n"
                   + "Microsoft Excel \n"
                   + "operador de Caixa\n"
                   + "Atendente de Farmácia\n"
                   + "BioSegurança"                                                                        
            ); 
            System.out.print("----\n");
            System.out.print(
                    "Carga Horária: 77 Horas\n"
                    + "Total de Meses: 10 Meses\n"
                    + "Valor total do pacote: R$ 2.695,00\n"
            );
            break; 
            
            default:
                System.out.print("Pacote não encontrado");
                break;
            
              
        }
    }
}
    

