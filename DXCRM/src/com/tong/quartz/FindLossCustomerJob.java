package com.tong.quartz;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tong.service.CustomerService;


/**
 * 查找流失客户 定时任务
 * @author Administrator
 *
 */
@Component
public class FindLossCustomerJob {

	@Resource
	private CustomerService customerService; // 客户Service
	
	/**
	 * 每分钟执行一次的代码
	(cron="0 0/1 * * * ?")
	 * 
	 * 每天凌晨2点定期执行
	 * cron="0 0 2 * * ?"秒 分 时 日期 月份 星期 年份（可选）
	 */
	@Scheduled(cron="0 0 2 * * ?")
	public void work(){
		customerService.checkCustomerLoss();
	}
}
