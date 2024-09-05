import numpy as np
import pandas as pd
from sklearn.metrics.pairwise import cosine_similarity

# 데이터 설정
data = {
    'User': ['A', 'B', 'C', 'D', 'E'],
    'Item 1': [5, 3, 4, 3, 1],
    'Item 2': [3, 1, 3, 3, 5],
    'Item 3': [4, 2, 4, 1, 5],
    'Item 4': [4, 3, 3, 5, 2],
    'Item 5': [np.nan, 3, 5, 4, 1],  # A 사용자가 평가하지 않은 Item 5
}

df = pd.DataFrame(data)
df.set_index('User', inplace=True)

# 사용자 간 코사인 유사도 계산
user_similarity = cosine_similarity(df.fillna(0))
user_similarity_df = pd.DataFrame(user_similarity, index=df.index, columns=df.index)

# A 사용자와 다른 사용자들의 유사도를 기반으로 아이템 5에 대한 평점 예측
def predict_rating(user, item):
    similar_users = user_similarity_df[user]
    item_ratings = df[item].fillna(0)
    weighted_sum = np.dot(similar_users, item_ratings)
    similarity_sum = np.sum(similar_users[item_ratings > 0])
    predicted_rating = weighted_sum / similarity_sum if similarity_sum != 0 else 0
    return predicted_rating

# A 사용자가 Item 5에 대해 가질 수 있는 예상 평점 계산
predicted_rating = predict_rating('A', 'Item 5')
print(f"A 사용자가 Item 5에 대해 예상되는 평점: {predicted_rating:.2f}")
