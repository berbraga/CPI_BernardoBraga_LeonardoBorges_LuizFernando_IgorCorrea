public class App {
    

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                function01(linha)
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }


/*
CODIGO ASSEMBLY:
main:   
       addi $s1, $zero, 4 
       addi $s2, $zero, 3 
       addi $s3, $zero, 2 
       addi $s4, $zero, 1 

       add $t0, $s1, $s2     # $t0 = g + h
       add $t1, $s3, $s4     # $t1 = i + j
       sub $s0, $t0, $t1     # f = $t0 - $t1

codigo assembly gera o 
CODIGOS BINARIOS DE EXEMPLO:

    OPCODE        REGISTRADOR          FUNCT           CODIGO ASSEMBLY:
    001000   00000 10001 00000 00000   000100          addi $s1, $zero, 4 
    001000   00000 10010 00000 00000   000011          addi $s2, $zero, 3 
    001000   00000 10011 00000 00000   000010          addi $s3, $zero, 2
    001000   00000 10100 00000 00000   000001          addi $s4, $zero, 1 
    000000   10001 10010 01000 00000   100000          add $t0, $s1, $s2     # $t0 = g + h
    000000   10011 10100 01001 00000   100000          add $t1, $s3, $s4     # $t1 = i + j
    000000   01000 01001 10000 00000   100010          sub $s0, $t0, $t1     # f = $t0 - $t1

  
 */


    public static void function01(String linha){/* OPCODE */
        if(!linha.equals("")){
            linha = linha.substring(0,6)
            System.out.println(linha);
      
        }

    }

    // Ultimos 6 códigos/ numeros / FUNC
    public int ultimosNumerosFuncao(String fun){
        linha = linha.substring(26,32)
                System.out.println(linha);
    }


public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }    
}




/*



