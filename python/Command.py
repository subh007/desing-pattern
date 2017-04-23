class Stock:
    def __init__(self, name):
        self._name = name

    def sale(self):
        print "sell stock" + self._name

    def buy(self):
        print "buy stock" + self._name

class BuyStock(Stock):
    pass

class SellStock(Stock):
    pass

class Broker:

    def __init__(self):
        self._stocks = list()

    def add_stock(self, stock):
        self._stocks += stock

    def process(self):
        for stock in self._stocks:
            if type(stock) == BuyStock:
                stock.buy()
            else:
                stock.sale()

broker = Broker()
buy = BuyStock("buy")

broker.add_stock(buy)
broker.process()
