#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, x, y;
    cin >> t;
    while (t--)
    {
        cin >> x >> y;
        x = x * y;
        cout << (x / 100) << endl;
    }
    return 0;
}
