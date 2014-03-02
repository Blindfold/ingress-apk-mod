package com.nianticproject.ingress.common.model;

import com.nianticproject.ingress.common.PlayerLocation;
import com.nianticproject.ingress.shared.Faction;

public class PlayerModelImpl implements PlayerModel {

    public PlayerLocation getPlayerLocation()
    {
        return null;
    }

    public void addListener(PlayerListener listener)
    {}

    public void removeListener(PlayerListener listener)
    {}

    public String getName()
    {
        return "BrootDeveloper";
    }
    public String getGuid()
    {
        return "89F61200-D045-4D97-A342-3B1DEF77E2C2";
    }

    public long getCurrentXM()
    {
        return 4000;
    }
    public long getCurrentAP()
    {
        return 500;
    }

    public Faction getFaction()
    {
        return Faction.ALIENS;
    }
}
