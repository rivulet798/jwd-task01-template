package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.dao.ApplianceDirector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		String[] criterion = criteria.getCriterion();
        File file = new File("src\\main\\resources\\appliances_db.txt");
			try {
				BufferedReader in = new BufferedReader(new FileReader(file));
				try {
					String line;
					while ((line = in.readLine()) != null) {
						int flag = 0;
                        for(String i : criterion){
						if(line.contains(i+" :")||line.contains(i+",")||line.contains(i+";") ){
							flag++;}
						else{
							break;}

					}
					if(flag==criterion.length){
							ApplianceDirector director = new ApplianceDirector();
							Command command = director.getCommand(criteria.getApplianceType());
							Appliance appl = command.execute(lineToArray(line));
							return appl;
							}
					}
				} finally {
					in.close();
				}
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		return null;
	}

	private static String[] lineToArray(String line)
	{
        String newline=line.replaceAll(" :|,|;","");
        String []pairs=newline.split("\\s");
        String[] values=new String[pairs.length-1];
        for(int i=0;i<values.length;i++){
            String[] tempPair=pairs[i+1].split("=");
            values[i]=tempPair[1];
        }
        return values;
	}

}

