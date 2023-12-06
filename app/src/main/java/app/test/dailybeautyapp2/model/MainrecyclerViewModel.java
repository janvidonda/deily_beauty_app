package app.test.dailybeautyapp2.model;

public class MainrecyclerViewModel {
    public MainrecyclerViewModel(String rv_text_main, int rv_img_main) {
        this.rv_text_main = rv_text_main;
        this.rv_img_main = rv_img_main;
    }

    String rv_text_main;
    int rv_img_main;

    public String getRv_text_main() {
        return rv_text_main;
    }

    public void setRv_text_main(String rv_text_main) {
        this.rv_text_main = rv_text_main;
    }

    public int getRv_img_main() {
        return rv_img_main;
    }

    public void setRv_img_main(int rv_img_main) {
        this.rv_img_main = rv_img_main;
    }
}
