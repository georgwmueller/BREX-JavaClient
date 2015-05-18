package io.brex.RestAPI.Client;

import javax.ws.rs.core.Form;

import io.brex.RestAPI.Client.Model.Announcement;
import io.brex.RestAPI.Client.Model.Company;
import io.brex.RestAPI.Client.Tools.AnnouncementSearchNLimit;
import io.brex.RestAPI.Client.Tools.BrexConfig;
import io.brex.RestAPI.Client.Tools.GeneralSearchQO;
import io.brex.RestAPI.Client.Tools.ResultSet;

public class CompanyService extends BrexService implements ICompanyService {	

	public CompanyService(BrexConfig config)  { super(config); }

	public CompanyService() { super(); }
	
    public Company companyIdSearch(String cid, ResultSet quant)
    {
        return companyIdSearch(cid, quant.toString());//getCompany("company/%s/%s", cid, quant.toString());
    }
    
	public Company companyIdSearch(String cid, String quant) 
	{
		return getCompany("company/%s/%s", cid, quant);
	}
    
    public Company[] companyNameSearch(String country, String name)
    {
        return getCompanies( "company/search/name/%s/%s", country, name);
    }
    
    //      company/search/number/{country}/{regnum}
    public Company[] companyRegnumSearch(String country, String regnum)
    {
        return getCompanies("company/search/number/%s/%s", country, regnum);
    }
    
    public Company[] companyGeneralSearch(String country, GeneralSearchQO qo)
    {
        return getCompanies( qo.keyVs(), "company/search/%s", country);	//??
    }
    
	public Announcement[] companyAnnouncementSearch(String cid) {
		return getAnnouncements("company/%s/announcements", cid);
	}

	public Announcement[] companyAnnouncementSearch(String country, int maxData) {
		return getAnnouncements( new AnnouncementSearchNLimit(maxData).keyVs()
				, "company/%s/announcements", country );
	}

	public Announcement announcementIdSearch(String aid) {
		 return getAnnouncement("company/announcement/%s", aid);
	}
  
    protected Company getCompany(String pattern, String... subs)
    {
        return (Company)
        		_cf.Getter[0].get( pattern, subs );
    }

    protected Company[] getCompanies(String pattern, String... subs)
    {
        return (Company[])
        		_cf.Getter[1].get( pattern, subs );
    }

    protected Company[] getCompanies(Form form, String pattern, String... subs)
    {
        return (Company[])
        		_cf.Getter[1].post( form, pattern, subs );
    }

    protected Announcement getAnnouncement(String pattern, String... subs)
    {
        return (Announcement)
        		_cf.Getter[7].get( pattern, subs );
    }

    protected Announcement[] getAnnouncements(String pattern, String... subs)
    {
        return (Announcement[])
        		_cf.Getter[8].get( pattern, subs );
    }

    protected Announcement[] getAnnouncements(Form form, String pattern, String... subs)
    {
        return (Announcement[])
        		_cf.Getter[8].post( form, pattern, subs );
    }    
}
