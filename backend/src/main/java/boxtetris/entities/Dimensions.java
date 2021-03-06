package boxtetris.entities;

/**
 * Abstract class for representing dimensions.
 */
public abstract class Dimensions {

    private Integer length;
    private Integer width;
    private Integer height;

    public Dimensions(Integer length, Integer width, Integer height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * @param length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * @return Integer
     */
    public Integer getLength() {
        return length;
    }

    /**
     * @return Integer
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @return Integer
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @return Integer
     */
    public Integer getArea() {
        return getLength() * getWidth();
    }

    /**
     * @return Integer
     */
    public Long getVolume() {
        return Long.valueOf(getLength().longValue() * getWidth().longValue() * getHeight().longValue());
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        String s = "";
        s += "Length: " + getLength() + "\n";
        s += "Width: " + getWidth() + "\n";
        s += "Height: " + getHeight() + "\n";
        return s;
    }

    /**
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dimensions other = (Dimensions) obj;
        if (height == null) {
            if (other.height != null)
                return false;
        } else if (!height.equals(other.height))
            return false;
        if (length == null) {
            if (other.length != null)
                return false;
        } else if (!length.equals(other.length))
            return false;
        if (width == null) {
            if (other.width != null)
                return false;
        } else if (!width.equals(other.width))
            return false;
        return true;
    }
}
