 public int majority(int val[])
    {
      if(val.length==0)
      {
          System.out.println("Array is empty");
          return -1;
      }
      int candidate=0;
      int count=0;
      int freq_count=0;
      for(int i=0;i<val.length;i++)
      {
        if(count==0)
            candidate=val[i];
        if(val[i]==candidate)
            count++;
        else
            count--;
      }
       System.out.println("Candidate is "+candidate);
       
       System.out.println("Count is "+count);

      for(int j=0;j<val.length;j++)
      {
        if(val[j]==candidate)
            freq_count++;
      }
      System.out.println("candidate appears "+freq_count+" times");
      
      if(freq_count==(val.length/2)+1)
          return candidate;
      
      else return -1;
    }
    
/* 
 we find the majority element in two passes.
 During the first pass we use two variables, candidate and count both initialized to zero
 If the count is zero then we set the current element as candidate.
 If the current value is candidate then increment the count or else decrement. That is first for loop
 
 Now in the second pass we count the frequency of the candidate. If it is more than half of the elements then we return  the value.
 
 Example 
 Consider int y[]={2,4,2,2,0,4,4,2,2};
 Output would be
 Candidate is 2
 Count is 1
 candidate appears 5 times
 so the majority element is found and is 2
 First pass:count values would be [1,0,1,2,1,0,1,0,1] and final candidate is 2 with count 1
 Second pass: The frequency of "2" is 5 so it is a majority element. 


*/
