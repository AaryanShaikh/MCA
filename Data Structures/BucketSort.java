import java.util.*;
public class BucketSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = in.nextInt();
		float arr[] = new float[size];
		System.out.println("Enter the "+size+" elements");
		float b0[] = new float[size];
		float b1[] = new float[size];
		float b2[] = new float[size];
		float b3[] = new float[size];
		float b4[] = new float[size];
		float b5[] = new float[size];
		float b6[] = new float[size];
		float b7[] = new float[size];
		float b8[] = new float[size];
		float b9[] = new float[size];
		int in0=0,in1=0,in2=0,in3=0,in4=0,in5=0,in6=0,in7=0,in8=0,in9=0;
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextFloat();
			int res = (int)arr[i]*10;
			switch(res){
				case 0: b0[in0] = arr[i];
						in0++;
						break;
				case 1: b1[in1] = arr[i];
						in1++;
						break;
				case 2: b2[in2] = arr[i];
						in2++;
						break;
				case 3: b3[in3] = arr[i];
						in3++;
						break;
				case 4: b4[in4] = arr[i];
						in4++;
						break;
				case 5: b5[in5] = arr[i];
						in5++;
						break;
				case 6: b6[in6] = arr[i];
						in6++;
						break;
				case 7: b7[in7] = arr[i];
						in7++;
						break;
				case 8: b8[in8] = arr[i];
						in8++;
						break;
				case 9: b9[in9] = arr[i];
						in9++;
						break;
			}
		}
		Arrays.sort(b0);
		Arrays.sort(b1);
		Arrays.sort(b2);
		Arrays.sort(b3);
		Arrays.sort(b4);
		Arrays.sort(b5);
		Arrays.sort(b6);
		Arrays.sort(b7);
		Arrays.sort(b8);
		Arrays.sort(b9);
		int i=0;
		System.out.println("Sorted");
			if (in0>0) {
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b0[k]);
				}
			}else if(in1>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b1[k]);
				}
			}else if(in2>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b2[k]);
				}
			}else if(in3>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b3[k]);
				}
			}else if(in4>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b4[k]);
				}
			}else if(in5>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b5[k]);
				}
			}else if(in6>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b6[k]);
				}
			}else if(in7>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b7[k]);
				}
			}else if(in8>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b8[k]);
				}
			}else if(in9>0){
				for (int k=0;k<in0 ;k++ ) {
					System.out.println(b9[k]);
				}
			}
		}
	}