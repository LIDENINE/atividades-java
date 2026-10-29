public class Livro{
    private String title;
    private int pages;

    public Livro(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public  void setPages(int pages){
        this.pages = pages;
    }

    public int getPages(){
        return this.pages;
    }
}
