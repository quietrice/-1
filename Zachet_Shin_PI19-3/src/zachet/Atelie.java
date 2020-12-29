package zachet;

public class Atelie {
    public void dressMen(Clothes[] clothes){
        System.out.println("Мужская одежда:");
        for (Clothes clothe: clothes) {
            if (clothe instanceof menClothes){
                System.out.println(clothe);
            }
        }
    }

    public void dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда:");
        for (Clothes clothe: clothes) {
            if (clothe instanceof womenClothes){
                System.out.println(clothe);
            }
        }
    }
}
