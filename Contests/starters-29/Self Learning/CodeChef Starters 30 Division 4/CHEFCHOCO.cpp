#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, c, x, y;
    cin >> t;
    while (t--)
    {
        cin >> c >> x >> y;
        if (c == x)
        {
            cout << c - x << endl;
        }
        else
        {
            cout << (c - x) * y << endl;
        }
    }
    return 0;
}
