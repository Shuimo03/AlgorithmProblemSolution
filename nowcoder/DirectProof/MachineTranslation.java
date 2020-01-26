import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class MachineTranslation {

	/**
	 * 解题思路
	 * 缓存可以使用一个队列来模拟，首先队列为空，接着每个数遍历队列，如果队列中没有，则插入，于是cnt加一，
	 * 以此类推，假设队列慢了，有新的数插入，则踢出最先进入的数，然后插入新数，同时cnt加一。
	 * 如果数据大，可以使用哈希表来判断缓存是否存在。
	 * 枚举单词情况
	 *  case1 如果单词在队列，直接pass
	 *  case2 如果缓存不满，则插入，如果缓存已满，弹出队头
	 *  算法的时间复杂度在O(n)
	 * Java util知识点 Queue LinkedList
	 */
	
	static int MAXSIZE = 1010;
	static boolean ST[] = new boolean[MAXSIZE];
	public static void main(String[]args) {
		
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNext())
			{
				int M = scanner.nextInt();
				int N = scanner.nextInt();
				int cnt = 0;
				Queue<Integer> queue = new LinkedList<Integer>();
				for(int i  = 0; i < N; i++) {
					
					int x =  scanner.nextInt();

					if(!ST[x]) {	//不在缓存中
						
						cnt++;
						
						if(queue.size() == M) { // 如果缓存满了,就需要弹出队头
							ST[queue.peek()] = false;
							queue.poll();
						}
						queue.add(x);
						ST[x] = true;
					}
				}
				System.out.println(cnt);
			}
	}
}
