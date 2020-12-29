
package zachet;



public class Size {
    private final String euroSize;

    public Size(String euroSize){
        this.euroSize = euroSize;
    }


    public static void main(String[] args) {
        String sizeClothes;
        public void Size(String sizeClothes){
            this.sizeClothes = sizeClothes;
        }
    }
}
interface menClothes{
    public static void dressMen(){

    };
};
interface womenClothes{
    public static void dressWomen(){

    }
};

abstract class Clothes{
    private String clothesSize;
    private String price;
    private String colour;
};

class Tshirt implements womenClothes, menClothes{
        };

class Shirt implements womenClothes, menClothes{
};

class Skirt implements womenClothes, menClothes{
};

class Tie implements womenClothes, menClothes{
};

enum Type
{
    getDescription,
    XXS,
    XS,
    S,
    M,
    L
}