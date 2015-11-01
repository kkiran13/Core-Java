import java.io.*; 

class RC4{ 
	public static void main(String args[])throws IOException { 
		int temp=0; 
		String ptext; 
		String key; 
		int s[]=new int[64]; 
		int k[]=new int[24]; 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nENTER PLAIN TEXT:\n"); 
		ptext=in.readLine();
		//ptext = "RC4";
		System.out.print("\nENTER KEY TEXt:\n"); 
		key=in.readLine();
		//key = "A";
		char ptextc[]=ptext.toCharArray();
		char keyc[]=key.toCharArray();
		int cipher[]=new int[ptext.length()];
		int decrypt[]=new int[ptext.length()]; 
		int ptexti[]=new int[ptext.length()]; 
		int keyi[]=new int[key.length()]; 
		for(int i=0;i<ptext.length();i++) { 
			ptexti[i]=(int)ptextc[i];
			//System.out.println("ptext for is:"+ptexti[i]);
			} 
		for(int i=0;i<key.length();i++) { 
			keyi[i]=(int)keyc[i]; 
			//System.out.println("keyi for is:"+keyi[i]);
			} 
		for(int i=0;i<8;i++) { 
			s[i]=i; 
			k[i]=keyi[i%key.length()]; 
			//System.out.println("ki for is:"+k[i]);
			}
		int j=0; 
		for(int i=0;i<8;i++) { 
			j=(j+s[i]+k[i])%8; 
			temp=s[i]; 
			s[i]=s[j]; 
			s[j]=temp; 
			} 
	 //System.out.println("S arr is:"+s[0]+s[1]+s[2]+s[3]+s[4]+s[5]+s[6]+s[7]);
		int i=0; 
		j=0;
		int z=0; 
		for(int l=0;l<ptext.length();l++) { 
			i=(l+1)%8; 
			j=(j+s[i])%8; 
			temp=s[i]; 
			s[i]=s[j]; 
			s[j]=temp; 
			//System.out.println("S[i]"+s[i]);
			//System.out.println("S[j]"+s[j]);
			z=s[(s[i]+s[j])%8];
			//System.out.println("loop:"+l);
			//System.out.println("k:"+z+"xor"+ptexti[l]);
			cipher[l]=z^ptexti[l]; 
			//System.out.print("ciph is"+cipher[l]); 
			decrypt[l]=z^cipher[l];
			//System.out.print("decrypt is"+decrypt[l]); 
			} 
		System.out.print("\n\nENCRYPTED:\t\t"); 
		display(cipher); 
		System.out.print("\n\nDECRYPTED:\t\t"); 
		display(decrypt); } 
	
	static void display(int disp[]) { 
		char convert[]=new char[disp.length]; 
		for(int l=0;l<disp.length;l++) { 
			convert[l]=(char)disp[l]; 
			System.out.print(convert[l]); 
			}
		}
	} 