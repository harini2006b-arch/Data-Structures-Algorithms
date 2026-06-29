using System.Collections.Generic;

public class Solution
{
    public int[] Intersection(int[] nums1, int[] nums2)
    {
        HashSet<int> set = new HashSet<int>();

        foreach (int num in nums1)
        {
            set.Add(num);
        }

        HashSet<int> result = new HashSet<int>();

        foreach (int num in nums2)
        {
            if (set.Contains(num))
            {
                result.Add(num);
            }
        }

        return new List<int>(result).ToArray();
    }
}