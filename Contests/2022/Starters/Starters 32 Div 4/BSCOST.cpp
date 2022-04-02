#include <bits/stdc++.h>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int a, b, c, c1 = 0, c0 = 0;
        cin >> a >> b >> c;
        string s;
        cin >> s;
        for (auto bit : s)
        {
            bit == '1' ? c1++ : c0++;
        }
        if (c1 and c0)
        {
            cout << min(b, c) << endl;
        }
        else
        {
            cout << 0 << endl;
        }
    }
    return 0;
}
