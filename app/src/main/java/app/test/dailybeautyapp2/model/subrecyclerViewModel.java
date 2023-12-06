package app.test.dailybeautyapp2.model;


public class subrecyclerViewModel {
    int sub_image;
    String main_title;
    String sub_title;
    String des_title;
    String title;

    public subrecyclerViewModel(int sub_image, String main_title, String sub_title,String des_title,String title) {
        this.sub_image = sub_image;
        this.main_title = main_title;
        this.sub_title = sub_title;
        this.des_title=des_title;
        this.title=title;
    }

    public int getSub_image() {
        return sub_image;
    }

    public void setSub_image(int sub_image) {
        this.sub_image = sub_image;
    }

    public String getMain_title() {
        return main_title;
    }

    public void setMain_title(String main_title) {
        this.main_title = main_title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getDes_title() {
        return des_title;
    }

    public void setDes_title(String des_title) {
        this.des_title = des_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
