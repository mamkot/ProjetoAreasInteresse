import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
      int Idade, GastoTransp, AreaInter, MedId = 0, OutroAl = 0, MedTransp = 0, AreaHum = 0, AreaExa = 0, AreaSau = 0, Contador = 0;
      String mensagem;
      
      do{
          Contador++;
          Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
          MedId+=Idade;
          GastoTransp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor gasto com transporte: "));
          MedTransp+=GastoTransp;
          AreaInter = Integer.parseInt(JOptionPane.showInputDialog
           ("Informe a sua área de interesse: \n1 - Humanas \n2 - Exatas \n3 - Saúde"));
          if(AreaInter==1){
              AreaHum++;              
          }
          else{
            if(AreaInter==2){
              AreaExa++;
            }
            else{
              AreaSau++;
           }
          }
          
          OutroAl=Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro aluno?: \n1 - SIM \n2 - NÃO "));              
          
     }while(OutroAl!=2);
     mensagem = "Alunos entrevistados: "+Contador
               +"\nMédia de idade dos entrevistados: "+MedId/Contador
               +"\nMédia de gastos com transporte: R$"+MedTransp/Contador
               +"\nÁreas de interesse escolhidas: "
               +"\nHumanas: "+AreaHum
               +"\nExatas: "+AreaExa
               +"\nSaúde: "+AreaSau;
     JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
