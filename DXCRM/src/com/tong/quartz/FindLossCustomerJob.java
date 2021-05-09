package com.tong.quartz;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tong.service.CustomerService;


/**
 * ������ʧ�ͻ� ��ʱ����
 * @author Administrator
 *
 */
@Component
public class FindLossCustomerJob {

	@Resource
	private CustomerService customerService; // �ͻ�Service
	
	/**
	 * ÿ����ִ��һ�εĴ���
	(cron="0 0/1 * * * ?")
	 * 
	 * ÿ���賿2�㶨��ִ��
	 * cron="0 0 2 * * ?"�� �� ʱ ���� �·� ���� ��ݣ���ѡ��
	 */
	@Scheduled(cron="0 0 2 * * ?")
	public void work(){
		customerService.checkCustomerLoss();
	}
}
