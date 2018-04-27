package com.dylbur.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Test {
	@Id
	@Column(name = "test_id")
	@SequenceGenerator(name = "test_id_seq", sequenceName = "test_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "test_id_seq", strategy = GenerationType.AUTO)
	private int testId;

	private String field;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(int testId, String field) {
		super();
		this.testId = testId;
		this.field = field;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		result = prime * result + testId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		if (testId != other.testId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", field=" + field + "]";
	}

}
