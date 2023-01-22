package com.aneonex.bitcoinchecker.datamodule.config

import com.aneonex.bitcoinchecker.datamodule.model.Market
import com.aneonex.bitcoinchecker.datamodule.model.market.*

object MarketsConfig {
    private val registeredMarkets = arrayOf(
        Coinbase(), // Default market

        Bitstamp(),
        Mercado(),

        Kraken(),
        Bitfinex(),
        Okcoin(),
//        Cryptsy(),
//        Vircurex(),
//        Fxbtc(),
        GateIo(),
//        Justcoin(),
        Btcturk(),
//        Coinse(),
//        Campbx(),
        TheRock(),
        CexIO(),
//        Virtex(),
        Huobi(),
//        VaultOfSatoshi(),
//        CoinMarketIO(),
//        McxNOW(),
//        CryptoTrade(),
//        MintPal(),
        CoinJar(),
        Poloniex(),
//        Winkdex(),
        BitX(),
//        CCex(),
//        Bitorado(),
        CoinDesk(),
        Koinim(),
//        FybSE(),
//        FybSG(),
//        Prelude(),
//        BitKonan(),
        Bittrex(),
//        Comkort(),
        Bit2c(),
//        CryptoAltex(),
        BtcMarkets(),
        Bleutrade(),
//        ShareXcoin(),
//        Unisend(),
//        BitcoinVenezuela(),
        Korbit(),
        CoinTree(),
//        Cryptonit(),
//        LakeBTC(),
//        BitMaszyna(),
//        Zaydo(),
//        AllCoin(),
        Ripio(),
//        DolarBlueNet(),
//        CoinSwap(),
        Paymium(),
        Bitso(),
//        Cryptoine(),
        BitcoinToYou(),
//        BitexLa(),
        ItBit(),
        BitcoinCoId(),
        HitBtc(),
//        CleverCoin(),
        BitBay(),
//        QuadrigaCX(),
        CoinMateIO(),
//        Buttercoin(),
//        CoinTraderNet(),
        LocalBitcoins(),
//        Cryptopia(),
//        Igot(),
//        Mexbt(),
//        Vaultoro(),
//        BitxCom(),
        BtcBox(),
//        BtcXIndia(),
        Uphold(),
        YoBit(),
//        ShapeShift(),
//        BitoEx(),
//        new FoscEx(),
//        CoinSecure(),
//        Dashcurex(),
//        Quoine(),
//        Livecoin(),
        Gemini(),
//        Coinapult(),
//        Btc38(),
//        ETHEXIndia(),
//        GateCoin(),
//        Liqui(),
        ChileBit(),
        SurBitcoin(),
        VBtc(),
//        Urdubit(),
//        NegocieCoins(),
        BitMEX(),
        BitFlyer(),
        Coinone(),
        Bithumb(),
        Coinsph(),
        Bl3p(),
//        SurBtc(),
//        CoinFloor(),
        Lykke(),
//        Coinnest(),
//        Braziliex(),
//        Abucoins(),
//        Zebpay(),
        Paribu(),
        SatoshiTango(),
//        Koinex(),
//        Unocoin(),
//        BlinkTrade(),
        Exmo(),
        Binance(),
        Kucoin(),
        BitcoinTrade(),
//        OmniTrade(),
//        Coinome(),
//        Nocks(),
        BitoPro(),
        Ftx(),
        Okex(),
        OkexFutures(),
//        ZgCom(),
        Upbit(),
        CoinEx(),
        BitpandaPro(),
        Indodax(),
        Liquid(),
        WazirX(),
        Pdax(),
//        Exrates(),
        Coinsbit(),
//        Coineal(),
        Bkex(),
//        Mxc(),

//        Biki(),
        Bybit(),
//        BitZ(),
//        Hbtc(),
//        Hydax(),
//        Mexo(),
//        XthetaGlobal(),

        UniswapV2(),
        IndependentReserve(),
        CapeCrypto(),

        BinanceFutures(),
        Bitvavo(),
        AscendEX(),

        BitPay(),
        Hotbit(),

        BitCambio(),
        BwCom(),
//        EXX(),
        CoinTiger(),
        LiteBit(),
        OceanEx(),
        BitMart(),
        BigONE(),
//        Tokok(),

        Orionx(),
        BudaCom(),
        CryptoMarket(),

        ProBit(),
        CryptoCom(),
        Foxbit(),

        Bitkub(),

        CoinJarExchange(),
//        CoinEgg(),
        Phemex(),

        FtxFutures(),
        HuobiFutures(),

        Latoken(),
        Bitrue(),
        FtxUs(),
        BinanceUs(),
        Mexc(),

        Stex(),
        SafeTrade(),

        Kuna(),
        XTCom(),

        Bitget(),

        Deribit(),
        Tokocrypto(),

        BybitDerivatives(),
        Exbitron(),
        Txbit(),
    )

    val MARKETS: Map<String, Market> = registeredMarkets.associateBy { it.key }
}
