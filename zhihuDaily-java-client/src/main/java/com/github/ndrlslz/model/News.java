package com.github.ndrlslz.model;

import java.util.List;

/**
 * News
 * <p>
 * Rest API Example: "http://news-at.zhihu.com/api/4/news/4772126"
 * <p>
 * Json Response Example:
 * <p>
 * {
 *      "body":"<div class="main-wrap content-wrap"></div>",
 *      "image_source":"Yestone.com 版权图片库",
 *      "title":"深夜惊奇 · 朋友圈错觉",
 *      "image":"http://pic3.zhimg.com/2d41a1d1ebf37fb699795e78db76b5c2.jpg",
 *      "share_url":"http://daily.zhihu.com/story/4772126",
 *      "js":[
 *      ],
 *      "recommenders":[
 *          {
 *              "avatar":"http://pic2.zhimg.com/fcb7039c1_m.jpg"
 *          },
 *          {
 *              "avatar":"http://pic2.zhimg.com/cc3fca1078fec26d2c04523a2e66cfa9_m.jpg"
 *          }
 *      ],
 *      "ga_prefix":"053022",
 *      "section":{
 *      "thumbnail":"http://pic3.zhimg.com/91125c9aebcab1c84f58ce4f8779551e.jpg",
 *      "id":1,
 *      "name":"深夜惊奇"
 *      },
 *      "images":[
 *      "http://pic4.zhimg.com/6a1ddebda9e8899811c4c169b92c35b3.jpg"
 *      ],
 *      "type":0,
 *      "id":4772126,
 *      "css":[
 *          "http://news-at.zhihu.com/css/news_qa.auto.css?v=4b3e3"
 *      ]
 * }
 */
public class News {
    /**
     * News content
     */
    private String body;

    /**
     * Image source
     */
    private String image_source;

    /**
     * News title
     */
    private String title;

    /**
     * News big image
     */
    private String image;

    /**
     * News share url
     */
    private String share_url;

    /**
     * Used by Google Analytics
     */
    private String ga_prefix;

    /**
     * Section information
     */
    private Section section;

    /**
     * News type
     */
    private int type;

    /**
     * News id
     */
    private int id;

    /**
     * Used by WebView(UIWebView)
     */
    private List<String> js;

    /**
     * Recommenders
     */
    private List<Recommender> recommenders;

    /**
     * News small images
     */
    private List<String> images;

    /**
     * Used by WebView(UIWebView)
     */
    private List<String> css;

    /**
     * Get body
     *
     * @return body
     */
    public String getBody() {
        return body;
    }

    /**
     * Set body
     *
     * @param body body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Get image_source
     *
     * @return iamge_source
     */
    public String getImage_source() {
        return image_source;
    }

    /**
     * Set image_source
     *
     * @param image_source image_source
     */
    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    /**
     * Get title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     *
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get image
     *
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * Set image
     *
     * @param image image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Get share_url
     *
     * @return share_url
     */
    public String getShare_url() {
        return share_url;
    }

    /**
     * Set share_url
     *
     * @param share_url share_url
     */
    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    /**
     * Get ga_prefix
     *
     * @return ga_prefix
     */
    public String getGa_prefix() {
        return ga_prefix;
    }

    /**
     * Set ga_prefix
     *
     * @param ga_prefix ga_prefix
     */
    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    /**
     * Get section
     *
     * @return section
     */
    public Section getSection() {
        return section;
    }

    /**
     * Set section
     *
     * @param section section
     */
    public void setSection(Section section) {
        this.section = section;
    }

    /**
     * Get type
     *
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * Set type
     *
     * @param type type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Get id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get js
     *
     * @return js
     */
    public List<?> getJs() {
        return js;
    }

    /**
     * Set js
     *
     * @param js js
     */
    public void setJs(List<String> js) {
        this.js = js;
    }

    /**
     * Get recommenders
     *
     * @return recommenders
     */
    public List<Recommender> getRecommenders() {
        return recommenders;
    }

    /**
     * Set recommenders
     *
     * @param recommenders recommenders
     */
    public void setRecommenders(List<Recommender> recommenders) {
        this.recommenders = recommenders;
    }

    /**
     * Get images
     *
     * @return images
     */
    public List<String> getImages() {
        return images;
    }

    /**
     * Set images
     *
     * @param images images
     */
    public void setImages(List<String> images) {
        this.images = images;
    }

    /**
     * Get css
     *
     * @return css
     */
    public List<String> getCss() {
        return css;
    }

    /**
     * Set css
     *
     * @param css css
     */
    public void setCss(List<String> css) {
        this.css = css;
    }

    public static class Section {
        /**
         * Section thumbnail
         */
        private String thumbnail;

        /**
         * Section id
         */
        private int id;

        /**
         * Section name
         */
        private String name;

        /**
         * Get thumbnail
         *
         * @return thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         * Set thumbnail
         *
         * @param thumbnail thumbnail
         */
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         * Get id
         *
         * @return id
         */
        public int getId() {
            return id;
        }

        /**
         * Set id
         *
         * @param id id
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * Get name
         *
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * Set name
         *
         * @param name name
         */
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Section{" +
                    "thumbnail='" + thumbnail + '\'' +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static class Recommender {
        /**
         * Avatar
         */
        private String avatar;

        /**
         * Get avatar
         *
         * @return avatar
         */
        public String getAvatar() {
            return avatar;
        }

        /**
         * Set avatar
         *
         * @param avatar avatar
         */
        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        @Override
        public String toString() {
            return "Recommender{" +
                    "avatar='" + avatar + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "News{" +
                "body='" + body + '\'' +
                ", image_source='" + image_source + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", share_url='" + share_url + '\'' +
                ", ga_prefix='" + ga_prefix + '\'' +
                ", section=" + section +
                ", type=" + type +
                ", id=" + id +
                ", js=" + js +
                ", recommenders=" + recommenders +
                ", images=" + images +
                ", css=" + css +
                '}';
    }
}
