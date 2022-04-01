#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, n, x, k;
    cin >> t;
    while (t--)
    {
        cin >> n >> x >> k;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (x <= k)
            {
                k -= x;
                count += 1;
            }
        }
        cout << count << endl;
    }
    return 0;
}
