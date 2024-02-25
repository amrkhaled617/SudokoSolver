
public class sudoko {
    block[][] x;
    public sudoko(block[][] x){
        this.x=x;
    }
    public static void fill(block[][] x){
        int i=0;
        int j=0;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                block p = x[i][j];
                if (p.a==0){
                    int y=0;
                    int z=0;
                    for(y=0;y<9;y++){
                        if(x[y][j].a!=0){
                            int a=x[y][j].a;
                            p.b[a]=1;
                        }
                    }
                    for(z=0;z<9;z++){
                        if(x[i][z].a!=0){
                            int a=x[i][z].a;
                            p.b[a]=1;
                        }
                    }
                    checksquare(x,p,i,j);
                }
            }
        }
        check(x);
    }
    public static void checksquare(block[][] x,block p,int i,int j){
             if((i==0 & j==0) || (i==0 & j==3) || (i==0 & j==6) || (i==3 & j==0) || (i==3 & j==3) || (i==3 & j==6) || (i==6 & j==0) || (i==6 & j==3) || (i==6 & j==6)){
                int y=i;
                int z=j;
                int ycap=y+3;
                int zcap=z+3;
                for(y=i;y<ycap;y++){
                    for(z=j;z<zcap;z++){
                        if(x[y][z].a!=0){
                            int a=x[y][z].a;
                            p.b[a]=1;
                        }
                    }
                }
        }    
        else if((i==0 & j==1) || (i==0 & j==4) || (i==0 & j==7) || (i==3 & j==1) || (i==3 & j==4) || (i==3 & j==7) || (i==6 & j==1) || (i==6 & j==4) || (i==6 & j==7)){
            int y=i;
            int z=j-1;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i;y<ycap;y++){
                for(z=j-1;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }
        else if((i==0 & j==2) || (i==0 & j==5) || (i==0 & j==8) || (i==3 & j==2) || (i==3 & j==5) || (i==3 & j==8) || (i==6 & j==2) || (i==6 & j==5) || (i==6 & j==8)){
            int y=i;
            int z=j-2;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i;y<ycap;y++){
                for(z=j-2;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }
        else if((i==1 & j==0) || (i==1 & j==3) || (i==1 & j==6) || (i==4 & j==0) || (i==4 & j==3) || (i==4 & j==6) || (i==7 & j==0) || (i==7 & j==3) || (i==7 & j==6)){
            int y=i-1;
            int z=j;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i-1;y<ycap;y++){
                for(z=j;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }
        else if((i==1 & j==1) || (i==1 & j==4) || (i==1 & j==7) || (i==4 & j==1) || (i==4 & j==4) || (i==4 & j==7) || (i==7 & j==1) || (i==7 & j==4) || (i==7 & j==7)){
            int y=i-1;
            int z=j-1;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i-1;y<ycap;y++){
                for(z=j-1;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }
        else if((i==1 & j==2) || (i==1 & j==5) || (i==1 & j==8) || (i==4 & j==2) || (i==4 & j==5) || (i==4 & j==8) || (i==7 & j==2) || (i==7 & j==5) || (i==7 & j==8)){
            int y=i-1;
            int z=j-2;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i-1;y<ycap;y++){
                for(z=j-2;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }
        else if((i==2 & j==0) || (i==2 & j==3) || (i==2 & j==6) || (i==5 & j==0) || (i==5 & j==3) || (i==5 & j==6) || (i==8 & j==0) || (i==8 & j==3) || (i==8 & j==6)){
            int y=i-2;
            int z=j;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i-2;y<ycap;y++){
                for(z=j;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }
        else if((i==2 & j==1) || (i==2 & j==4) || (i==2 & j==7) || (i==5 & j==1) || (i==5 & j==4) || (i==5 & j==7) || (i==8 & j==1) || (i==8 & j==4) || (i==8 & j==7)){
            int y=i-2;
            int z=j-1;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i-2;y<ycap;y++){
                for(z=j-1;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }
        else if((i==2 & j==2) || (i==2 & j==5) || (i==2 & j==8) || (i==5 & j==2) || (i==5 & j==5) || (i==5 & j==8) || (i==8 & j==2) || (i==8 & j==5) || (i==8 & j==8)){
            int y=i-2;
            int z=j-2;
            int ycap=y+3;
            int zcap=z+3;
            for(y=i-2;y<ycap;y++){
                for(z=j-2;z<zcap;z++){
                    if(x[y][z].a!=0){
                        int a=x[y][z].a;
                        p.b[a]=1;
                    }
                }
            }
        }

        
    }
    public static void check(block[][] x){
        int i=0;
        int j=0;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                block p=x[i][j];
                int[] arr=p.b;
                int y=1;
                int k=0;
                for(y=1;y<10;y++){
                    if(arr[y]==0){
                        k++;
                    }
                }
                if(k==1){
                    for(y=1;y<10;y++){
                        if(arr[y]==0){
                            p.a=y;
                        }
                    }
                }
            }
        }
        checkfull(x);
    }
    public static block[][] checkfull(block[][] x){
        int i=0;
        int j=0;
        int k=0;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(x[i][j].a!=0){
                    k++;
                }
            }
        }
        if(k!=81){
            fill(x);
        }

        return x;
    }
    public static void main(String[] args) {
        block[][] x=
        {{new block(8),new block(0),new block(5),new block(4),new block(0),new block(0),new block(0),new block(0),new block(0)},
         {new block(0),new block(0),new block(2),new block(0),new block(0),new block(0),new block(0),new block(4),new block(5)},
         {new block(0),new block(0),new block(0),new block(0),new block(6),new block(0),new block(2),new block(9),new block(0)},
         {new block(9),new block(4),new block(6),new block(0),new block(0),new block(0),new block(0),new block(1),new block(0)},
         {new block(0),new block(7),new block(0),new block(0),new block(9),new block(0),new block(0),new block(0),new block(0)},
         {new block(0),new block(2),new block(0),new block(7),new block(0),new block(5),new block(0),new block(3),new block(0)},
         {new block(0),new block(5),new block(0),new block(0),new block(0),new block(4),new block(7),new block(0),new block(2)},
         {new block(0),new block(8),new block(0),new block(0),new block(1),new block(0),new block(4),new block(0),new block(0)},
         {new block(4),new block(6),new block(0),new block(0),new block(5),new block(0),new block(3),new block(0),new block(0)}};
        x=checkfull(x);
        System.out.println();
        System.out.print("------------------------------");
        for(int i=0;i<9;i++){
            if(i==3 || i==6 ){
                System.out.println();
                System.out.print("------------------------------");
            }
            System.out.println();
            System.out.print("|");
            for(int j=0;j<9;j++){
                if(j==3 || j==6 ){
                    System.out.print("| ");
                    System.out.print(x[i][j].a + "  ");
                }
                else if (j==8){
                    System.out.print(x[i][j].a);
                    System.out.print("| ");
                                        
                }
                else{
                System.out.print(x[i][j].a + "  ");
                }
            }

        }
        System.out.println();
        System.out.print("------------------------------");
    }
}
