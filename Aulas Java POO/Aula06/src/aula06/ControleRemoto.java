package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.setVolume(50);
        this.setTocando(false);
        this.setLigado(false);
    }
    
    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }
    
    public boolean getLigado(){
        return this.ligado;
    }
    
    public void setLigado(boolean l){
        this.ligado = l;
    }
    
    public boolean getTocando(){
        return this.tocando;
    }
    
    public void setTocando(boolean t){
        this.tocando = t;
    }

    // Metodos ABSTRATOS, METODOS DA INTERFACE(CONTROLADOR) QUE VAI SER PROGRAMADO AQUI
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("Esta Ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume? " + this.getVolume());
        for(int i = 1; i <= this.getVolume(); i += 10){
            System.out.print("[]");
        }
        System.out.println("");
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu :(");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 1);
        }else{
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Impossivel abaixar");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else{
            System.out.println("Não consegui pausar");
        }
    }
    
}
