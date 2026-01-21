package ejemplos;
public class ejemplo1 {


        public static void main(String[] args) {

            try {
                verificarEdad(2);
            } catch (EdadInvalidaException e) {
                System.out.println(e.getMessage());
            }

        }

        public static void verificarEdad(int edad) throws EdadInvalidaException {
            if (edad < 18) {
                throw new EdadInvalidaException("Sos menor, no podés entrar");
            }
        }
    }
