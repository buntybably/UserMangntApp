package com.bikkadIT.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STATE_MASTER")
public class State {
	@Id
	private int StateId;
	private String StateName;
	@Override
	public String toString() {
		return "State [StateId=" + StateId + ", StateName=" + StateName + "]";
	}
	public int getStateId() {
		return StateId;
	}
	public void setStateId(int stateId) {
		StateId = stateId;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	

}
