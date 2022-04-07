#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;

    cin >> t;
    while (t--)
    {
        int x, y;
        cin >> x >> y;
        y *= 30;
        cout << (x >= y ? "YES" : "NO") << endl;
    }
    return 0;
}
