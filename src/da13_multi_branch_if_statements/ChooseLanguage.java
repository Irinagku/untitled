package da13_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection ;
        selection = 1;

        if(selection==1){
            System.out.println("hello, thank you for your call");
        }else if(selection==2){
                System.out.println("hola, gracias para llamar");
            }else if(selection==3){
                System.out.println("merhaba,aradiginiz icin tessekkurler");
            }else if(selection==4){
                System.out.println("privet, spasibo za vash zvonok");
            }else{
                System.out.println("lets talk java and english, hello");
            }

    }
}
