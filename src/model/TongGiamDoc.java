package model;

public class TongGiamDoc {
    private String name;
    private String id;
    private static TongGiamDoc instance;
    public static TongGiamDoc getInstance(String name, String id){
        if (instance == null){
            synchronized (TongGiamDoc.class){
                if (instance==null){
                    instance = new TongGiamDoc(name, id);
                }
            }
        }
            return instance;

    }

    @Override
    public String toString() {
        return "TongGiamDoc{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    private TongGiamDoc(java.lang.String name, java.lang.String id) {
        this.name = name;
        this.id = id;
    }

    private TongGiamDoc() {
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }
}
