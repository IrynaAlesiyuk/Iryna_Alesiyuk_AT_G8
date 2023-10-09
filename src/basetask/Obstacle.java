package basetask;

public class Obstacle {
    private String description;
    private String severity;

    public Obstacle(String severity,String description) {
        this.description = description;
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.println(String.format("Возникло %s препятствиие %s", this.severity, this.description));
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
