import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {    
    String myName = "";
    public String whatsYourName() {
        return myName;
    }
}

class Jasmine extends Flower {
    public Jasmine() {
        myName = "Jasmine";
    }
}

class Lily extends Flower {
    public Lily() {
        myName = "Lily";
    }
}

class Region {
    Flower nationalFlower = null;
    public Flower yourNationalFlower() {
        return nationalFlower;
    }
}

class WestBengal extends Region {
    public WestBengal() {
        nationalFlower = new Jasmine();
    }
}

class AndhraPradesh extends Region {
    public AndhraPradesh() {
        nationalFlower = new Lily();
    }
}

public class covariance {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}