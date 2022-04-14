package com.mycompany.abstractfactoryovos;

public class FabricaGaroto extends FabricaDeOvos {

    @Override
    public OvoDePascoa criarOvo1() {
        return new Crocante();
    }

    @Override
    public OvoDePascoa criarOvo2() {
        return new Talento();
    }

    @Override
    public OvoDePascoa criarOvo3() {
        return new Baton();
    }
}
