# pandas
import pandas as pd
a = pd.Series([1, 2, 3])
b = pd.Series([4, 5, 6])

c = pd.Series([[1, 2, 3],[4, 5, 6]])
d = pd.Series([[7, 8, 9],[10, 11, 12]])
# 방법1
# pd.conact()
print("pd.conact 행 병합")
print(pd.concat((a, b), axis=0))
print("pd.conact 열 병합")
print(pd.concat((a, b), axis=1))
# 방법2
# pd.merge()
a_df = pd.DataFrame({'a': [1, 2, 3]})
b_df = pd.DataFrame({'b': [4, 5, 6]})
pd.merge(a_df, b_df, left_index=True, right_index=True)

# 방법3
print("pd.join()")
print(a_df.join(b_df))