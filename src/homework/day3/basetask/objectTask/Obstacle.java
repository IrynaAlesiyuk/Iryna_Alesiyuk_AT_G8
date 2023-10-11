package homework.day3.basetask.objectTask;

public class Obstacle {
    private String description;
    private String severity;

    public Obstacle(String severity, String description) {
        this.description = description;
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.printf("Возникло %s препятствиие %s", this.severity, this.description);
        System.out.println();
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
