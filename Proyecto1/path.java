public String path(Maze m, int x){
        int exit = m.getExitSpace();
        int start = m.getStartSpace();
        int a = x;
        String pos = "";
        int u;
        if (a == exit){
            return "[" + pos + "]";
        } else {
            u = m.moveNorth(a);
            if (u != a){
                a = u;
                pos = (pos + String.valueOf(a) + ", ");
                System.out.println("North = " + a);
                //System.out.println(pos);
                return path(m, a);
            } else{
                u = m.moveWest(a);
                if (u != a){
                    a = u;
                    pos = pos + String.valueOf(a) + ", ";
                    System.out.println("West =" + a);
                    //System.out.println(pos);
                    return path(m, a);
                } else{
                    u = m.moveSouth(a);
                    if (u != a){
                        a = u;
                        pos = pos + String.valueOf(a) + ", ";
                        System.out.println("South =" + a);
                        return path(m, a);
                    } else {
                        u = m.moveEast(a);
                        if (u != a){
                            a = u;
                            pos = pos + String.valueOf(a) + ", ";
                            System.out.println("East =" + a);
                            return path(m, a);
                        }
                    }
                }

            }
        }
        return null;
    }