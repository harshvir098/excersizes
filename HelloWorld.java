public class HelloWorld {

    public static void main(String[] args) {


        int i =3;

        int divide = 0;

        try {
            divide= 3%0;
        } catch (Exception e){
            System.out.println(e);

        }


        System.out.println(divide);

    }
}
