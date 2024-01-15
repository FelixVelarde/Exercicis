package exercici;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cas_1 {

	@Test
	void test1() {
		int[][] res = new int[4][4];
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++) {
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					res[i][j] = 2;
				}else {
					res[i][j] = 3;
				}
			}
		}
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + " ");
			}System.out.println();
		}
		
		assertArrayEquals(res, TaulellDescacs.taulell(4, 2, 3));
	}
	@Test
	void test2() {
		int[][] res = new int[6][6];
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++) {
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					res[i][j] = 4;
				}else {
					res[i][j] = 7;
				}
			}
		}
		assertArrayEquals(res, TaulellDescacs.taulell(6, 4, 7));
	}
	@Test
	void test3() {
		int[][] res = new int[2][2];
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++) {
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					res[i][j] = 1;
				}else {
					res[i][j] = 0;
				}
			}
		}
		assertArrayEquals(res, TaulellDescacs.taulell(2, 1, 0));
	}
	@Test
	void test4() {
		int[][] res = new int[37][37];
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++) {
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					res[i][j] = 78;
				}else {
					res[i][j] = 15;
				}
			}
		}
		assertArrayEquals(res, TaulellDescacs.taulell(37, 78, 15));
	}
	@Test
	void test5() {
		int[][] res = new int[1][1];
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++) {
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					res[i][j] = 0;
				}else {
					res[i][j] = 1;
				}
			}
		}
		assertArrayEquals(res, TaulellDescacs.taulell(1, 0, 1));
	}

}
