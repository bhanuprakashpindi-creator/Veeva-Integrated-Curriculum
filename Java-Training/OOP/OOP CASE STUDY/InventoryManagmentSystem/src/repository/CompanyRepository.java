package repository;

import model.Company;

import java.util.HashMap;
import java.util.Map;

public class CompanyRepository {
    public Map<Integer, Company> companyList= new HashMap<>();


    public boolean addCompany(int companyId, Company company) {
        if (companyList.containsKey(companyId))
        {
            System.out.println("Company_id Already Exists");
            return false;
        }
        companyList.put(companyId,company);
        return true;
    }

    public void updateCompany(int companyId,Company company) {
        if(companyList.containsKey(companyId))
        {
            companyList.put(companyId,company);
            System.out.println("Company Details Updated Successfully..");
        }
        else
        {
            System.out.println("Error : No Company Found With Company Id -"+companyId);
        }
    }
}
