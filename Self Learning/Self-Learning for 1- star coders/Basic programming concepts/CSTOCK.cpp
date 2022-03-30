#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    float a,b,c,d,temp=0;
	    cin>>a>>b>>c>>d;
	    d=a*(d/100);
	    temp=a+(d);
	    //cout<<temp<<endl;
	    if(temp>=b && temp<=c){
	        cout<<"YES"<<endl;
	    }
	    else{
	        cout<<"NO"<<endl;
	    }
	    //cout<<((temp>b && temp<c)?"YES":"NO")<<endl;
	}
	return 0;
}
