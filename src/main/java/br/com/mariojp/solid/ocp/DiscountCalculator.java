package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
	
   private final Map<CustomerType, DiscountPolicy> policyMap = new HashMap<>();
   
   public DiscountCalculator() {
	   policyMap.put(CustomerType.REGULAR, new RegularPolicy());
	   policyMap.put(CustomerType.PREMIUM, new PremiumPolicy());
	   policyMap.put(CustomerType.PARTNER, new PartnerPolicy());
	   
   }
   
   public double apply(double amount, CustomerType type) {
	   DiscountPolicy policy = policyMap.get(type);
	   return policy.apply(amount);
   }
}