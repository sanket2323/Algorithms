class Solution:
    def defangIPaddr(self, address: str) -> str:
        new_list = [
            '[.]' if x == '.' else x for x in address
        ]

        return "".join(new_list)