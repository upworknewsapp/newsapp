package android.ali.com.newsapp.consts;

/**
 * Created by Paul on 3/2/17.
 */

public class Urls {

    public static enum RequestType {
        TRANSLATE,
        TRANSLATE_OCR,
        LANGS
    }

    //News Constants
    public static final String NEWS_API_KEY = "b77f4061fdde40508a764f163efadac3";

    public static final String SOURCE_CNN = "cnn";
    public static final String CNN_NEWS = "https://newsapi.org/v1/articles?source=" + SOURCE_CNN + "&sortBy=top&apiKey=" + NEWS_API_KEY;


}
