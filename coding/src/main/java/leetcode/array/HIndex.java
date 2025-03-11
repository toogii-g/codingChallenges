package leetcode.array;

public class HIndex {

    public int hIndex(int[] citations) {

        // how many papers published
        int papers = citations.length;

        // count by cited amounts and no need to consider more than papers amount
        // because h-index needs to be equal to cited amount and paper count
        int[] citationsBucket = new int[papers + 1];


        // Distribute papers into buckets based on their citation count,
        // capping at 'papers' to ensure citations exceeding the total paper count
        // are grouped in the last bucket.
        for (int citation : citations) {
            citationsBucket[Math.min(citation, papers)]++;
        }


        int cumulatedCites = 0;

        // Traverse the buckets from highest possible h-index downward.
        // Accumulate citation counts, and check if the current h-index condition is met.
        // If the number of papers with at least 'hIndex' citations is >= 'hIndex', return the h-index.
        for (int hIndex = papers - 1; hIndex > 0; hIndex--) {
            cumulatedCites += citationsBucket[hIndex];
            if (cumulatedCites >= hIndex) {
                return cumulatedCites;
            }
        }

        // if no hIndex satisfied
        return 0;
    }
}
