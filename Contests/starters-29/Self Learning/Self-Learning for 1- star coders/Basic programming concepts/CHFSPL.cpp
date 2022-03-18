#include <bits/stdc++.h>
using namespace std;

int main()
{
    // your code goes here
    int t, a, b, c;
    cin >> t;
    while (t--)
    {
        cin >> a >> b >> c;
        cout << a + b + c - min(a, min(b, c)) << endl;
    }
    return 0;
}
