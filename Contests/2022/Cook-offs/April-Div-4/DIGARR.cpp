#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n,count;
	    cin>>n;
	    string s;
	    cin>>s;
	    count=0;
	    for (int i = 0; i < n; i++) {
	        if(s[i]=='0' or s[i]=='5'){
	            count++;
	        }
	    }
	     if(count>0){
	         cout<<"YES"<<endl;
	     }
	     else{
	         cout<<"NO"<<endl;
	     }
	}
	return 0;
}
