import random


def show_menu():
    print("1. 가위")
    print("2. 바위")
    print("3. 보")
    return int(input("선택: "))


if __name__ == "__main__":
    r = random.randrange(0, 3) + 1
    dic = {1: "가위", 2: "바위", 3: "보"}

    select = show_menu()
    print(f"컴퓨터: {dic[r]}, 사용자: {dic[select]}")
    if select == r:
        print("비겼습니다.")
    elif (select - r + 3) % 3 == 1:
        print("이겼습니다.")
    elif (select - r + 3) % 3 == 2:
        print("졌습니다.")
