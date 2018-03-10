package net.mjorn.warcraftracechooser.races;

public class Racial {

    private String name;
    private int icon;
    private Type type;
    private String desc;

    public Racial(String name, int icon, Type type, String desc) {
        this.name = name;
        this.icon = icon;
        this.type = type;
        this.desc = desc;
    }

    public String getName() {return name;}
    public int getIcon() {return icon;}
    public Type getType() {return type;}
    public String getDesc() {return desc;}

}
