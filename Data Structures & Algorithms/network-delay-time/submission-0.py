class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        adj = defaultdict(list)
        for u, v, t in times:
            adj[u].append((v, t))

        dist = {k: 0}
        heap = [(0, k)]

        while heap:
            time, node = heapq.heappop(heap)
            if time > dist.get(node, float('inf')):
                continue
            for neighbor, weight in adj[node]:
                new_time = time + weight
                if new_time < dist.get(neighbor, float('inf')):
                    dist[neighbor] = new_time
                    heapq.heappush(heap, (new_time, neighbor))

        if len(dist) == n:
            return max(dist.values())
        return -1