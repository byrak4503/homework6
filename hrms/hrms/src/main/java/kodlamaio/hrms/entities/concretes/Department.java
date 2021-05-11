package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="position")


public class Department {
	@Id
	@GeneratedValue
	@Column(name="position_id")
	private int id;
	
	@Column(name="position_name")
	private String departmentName;
	
	@Column(name="position_detail")
	private String departmentDetail;
	
	public Department() {}

	public Department(int id, String departmentName, String departmentDetail) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentDetail = departmentDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDetail() {
		return departmentDetail;
	}

	public void setDepartmentDetail(String departmentDetail) {
		this.departmentDetail = departmentDetail;
	}

	
	
	

}
