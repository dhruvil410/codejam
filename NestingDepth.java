#include<bits/stdc++.h>
#define ll long long int
#define faster ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define trace(x) cerr<<#x<<" : "<<x<<endl;
using namespace std;
int main()
{
    int t,e=1;
    cin>>t;
    while(e<=t)
    {
        string s,ans;
        cin>>s;
        int n=s.length(),len=0;
        for(int j=0;j<s[0]-48;j++)
        {
            ans+='(';
            len++;
        }
        ans+=s[0];
        for(int i=1;i<n;i++)
        {
            int d=s[i-1]-s[i];
            if(d==0)
            {
                ans+=s[i];
            }
            else if(d<0)
            {
                for(int j=0;j<abs(d);j++)
                {
                    ans+='(';
                    len++;
                }
                ans+=s[i];
            }
            else
            {
                for(int j=0;j<d;j++)
                {
                    ans+=')';
                    len--;
                }
                ans+=s[i];
            }
        }
        if(len>0)
        {
            for(int i=0;i<len;i++)
            {
                ans+=')';
            }
        }
        cout<<"Case "<<"#"<<e++<<": "<<ans<<endl;
    }
}
