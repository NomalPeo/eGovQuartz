package egovframework.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class quartz {
	
	
	public void test1() throws Exception {
		System.out.println("5초에 반복");
	}
	
	@Scheduled(cron="0/10 * * * * *") //매 0초 5초에 실행 ( 초 분 시 일 월 주 년 )
	public void test2() throws Exception{
		System.out.println("10초에 반복");
	}
}
