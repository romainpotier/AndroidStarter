package fr.romainpotier.androidstarterapi.beans;

public class Movie {

    private String title;

    private int year;

    private String nationality;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Movie other = (Movie) obj;
        if (nationality == null) {
            if (other.nationality != null) {
                return false;
            }
        } else if (!nationality.equals(other.nationality)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        if (year != other.year) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", year=" + year + ", nationality=" + nationality + "]";
    }

}
