public class Domino {
    private int left;
    private int right;

    public Domino(int i, int j){
        this.left = i;
        this.right = j;
    }

    public Domino(){
        this.left = 0;
        this.right = 0;
    }

    public int getLeft(){
        return left;
    }

    public int getRight(){
        return right;
    }

    public boolean isDomino(){
        if ((left >= 0 || left <= 6)&&(right >= 0 || right <= 6)) 
            return true;
        return false;
    }

    public boolean isDouble(){
        if(left == right)
            return true;
        return false;
    }

    public int totalPoint(){
        return left+right;
    }

    public void rotate(){
        int temp;
        temp = left;
        left = right;
        right = temp;
    }

    public String toString(){
        return "|"+left+" ; "+right+"|";
    }

    public int compareTo(Domino d){
        rotate();
        d.rotate();
        if (left == d.left) {
            return -2;
        }else {
            if(right == d.left)
                return -1;
            return 0;
        }
    }
}
