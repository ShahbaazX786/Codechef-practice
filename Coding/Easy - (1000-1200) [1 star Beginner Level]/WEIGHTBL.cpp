#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int w1, w2, x1, x2, z;
        cin >> w1 >> w2 >> x1 >> x2 >> z;
        w2 = w2 - w1;
        x1 = x1 * z;
        x2 = x2 * z;
        if (w2 >= x1 && w2 <= x2)
        {
            cout << 1 << endl;
        }
        else
        {
            cout << 0 << endl;
        }
    }
    return 0;
}