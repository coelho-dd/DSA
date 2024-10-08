clients = ["Lexi", "Britney", "Danny", "Bobbi", "Chris"]

# Algoritmo:
def identify_client(lst):
    for client in lst:
        if client[0] == "B":
            print(f"{client} will receive a free book")

