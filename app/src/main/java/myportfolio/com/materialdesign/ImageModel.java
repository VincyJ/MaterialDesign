package myportfolio.com.materialdesign;

/**
 * Created by arputha_v on 3/13/2018.
 */

public class ImageModel {
    private String imageUrl;
    private String imageTitle;
    private String imageDescription;

    public ImageModel(String imageUrl, String imageTitle, String imageDescription) {
        this.imageUrl = imageUrl;
        this.imageTitle = imageTitle;
        this.imageDescription = imageDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }
}
