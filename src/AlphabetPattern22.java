
public class AlphabetPattern22 {

	public static void main(String[] args)
	
	
	{
	        String txt = "abc";
	        int i,s,j,k,n;
	        for(i=0;i<txt.length();i++){
	            for(s=1;s<txt.length()-i;s++) System.out.print(" ");
	        	//System.out.print(" ");
	        	for(j=0,k=i;j<=i*2;j++){
	            	
	                if(j<=i) { System.out.print(txt.substring(j, j+1)+" ");
	                }
	                else{
	                    System.out.print(txt.substring(k-1, k)+" ");
	                    k--;
	                }
	                
	            }
	            System.out.println();
	        }
	        for( i=0;i<txt.length();i++){
	            for( s=-1;s<i*2;s++) System.out.print(" ");
	            for(j=txt.length()-i-1,n=0;j>0;j--,n++)
	                System.out.print(txt.substring(n, n+1)+" ");
	            for( j=txt.length()-i-2;j>0;j--)
	                System.out.print(txt.substring(j-1, j)+" ");
	            System.out.println();
	        }
	    }
	}
