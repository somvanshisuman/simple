package com.example.FundTransfer;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class Fund {

		@GetMapping("/fund")
		@ResponseBody 
		public int fund() {
			int a=4;
			int b=5;
			int c=a+b;
			System.out.println(c);
			return c;
			
			
		}
		

}
