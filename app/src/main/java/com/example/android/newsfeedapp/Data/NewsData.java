package com.example.android.newsfeedapp.Data;

import java.util.List;

public class NewsData {
    private String titleOfStory; //Stores the name of the place's string ID
    private String imageOfStoryResource; // Stores the side attraction's image ID
    private String urlOfStory;
    private String dateTimeOfStory;
    private String sectionOfStory;
    private List<String> reporterName;
    private String bodyOfStory;

    /**
     * Creates a constructor of the Tour Places Data Class
     * @param inputTitleOfStory is the string ID of the name of the side attraction
     * @param inputImageOfStoryResourceID is the ID of the side attraction's image
     */
    public NewsData(String inputTitleOfStory, String inputImageOfStoryResourceID, String InputUrlOfStory, String InputDateTimeOfStory, String InputSectionOfStory, List<String> InputReporterName, String InputBodyOfStory){
        titleOfStory = inputTitleOfStory;
        imageOfStoryResource = inputImageOfStoryResourceID;
        urlOfStory = InputUrlOfStory;
        dateTimeOfStory = InputDateTimeOfStory;
        sectionOfStory = InputSectionOfStory;
        reporterName = InputReporterName;
        bodyOfStory = InputBodyOfStory;
    }

    /**
     * Gets the tile of the news story
     * @return the title of the news story
     */
    public String getTitleOfStory() {
        return titleOfStory;
    }

    /**
     * Gets the image resource ID of the place
     * @return the image resource ID of the place
     */
    public String getImageOfStoryResource() {
        return imageOfStoryResource;
    }

    /**
     * Gets the name of the news story
     * @return the url of the news story
     */
    public String getUrlOfStory() {
        return urlOfStory;
    }

    /**
     * Gets the unix time of the news story
     * @return the unix time of the news story
     */
    public String getDateTimeOfStory() {
        return dateTimeOfStory;
    }

    /**
     * Gets the section of the news story
     * @return the section of the news story
     */
    public String getSectionOfStory() {
        return sectionOfStory;
    }

    /**
     * Gets the reporter's name
     * @return the reporter's name
     */
    public List<String> getReporterName() {
        return reporterName;
    }

    /**
     * Gets the body of the news story
     * @return the body of the news story
     */
    public String getBodyOfStory() {
        return bodyOfStory;
    }

}
