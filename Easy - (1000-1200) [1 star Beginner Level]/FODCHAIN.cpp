#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int t, e, k;
    cin >> t;
    while (t--)
    {
        int ans = 1;
        cin >> e >> k;
        while (e >= k)
        {
            e = floor(e / k);
            ans++;
        }
        cout << ans << endl;
    }

    // your code goes here
    return 0;
}
