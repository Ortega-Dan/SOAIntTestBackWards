package test.view;

import test.lib.JSFUtil;

public class ContextEventHandler {
    public ContextEventHandler() {
        super();
    }

    public static void procesarEvento(Object carga) {
        
        MainUI ventDest = (MainUI) JSFUtil.resolveExpression("#{pageFlowScope.Main}");
        
        ventDest.recibirEvento(carga);
        
    }
    
}
