public class cat {

    // instance variables
    private String name;
    private String color;
    private boolean energetic;

    public cat() {            // default constructor
    name = "Unknown";
    color = "Black";
    energetic = false;
}

public cat(String name, String color, boolean energetic) { // parameterized constructor
    this.name = name;
    this.color = color;
    this.energetic = energetic;
}

public String getName() { 
    return name; 
}
public void setName(String name) { 
    this.name = name; 
}
public String getColor() { 
    return color; 
}
public void setColor(String color) { 
    this.color = color; 
}

public boolean getEnergetic() { 
    return energetic; 
}
public void setEnergetic(boolean energetic) { 
    this.energetic = energetic; 
}
@Override
public String toString() {
    return "cat{name = '" + name + "', age = " + color + ", energetic = '" + energetic + "'}";
}
}

