
public class Individual extends User{
    private String post;

    public Individual(){
        super();
        post = "unemployed";
    }
    public Individual(String name, String address, String phoneNumber){
        super(name, address, phoneNumber);
        post = "unemployed";
    }

    public Individual(String name, String address, String phoneNumber, String post){
        super(name, address, phoneNumber);
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return super.toString() + post;
    }
}
