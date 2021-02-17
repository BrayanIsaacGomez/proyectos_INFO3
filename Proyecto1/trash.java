public int noescape(Maze m, int b){ 
    int n = m.moveNorth(b);
    int s = m.moveSouth(b);
    int w = m.moveWest(b);
    int e = m.moveEast(b);   
    if((n+s+w)/3==b){
        return e;
    } else if((n+s+e)/3==b){
        return w;
    } else if((s+w+e)/3==b){
        return n;
    } else if((w+e+n)/3==b){
        return s;
    } else{
        return b;
    }
}

public boolean validN(Maze m, int pos){
    if (pos != m.moveNorth(pos)){
        return true;
    } 
    return false;
}

public boolean validW(Maze m, int pos){
    if (pos != m.moveWest(pos)){
        return true;
    } 
    return false;
}

public boolean validS(Maze m, int pos){
    if (pos != m.moveSouth(pos)){
        return true;
    } 
    return false;
}

public boolean validE(Maze m, int pos){
    if (pos != m.moveEast(pos)){
        return true;
    } 
    return false;
}

/*public boolean noescape(Maze m, int pos_sig){
        int n = m.moveNorth(pos_sig);
        int s = m.moveSouth(pos_sig);
        int e = m.moveEast(pos_sig);
        int o = m.moveWest(pos_sig);
        
        return (s == e == o) || (n == e == o) || (n == s == o) || (n == s == e) ;  
    }*/
