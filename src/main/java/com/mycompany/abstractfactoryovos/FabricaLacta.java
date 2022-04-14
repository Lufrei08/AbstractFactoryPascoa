package com.mycompany.abstractfactoryovos;

public class FabricaLacta extends FabricaDeOvos {

    @Override
    public OvoDePascoa criarOvo1() {
        return new AoLeite();
    }

    @Override
    public OvoDePascoa criarOvo2() {
        return new Oreo();
    }

    @Override
    public OvoDePascoa criarOvo3() {
        return new SonhoDeValsa();
    }
}
