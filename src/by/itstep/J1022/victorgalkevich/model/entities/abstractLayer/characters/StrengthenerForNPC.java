package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters;

public class StrengthenerForNPC extends NonPlayerCharacter{
    protected NonPlayerCharacter npc;
    protected StrengthenerForNPC(){}
    @Override
    public String attack() {
        return npc.attack();
    }
}
