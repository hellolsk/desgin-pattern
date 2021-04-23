package com.lsk.cipher.creationalPatterns.builderPattern;

/**
 * @Author:六月的雨
 * @Date:2021/2/9 16:59
 * @PackageName:21hj com.lsk.cipher.creationalPatterns.builderPattern
 * @Description:
 */
public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
    static class Builder{
        private Course course = new Course();
        public Course builder(){
            return course;
        }
        public Builder addName(String name){
            course.setName(name);
            return this;
        }
        public Builder addPpt(String ppt){
            course.setPpt(ppt);
            return this;
        }
        public Builder addNote(String note){
            course.setNote(note);
            return this;
        }
        public Builder addVideo(String video){
            course.setVideo(video);
            return this;
        }
    }
}
