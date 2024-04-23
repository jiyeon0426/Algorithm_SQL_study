from collections import defaultdict

def dfs(graph, visited, start, target, depth):
    if depth == 4:
        return True

    visited[start] = True
    for friend in graph[start]:
        if not visited[friend]:
            if dfs(graph, visited, friend, target, depth + 1):
                return True
    visited[start] = False
    return False

def check_relationship(graph):
    for i in range(len(graph)):
        visited = [False] * len(graph)
        if dfs(graph, visited, i, i, 0):
            return 1
    return 0

def main():
    N, M = map(int, input().split())
    graph = defaultdict(list)

    for _ in range(M):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    result = check_relationship(graph)
    print(result)

if __name__ == "__main__":
    main()
