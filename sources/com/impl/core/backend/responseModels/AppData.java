package com.impl.core.backend.responseModels;

import defpackage.C1039Gc0;
import defpackage.C1526Mj;
import defpackage.C5491nL;
import defpackage.C5896pG;
import defpackage.C6945uG;
import defpackage.EF0;
import defpackage.IS1;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import defpackage.NF;
import defpackage.PW0;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0005\u001a\u0004\b)\u0010\u0007R\u001c\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0005\u001a\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0005\u001a\u0004\b-\u0010\u0007R\u001c\u0010.\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R(\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0011\u001a\u0004\b2\u0010\u0013R(\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u0013¨\u00065"}, d2 = {"Lcom/impl/core/backend/responseModels/AppData;", "LIt1;", "LuG;", "", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "", "uid", "J", "getUid", "()J", "nickname", "getNickname", "", "countryList", "Ljava/util/Map;", "getCountryList", "()Ljava/util/Map;", "country", "getCountry", "realBalance", "getRealBalance", "", "demoBalance", "Ljava/lang/Double;", "getDemoBalance", "()Ljava/lang/Double;", "", "isEmailVerified", "I", "()I", "isProfileVerified", "", "Lcom/impl/core/backend/responseModels/ServerListItem;", "serversList", "Ljava/util/List;", "getServersList", "()Ljava/util/List;", "currencyCodeMain", "getCurrencyCodeMain", "currencyCodeCurrent", "getCurrencyCodeCurrent", "currencySymbol", "getCurrencySymbol", "isDemoAccount", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "rates", "getRates", "ratesBeauty", "getRatesBeauty", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppData implements InterfaceC1247It1<C6945uG> {

    @NotNull
    private final String country;

    @InterfaceC2691aI1("countryList")
    @Nullable
    private final Map<String, String> countryList;

    @InterfaceC2691aI1("currency_code")
    @Nullable
    private final String currencyCodeCurrent;

    @InterfaceC2691aI1("currency_code_main")
    @Nullable
    private final String currencyCodeMain;

    @InterfaceC2691aI1("currency")
    @Nullable
    private final String currencySymbol;

    @InterfaceC2691aI1("user-demo-balance")
    @Nullable
    private final Double demoBalance;

    @NotNull
    private final String email;

    @InterfaceC2691aI1("is-demo")
    @Nullable
    private final Integer isDemoAccount;

    @InterfaceC2691aI1("isEmailVerified")
    private final int isEmailVerified;

    @InterfaceC2691aI1("isProfileVerified")
    private final int isProfileVerified;

    @Nullable
    private final String nickname;

    @InterfaceC2691aI1("rates")
    @Nullable
    private final Map<String, Double> rates;

    @InterfaceC2691aI1("rates_beauty")
    @Nullable
    private final Map<String, Double> ratesBeauty;

    @InterfaceC2691aI1("user-balance")
    @Nullable
    private final String realBalance;

    @InterfaceC2691aI1("servers-list")
    @NotNull
    private final List<ServerListItem> serversList;
    private final long uid;

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    @Override // defpackage.InterfaceC1247It1
    public final C6945uG a() {
        Object next;
        String upperCase;
        String str;
        String str2;
        Double d;
        String str3 = this.currencyCodeMain;
        String str4 = this.currencyCodeCurrent;
        Integer num = this.isDemoAccount;
        if (num != null && num.intValue() == 1) {
            str4 = null;
        }
        String[] elements = {str3, str4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = C1526Mj.o(elements).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (StringsKt.I((String) next));
        String str5 = (String) next;
        if (str5 != null) {
            upperCase = str5.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase == null) {
                upperCase = "usd".toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
        } else {
            upperCase = "usd".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        String str6 = upperCase;
        String str7 = this.currencySymbol;
        if (str7 == null) {
            str = "$";
        } else {
            str = StringsKt.I(str7) ? null : str7;
            if (str == null) {
                str = "$";
            }
        }
        String str8 = str;
        long j = this.uid;
        String str9 = this.email;
        Map<String, String> map = this.countryList;
        if (map == null || (str2 = map.get(this.country)) == null) {
            str2 = this.country;
        }
        String str10 = str2;
        String str11 = this.realBalance;
        double dDoubleValue = (str11 == null || (d = IS1.d(str11)) == null) ? 0.0d : d.doubleValue();
        Double d2 = this.demoBalance;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        boolean z = this.isEmailVerified != 0;
        boolean z2 = this.isProfileVerified != 0;
        List<ServerListItem> list = this.serversList;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ServerListItem) it2.next()).getServer());
        }
        return new C6945uG(j, str9, "Trader", str10, str8, str6, dDoubleValue, dDoubleValue2, z, z2, "", arrayList, 416);
    }

    @NotNull
    public final NF b() {
        Map mapC = this.rates;
        if (mapC == null) {
            mapC = PW0.c();
        }
        Map mapC2 = this.ratesBeauty;
        if (mapC2 == null) {
            mapC2 = PW0.c();
        }
        return new NF(mapC, mapC2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppData)) {
            return false;
        }
        AppData appData = (AppData) obj;
        return Intrinsics.a(this.email, appData.email) && this.uid == appData.uid && Intrinsics.a(this.nickname, appData.nickname) && Intrinsics.a(this.countryList, appData.countryList) && Intrinsics.a(this.country, appData.country) && Intrinsics.a(this.realBalance, appData.realBalance) && Intrinsics.a(this.demoBalance, appData.demoBalance) && this.isEmailVerified == appData.isEmailVerified && this.isProfileVerified == appData.isProfileVerified && Intrinsics.a(this.serversList, appData.serversList) && Intrinsics.a(this.currencyCodeMain, appData.currencyCodeMain) && Intrinsics.a(this.currencyCodeCurrent, appData.currencyCodeCurrent) && Intrinsics.a(this.currencySymbol, appData.currencySymbol) && Intrinsics.a(this.isDemoAccount, appData.isDemoAccount) && Intrinsics.a(this.rates, appData.rates) && Intrinsics.a(this.ratesBeauty, appData.ratesBeauty);
    }

    public final int hashCode() {
        int iA = C5491nL.a(this.email.hashCode() * 31, 31, this.uid);
        String str = this.nickname;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.countryList;
        int iB = C1039Gc0.b((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.country);
        String str2 = this.realBalance;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.demoBalance;
        int iB2 = C5491nL.b(EF0.a(this.isProfileVerified, EF0.a(this.isEmailVerified, (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31), 31), 31, this.serversList);
        String str3 = this.currencyCodeMain;
        int iHashCode3 = (iB2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyCodeCurrent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencySymbol;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.isDemoAccount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, Double> map2 = this.rates;
        int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Double> map3 = this.ratesBeauty;
        return iHashCode7 + (map3 != null ? map3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.email;
        long j = this.uid;
        String str2 = this.nickname;
        Map<String, String> map = this.countryList;
        String str3 = this.country;
        String str4 = this.realBalance;
        Double d = this.demoBalance;
        int i = this.isEmailVerified;
        int i2 = this.isProfileVerified;
        List<ServerListItem> list = this.serversList;
        String str5 = this.currencyCodeMain;
        String str6 = this.currencyCodeCurrent;
        String str7 = this.currencySymbol;
        Integer num = this.isDemoAccount;
        Map<String, Double> map2 = this.rates;
        Map<String, Double> map3 = this.ratesBeauty;
        StringBuilder sb = new StringBuilder("AppData(email=");
        sb.append(str);
        sb.append(", uid=");
        sb.append(j);
        sb.append(", nickname=");
        sb.append(str2);
        sb.append(", countryList=");
        sb.append(map);
        C5896pG.b(sb, ", country=", str3, ", realBalance=", str4);
        sb.append(", demoBalance=");
        sb.append(d);
        sb.append(", isEmailVerified=");
        sb.append(i);
        sb.append(", isProfileVerified=");
        sb.append(i2);
        sb.append(", serversList=");
        sb.append(list);
        C5896pG.b(sb, ", currencyCodeMain=", str5, ", currencyCodeCurrent=", str6);
        sb.append(", currencySymbol=");
        sb.append(str7);
        sb.append(", isDemoAccount=");
        sb.append(num);
        sb.append(", rates=");
        sb.append(map2);
        sb.append(", ratesBeauty=");
        sb.append(map3);
        sb.append(")");
        return sb.toString();
    }
}
