package io.brex.RestAPI.Client.Tools;

public class AnnouncementSearchNLimit extends QueryObject {

		boolean data = false;
		int dataMax = 0;
		
		public AnnouncementSearchNLimit(int n) 
		{
			dataMax = n; data = dataMax > 0;
		}
}
