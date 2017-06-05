import java.lang.reflect.Constructor;

public class ObjectCreationWays {
   String name="f";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
           /* Class cls = Class.forName("ObjectCreationWays");
            ObjectCreationWays obj =
                    (ObjectCreationWays) cls.newInstance();
        System.out.println(obj.name);*/
			
			 Constructor<ObjectCreationWays> constructor
             = ObjectCreationWays.class.getDeclaredConstructor();
			 ObjectCreationWays r = constructor.newInstance();
         r.name="GeeksForGeeks";
         System.out.println(r.name);
        }
       
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
	}


