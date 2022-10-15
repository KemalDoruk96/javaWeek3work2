public class ProductValidator {

    static {
        System.out.println("Statik Yapıcı Blok Çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }
    public static boolean isValid(Product product){ // tek amaçlı kullanmak için statik kullandık
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }


}
