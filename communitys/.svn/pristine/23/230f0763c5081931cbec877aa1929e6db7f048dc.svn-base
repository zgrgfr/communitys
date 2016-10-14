package test;

import entity.LeaguesIntroduce;
import service.LeaguesIntroduceService;
public class LeaguesIntroduceTest {
	
	public static void main(String args[])throws Exception{
		LeaguesIntroduceService leaService = new LeaguesIntroduceService();
		
		
		
		leaService.deleteById(1);
		LeaguesIntroduce leaguesIntroduce = new LeaguesIntroduce();
		
		leaguesIntroduce.setId(2);
		leaguesIntroduce.setContent("修改过de校社联的简介");
		leaService.updateById(leaguesIntroduce);
	}
}
