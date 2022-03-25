#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t,x,y,d;
	cin>>t;
	while(t--){
	    cin>>x>>y>>d;
	    int temp=x>y?x-y:y-x;
	    cout<<((temp<=d)?"YES":"NO")<<endl;
	}
	return 0;
}
