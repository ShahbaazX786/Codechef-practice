#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, a, b, x;
    cin >> t;
    while (t--)
    {
        cin >> a >> b >> x;
        b -= a;
        cout << b / x << endl;
    }
    return 0;
}
