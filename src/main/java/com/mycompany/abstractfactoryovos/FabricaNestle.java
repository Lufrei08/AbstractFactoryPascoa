package com.mycompany.abstractfactoryovos;

public class FabricaNestle extends FabricaDeOvos {

    @Override
    public OvoDePascoa criarOvo1() {
        return new Alpino();
    }
    
    @Override
    public OvoDePascoa criarOvo2() {
        return new Classic();
    }
    
    @Override
    public OvoDePascoa criarOvo3() {
        return new KitKat();
    }

}
