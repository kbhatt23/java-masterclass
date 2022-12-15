package com.learning.sample.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProcessService {
	public static void main(String[] args) {
		int[] unixProcessesToKill = new ProcessService().unixProcessesToKill(new int[] {1,3,10,5,6}, new int[] {3,0,5,3, 10}, 5);
		for(int a : unixProcessesToKill) {
			System.out.println(a);
		}
	}

	// pid [1,3,10,5], ppid = [3,0,5,3], kill = 5
	public int[] unixProcessesToKill(int[] pids, int[] ppids, int kill) {
		//pid value as key
		//List<Integer> children pids
		Map<Integer, List<Integer>> parentChildrenStorage = new HashMap<>();
		
		int nodes = pids.length;
		List<Integer> allChildrens = new ArrayList<>();
		
		for(int number: pids) {
				allChildrens.add(number);
		}
		
		for(int i= 0 ; i < nodes ; i++) {
			int childPid = pids[i];
			int parentId = ppids[i];
			
			if(parentChildrenStorage.containsKey(parentId)) {
				List<Integer> childrens = parentChildrenStorage.get(parentId);
				childrens.add(childPid);
			}
			else if(parentId == 0) {
				parentChildrenStorage.put(childPid, allChildrens);
			}
			else {
				List<Integer> childrens = new ArrayList<>();
				childrens.add(childPid);
				childrens.add(parentId);
				parentChildrenStorage.put(parentId, childrens);
			}
		}
		List<Integer> killPIDs = parentChildrenStorage.get(kill);
		
		return killPIDs.stream().mapToInt(Integer::intValue).toArray();
		
	}
}
