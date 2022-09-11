class Tile{
    int edge;
    Tile(int e){
        edge = e;
    }
}
class Floor{
    int length,width;
    Floor(int i,int w){
        length = i;
        width = w;
    }
    void totalTiles(Tile t) {
        System.out.println("Total no. of tile to cover the floor "+ (length*width) / (t.edge*t.edge));
    }
}
public class TileNo{
    public static void main(String[] args) {
        Tile t1 = new Tile(4);
        Floor f1 = new Floor(8, 12);
        f1.totalTiles(t1);
    }
}