class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        hours.sort()

        count = 0

        le = len(hours)

        for hour in hours:

            if hour >= target:
                break

            count += 1

        return le - count