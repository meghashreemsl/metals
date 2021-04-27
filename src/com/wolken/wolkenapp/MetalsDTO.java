package com.wolken.wolkenapp;

public class MetalsDTO {
	private Integer metalId;
	private String metalName;
	private String property;
	
	public MetalsDTO() {
		//auto generated constructor
		System.out.println(this.getClass());
	}
	public Integer getMetalId() {
		return metalId;
	}
	public void setMetalId(Integer metalId) {
		this.metalId =  metalId;
	}
	public String getMetalName() {
		return metalName;
	}
	public void setMetalName(String metalName) {
		this.metalName = metalName;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property =  property;
	}
	@Override
	public String toString() {
		return " MetalsDTO - MetalId="+metalId+" | MetalName=" +metalName+" | Property=" +property+"";
	}
		public Integer hashcode() {
    	 return metalId;
     }
		public boolean equals(Object obj) {
			//down casting
			MetalsDTO dto = (MetalsDTO)obj;
			if(obj == null) {
				return false;
			}
			else {
				if(obj instanceof MetalsDTO) {
					if(this.hashcode() == dto.hashcode()) {
						return true;
					}
					if(this.metalId == (dto.metalId)) {
						return true;
					}
				}
			}
		
		return false;
		}
}
