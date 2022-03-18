#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        long long int n, x, s, r, ans = 0;
        cin >> n >> x;
        for (int i = 0; i < n; i++)
        {
            cin >> s >> r;
            if (s <= x && ans < r)
            {
                ans = r;
            }
        }
        cout << ans << endl;
    }
    return 0;
}