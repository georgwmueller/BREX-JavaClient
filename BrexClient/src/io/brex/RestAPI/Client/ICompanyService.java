package io.brex.RestAPI.Client;

import io.brex.RestAPI.Client.Model.*;
import io.brex.RestAPI.Client.Tools.*;

public interface ICompanyService {
	// https://api.brex.io/docs/v1-company.json
    Company[] companyNameSearch(String country, String name);
    Company[] companyGeneralSearch(String country, GeneralSearchQO qu);
    Company[] companyRegnumSearch(String country, String regnum);
    Company companyIdSearch(String cid, String quant);
    Company companyIdSearch(String cid, ResultSet quant);
    Announcement[] companyAnnouncementSearch(String cid);
    Announcement[] companyAnnouncementSearch(String country, int maxData);
    Announcement announcementIdSearch(String aid);
}
