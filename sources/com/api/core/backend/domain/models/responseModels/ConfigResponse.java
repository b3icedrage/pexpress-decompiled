package com.api.core.backend.domain.models.responseModels;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.onesignal.core.activities.PermissionsActivity;
import defpackage.C4818k80;
import defpackage.C5653o60;
import defpackage.C5686oG;
import defpackage.C5896pG;
import defpackage.C6141qR1;
import defpackage.C7362wF;
import defpackage.FF;
import defpackage.InterfaceC2691aI1;
import defpackage.PW0;
import defpackage.R51;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\b\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/ConfigResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "Lcom/api/core/backend/domain/models/responseModels/ConfigResponse$Result;", "result", "Lcom/api/core/backend/domain/models/responseModels/ConfigResponse$Result;", "e", "()Lcom/api/core/backend/domain/models/responseModels/ConfigResponse$Result;", "Companion", "Result", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfigResponse extends HttpResponse<Result> {
    private static final int DEFAULT_INIT_BET = 20;

    @Nullable
    private final Result result;

    @NotNull
    private static final Map<C6141qR1, Integer> DEFAULT_STRATEGIES_MAP = PW0.e(new Pair(new C6141qR1("CONSERVATIVE", "usd"), 10), new Pair(new C6141qR1("CAUTIOUS", "usd"), 50), new Pair(new C6141qR1("MODERATE", "usd"), 100), new Pair(new C6141qR1("ASSERTIVE", "usd"), Integer.valueOf(PermissionsActivity.DELAY_TIME_CALLBACK_CALL)), new Pair(new C6141qR1("AGGRESSIVE", "usd"), Integer.valueOf(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000fR\u001c\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000fR\u001c\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u000fR\"\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u001c\u00104\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b5\u0010\u000fR\u001c\u00106\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u000fR\u001c\u00108\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\r\u001a\u0004\b9\u0010\u000fR\u001c\u0010:\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\r\u001a\u0004\b;\u0010\u000fR4\u0010=\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a0<\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R4\u0010A\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a0<\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R(\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@R\u001c\u0010F\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\r\u001a\u0004\bK\u0010\u000fR(\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@R\u001c\u0010N\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\r\u001a\u0004\bO\u0010\u000fR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0006R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R\u001c\u0010V\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010\u001c\u001a\u0004\bW\u0010\u001eR\u001c\u0010Y\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010]\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010,\u001a\u0004\b^\u0010.R\u001c\u0010_\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\r\u001a\u0004\b`\u0010\u000fR\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\u0004\u001a\u0004\bb\u0010\u0006R\u001c\u0010c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010\r\u001a\u0004\bd\u0010\u000f¨\u0006e"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/ConfigResponse$Result;", "", "", "isShow", "Ljava/lang/Boolean;", "K", "()Ljava/lang/Boolean;", "chatIsShow", "f", "isShowStub", "L", "", "lastStubVersion", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "isVpn", "M", "affiliateId", "b", "country", "g", "domain", R51.PUSH_MINIFIED_BUTTON_TEXT, "defaultDomain", "k", "", "maxEarnDemo", "Ljava/lang/Integer;", "w", "()Ljava/lang/Integer;", "initBet", "r", "lastAppVersion", "t", "minAppVersion", "x", "platformPackageName", "z", "platformAppLink", "y", "", "Lcom/api/core/backend/domain/models/responseModels/ServerResponse;", "serversList", "Ljava/util/List;", "B", "()Ljava/util/List;", "Lcom/api/core/backend/domain/models/responseModels/Currency;", "currencies", "j", "showNotOurUserFragment", "F", "depositUrl", "l", "depositUrlLite", "m", "withdrawUrl", "I", "loginUrl", "v", "", "strategies", "Ljava/util/Map;", "G", "()Ljava/util/Map;", "doubleStrategies", R51.PUSH_MINIFIED_BUTTONS_LIST, "recommendedDeposit", "A", "Lcom/api/core/backend/domain/models/responseModels/AvailableAccountEvent;", "availableEvents", "Lcom/api/core/backend/domain/models/responseModels/AvailableAccountEvent;", "d", "()Lcom/api/core/backend/domain/models/responseModels/AvailableAccountEvent;", "jivoKey", "s", "events", R51.PUSH_MINIFIED_BUTTON_ICON, "captchaSiteKey", "e", "showCryptoAssets", "D", "showCryptoPaymentMethods", "E", "cryptoDemoTradesEnabled", "h", "cryptoDemoTradesThreshold", "i", "", "affiliateIdGetProfit", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "filterAssetId", "q", "supportEmail", "H", "isAmplitudeEnable", "J", "shortUrl", "C", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        @InterfaceC2691aI1("a_id")
        @Nullable
        private final String affiliateId;

        @InterfaceC2691aI1("a_id_getprofit")
        @Nullable
        private final Long affiliateIdGetProfit;

        @InterfaceC2691aI1("available_events")
        @Nullable
        private final AvailableAccountEvent availableEvents;

        @InterfaceC2691aI1("captcha_site_key")
        @Nullable
        private final String captchaSiteKey;

        @InterfaceC2691aI1("chat_is_show")
        @Nullable
        private final Boolean chatIsShow;

        @InterfaceC2691aI1("country")
        @Nullable
        private final String country;

        @InterfaceC2691aI1("crypto_demo_trades_enabled")
        @Nullable
        private final Boolean cryptoDemoTradesEnabled;

        @InterfaceC2691aI1("crypto_demo_trades_threshold")
        @Nullable
        private final Integer cryptoDemoTradesThreshold;

        @InterfaceC2691aI1("currencies")
        @Nullable
        private final List<Currency> currencies;

        @InterfaceC2691aI1("default_domain")
        @Nullable
        private final String defaultDomain;

        @InterfaceC2691aI1("deposit_url")
        @Nullable
        private final String depositUrl;

        @InterfaceC2691aI1("deposit_url_lite")
        @Nullable
        private final String depositUrlLite;

        @InterfaceC2691aI1("domain")
        @Nullable
        private final String domain;

        @InterfaceC2691aI1("double_strategies")
        @Nullable
        private final Map<String, Map<String, Integer>> doubleStrategies;

        @InterfaceC2691aI1("events")
        @Nullable
        private final Map<String, Boolean> events;

        @InterfaceC2691aI1("filter_asset_id")
        @Nullable
        private final List<Integer> filterAssetId;

        @InterfaceC2691aI1("init_bet")
        @Nullable
        private final Integer initBet;

        @InterfaceC2691aI1("amplitude_enable")
        @Nullable
        private final Boolean isAmplitudeEnable;

        @InterfaceC2691aI1("is_show")
        @Nullable
        private final Boolean isShow;

        @InterfaceC2691aI1("is_show_stub")
        @Nullable
        private final Boolean isShowStub;

        @InterfaceC2691aI1("is_vpn")
        @Nullable
        private final Boolean isVpn;

        @InterfaceC2691aI1("jivoId")
        @Nullable
        private final String jivoKey;

        @InterfaceC2691aI1("last_app_version")
        @Nullable
        private final String lastAppVersion;

        @InterfaceC2691aI1("last_stub_version")
        @Nullable
        private final String lastStubVersion;

        @InterfaceC2691aI1("landing_link")
        @Nullable
        private final String loginUrl;

        @InterfaceC2691aI1("max_earn_demo")
        @Nullable
        private final Integer maxEarnDemo;

        @InterfaceC2691aI1("minimal_app_version")
        @Nullable
        private final String minAppVersion;

        @InterfaceC2691aI1("platform_app_link")
        @Nullable
        private final String platformAppLink;

        @InterfaceC2691aI1("platform_package_name")
        @Nullable
        private final String platformPackageName;

        @InterfaceC2691aI1("recommended_deposit")
        @Nullable
        private final Map<String, Integer> recommendedDeposit;

        @InterfaceC2691aI1("servers_list")
        @Nullable
        private final List<ServerResponse> serversList;

        @InterfaceC2691aI1("short_link")
        @Nullable
        private final String shortUrl;

        @InterfaceC2691aI1("show_crypto_assets")
        @Nullable
        private final Boolean showCryptoAssets;

        @InterfaceC2691aI1("show_crypto_payment_methods")
        @Nullable
        private final Boolean showCryptoPaymentMethods;

        @InterfaceC2691aI1("re_reg")
        @Nullable
        private final Boolean showNotOurUserFragment;

        @InterfaceC2691aI1("strategies")
        @Nullable
        private final Map<String, Map<String, Integer>> strategies;

        @InterfaceC2691aI1("support_email")
        @Nullable
        private final String supportEmail;

        @InterfaceC2691aI1("withdraw_url")
        @Nullable
        private final String withdrawUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable Boolean bool4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<ServerResponse> list, @Nullable List<Currency> list2, @Nullable Boolean bool5, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Map<String, ? extends Map<String, Integer>> map, @Nullable Map<String, ? extends Map<String, Integer>> map2, @Nullable Map<String, Integer> map3, @Nullable AvailableAccountEvent availableAccountEvent, @Nullable String str14, @Nullable Map<String, Boolean> map4, @Nullable String str15, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Integer num3, @Nullable Long l, @Nullable List<Integer> list3, @Nullable String str16, @Nullable Boolean bool9, @Nullable String str17) {
            this.isShow = bool;
            this.chatIsShow = bool2;
            this.isShowStub = bool3;
            this.lastStubVersion = str;
            this.isVpn = bool4;
            this.affiliateId = str2;
            this.country = str3;
            this.domain = str4;
            this.defaultDomain = str5;
            this.maxEarnDemo = num;
            this.initBet = num2;
            this.lastAppVersion = str6;
            this.minAppVersion = str7;
            this.platformPackageName = str8;
            this.platformAppLink = str9;
            this.serversList = list;
            this.currencies = list2;
            this.showNotOurUserFragment = bool5;
            this.depositUrl = str10;
            this.depositUrlLite = str11;
            this.withdrawUrl = str12;
            this.loginUrl = str13;
            this.strategies = map;
            this.doubleStrategies = map2;
            this.recommendedDeposit = map3;
            this.availableEvents = availableAccountEvent;
            this.jivoKey = str14;
            this.events = map4;
            this.captchaSiteKey = str15;
            this.showCryptoAssets = bool6;
            this.showCryptoPaymentMethods = bool7;
            this.cryptoDemoTradesEnabled = bool8;
            this.cryptoDemoTradesThreshold = num3;
            this.affiliateIdGetProfit = l;
            this.filterAssetId = list3;
            this.supportEmail = str16;
            this.isAmplitudeEnable = bool9;
            this.shortUrl = str17;
        }

        public static Result a(Result result, String str) {
            return new Result(result.isShow, result.chatIsShow, result.isShowStub, result.lastStubVersion, result.isVpn, result.affiliateId, result.country, str, result.defaultDomain, result.maxEarnDemo, result.initBet, result.lastAppVersion, result.minAppVersion, result.platformPackageName, result.platformAppLink, result.serversList, result.currencies, result.showNotOurUserFragment, result.depositUrl, result.depositUrlLite, result.withdrawUrl, result.loginUrl, result.strategies, result.doubleStrategies, result.recommendedDeposit, result.availableEvents, result.jivoKey, result.events, result.captchaSiteKey, result.showCryptoAssets, result.showCryptoPaymentMethods, result.cryptoDemoTradesEnabled, result.cryptoDemoTradesThreshold, result.affiliateIdGetProfit, result.filterAssetId, result.supportEmail, result.isAmplitudeEnable, result.shortUrl);
        }

        @Nullable
        public final Map<String, Integer> A() {
            return this.recommendedDeposit;
        }

        @Nullable
        public final List<ServerResponse> B() {
            return this.serversList;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getShortUrl() {
            return this.shortUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final Boolean getShowCryptoAssets() {
            return this.showCryptoAssets;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final Boolean getShowCryptoPaymentMethods() {
            return this.showCryptoPaymentMethods;
        }

        @Nullable
        /* JADX INFO: renamed from: F, reason: from getter */
        public final Boolean getShowNotOurUserFragment() {
            return this.showNotOurUserFragment;
        }

        @Nullable
        public final Map<String, Map<String, Integer>> G() {
            return this.strategies;
        }

        @Nullable
        /* JADX INFO: renamed from: H, reason: from getter */
        public final String getSupportEmail() {
            return this.supportEmail;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final String getWithdrawUrl() {
            return this.withdrawUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final Boolean getIsAmplitudeEnable() {
            return this.isAmplitudeEnable;
        }

        @Nullable
        /* JADX INFO: renamed from: K, reason: from getter */
        public final Boolean getIsShow() {
            return this.isShow;
        }

        @Nullable
        /* JADX INFO: renamed from: L, reason: from getter */
        public final Boolean getIsShowStub() {
            return this.isShowStub;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final Boolean getIsVpn() {
            return this.isVpn;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAffiliateId() {
            return this.affiliateId;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getAffiliateIdGetProfit() {
            return this.affiliateIdGetProfit;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final AvailableAccountEvent getAvailableEvents() {
            return this.availableEvents;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCaptchaSiteKey() {
            return this.captchaSiteKey;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.a(this.isShow, result.isShow) && Intrinsics.a(this.chatIsShow, result.chatIsShow) && Intrinsics.a(this.isShowStub, result.isShowStub) && Intrinsics.a(this.lastStubVersion, result.lastStubVersion) && Intrinsics.a(this.isVpn, result.isVpn) && Intrinsics.a(this.affiliateId, result.affiliateId) && Intrinsics.a(this.country, result.country) && Intrinsics.a(this.domain, result.domain) && Intrinsics.a(this.defaultDomain, result.defaultDomain) && Intrinsics.a(this.maxEarnDemo, result.maxEarnDemo) && Intrinsics.a(this.initBet, result.initBet) && Intrinsics.a(this.lastAppVersion, result.lastAppVersion) && Intrinsics.a(this.minAppVersion, result.minAppVersion) && Intrinsics.a(this.platformPackageName, result.platformPackageName) && Intrinsics.a(this.platformAppLink, result.platformAppLink) && Intrinsics.a(this.serversList, result.serversList) && Intrinsics.a(this.currencies, result.currencies) && Intrinsics.a(this.showNotOurUserFragment, result.showNotOurUserFragment) && Intrinsics.a(this.depositUrl, result.depositUrl) && Intrinsics.a(this.depositUrlLite, result.depositUrlLite) && Intrinsics.a(this.withdrawUrl, result.withdrawUrl) && Intrinsics.a(this.loginUrl, result.loginUrl) && Intrinsics.a(this.strategies, result.strategies) && Intrinsics.a(this.doubleStrategies, result.doubleStrategies) && Intrinsics.a(this.recommendedDeposit, result.recommendedDeposit) && Intrinsics.a(this.availableEvents, result.availableEvents) && Intrinsics.a(this.jivoKey, result.jivoKey) && Intrinsics.a(this.events, result.events) && Intrinsics.a(this.captchaSiteKey, result.captchaSiteKey) && Intrinsics.a(this.showCryptoAssets, result.showCryptoAssets) && Intrinsics.a(this.showCryptoPaymentMethods, result.showCryptoPaymentMethods) && Intrinsics.a(this.cryptoDemoTradesEnabled, result.cryptoDemoTradesEnabled) && Intrinsics.a(this.cryptoDemoTradesThreshold, result.cryptoDemoTradesThreshold) && Intrinsics.a(this.affiliateIdGetProfit, result.affiliateIdGetProfit) && Intrinsics.a(this.filterAssetId, result.filterAssetId) && Intrinsics.a(this.supportEmail, result.supportEmail) && Intrinsics.a(this.isAmplitudeEnable, result.isAmplitudeEnable) && Intrinsics.a(this.shortUrl, result.shortUrl);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getChatIsShow() {
            return this.chatIsShow;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final Boolean getCryptoDemoTradesEnabled() {
            return this.cryptoDemoTradesEnabled;
        }

        public final int hashCode() {
            Boolean bool = this.isShow;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.chatIsShow;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isShowStub;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.lastStubVersion;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool4 = this.isVpn;
            int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str2 = this.affiliateId;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.domain;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.defaultDomain;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.maxEarnDemo;
            int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.initBet;
            int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str6 = this.lastAppVersion;
            int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.minAppVersion;
            int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.platformPackageName;
            int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.platformAppLink;
            int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<ServerResponse> list = this.serversList;
            int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
            List<Currency> list2 = this.currencies;
            int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool5 = this.showNotOurUserFragment;
            int iHashCode18 = (iHashCode17 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str10 = this.depositUrl;
            int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.depositUrlLite;
            int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.withdrawUrl;
            int iHashCode21 = (iHashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.loginUrl;
            int iHashCode22 = (iHashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Map<String, Map<String, Integer>> map = this.strategies;
            int iHashCode23 = (iHashCode22 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, Map<String, Integer>> map2 = this.doubleStrategies;
            int iHashCode24 = (iHashCode23 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, Integer> map3 = this.recommendedDeposit;
            int iHashCode25 = (iHashCode24 + (map3 == null ? 0 : map3.hashCode())) * 31;
            AvailableAccountEvent availableAccountEvent = this.availableEvents;
            int iHashCode26 = (iHashCode25 + (availableAccountEvent == null ? 0 : availableAccountEvent.hashCode())) * 31;
            String str14 = this.jivoKey;
            int iHashCode27 = (iHashCode26 + (str14 == null ? 0 : str14.hashCode())) * 31;
            Map<String, Boolean> map4 = this.events;
            int iHashCode28 = (iHashCode27 + (map4 == null ? 0 : map4.hashCode())) * 31;
            String str15 = this.captchaSiteKey;
            int iHashCode29 = (iHashCode28 + (str15 == null ? 0 : str15.hashCode())) * 31;
            Boolean bool6 = this.showCryptoAssets;
            int iHashCode30 = (iHashCode29 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.showCryptoPaymentMethods;
            int iHashCode31 = (iHashCode30 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.cryptoDemoTradesEnabled;
            int iHashCode32 = (iHashCode31 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Integer num3 = this.cryptoDemoTradesThreshold;
            int iHashCode33 = (iHashCode32 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Long l = this.affiliateIdGetProfit;
            int iHashCode34 = (iHashCode33 + (l == null ? 0 : l.hashCode())) * 31;
            List<Integer> list3 = this.filterAssetId;
            int iHashCode35 = (iHashCode34 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str16 = this.supportEmail;
            int iHashCode36 = (iHashCode35 + (str16 == null ? 0 : str16.hashCode())) * 31;
            Boolean bool9 = this.isAmplitudeEnable;
            int iHashCode37 = (iHashCode36 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            String str17 = this.shortUrl;
            return iHashCode37 + (str17 != null ? str17.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final Integer getCryptoDemoTradesThreshold() {
            return this.cryptoDemoTradesThreshold;
        }

        @Nullable
        public final List<Currency> j() {
            return this.currencies;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDefaultDomain() {
            return this.defaultDomain;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getDepositUrl() {
            return this.depositUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getDepositUrlLite() {
            return this.depositUrlLite;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getDomain() {
            return this.domain;
        }

        @Nullable
        public final Map<String, Map<String, Integer>> o() {
            return this.doubleStrategies;
        }

        @Nullable
        public final Map<String, Boolean> p() {
            return this.events;
        }

        @Nullable
        public final List<Integer> q() {
            return this.filterAssetId;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final Integer getInitBet() {
            return this.initBet;
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getJivoKey() {
            return this.jivoKey;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getLastAppVersion() {
            return this.lastAppVersion;
        }

        @NotNull
        public final String toString() {
            Boolean bool = this.isShow;
            Boolean bool2 = this.chatIsShow;
            Boolean bool3 = this.isShowStub;
            String str = this.lastStubVersion;
            Boolean bool4 = this.isVpn;
            String str2 = this.affiliateId;
            String str3 = this.country;
            String str4 = this.domain;
            String str5 = this.defaultDomain;
            Integer num = this.maxEarnDemo;
            Integer num2 = this.initBet;
            String str6 = this.lastAppVersion;
            String str7 = this.minAppVersion;
            String str8 = this.platformPackageName;
            String str9 = this.platformAppLink;
            List<ServerResponse> list = this.serversList;
            List<Currency> list2 = this.currencies;
            Boolean bool5 = this.showNotOurUserFragment;
            String str10 = this.depositUrl;
            String str11 = this.depositUrlLite;
            String str12 = this.withdrawUrl;
            String str13 = this.loginUrl;
            Map<String, Map<String, Integer>> map = this.strategies;
            Map<String, Map<String, Integer>> map2 = this.doubleStrategies;
            Map<String, Integer> map3 = this.recommendedDeposit;
            AvailableAccountEvent availableAccountEvent = this.availableEvents;
            String str14 = this.jivoKey;
            Map<String, Boolean> map4 = this.events;
            String str15 = this.captchaSiteKey;
            Boolean bool6 = this.showCryptoAssets;
            Boolean bool7 = this.showCryptoPaymentMethods;
            Boolean bool8 = this.cryptoDemoTradesEnabled;
            Integer num3 = this.cryptoDemoTradesThreshold;
            Long l = this.affiliateIdGetProfit;
            List<Integer> list3 = this.filterAssetId;
            String str16 = this.supportEmail;
            Boolean bool9 = this.isAmplitudeEnable;
            String str17 = this.shortUrl;
            StringBuilder sb = new StringBuilder("Result(isShow=");
            sb.append(bool);
            sb.append(", chatIsShow=");
            sb.append(bool2);
            sb.append(", isShowStub=");
            sb.append(bool3);
            sb.append(", lastStubVersion=");
            sb.append(str);
            sb.append(", isVpn=");
            sb.append(bool4);
            sb.append(", affiliateId=");
            sb.append(str2);
            sb.append(", country=");
            C5896pG.b(sb, str3, ", domain=", str4, ", defaultDomain=");
            sb.append(str5);
            sb.append(", maxEarnDemo=");
            sb.append(num);
            sb.append(", initBet=");
            sb.append(num2);
            sb.append(", lastAppVersion=");
            sb.append(str6);
            sb.append(", minAppVersion=");
            C5896pG.b(sb, str7, ", platformPackageName=", str8, ", platformAppLink=");
            sb.append(str9);
            sb.append(", serversList=");
            sb.append(list);
            sb.append(", currencies=");
            sb.append(list2);
            sb.append(", showNotOurUserFragment=");
            sb.append(bool5);
            sb.append(", depositUrl=");
            C5896pG.b(sb, str10, ", depositUrlLite=", str11, ", withdrawUrl=");
            C5896pG.b(sb, str12, ", loginUrl=", str13, ", strategies=");
            sb.append(map);
            sb.append(", doubleStrategies=");
            sb.append(map2);
            sb.append(", recommendedDeposit=");
            sb.append(map3);
            sb.append(", availableEvents=");
            sb.append(availableAccountEvent);
            sb.append(", jivoKey=");
            sb.append(str14);
            sb.append(", events=");
            sb.append(map4);
            sb.append(", captchaSiteKey=");
            sb.append(str15);
            sb.append(", showCryptoAssets=");
            sb.append(bool6);
            sb.append(", showCryptoPaymentMethods=");
            sb.append(bool7);
            sb.append(", cryptoDemoTradesEnabled=");
            sb.append(bool8);
            sb.append(", cryptoDemoTradesThreshold=");
            sb.append(num3);
            sb.append(", affiliateIdGetProfit=");
            sb.append(l);
            sb.append(", filterAssetId=");
            sb.append(list3);
            sb.append(", supportEmail=");
            sb.append(str16);
            sb.append(", isAmplitudeEnable=");
            sb.append(bool9);
            sb.append(", shortUrl=");
            sb.append(str17);
            sb.append(")");
            return sb.toString();
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getLastStubVersion() {
            return this.lastStubVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getLoginUrl() {
            return this.loginUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final Integer getMaxEarnDemo() {
            return this.maxEarnDemo;
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getMinAppVersion() {
            return this.minAppVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getPlatformAppLink() {
            return this.platformAppLink;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getPlatformPackageName() {
            return this.platformPackageName;
        }
    }

    public ConfigResponse(@Nullable Result result) {
        this.result = result;
    }

    public static LinkedHashMap g(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str2 = (String) entry2.getKey();
                int iIntValue = ((Number) entry2.getValue()).intValue();
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                String lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                linkedHashMap.put(new C6141qR1(upperCase, lowerCase), Integer.valueOf(iIntValue));
            }
        }
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfigResponse) && Intrinsics.a(this.result, ((ConfigResponse) obj).result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [o60] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [o60] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Nullable
    public final FF f() {
        ?? arrayList;
        ?? arrayList2;
        List list;
        ?? r3;
        Result result = this.result;
        if (result == null) {
            return null;
        }
        Boolean isShow = result.getIsShow();
        boolean zBooleanValue = isShow != null ? isShow.booleanValue() : false;
        Boolean chatIsShow = this.result.getChatIsShow();
        boolean zBooleanValue2 = chatIsShow != null ? chatIsShow.booleanValue() : false;
        Boolean isShowStub = this.result.getIsShowStub();
        boolean zBooleanValue3 = isShowStub != null ? isShowStub.booleanValue() : true;
        Boolean isVpn = this.result.getIsVpn();
        boolean zBooleanValue4 = isVpn != null ? isVpn.booleanValue() : false;
        String strValueOf = String.valueOf(this.result.getAffiliateId());
        String country = this.result.getCountry();
        if (country == null) {
            country = "";
        }
        String domain = this.result.getDomain();
        if (domain == null) {
            domain = "";
        }
        String defaultDomain = this.result.getDefaultDomain();
        String loginUrl = this.result.getLoginUrl();
        if (loginUrl == null) {
            loginUrl = "";
        }
        Integer maxEarnDemo = this.result.getMaxEarnDemo();
        int iIntValue = maxEarnDemo != null ? maxEarnDemo.intValue() : 20;
        Integer initBet = this.result.getInitBet();
        int iIntValue2 = initBet != null ? initBet.intValue() : 20;
        String lastAppVersion = this.result.getLastAppVersion();
        if (lastAppVersion == null) {
            lastAppVersion = "";
        }
        String minAppVersion = this.result.getMinAppVersion();
        if (minAppVersion == null) {
            minAppVersion = "";
        }
        String lastStubVersion = this.result.getLastStubVersion();
        if (lastStubVersion == null) {
            lastStubVersion = "";
        }
        String str = country;
        String platformPackageName = this.result.getPlatformPackageName();
        String platformAppLink = this.result.getPlatformAppLink();
        List<ServerResponse> listB = this.result.B();
        String str2 = lastAppVersion;
        String str3 = lastStubVersion;
        if (listB != null) {
            arrayList = new ArrayList(XE.m(listB, 10));
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                String address = ((ServerResponse) it.next()).getAddress();
                if (address == null) {
                    address = "";
                }
                arrayList.add(new C5686oG(address));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C5653o60.d;
        }
        List<Currency> listJ = this.result.j();
        if (listJ != null) {
            arrayList2 = new ArrayList(XE.m(listJ, 10));
            Iterator it2 = listJ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Currency) it2.next()).a());
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = C5653o60.d;
        }
        Boolean showNotOurUserFragment = this.result.getShowNotOurUserFragment();
        boolean zBooleanValue5 = showNotOurUserFragment != null ? showNotOurUserFragment.booleanValue() : true;
        String depositUrl = this.result.getDepositUrl();
        String depositUrlLite = this.result.getDepositUrlLite();
        String withdrawUrl = this.result.getWithdrawUrl();
        Map<String, Map<String, Integer>> mapG = this.result.G();
        Map mapG2 = mapG != null ? g(mapG) : DEFAULT_STRATEGIES_MAP;
        Map<String, Map<String, Integer>> mapO = this.result.o();
        Map mapG3 = mapO != null ? g(mapO) : DEFAULT_STRATEGIES_MAP;
        Map<String, Integer> mapA = this.result.A();
        if (mapA == null) {
            mapA = PW0.c();
        }
        Map<String, Integer> map = mapA;
        AvailableAccountEvent availableEvents = this.result.getAvailableEvents();
        C7362wF c7362wFA = availableEvents != null ? availableEvents.a() : new C7362wF(false);
        String jivoKey = this.result.getJivoKey();
        String str4 = jivoKey == null ? "" : jivoKey;
        String captchaSiteKey = this.result.getCaptchaSiteKey();
        Map<String, Boolean> mapP = this.result.p();
        if (mapP != null) {
            ArrayList arrayList3 = new ArrayList(mapP.size());
            Iterator<Map.Entry<String, Boolean>> it3 = mapP.entrySet().iterator();
            ?? r4 = arrayList;
            while (it3.hasNext()) {
                Map.Entry<String, Boolean> next = it3.next();
                arrayList3.add(new C4818k80(next.getKey(), next.getValue().booleanValue()));
                it3 = it3;
                r4 = r4;
            }
            list = arrayList3;
            r3 = r4;
        } else {
            list = null;
            r3 = arrayList;
        }
        ?? r35 = r3;
        if (list == null) {
            list = C5653o60.d;
        }
        Boolean showCryptoAssets = this.result.getShowCryptoAssets();
        boolean zBooleanValue6 = showCryptoAssets != null ? showCryptoAssets.booleanValue() : false;
        Boolean showCryptoPaymentMethods = this.result.getShowCryptoPaymentMethods();
        boolean zBooleanValue7 = showCryptoPaymentMethods != null ? showCryptoPaymentMethods.booleanValue() : false;
        String strValueOf2 = String.valueOf(this.result.getAffiliateIdGetProfit());
        List<Integer> listQ = this.result.q();
        if (listQ == null) {
            listQ = C5653o60.d;
        }
        List<Integer> list2 = listQ;
        String supportEmail = this.result.getSupportEmail();
        Boolean isAmplitudeEnable = this.result.getIsAmplitudeEnable();
        boolean zBooleanValue8 = isAmplitudeEnable != null ? isAmplitudeEnable.booleanValue() : false;
        Boolean cryptoDemoTradesEnabled = this.result.getCryptoDemoTradesEnabled();
        boolean zBooleanValue9 = cryptoDemoTradesEnabled != null ? cryptoDemoTradesEnabled.booleanValue() : false;
        Integer cryptoDemoTradesThreshold = this.result.getCryptoDemoTradesThreshold();
        return new FF(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, strValueOf, str, domain, defaultDomain, loginUrl, iIntValue, iIntValue2, str2, minAppVersion, str3, platformPackageName, platformAppLink, r35, arrayList2, zBooleanValue5, depositUrl, depositUrlLite, withdrawUrl, mapG2, mapG3, map, c7362wFA, str4, captchaSiteKey, list, zBooleanValue6, zBooleanValue7, strValueOf2, list2, supportEmail, zBooleanValue8, zBooleanValue9, cryptoDemoTradesThreshold != null ? cryptoDemoTradesThreshold.intValue() : 0);
    }

    public final int hashCode() {
        Result result = this.result;
        if (result == null) {
            return 0;
        }
        return result.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ConfigResponse(result=" + this.result + ")";
    }
}
