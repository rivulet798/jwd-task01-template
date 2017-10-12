package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private String applianceType;
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public void setApplianceType(String applianceType){
		this.applianceType=applianceType;
	}

	public String getApplianceType(){
		return applianceType;
	}

	public Map<E,Object> getMap(){
		return criteria;
	}

	public String[] getCriterion() {
		String[] criterion = new String[criteria.size()+1];
		criterion[0]=applianceType;
		int i = 1;
		for (Map.Entry<E,Object> map : criteria.entrySet()) {
			criterion[i] = map.getKey().toString() + "=" + map.getValue().toString();
			i++;
		}
		return criterion;
	}

}
