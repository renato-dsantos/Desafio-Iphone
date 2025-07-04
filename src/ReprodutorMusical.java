public class ReprodutorMusical{
        public String musica;

        public void tocar(){
            System.out.println("TOCANDO MUSICA");

        }

        public void pausar(){
            System.out.println("PAUSA MUSICA");

        }

        public void selecionarMusica(musica){
            this.musica = musica;
            System.out.println("TOCANDO MUSICA" + musica);

        }


}