package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "semanas")
public class SemanasEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "week_num")
	private String week_num;
	@Column(name = "week_start_date")
	private String week_start_date;
	@Column(name = "week_end_date")
	private String week_end_date;
	@Column(name = "working_hours")
	private String working_hours;
	@Column(name = "year")
	private String year;
	
	public SemanasEntity() {}

	public SemanasEntity(Long id, String week_num, String week_start_date, String week_end_date, String working_hours,
			String year) {
		super();
		this.id = id;
		this.week_num = week_num;
		this.week_start_date = week_start_date;
		this.week_end_date = week_end_date;
		this.working_hours = working_hours;
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWeek_num() {
		return week_num;
	}

	public void setWeek_num(String week_num) {
		this.week_num = week_num;
	}

	public String getWeek_start_date() {
		return week_start_date;
	}

	public void setWeek_start_date(String week_start_date) {
		this.week_start_date = week_start_date;
	}

	public String getWeek_end_date() {
		return week_end_date;
	}

	public void setWeek_end_date(String week_end_date) {
		this.week_end_date = week_end_date;
	}

	public String getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(String working_hours) {
		this.working_hours = working_hours;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "SemanasEntity [id=" + id + ", week_num=" + week_num + ", week_start_date=" + week_start_date
				+ ", week_end_date=" + week_end_date + ", working_hours=" + working_hours + ", year=" + year + "]";
	}
	


}
