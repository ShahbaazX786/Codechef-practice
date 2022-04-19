#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int n, b, max = -1;
        cin >> n >> b;
        while (n--)
        {
            int x, y, z;
            cin >> x >> y >> z;
            if (b >= z)
            {
                if (max < (x * y))
                {
                    max = x * y;
                }
            }
        }
        if (max < 0)
        {
            cout << "no tablet" << endl;
        }
        else
        {
            cout << max << endl;
        }
    }
    return 0;
}