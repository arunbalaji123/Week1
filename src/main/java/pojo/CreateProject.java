package pojo;

public class CreateProject {
	public CreateProject(String createdBy, String projectName, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.ProjectName = projectName;
		this.status = status;
		TeamSize = teamSize;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return TeamSize;
	}
	public void setTeamSize(int teamSize) {
		TeamSize = teamSize;
	}
	private String createdBy;
	private String ProjectName;
	private String status;
	private int TeamSize;
		 

}
