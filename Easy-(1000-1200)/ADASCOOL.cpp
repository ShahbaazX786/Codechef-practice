#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, a, b;
    cin >> t;
    while (t--)
    {
        cin >> a >> b;
        a = a * b;
        cout << (a & 1 == 1 ? "NO" : "YES") << endl;
    }
    return 0;
}
