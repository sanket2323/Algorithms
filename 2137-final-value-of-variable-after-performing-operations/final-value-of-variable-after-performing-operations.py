class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        hash_dict = {
            '--x' : -1,
            'x--' : -1,
            'x++' : +1,
            '++x' : +1
        }
        x = 0
        for operation in operations:
            new_x = operation.lower()
            x = x + hash_dict.get(new_x,0)

        return x
