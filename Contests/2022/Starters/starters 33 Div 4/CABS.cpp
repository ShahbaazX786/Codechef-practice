#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    if(a==b){
	        cout<<"ANY"<<endl;
	    }
	    else{
	        cout<<(a<b?"FIRST":"SECOND")<<endl;
	    }
	}
	return 0;
}
