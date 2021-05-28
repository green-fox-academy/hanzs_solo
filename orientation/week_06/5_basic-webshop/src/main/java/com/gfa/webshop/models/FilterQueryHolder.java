package com.gfa.webshop.models;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

public class FilterQueryHolder {
  String search;
  Boolean inDescription;
  String shortBy;
  Boolean isDescending;
  Boolean availableOnly;

  public FilterQueryHolder(String search, Boolean inDescription, String shortBy,
      Boolean isDescending, Boolean availableOnly){
    this.search = search;
    this.inDescription = inDescription;
    this.shortBy = shortBy;
    this.isDescending = isDescending;
    this.availableOnly = availableOnly;
  }

  @Override
  public String toString() {
    return "search='" + search
        + ", inDescription=" + inDescription
        + ", shortBy='" + shortBy
        + ", isDescending=" + isDescending
        + ", availableOnly=" + availableOnly;
  }

  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public Boolean getInDescription() {
    return inDescription;
  }

  public void setInDescription(Boolean inDescription) {
    this.inDescription = inDescription;
  }

  public String getShortBy() {
    return shortBy;
  }

  public void setShortBy(String shortBy) {
    this.shortBy = shortBy;
  }

  public Boolean getIsDescending() {
    return isDescending;
  }

  public void setIsDescending(Boolean descending) {
    isDescending = descending;
  }

  public Boolean getAvailableOnly() {
    return availableOnly;
  }

  public void setAvailableOnly(Boolean availableOnly) {
    this.availableOnly = availableOnly;
  }
}
