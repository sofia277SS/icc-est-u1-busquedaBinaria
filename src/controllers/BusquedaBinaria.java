package controllers;

import models.Product;

public class BusquedaBinaria {

    public int findProductIndexByStock(Product[] products, int clave){
        //ORDENAR
        sortProductsByStock(products);

        int bajo = 0;
        int alto = products.length -1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            if (products[centro].getStock() == clave) {
                return centro;
            }
            // Defino si voy a la izquierda o a la derecha
            if (products[centro].getStock()>clave) {
                alto = centro - 1;
            } else {
                bajo = centro + 1;
            }
        }
        return -1;
    }

    private void sortProductsByStock(Product[] products){
        for(int i = 0; i<products.length-1; i++){
            //boolean swap = false;
            for(int j = 0; j<products.length - i - 1; j++){
                if (products[j].getStock()> products[j + 1].getStock()) {
                    Product aux = products[j];
                    products[j]= products[j + 1];
                    products[j + 1] = aux;
                    //swap = true;
                }
            }
        }
    }

    public Product findProductsByStock(Product[] products, int clave){
        
        return null;
    }

    
}