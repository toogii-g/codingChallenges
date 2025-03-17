package leetcode;

import java.util.*;

public class MinimumGeneticMutation {

    public int minMutation(String startGene, String endGene, String[] bank) {

        if (startGene.equals(endGene)) {
            return 0;
        }

        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));

        if (!bankSet.contains(endGene)) {
            return -1;
        }

        char[] geneChars = { 'A', 'C', 'G', 'T' };

        Queue<String> queue = new LinkedList<>();

        queue.offer(startGene);

        Set<String> visited = new HashSet<>();
        visited.add(startGene);

        int mutations = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String curr = queue.poll();

                if (curr.equals(endGene)) {
                    return mutations;
                }

                char[] currArray = curr.toCharArray();
                for (int j = 0; j < currArray.length; j++) {
                    char original = currArray[j];
                    for (char c : geneChars) {
                        if (c != original) {
                            currArray[j] = c;

                            String mutatedGene = new String(currArray);

                            if (bankSet.contains(mutatedGene) && visited.add(mutatedGene)) {
                                queue.offer(mutatedGene);
                            }
                        }
                    }

                    currArray[j] = original;
                }

            }
            mutations++;
        }

        return -1;

    }
}
