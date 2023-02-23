import java.util.Scanner;


public class binaryTree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,cnt;
        
        int[] stack=new int[100];
        String inputNum;
        String[] temp_str=new String[100];
        int[] temp_int=new int[100];


        for(int i=0; i<100; i++){
            temp_int[i]=0;
            stack[i]=0;
        }



        System.out.println("<이진 탐색 트리>");
        while(true){
            for(int i=0; i<100; i++){
                temp_int[i]=0;
                
            }
        
        
        System.out.print("1은 삽입, 2는 삭제, 3은 탐색입니다. 원하는 기능을 해당하는 정수로 입력하세요.\n입력 : ");

        a=sc.nextInt();

        if(a==1){

            System.out.print("삽입 하고 싶은 정수를 입력하세요. 여러개를 입력하려면 정수를 띄어쓰기로 구분하여 입력해 주십시오.  예시)15 4 8 19 92 400\n입력 : ");
            inputNum=sc.nextLine();
            inputNum=sc.nextLine();

            temp_str=inputNum.split(" ");
            
            for(int i=0; i<temp_str.length; i++){
                temp_int[i]=Integer.parseInt(temp_str[i]);
               // System.out.print("삽입");
            }
            
            
            for(int i=0; i<99; i++){
                if(temp_int[i]!=0){
                    //System.out.print("반복");
                    for(int j=1; j<99; j++){
                        if(stack[1]==0){
                            stack[1]=temp_int[0];
                            
                            break;
                        }
                        
                        if(stack[j]!=0){
                            if(temp_int[i] < stack[j]){
                              //  System.out.printf("<%d>",temp_int[i]);
                              //System.out.printf("<%d>",j);
                                j=2*j;
                               // System.out.printf("<%d>",j);
                            }
                            else if(temp_int[i] > stack[j]){
                               // System.out.printf("<%d>",j);
                                j=2*j+1;
                                
                                
                            }
                            
                        }
                        //System.out.printf("<%d>",j);


                        if(stack[j]==0 && stack[j/2] != 0){
                            if(temp_int[i] < stack[j/2]){
                                stack[j]=temp_int[i];
                                
                                break;
                            }
                            else if(temp_int[i] > stack[j/2]){
                                stack[j]=temp_int[i];
                                
                                break;
                                
                            }
                        }
                        j=j-1;
                }
            }


            
               
        }
        System.out.print("(노드번호)값\n");
        for(int j=99; j>0; j--){

            if(stack[j]!=0){
                for(int i=1; i<j+5; i++){

                    System.out.printf("(%d)%d\n",i,stack[i]);

                }
                break;
            }
        }


        }
        }
    }
}