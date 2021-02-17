/*
    Esta es su clase principal. El unico metodo que debe implementar es
    public String[] solve(Maze maze)
    pero es libre de crear otros metodos y clases en este u otro archivo que desee.
*/


public class Solver{

    public String pos;
    public int pathNumber;

    public Solver(){
        this.pos = "";
        this.pathNumber = 0;
        //Sientase libre de implementar el contructor de la forma que usted lo desee
    }

    public String getSolutionS(){
        return this.pos;
    }

    
    public String getValidMoves(Maze m, int pos){
        return null; 
    }
    


    public String path(Maze m, int x, int anterior){
        int exit = m.getExitSpace();

        int start = m.getStartSpace();

        int a = x;
        String pos = "";
        int u;
        if (a == exit){
            String result = this.pos;
            this.pos = "";
            return "[" + result + "]";
        } else {
            /*if (noescape(m, a) != a){
                return path(m, noescape(m,a), x);
            } else*/ if (m.moveNorth(a) != a && anterior != m.moveNorth(a)){
                a = m.moveNorth(a);
                this.pos = (this.pos + String.valueOf(a) + ", ");
                System.out.println("North = " + a);
                //System.out.println(pos);
                return path(m, a, x);
            } else if (m.moveWest(a) != a && anterior != m.moveWest(a)){
                a = m.moveWest(a);
                this.pos = this.pos + String.valueOf(a) + ", ";
                System.out.println("West =" + a);
                //System.out.println(pos);
                return path(m, a, x);
            } else if (m.moveSouth(a) != a && anterior != m.moveSouth(a)){
                a = m.moveSouth(a);
                this.pos = this.pos + String.valueOf(a) + ", ";
                System.out.println("South =" + a);
                return path(m, a, x);
            } else if (m.moveEast(a) != a && anterior != m.moveEast(a)) {
                    a = m.moveEast(a);
                    this.pos = this.pos + String.valueOf(a) + ", ";
                    System.out.println("East =" + a);
                    return path(m, a, x);
                }
                    
                

            
        }
        return null;

    }

    /*public String path(Maze m, int x){
        int exit = m.getExitSpace();
        int start = m.getStartSpace();
        int a = x;
        int u;
        if (a == exit){
            String result = this.pos;
            this.pos = "";
            return "[" + result + "]";
        } else {
            u = m.moveNorth(a);
            if (u != a){
                a = u;
                this.pos = (this.pos + String.valueOf(a) + ", ");
                System.out.println("North = " + a);
                //System.out.println(pos);
                return path(m, a);
            } else{
                u = m.moveWest(a);
                if (u != a){
                    a = u;
                    this.pos = this.pos + String.valueOf(a) + ", ";
                    System.out.println("West =" + a);
                    //System.out.println(pos);
                    return path(m, a);
                } else{
                    u = m.moveSouth(a);
                    if (u != a){
                        a = u;
                        this.pos = this.pos + String.valueOf(a) + ", ";
                        System.out.println("South =" + a);
                        return path(m, a);
                    } else {
                        u = m.moveEast(a);
                        if (u != a){
                            a = u;
                            this.pos = this.pos + String.valueOf(a) + ", ";
                            System.out.println("East =" + a);
                            return path(m, a);
                        }
                    }
                }

            }
        }
        return null;
    }*/

    public String[] solve(Maze maze) {
        //Implemente su metodo aqui. Sientase libre de implementar métodos adicionales
        int moves = 0;
        int limMoves = maze.getMaxMoves();
        String solu ="";
        if (moves != limMoves){
            solu = path(maze, maze.getStartSpace(), maze.getStartSpace());
            this.pathNumber++;
        }
        String[] str = new String[this.pathNumber];
        str[0] = solu;
       // str[1] = "prueba";
        return str;
    }

    public static void main(String[] args) throws Exception{
        Maze mapa = new Maze(args[0]);
        Solver s = new Solver();
        String[] sol = s.solve(mapa);
        int start = mapa.getStartSpace();
        int exit = mapa.getExitSpace();
        System.out.println("Punto de Inicio: "+ start);
        System.out.println("Punto de Salida: " + exit);
        System.out.println("Movimientos maximos: "+mapa.getMaxMoves());


        String resultado = s.path(mapa, start, start);
        String solutionString = s.getSolutionS();
        for (int i=0; i<sol.length; i++){
            System.out.println(sol[0]);
        }
        //System.out.println(solutionString);

        //System.out.println(String.valueOf(exit));

        //System.out.println(resultado);

        //System.out.println(sol[0]);
        
        
    }

}