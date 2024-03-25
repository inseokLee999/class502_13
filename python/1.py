from collections import deque
import sys
input=sys.stdin.readline
N,M,V=map(int,input().split())
edge=list([] for _ in range(N+1))
list_bfs=[]
list_dfs=[]
for _ in range(M):
    u, v = map(int, input().split())
    edge[u].append(v)
    edge[v].append(u)

for i in edge:
    i.sort()
def solution_BFS(num,edge):
    visited = [False] * (N + 1)
    q=deque()
    q.append(num)
    visited[num]=True
    while q:
        u=q.popleft()
        list_bfs.append(u)
        for v in edge[u]:
            if visited[v]==False:
                visited[v]=True
                q.append(v)

def solution_DFS(num,edge):
    visited = [False] * (N + 1)
    q=[]
    q.append(num)
    while q:
        u=q.pop()
        if visited[u]==False:
            visited[u] = True
            list_dfs.append(u)
            for v in reversed(edge[u]):
                if visited[v]==False:
                    q.append(v)


solution_BFS(V,edge)
solution_DFS(V,edge)
print(' '.join(map(str,list_dfs)))
print(' '.join(map(str,list_bfs)))