package ufpb.br.neuron.by;

import javax.swing.JButton;

/**
 * @author klauder
 */
public class Arduino {
    private ControlePorta arduino;

    /**
     * Construtor da classe Arduino
     */
    public Arduino(){
        //arduino = new ControlePorta("COM3",9600);//Windows - porta e taxa de transmissão
        arduino = new ControlePorta("/dev/ttyUSB0",9600);//Linux - porta e taxa de transmissão
    }

    /**
     * Envia o comando para a porta serial
     * @param button - Botão que é clicado na interface Java
     */
    public void comunicacaoArduino(JButton button) {
        if("Ligar".equals(button.getActionCommand())){
            arduino.enviaDados(1);
            System.out.println(button.getText());//Imprime o nome do botão pressionado
        }
        else if("Desligar".equals(button.getActionCommand())){
            arduino.enviaDados(2);
            System.out.println(button.getText());
        }
        else{
            arduino.close();
            System.out.println(button.getText());//Imprime o nome do botão pressionado
        }
    }
}
