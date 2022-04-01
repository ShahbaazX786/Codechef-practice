#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, x;
    cin >> t;
    while (t--)
    {
        cin >> x;
        int s = 1, e = x;
        s = s + (e - s) / 2;
        cout << s << endl;
    }
    return 0;
}
