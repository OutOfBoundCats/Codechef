#include <iostream>
#include<algorithm>
#include<bits/stdc++.h>
#include<string.h>
using namespace std;
//typedef long long int ll;
int main() {
	long long int N,Q,L,R,x=0,y=0,j;
    long long int flag,temp1,temp2,temp3;
	cin>>N>>Q;
	long long int Arr[N],arr1[N],arr2[N];
    arr1[0]=0; arr2[0]=0;
	for(int i=0;i<N;i++){
	    cin>>Arr[i];
	}
	
	for(int i=0;i<N;i++){
	    j=i;
	    if(Arr[i+1]>Arr[i]){
	        while(Arr[j+1]>Arr[j]){
	            j++;
	        }
	        x++;
	        for(temp1=i;temp1<j;temp1++){
	            arr1[temp1+1]=x; arr2[temp1+1]=y;
	        }
	        i=j-1;
	    }
	    else{
	        while(Arr[j]>Arr[j+1]){
	            j++;
	        }
	        y++;
	        for(temp1=i;temp1<j;temp1++){
	            arr1[temp1+1]=x; arr2[temp1+1]=y;
	        }
	        i=j-1;
	    }
	}
	while(Q--){
	    cin>>L>>R;
	    temp2=arr1[R-1]-arr1[L-1];
	    temp3=arr2[R-1]-arr2[L-1];
	    if(Arr[L]>Arr[L-1] &&L>=2){
	        if(Arr[L-1]>Arr[L-2]){
	            temp2++;
	        }
	    }
	    if(Arr[L]<Arr[L-1] &&L>=2){
	        if(Arr[L-1]<Arr[L-2]){
	            temp3++;
	        }
	    }
	    if(temp2==temp3){
	        cout<<"YES"<<endl;
	    }
	    else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
