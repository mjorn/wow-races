package net.mjorn.warcraftracechooser;

public class Article {
    private String title;
    private boolean hasImage;
    private String imageURL;
    private String text;

    public Article(String title, boolean hasImage, String imageURL, String text) {
        this.title = title;
        this.hasImage = hasImage;
        this.imageURL = imageURL;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getText() {
        return text;
    }

    public boolean hasImage() {
        return hasImage;
    }

}
