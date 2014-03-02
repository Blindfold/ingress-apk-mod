package com.nianticproject.ingress.common;

import com.nianticproject.ingress.common.model.PlayerModel;
import com.nianticproject.ingress.common.model.PlayerModelImpl;
import com.nianticproject.ingress.common.ui.SubActivityManager;

public class ComponentManager {

    public static PlayerModel getPlayerModel() {
        return new PlayerModelImpl();
    }
    
    public static SubActivityManager getSubActivityManager() {
        return null;
    }
}
