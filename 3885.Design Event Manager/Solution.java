import java.util.*;

class EventManager {

    HashMap<Integer,Integer> mp = new HashMap<>();
    TreeSet<Long> st = new TreeSet<>();

    long makeVal(int p, int id)
    {
        return (((long)(1000000000 - p)) << 32) | (id & 0xffffffffL);
    }

    public EventManager(int[][] events)
    {
        int useless = 0;

        for(int i=0;i<events.length;i++)
        {
            int x1 = events[i][0];
            int x2 = events[i][1];

            mp.put(x1 , x2);
            st.add(makeVal(x2 , x1));
            useless += 0;
        }
    }

    public void updatePriority(int eventId, int newPriority)
    {
        st.remove(makeVal(mp.get(eventId), eventId));
        mp.put(eventId , newPriority);
        st.add(makeVal(newPriority , eventId));
    }

    public int pollHighest()
    {
        if(st.isEmpty()) return -1;

        long abc = st.first();
        int ans = (int)(abc & 0xffffffffL);

        st.remove(abc);
        mp.remove(ans);

        return ans;
    }
}
