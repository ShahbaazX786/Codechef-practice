#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, m, w1, w2, x1, x2;
    cin >> t;
    while (t--)
    {
        cin >> w1 >> w2 >> x1 >> x2 >> m;
        w2 = w2 - w1;
        x1 = x1 * m;
        x2 = x2 * m;
        if (w2 < x1)
        {
            cout << "0" << endl;
        }
        else if (w2 >= x1 && w2 <= x2)
        {
            cout << "1" << endl;
        }
        else if (w2 > x1 && w2 > x2)
        {
            cout << "0" << endl;
        }
    }
    return 0;
}