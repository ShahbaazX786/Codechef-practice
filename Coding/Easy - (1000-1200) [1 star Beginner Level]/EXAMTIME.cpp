#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, d1, d2, d3, s1, s2, s3;
    cin >> t;
    while (t--)
    {
        cin >> d1 >> d2 >> d3;
        cin >> s1 >> s2 >> s3;
        int a = 0, b = 0;
        a = d1 + d2 + d3;
        b = s1 + s2 + s3;
        if (a > b)
        {
            cout << "DRAGON" << endl;
        }
        else if (b > a)
        {
            cout << "SLOTH" << endl;
        }
        else if (d1 > s1)
        {
            cout << "DRAGON" << endl;
        }
        else if (d1 < s1)
        {
            cout << "SLOTH" << endl;
        }
        else if (d2 > s2)
        {
            cout << "DRAGON" << endl;
        }
        else if (d2 < s2)
        {
            cout << "SLOTH" << endl;
        }
        else
        {
            cout << "TIE" << endl;
        }
    }
    return 0;
}