package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.share.AFInAppEventType;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7770yA1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final ReporterApi b;

    @NotNull
    public final NQ c;

    @NotNull
    public final J22 d;

    @NotNull
    public final O3 e;

    @NotNull
    public final EQ f;

    @NotNull
    public final MR1 g;

    @NotNull
    public final AbstractC2327Wn1 h;

    @NotNull
    public final AbstractC6366rX i;

    @NotNull
    public final AbstractC1787Pr j;

    @NotNull
    public final InterfaceC2152Ui1 k;

    @NotNull
    public final RT0 l;

    @NotNull
    public final AbstractC6505s91 m;

    @NotNull
    public final AbstractC4892kW0 n;

    @NotNull
    public final C4612j90 o;

    @NotNull
    public final OM p;

    /* JADX INFO: renamed from: yA1$a */
    public static final class a {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        @NotNull
        public final String c;

        @NotNull
        public final String d;
        public final long e;

        @NotNull
        public final String f;

        @NotNull
        public final String g;
        public final int h;

        @Nullable
        public final Double i;

        @Nullable
        public final Double j;
        public final boolean k;

        @NotNull
        public final String l;

        @Nullable
        public final Double m;

        @Nullable
        public final Double n;

        @Nullable
        public final Double o;
        public final boolean p;

        @NotNull
        public final String q;

        public a(@NotNull String assetSelectionOnOff, @NotNull String assetSelectionName, @NotNull String tradingStrategy, @NotNull String tradingAsset, long j, @NotNull String currency, @NotNull String technicalIndicator, int i, @Nullable Double d, @Nullable Double d2, boolean z, @NotNull String profitFilter, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, boolean z2, @NotNull String startDealId) {
            Intrinsics.checkNotNullParameter(assetSelectionOnOff, "assetSelectionOnOff");
            Intrinsics.checkNotNullParameter(assetSelectionName, "assetSelectionName");
            Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
            Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
            Intrinsics.checkNotNullParameter(profitFilter, "profitFilter");
            Intrinsics.checkNotNullParameter(startDealId, "startDealId");
            this.a = assetSelectionOnOff;
            this.b = assetSelectionName;
            this.c = tradingStrategy;
            this.d = tradingAsset;
            this.e = j;
            this.f = currency;
            this.g = technicalIndicator;
            this.h = i;
            this.i = d;
            this.j = d2;
            this.k = z;
            this.l = profitFilter;
            this.m = d3;
            this.n = d4;
            this.o = d5;
            this.p = z2;
            this.q = startDealId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b) && Intrinsics.a(this.c, aVar.c) && Intrinsics.a(this.d, aVar.d) && this.e == aVar.e && Intrinsics.a(this.f, aVar.f) && Intrinsics.a(this.g, aVar.g) && this.h == aVar.h && Intrinsics.a(this.i, aVar.i) && Intrinsics.a(this.j, aVar.j) && this.k == aVar.k && Intrinsics.a(this.l, aVar.l) && Intrinsics.a(this.m, aVar.m) && Intrinsics.a(this.n, aVar.n) && Intrinsics.a(this.o, aVar.o) && this.p == aVar.p && Intrinsics.a(this.q, aVar.q);
        }

        public final int hashCode() {
            int iA = EF0.a(this.h, C1039Gc0.b(C1039Gc0.b(C5491nL.a(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
            Double d = this.i;
            int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.j;
            int iB = C1039Gc0.b(C2983be.a((iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31, this.k, 31), 31, this.l);
            Double d3 = this.m;
            int iHashCode2 = (iB + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d4 = this.n;
            int iHashCode3 = (iHashCode2 + (d4 == null ? 0 : d4.hashCode())) * 31;
            Double d5 = this.o;
            return this.q.hashCode() + C2983be.a((iHashCode3 + (d5 != null ? d5.hashCode() : 0)) * 31, this.p, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonTradingProperty(assetSelectionOnOff=");
            sb.append(this.a);
            sb.append(", assetSelectionName=");
            sb.append(this.b);
            sb.append(", tradingStrategy=");
            sb.append(this.c);
            sb.append(", tradingAsset=");
            sb.append(this.d);
            sb.append(", startAmount=");
            sb.append(this.e);
            sb.append(", currency=");
            sb.append(this.f);
            sb.append(", technicalIndicator=");
            sb.append(this.g);
            sb.append(", time=");
            sb.append(this.h);
            sb.append(", startBalance=");
            sb.append(this.i);
            sb.append(", startBalanceUsd=");
            sb.append(this.j);
            sb.append(", lossLimit=");
            sb.append(this.k);
            sb.append(", profitFilter=");
            sb.append(this.l);
            sb.append(", profitFilterSum=");
            sb.append(this.m);
            sb.append(", balance=");
            sb.append(this.n);
            sb.append(", balanceUsd=");
            sb.append(this.o);
            sb.append(", oneClickDeals=");
            sb.append(this.p);
            sb.append(", startDealId=");
            return C5807oq.b(sb, this.q, ")");
        }
    }

    public AbstractC7770yA1(@NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull NQ currentIndicatorProvider, @NotNull J22 currentAssetProvider, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider, @NotNull MR1 strategySelectionUseCase, @NotNull AbstractC2327Wn1 realAmountUseCase, @NotNull AbstractC6366rX demoAmountUseCase, @NotNull AbstractC1787Pr betDurationUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase, @NotNull RT0 lossLimitUseCase, @NotNull AbstractC6505s91 oneClickDealsUseCase, @NotNull AbstractC4892kW0 manualAssetSelectionEnabledUseCase, @NotNull C4612j90 eventsFlowsProvider, @NotNull OM convertCurrencyUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(currentAssetProvider, "currentAssetProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        Intrinsics.checkNotNullParameter(realAmountUseCase, "realAmountUseCase");
        Intrinsics.checkNotNullParameter(demoAmountUseCase, "demoAmountUseCase");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(lossLimitUseCase, "lossLimitUseCase");
        Intrinsics.checkNotNullParameter(oneClickDealsUseCase, "oneClickDealsUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(convertCurrencyUseCase, "convertCurrencyUseCase");
        this.a = appData;
        this.b = reporter;
        this.c = currentIndicatorProvider;
        this.d = currentAssetProvider;
        this.e = accountModeSelectionUseCase;
        this.f = currencySignProvider;
        this.g = strategySelectionUseCase;
        this.h = realAmountUseCase;
        this.i = demoAmountUseCase;
        this.j = betDurationUseCase;
        this.k = profitLimitUseCase;
        this.l = lossLimitUseCase;
        this.m = oneClickDealsUseCase;
        this.n = manualAssetSelectionEnabledUseCase;
        this.o = eventsFlowsProvider;
        this.p = convertCurrencyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0587  */
    /* JADX WARN: Code duplicated, block: B:107:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0623  */
    /* JADX WARN: Code duplicated, block: B:114:0x0678  */
    /* JADX WARN: Code duplicated, block: B:115:0x067b  */
    /* JADX WARN: Code duplicated, block: B:118:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:122:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x0729 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x072a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0755  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x038b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0398  */
    /* JADX WARN: Code duplicated, block: B:38:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0402 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0404 A[PHI: r0 r4 r6 r9 r11 r12 r14 r15 r17
      0x0404: PHI (r0v26 java.lang.String) = (r0v23 java.lang.String), (r0v33 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r4v7 long) = (r4v5 long), (r4v12 long) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r6v16 yA1) = (r6v14 yA1), (r6v20 yA1) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r9v6 boolean) = (r9v4 boolean), (r9v11 boolean) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r11v10 java.lang.Double) = (r11v7 java.lang.Double), (r11v15 java.lang.Double) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r12v12 java.lang.Double) = (r12v9 java.lang.Double), (r12v18 java.lang.Double) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r14v11 java.lang.String) = (r14v8 java.lang.String), (r14v17 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r15v11 java.lang.String) = (r15v7 java.lang.String), (r15v16 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0404: PHI (r17v7 java.lang.String) = (r17v4 java.lang.String), (r17v12 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0407 A[PHI: r0 r4 r6 r9 r11 r12 r14 r15 r17
      0x0407: PHI (r0v27 java.lang.String) = (r0v23 java.lang.String), (r0v33 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r4v8 long) = (r4v5 long), (r4v12 long) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r6v17 yA1) = (r6v14 yA1), (r6v20 yA1) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r9v7 boolean) = (r9v4 boolean), (r9v11 boolean) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r11v11 java.lang.Double) = (r11v7 java.lang.Double), (r11v15 java.lang.Double) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r12v13 java.lang.Double) = (r12v9 java.lang.Double), (r12v18 java.lang.Double) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r14v12 java.lang.String) = (r14v8 java.lang.String), (r14v17 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r15v12 java.lang.String) = (r15v7 java.lang.String), (r15v16 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r17v8 java.lang.String) = (r17v4 java.lang.String), (r17v12 java.lang.String) binds: [B:52:0x0402, B:67:0x0455] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0409 A[PHI: r0 r4 r6 r9 r11 r12 r14 r15 r17 r18
      0x0409: PHI (r0v32 java.lang.String) = (r0v23 java.lang.String), (r0v33 java.lang.String) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r4v11 long) = (r4v5 long), (r4v12 long) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r6v19 yA1) = (r6v14 yA1), (r6v20 yA1) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r9v10 boolean) = (r9v4 boolean), (r9v11 boolean) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r11v14 java.lang.Double) = (r11v7 java.lang.Double), (r11v15 java.lang.Double) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r12v17 java.lang.Double) = (r12v9 java.lang.Double), (r12v18 java.lang.Double) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r14v16 java.lang.String) = (r14v8 java.lang.String), (r14v17 java.lang.String) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r15v15 java.lang.String) = (r15v7 java.lang.String), (r15v16 java.lang.String) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r17v11 java.lang.String) = (r17v4 java.lang.String), (r17v12 java.lang.String) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r18v3 java.lang.String) = (r18v1 java.lang.String), (r18v4 java.lang.String) binds: [B:51:0x0400, B:66:0x0453] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x040f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0419  */
    /* JADX WARN: Code duplicated, block: B:60:0x0421  */
    /* JADX WARN: Code duplicated, block: B:64:0x0443  */
    /* JADX WARN: Code duplicated, block: B:67:0x0455 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0473  */
    /* JADX WARN: Code duplicated, block: B:75:0x0481  */
    /* JADX WARN: Code duplicated, block: B:76:0x0484  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:83:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:84:0x04be  */
    /* JADX WARN: Code duplicated, block: B:87:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:91:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x051a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0547  */
    public final Object a(boolean z, Double d, Double d2, long j, String str, LM lm) {
        C7980zA1 c7980zA1;
        boolean z2;
        Object obj;
        String str2;
        boolean z3;
        AbstractC7770yA1 abstractC7770yA1;
        Double d3;
        Double d4;
        long j2;
        String str3;
        boolean zBooleanValue;
        C4923kf c4923kf;
        String str4;
        String str5;
        Object value;
        Object obj2;
        String str6;
        InterfaceC2152Ui1 interfaceC2152Ui1;
        C6945uG c6945uG;
        Double d5;
        Object objO;
        Double d6;
        String str7;
        Object obj3;
        AbstractC7770yA1 abstractC7770yA2;
        String str8;
        AbstractC7770yA1 abstractC7770yA3;
        C6945uG c6945uG2;
        Object objO2;
        Object obj4;
        AbstractC7770yA1 abstractC7770yA4;
        C6945uG c6945uG3;
        Double d7;
        boolean zBooleanValue2;
        Object objD;
        String str9;
        Double d8;
        String str10;
        Object obj5;
        String str11;
        Double d9;
        boolean zBooleanValue3;
        String str12;
        Object objD2;
        String str13;
        Double d10;
        String str14;
        Object obj6;
        Boolean bool;
        Object objO3;
        String str15;
        String str16;
        Double d11;
        Double d12;
        String str17;
        String str18;
        AbstractC7770yA1 abstractC7770yA5;
        String strB;
        Object objE;
        String str19;
        Object obj7;
        String str20;
        double dLongValue;
        Object objF;
        String str21;
        String str22;
        String str23;
        Double d13;
        String str24;
        double d14;
        String str25;
        double d15;
        long jLongValue;
        String str26;
        String str27;
        Double d16;
        Object objB;
        double d17;
        long j3;
        String str28;
        Object obj8;
        String str29;
        Double d18;
        Double d19;
        long j4;
        String str30;
        String str31;
        Object objO4;
        MN mn;
        long j5;
        MN mn2;
        Object obj9;
        String str32;
        Double d20;
        Double d21;
        String str33;
        String str34;
        String str35;
        boolean z4;
        Double d22;
        String str36;
        double d23;
        int iR;
        String str37;
        Double d24;
        Object objO5;
        MN mn3;
        Double d25;
        Double d26;
        int i;
        String str38;
        Object obj10;
        String str39;
        String str40;
        String str41;
        Double d27;
        boolean z5;
        double d28;
        long j6;
        long j7;
        boolean zBooleanValue4;
        Double d29;
        String str42;
        int i2;
        Object objO6;
        MN mn4;
        Object obj11;
        Double d30;
        boolean z6;
        String str43;
        String str44;
        long j8;
        MN mn5;
        double d31;
        int i3;
        Double d32;
        String str45;
        Double d33;
        boolean z7;
        boolean zBooleanValue5;
        C3279d22 c3279d22;
        String str46;
        int i4;
        Double d34;
        Double d35;
        Object objO7;
        MN mn6;
        boolean z8;
        Double d36;
        boolean z9;
        String str47;
        Double d37;
        String str48;
        String str49;
        String str50;
        long j9;
        int i5;
        Double d38;
        Object obj12;
        String str51;
        String str52;
        a aVar;
        a aVar2;
        if (lm instanceof C7980zA1) {
            c7980zA1 = (C7980zA1) lm;
            int i6 = c7980zA1.x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c7980zA1.x = i6 - Integer.MIN_VALUE;
            } else {
                c7980zA1 = new C7980zA1(this, lm);
            }
        } else {
            c7980zA1 = new C7980zA1(this, lm);
        }
        Object objB2 = c7980zA1.v;
        MN mn7 = MN.d;
        String str53 = "not activated";
        switch (c7980zA1.x) {
            case 0:
                C1795Pt1.b(objB2);
                boolean zBooleanValue6 = ((Boolean) this.a.e.getValue()).booleanValue();
                c7980zA1.d = this;
                c7980zA1.e = d;
                c7980zA1.g = d2;
                c7980zA1.h = str;
                c7980zA1.p = z;
                c7980zA1.s = j;
                c7980zA1.q = zBooleanValue6;
                c7980zA1.x = 1;
                Object objA = this.f.a(false, c7980zA1);
                if (objA != mn7) {
                    z2 = zBooleanValue6;
                    obj = objA;
                    str2 = str;
                    z3 = z;
                    abstractC7770yA1 = this;
                    d3 = d;
                    d4 = d2;
                    j2 = j;
                    str3 = (String) obj;
                    zBooleanValue = ((Boolean) abstractC7770yA1.a.e.getValue()).booleanValue();
                    c4923kf = abstractC7770yA1.a;
                    if (zBooleanValue) {
                        str4 = "off";
                        str5 = "on";
                        value = abstractC7770yA1.e.l().d.getValue();
                        obj2 = EnumC4164hF1.h;
                        str6 = "not activated";
                        interfaceC2152Ui1 = abstractC7770yA1.k;
                        if (value == obj2) {
                            c6945uG2 = (C6945uG) c4923kf.k.getValue();
                            if (c6945uG2 != null) {
                                d6 = new Double(c6945uG2.j);
                            } else {
                                d6 = null;
                            }
                            c7980zA1.d = abstractC7770yA1;
                            c7980zA1.e = str2;
                            c7980zA1.g = str3;
                            c7980zA1.h = d6;
                            c7980zA1.i = d4;
                            c7980zA1.j = abstractC7770yA1;
                            c7980zA1.p = z3;
                            c7980zA1.s = j2;
                            c7980zA1.q = z2;
                            c7980zA1.x = 2;
                            objO2 = C4466ii.o(interfaceC2152Ui1.isEnabled(), c7980zA1);
                            if (objO2 != mn7) {
                                obj4 = objO2;
                                str7 = str3;
                                abstractC7770yA2 = abstractC7770yA1;
                                str8 = str2;
                                abstractC7770yA4 = abstractC7770yA2;
                                zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                abstractC7770yA4.getClass();
                                if (!z2) {
                                    str53 = str6;
                                } else if (zBooleanValue2) {
                                    str53 = str5;
                                } else {
                                    str53 = str4;
                                }
                                str3 = str7;
                                str2 = str8;
                                abstractC7770yA1 = abstractC7770yA2;
                                c7980zA1.d = abstractC7770yA1;
                                c7980zA1.e = str2;
                                c7980zA1.g = str3;
                                c7980zA1.h = d6;
                                c7980zA1.i = str53;
                                c7980zA1.j = d4;
                                c7980zA1.p = z3;
                                c7980zA1.s = j2;
                                c7980zA1.x = 4;
                                objD = abstractC7770yA1.d(c7980zA1);
                                if (objD != mn7) {
                                    str9 = str2;
                                    d8 = d6;
                                    str10 = str3;
                                    obj5 = objD;
                                    str11 = str53;
                                    d9 = d4;
                                    if (((Boolean) obj5).booleanValue()) {
                                        str12 = "best_pair";
                                    } else {
                                        str12 = "manual";
                                    }
                                    c7980zA1.d = abstractC7770yA1;
                                    c7980zA1.e = str9;
                                    c7980zA1.g = str10;
                                    c7980zA1.h = d8;
                                    c7980zA1.i = str11;
                                    c7980zA1.j = d9;
                                    c7980zA1.k = str12;
                                    c7980zA1.p = z3;
                                    c7980zA1.s = j2;
                                    c7980zA1.x = 5;
                                    objD2 = abstractC7770yA1.d(c7980zA1);
                                    if (objD2 != mn7) {
                                        str13 = str11;
                                        d10 = d9;
                                        str14 = str12;
                                        obj6 = objD2;
                                        bool = (Boolean) obj6;
                                        Intrinsics.checkNotNullParameter("", "onNull");
                                        if (Intrinsics.a(bool, Boolean.TRUE)) {
                                            str4 = str5;
                                        } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                                            str4 = "";
                                        }
                                        c7980zA1.d = abstractC7770yA1;
                                        c7980zA1.e = str9;
                                        c7980zA1.g = str10;
                                        c7980zA1.h = d8;
                                        c7980zA1.i = str13;
                                        c7980zA1.j = d10;
                                        c7980zA1.k = str14;
                                        c7980zA1.l = str4;
                                        c7980zA1.p = z3;
                                        c7980zA1.s = j2;
                                        c7980zA1.x = 6;
                                        objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                                        if (objO3 != mn7) {
                                            String str54 = str14;
                                            str15 = str13;
                                            str16 = str54;
                                            d11 = d10;
                                            d12 = d8;
                                            str17 = str10;
                                            str18 = str9;
                                            abstractC7770yA5 = abstractC7770yA1;
                                            strB = ((EnumC2644a42) objO3).b();
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str18;
                                            c7980zA1.g = str17;
                                            c7980zA1.h = d12;
                                            c7980zA1.i = str15;
                                            c7980zA1.j = d11;
                                            c7980zA1.k = str16;
                                            c7980zA1.l = str4;
                                            c7980zA1.m = strB;
                                            c7980zA1.p = z3;
                                            c7980zA1.x = 7;
                                            objE = abstractC7770yA5.e(j2, c7980zA1);
                                            if (objE != mn7) {
                                                str19 = strB;
                                                obj7 = objE;
                                                str20 = str4;
                                                dLongValue = ((Number) obj7).longValue();
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str18;
                                                c7980zA1.g = str17;
                                                c7980zA1.h = d12;
                                                c7980zA1.i = str15;
                                                c7980zA1.j = d11;
                                                c7980zA1.k = str16;
                                                c7980zA1.l = str20;
                                                c7980zA1.m = str19;
                                                c7980zA1.p = z3;
                                                c7980zA1.t = dLongValue;
                                                c7980zA1.x = 8;
                                                objF = abstractC7770yA5.f(c7980zA1);
                                                if (objF != mn7) {
                                                    String str55 = str15;
                                                    str21 = str19;
                                                    str22 = str55;
                                                    str23 = str18;
                                                    d13 = d11;
                                                    String str56 = str17;
                                                    str24 = str16;
                                                    d14 = dLongValue;
                                                    str25 = str56;
                                                    d15 = d14;
                                                    jLongValue = ((Number) objF).longValue();
                                                    OM om = abstractC7770yA5.p;
                                                    c7980zA1.d = abstractC7770yA5;
                                                    c7980zA1.e = str23;
                                                    c7980zA1.g = str25;
                                                    c7980zA1.h = d12;
                                                    c7980zA1.i = str22;
                                                    c7980zA1.j = d13;
                                                    c7980zA1.k = str24;
                                                    c7980zA1.l = str20;
                                                    c7980zA1.m = str21;
                                                    c7980zA1.p = z3;
                                                    str26 = str22;
                                                    str27 = str20;
                                                    c7980zA1.t = d15;
                                                    c7980zA1.s = jLongValue;
                                                    d16 = d12;
                                                    c7980zA1.x = 9;
                                                    objB = om.b(d13, c7980zA1);
                                                    if (objB != mn7) {
                                                        d17 = d15;
                                                        j3 = jLongValue;
                                                        str28 = str26;
                                                        obj8 = objB;
                                                        str29 = str23;
                                                        d18 = d16;
                                                        d19 = (Double) obj8;
                                                        j4 = j3;
                                                        AbstractC1787Pr.a aVar3 = abstractC7770yA5.j.b;
                                                        c7980zA1.d = abstractC7770yA5;
                                                        c7980zA1.e = str29;
                                                        c7980zA1.g = str25;
                                                        c7980zA1.h = d18;
                                                        c7980zA1.i = str28;
                                                        c7980zA1.j = d13;
                                                        c7980zA1.k = str24;
                                                        c7980zA1.l = str27;
                                                        c7980zA1.m = str21;
                                                        c7980zA1.n = d19;
                                                        c7980zA1.p = z3;
                                                        c7980zA1.t = d17;
                                                        str30 = str28;
                                                        str31 = str29;
                                                        c7980zA1.s = j4;
                                                        c7980zA1.x = 10;
                                                        objO4 = C4466ii.o(aVar3, c7980zA1);
                                                        mn = mn7;
                                                        if (objO4 != mn) {
                                                            j5 = j4;
                                                            mn2 = mn;
                                                            obj9 = objO4;
                                                            str32 = str30;
                                                            d20 = d18;
                                                            d21 = d13;
                                                            str33 = str27;
                                                            str34 = str24;
                                                            str35 = str21;
                                                            z4 = z3;
                                                            d22 = d19;
                                                            str36 = str31;
                                                            d23 = d17;
                                                            iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                                            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = abstractC7770yA5.m.l();
                                                            c7980zA1.d = abstractC7770yA5;
                                                            c7980zA1.e = str36;
                                                            c7980zA1.g = str25;
                                                            c7980zA1.h = d20;
                                                            c7980zA1.i = str32;
                                                            c7980zA1.j = d21;
                                                            c7980zA1.k = str34;
                                                            c7980zA1.l = str33;
                                                            c7980zA1.m = str35;
                                                            c7980zA1.n = d22;
                                                            c7980zA1.p = z4;
                                                            c7980zA1.t = d23;
                                                            str37 = str32;
                                                            d24 = d20;
                                                            c7980zA1.s = j5;
                                                            c7980zA1.u = iR;
                                                            c7980zA1.x = 11;
                                                            objO5 = C4466ii.o(interfaceC6396rf0L, c7980zA1);
                                                            mn = mn2;
                                                            if (objO5 != mn) {
                                                                mn3 = mn;
                                                                d25 = d21;
                                                                d26 = d24;
                                                                i = iR;
                                                                str38 = str37;
                                                                obj10 = objO5;
                                                                str39 = str34;
                                                                str40 = str33;
                                                                str41 = str35;
                                                                d27 = d22;
                                                                z5 = z4;
                                                                d28 = d23;
                                                                j6 = j5;
                                                                Boolean bool2 = (Boolean) obj10;
                                                                j7 = j6;
                                                                zBooleanValue4 = bool2.booleanValue();
                                                                InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled = abstractC7770yA5.l.isEnabled();
                                                                c7980zA1.d = abstractC7770yA5;
                                                                c7980zA1.e = str36;
                                                                c7980zA1.g = str25;
                                                                c7980zA1.h = d26;
                                                                c7980zA1.i = str38;
                                                                c7980zA1.j = d25;
                                                                c7980zA1.k = str39;
                                                                c7980zA1.l = str40;
                                                                c7980zA1.m = str41;
                                                                c7980zA1.n = d27;
                                                                c7980zA1.p = z5;
                                                                c7980zA1.t = d28;
                                                                d29 = d25;
                                                                str42 = str39;
                                                                c7980zA1.s = j7;
                                                                i2 = i;
                                                                c7980zA1.u = i2;
                                                                c7980zA1.q = zBooleanValue4;
                                                                c7980zA1.x = 12;
                                                                objO6 = C4466ii.o(interfaceC6396rf0IsEnabled, c7980zA1);
                                                                mn4 = mn3;
                                                                if (objO6 == mn4) {
                                                                    return mn4;
                                                                }
                                                                obj11 = objO6;
                                                                d30 = d27;
                                                                z6 = zBooleanValue4;
                                                                str43 = str40;
                                                                str44 = str42;
                                                                j8 = j7;
                                                                mn5 = mn4;
                                                                d31 = d28;
                                                                i3 = i2;
                                                                d32 = d26;
                                                                str45 = str38;
                                                                d33 = d29;
                                                                Boolean bool3 = (Boolean) obj11;
                                                                z7 = z6;
                                                                zBooleanValue5 = bool3.booleanValue();
                                                                c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                                if (c3279d22 != null) {
                                                                    str46 = "-";
                                                                } else {
                                                                    str46 = "-";
                                                                }
                                                                i4 = i3;
                                                                InterfaceC6396rf0<C1491Lx0> interfaceC6396rf0 = abstractC7770yA5.c.b;
                                                                c7980zA1.d = abstractC7770yA5;
                                                                c7980zA1.e = str36;
                                                                c7980zA1.g = str25;
                                                                c7980zA1.h = d32;
                                                                c7980zA1.i = str45;
                                                                c7980zA1.j = d33;
                                                                c7980zA1.k = str44;
                                                                c7980zA1.l = str43;
                                                                c7980zA1.m = str41;
                                                                c7980zA1.n = d30;
                                                                c7980zA1.o = str46;
                                                                c7980zA1.p = z5;
                                                                c7980zA1.t = d31;
                                                                d34 = d32;
                                                                d35 = d30;
                                                                c7980zA1.s = j8;
                                                                c7980zA1.u = i4;
                                                                c7980zA1.q = z7;
                                                                c7980zA1.r = zBooleanValue5;
                                                                c7980zA1.x = 13;
                                                                objO7 = C4466ii.o(interfaceC6396rf0, c7980zA1);
                                                                mn6 = mn5;
                                                                if (objO7 == mn6) {
                                                                    return mn6;
                                                                }
                                                                z8 = zBooleanValue5;
                                                                d36 = d35;
                                                                z9 = z7;
                                                                str47 = str36;
                                                                d37 = d33;
                                                                str48 = str46;
                                                                str49 = str25;
                                                                str50 = str45;
                                                                j9 = j8;
                                                                i5 = i4;
                                                                d38 = d34;
                                                                obj12 = objO7;
                                                                str51 = str41;
                                                                str52 = str44;
                                                                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                                if (z5) {
                                                                    return aVar;
                                                                }
                                                                OM om2 = abstractC7770yA5.p;
                                                                c7980zA1.d = aVar;
                                                                c7980zA1.e = d38;
                                                                c7980zA1.g = null;
                                                                c7980zA1.h = null;
                                                                c7980zA1.i = null;
                                                                c7980zA1.j = null;
                                                                c7980zA1.k = null;
                                                                c7980zA1.l = null;
                                                                c7980zA1.m = null;
                                                                c7980zA1.n = null;
                                                                c7980zA1.o = null;
                                                                c7980zA1.s = 0L;
                                                                c7980zA1.u = 0;
                                                                c7980zA1.x = 14;
                                                                objB2 = om2.b(d38, c7980zA1);
                                                                if (objB2 == mn6) {
                                                                    return mn6;
                                                                }
                                                                aVar2 = aVar;
                                                                Double d39 = d38;
                                                                Double d40 = (Double) objB2;
                                                                String assetSelectionOnOff = aVar2.a;
                                                                Intrinsics.checkNotNullParameter(assetSelectionOnOff, "assetSelectionOnOff");
                                                                String assetSelectionName = aVar2.b;
                                                                Intrinsics.checkNotNullParameter(assetSelectionName, "assetSelectionName");
                                                                String tradingStrategy = aVar2.c;
                                                                Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                                                                String tradingAsset = aVar2.d;
                                                                Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
                                                                String currency = aVar2.f;
                                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                                String technicalIndicator = aVar2.g;
                                                                Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                                                                String profitFilter = aVar2.l;
                                                                Intrinsics.checkNotNullParameter(profitFilter, "profitFilter");
                                                                String startDealId = aVar2.q;
                                                                Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                                                                return new a(assetSelectionOnOff, assetSelectionName, tradingStrategy, tradingAsset, aVar2.e, currency, technicalIndicator, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter, aVar2.m, d39, d40, aVar2.p, startDealId);
                                                            }
                                                        }
                                                        return mn;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c6945uG = (C6945uG) c4923kf.k.getValue();
                            if (c6945uG != null) {
                                d5 = new Double(c6945uG.k);
                            } else {
                                d5 = null;
                            }
                            c7980zA1.d = abstractC7770yA1;
                            c7980zA1.e = str2;
                            c7980zA1.g = str3;
                            c7980zA1.h = d5;
                            c7980zA1.i = d3;
                            c7980zA1.j = abstractC7770yA1;
                            c7980zA1.p = z3;
                            c7980zA1.s = j2;
                            c7980zA1.q = z2;
                            c7980zA1.x = 3;
                            objO = C4466ii.o(interfaceC2152Ui1.isEnabled(), c7980zA1);
                            if (objO != mn7) {
                                d4 = d3;
                                d6 = d5;
                                str7 = str3;
                                obj3 = objO;
                                abstractC7770yA2 = abstractC7770yA1;
                                str8 = str2;
                                abstractC7770yA3 = abstractC7770yA2;
                                zBooleanValue3 = ((Boolean) obj3).booleanValue();
                                abstractC7770yA3.getClass();
                                if (!z2) {
                                    str53 = str6;
                                } else if (zBooleanValue3) {
                                    str53 = str5;
                                } else {
                                    str53 = str4;
                                }
                                str3 = str7;
                                str2 = str8;
                                abstractC7770yA1 = abstractC7770yA2;
                                c7980zA1.d = abstractC7770yA1;
                                c7980zA1.e = str2;
                                c7980zA1.g = str3;
                                c7980zA1.h = d6;
                                c7980zA1.i = str53;
                                c7980zA1.j = d4;
                                c7980zA1.p = z3;
                                c7980zA1.s = j2;
                                c7980zA1.x = 4;
                                objD = abstractC7770yA1.d(c7980zA1);
                                if (objD != mn7) {
                                    str9 = str2;
                                    d8 = d6;
                                    str10 = str3;
                                    obj5 = objD;
                                    str11 = str53;
                                    d9 = d4;
                                    if (((Boolean) obj5).booleanValue()) {
                                        str12 = "best_pair";
                                    } else {
                                        str12 = "manual";
                                    }
                                    c7980zA1.d = abstractC7770yA1;
                                    c7980zA1.e = str9;
                                    c7980zA1.g = str10;
                                    c7980zA1.h = d8;
                                    c7980zA1.i = str11;
                                    c7980zA1.j = d9;
                                    c7980zA1.k = str12;
                                    c7980zA1.p = z3;
                                    c7980zA1.s = j2;
                                    c7980zA1.x = 5;
                                    objD2 = abstractC7770yA1.d(c7980zA1);
                                    if (objD2 != mn7) {
                                        str13 = str11;
                                        d10 = d9;
                                        str14 = str12;
                                        obj6 = objD2;
                                        bool = (Boolean) obj6;
                                        Intrinsics.checkNotNullParameter("", "onNull");
                                        if (Intrinsics.a(bool, Boolean.TRUE)) {
                                            str4 = str5;
                                        } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                                            str4 = "";
                                        }
                                        c7980zA1.d = abstractC7770yA1;
                                        c7980zA1.e = str9;
                                        c7980zA1.g = str10;
                                        c7980zA1.h = d8;
                                        c7980zA1.i = str13;
                                        c7980zA1.j = d10;
                                        c7980zA1.k = str14;
                                        c7980zA1.l = str4;
                                        c7980zA1.p = z3;
                                        c7980zA1.s = j2;
                                        c7980zA1.x = 6;
                                        objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                                        if (objO3 != mn7) {
                                            String str57 = str14;
                                            str15 = str13;
                                            str16 = str57;
                                            d11 = d10;
                                            d12 = d8;
                                            str17 = str10;
                                            str18 = str9;
                                            abstractC7770yA5 = abstractC7770yA1;
                                            strB = ((EnumC2644a42) objO3).b();
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str18;
                                            c7980zA1.g = str17;
                                            c7980zA1.h = d12;
                                            c7980zA1.i = str15;
                                            c7980zA1.j = d11;
                                            c7980zA1.k = str16;
                                            c7980zA1.l = str4;
                                            c7980zA1.m = strB;
                                            c7980zA1.p = z3;
                                            c7980zA1.x = 7;
                                            objE = abstractC7770yA5.e(j2, c7980zA1);
                                            if (objE != mn7) {
                                                str19 = strB;
                                                obj7 = objE;
                                                str20 = str4;
                                                dLongValue = ((Number) obj7).longValue();
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str18;
                                                c7980zA1.g = str17;
                                                c7980zA1.h = d12;
                                                c7980zA1.i = str15;
                                                c7980zA1.j = d11;
                                                c7980zA1.k = str16;
                                                c7980zA1.l = str20;
                                                c7980zA1.m = str19;
                                                c7980zA1.p = z3;
                                                c7980zA1.t = dLongValue;
                                                c7980zA1.x = 8;
                                                objF = abstractC7770yA5.f(c7980zA1);
                                                if (objF != mn7) {
                                                    String str58 = str15;
                                                    str21 = str19;
                                                    str22 = str58;
                                                    str23 = str18;
                                                    d13 = d11;
                                                    String str59 = str17;
                                                    str24 = str16;
                                                    d14 = dLongValue;
                                                    str25 = str59;
                                                    d15 = d14;
                                                    jLongValue = ((Number) objF).longValue();
                                                    OM om3 = abstractC7770yA5.p;
                                                    c7980zA1.d = abstractC7770yA5;
                                                    c7980zA1.e = str23;
                                                    c7980zA1.g = str25;
                                                    c7980zA1.h = d12;
                                                    c7980zA1.i = str22;
                                                    c7980zA1.j = d13;
                                                    c7980zA1.k = str24;
                                                    c7980zA1.l = str20;
                                                    c7980zA1.m = str21;
                                                    c7980zA1.p = z3;
                                                    str26 = str22;
                                                    str27 = str20;
                                                    c7980zA1.t = d15;
                                                    c7980zA1.s = jLongValue;
                                                    d16 = d12;
                                                    c7980zA1.x = 9;
                                                    objB = om3.b(d13, c7980zA1);
                                                    if (objB != mn7) {
                                                        d17 = d15;
                                                        j3 = jLongValue;
                                                        str28 = str26;
                                                        obj8 = objB;
                                                        str29 = str23;
                                                        d18 = d16;
                                                        d19 = (Double) obj8;
                                                        j4 = j3;
                                                        AbstractC1787Pr.a aVar4 = abstractC7770yA5.j.b;
                                                        c7980zA1.d = abstractC7770yA5;
                                                        c7980zA1.e = str29;
                                                        c7980zA1.g = str25;
                                                        c7980zA1.h = d18;
                                                        c7980zA1.i = str28;
                                                        c7980zA1.j = d13;
                                                        c7980zA1.k = str24;
                                                        c7980zA1.l = str27;
                                                        c7980zA1.m = str21;
                                                        c7980zA1.n = d19;
                                                        c7980zA1.p = z3;
                                                        c7980zA1.t = d17;
                                                        str30 = str28;
                                                        str31 = str29;
                                                        c7980zA1.s = j4;
                                                        c7980zA1.x = 10;
                                                        objO4 = C4466ii.o(aVar4, c7980zA1);
                                                        mn = mn7;
                                                        if (objO4 != mn) {
                                                            j5 = j4;
                                                            mn2 = mn;
                                                            obj9 = objO4;
                                                            str32 = str30;
                                                            d20 = d18;
                                                            d21 = d13;
                                                            str33 = str27;
                                                            str34 = str24;
                                                            str35 = str21;
                                                            z4 = z3;
                                                            d22 = d19;
                                                            str36 = str31;
                                                            d23 = d17;
                                                            iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                                            InterfaceC6396rf0<Boolean> interfaceC6396rf0L2 = abstractC7770yA5.m.l();
                                                            c7980zA1.d = abstractC7770yA5;
                                                            c7980zA1.e = str36;
                                                            c7980zA1.g = str25;
                                                            c7980zA1.h = d20;
                                                            c7980zA1.i = str32;
                                                            c7980zA1.j = d21;
                                                            c7980zA1.k = str34;
                                                            c7980zA1.l = str33;
                                                            c7980zA1.m = str35;
                                                            c7980zA1.n = d22;
                                                            c7980zA1.p = z4;
                                                            c7980zA1.t = d23;
                                                            str37 = str32;
                                                            d24 = d20;
                                                            c7980zA1.s = j5;
                                                            c7980zA1.u = iR;
                                                            c7980zA1.x = 11;
                                                            objO5 = C4466ii.o(interfaceC6396rf0L2, c7980zA1);
                                                            mn = mn2;
                                                            if (objO5 != mn) {
                                                                mn3 = mn;
                                                                d25 = d21;
                                                                d26 = d24;
                                                                i = iR;
                                                                str38 = str37;
                                                                obj10 = objO5;
                                                                str39 = str34;
                                                                str40 = str33;
                                                                str41 = str35;
                                                                d27 = d22;
                                                                z5 = z4;
                                                                d28 = d23;
                                                                j6 = j5;
                                                                Boolean bool4 = (Boolean) obj10;
                                                                j7 = j6;
                                                                zBooleanValue4 = bool4.booleanValue();
                                                                InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled2 = abstractC7770yA5.l.isEnabled();
                                                                c7980zA1.d = abstractC7770yA5;
                                                                c7980zA1.e = str36;
                                                                c7980zA1.g = str25;
                                                                c7980zA1.h = d26;
                                                                c7980zA1.i = str38;
                                                                c7980zA1.j = d25;
                                                                c7980zA1.k = str39;
                                                                c7980zA1.l = str40;
                                                                c7980zA1.m = str41;
                                                                c7980zA1.n = d27;
                                                                c7980zA1.p = z5;
                                                                c7980zA1.t = d28;
                                                                d29 = d25;
                                                                str42 = str39;
                                                                c7980zA1.s = j7;
                                                                i2 = i;
                                                                c7980zA1.u = i2;
                                                                c7980zA1.q = zBooleanValue4;
                                                                c7980zA1.x = 12;
                                                                objO6 = C4466ii.o(interfaceC6396rf0IsEnabled2, c7980zA1);
                                                                mn4 = mn3;
                                                                if (objO6 == mn4) {
                                                                    return mn4;
                                                                }
                                                                obj11 = objO6;
                                                                d30 = d27;
                                                                z6 = zBooleanValue4;
                                                                str43 = str40;
                                                                str44 = str42;
                                                                j8 = j7;
                                                                mn5 = mn4;
                                                                d31 = d28;
                                                                i3 = i2;
                                                                d32 = d26;
                                                                str45 = str38;
                                                                d33 = d29;
                                                                Boolean bool5 = (Boolean) obj11;
                                                                z7 = z6;
                                                                zBooleanValue5 = bool5.booleanValue();
                                                                c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                                if (c3279d22 != null) {
                                                                    str46 = "-";
                                                                } else {
                                                                    str46 = "-";
                                                                }
                                                                i4 = i3;
                                                                InterfaceC6396rf0<C1491Lx0> interfaceC6396rf1 = abstractC7770yA5.c.b;
                                                                c7980zA1.d = abstractC7770yA5;
                                                                c7980zA1.e = str36;
                                                                c7980zA1.g = str25;
                                                                c7980zA1.h = d32;
                                                                c7980zA1.i = str45;
                                                                c7980zA1.j = d33;
                                                                c7980zA1.k = str44;
                                                                c7980zA1.l = str43;
                                                                c7980zA1.m = str41;
                                                                c7980zA1.n = d30;
                                                                c7980zA1.o = str46;
                                                                c7980zA1.p = z5;
                                                                c7980zA1.t = d31;
                                                                d34 = d32;
                                                                d35 = d30;
                                                                c7980zA1.s = j8;
                                                                c7980zA1.u = i4;
                                                                c7980zA1.q = z7;
                                                                c7980zA1.r = zBooleanValue5;
                                                                c7980zA1.x = 13;
                                                                objO7 = C4466ii.o(interfaceC6396rf1, c7980zA1);
                                                                mn6 = mn5;
                                                                if (objO7 == mn6) {
                                                                    return mn6;
                                                                }
                                                                z8 = zBooleanValue5;
                                                                d36 = d35;
                                                                z9 = z7;
                                                                str47 = str36;
                                                                d37 = d33;
                                                                str48 = str46;
                                                                str49 = str25;
                                                                str50 = str45;
                                                                j9 = j8;
                                                                i5 = i4;
                                                                d38 = d34;
                                                                obj12 = objO7;
                                                                str51 = str41;
                                                                str52 = str44;
                                                                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                                if (z5) {
                                                                    return aVar;
                                                                }
                                                                OM om4 = abstractC7770yA5.p;
                                                                c7980zA1.d = aVar;
                                                                c7980zA1.e = d38;
                                                                c7980zA1.g = null;
                                                                c7980zA1.h = null;
                                                                c7980zA1.i = null;
                                                                c7980zA1.j = null;
                                                                c7980zA1.k = null;
                                                                c7980zA1.l = null;
                                                                c7980zA1.m = null;
                                                                c7980zA1.n = null;
                                                                c7980zA1.o = null;
                                                                c7980zA1.s = 0L;
                                                                c7980zA1.u = 0;
                                                                c7980zA1.x = 14;
                                                                objB2 = om4.b(d38, c7980zA1);
                                                                if (objB2 == mn6) {
                                                                    return mn6;
                                                                }
                                                                aVar2 = aVar;
                                                                Double d310 = d38;
                                                                Double d41 = (Double) objB2;
                                                                String assetSelectionOnOff2 = aVar2.a;
                                                                Intrinsics.checkNotNullParameter(assetSelectionOnOff2, "assetSelectionOnOff");
                                                                String assetSelectionName2 = aVar2.b;
                                                                Intrinsics.checkNotNullParameter(assetSelectionName2, "assetSelectionName");
                                                                String tradingStrategy2 = aVar2.c;
                                                                Intrinsics.checkNotNullParameter(tradingStrategy2, "tradingStrategy");
                                                                String tradingAsset2 = aVar2.d;
                                                                Intrinsics.checkNotNullParameter(tradingAsset2, "tradingAsset");
                                                                String currency2 = aVar2.f;
                                                                Intrinsics.checkNotNullParameter(currency2, "currency");
                                                                String technicalIndicator2 = aVar2.g;
                                                                Intrinsics.checkNotNullParameter(technicalIndicator2, "technicalIndicator");
                                                                String profitFilter2 = aVar2.l;
                                                                Intrinsics.checkNotNullParameter(profitFilter2, "profitFilter");
                                                                String startDealId2 = aVar2.q;
                                                                Intrinsics.checkNotNullParameter(startDealId2, "startDealId");
                                                                return new a(assetSelectionOnOff2, assetSelectionName2, tradingStrategy2, tradingAsset2, aVar2.e, currency2, technicalIndicator2, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter2, aVar2.m, d310, d41, aVar2.p, startDealId2);
                                                            }
                                                        }
                                                        return mn;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c6945uG3 = (C6945uG) c4923kf.k.getValue();
                        str4 = "off";
                        str5 = "on";
                        if (c6945uG3 != null) {
                            d7 = new Double(c6945uG3.k);
                        } else {
                            d7 = null;
                        }
                        d4 = d3;
                        d6 = d7;
                        c7980zA1.d = abstractC7770yA1;
                        c7980zA1.e = str2;
                        c7980zA1.g = str3;
                        c7980zA1.h = d6;
                        c7980zA1.i = str53;
                        c7980zA1.j = d4;
                        c7980zA1.p = z3;
                        c7980zA1.s = j2;
                        c7980zA1.x = 4;
                        objD = abstractC7770yA1.d(c7980zA1);
                        if (objD != mn7) {
                            str9 = str2;
                            d8 = d6;
                            str10 = str3;
                            obj5 = objD;
                            str11 = str53;
                            d9 = d4;
                            if (((Boolean) obj5).booleanValue()) {
                                str12 = "best_pair";
                            } else {
                                str12 = "manual";
                            }
                            c7980zA1.d = abstractC7770yA1;
                            c7980zA1.e = str9;
                            c7980zA1.g = str10;
                            c7980zA1.h = d8;
                            c7980zA1.i = str11;
                            c7980zA1.j = d9;
                            c7980zA1.k = str12;
                            c7980zA1.p = z3;
                            c7980zA1.s = j2;
                            c7980zA1.x = 5;
                            objD2 = abstractC7770yA1.d(c7980zA1);
                            if (objD2 != mn7) {
                                str13 = str11;
                                d10 = d9;
                                str14 = str12;
                                obj6 = objD2;
                                bool = (Boolean) obj6;
                                Intrinsics.checkNotNullParameter("", "onNull");
                                if (Intrinsics.a(bool, Boolean.TRUE)) {
                                    str4 = str5;
                                } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                                    str4 = "";
                                }
                                c7980zA1.d = abstractC7770yA1;
                                c7980zA1.e = str9;
                                c7980zA1.g = str10;
                                c7980zA1.h = d8;
                                c7980zA1.i = str13;
                                c7980zA1.j = d10;
                                c7980zA1.k = str14;
                                c7980zA1.l = str4;
                                c7980zA1.p = z3;
                                c7980zA1.s = j2;
                                c7980zA1.x = 6;
                                objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                                if (objO3 != mn7) {
                                    String str510 = str14;
                                    str15 = str13;
                                    str16 = str510;
                                    d11 = d10;
                                    d12 = d8;
                                    str17 = str10;
                                    str18 = str9;
                                    abstractC7770yA5 = abstractC7770yA1;
                                    strB = ((EnumC2644a42) objO3).b();
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str18;
                                    c7980zA1.g = str17;
                                    c7980zA1.h = d12;
                                    c7980zA1.i = str15;
                                    c7980zA1.j = d11;
                                    c7980zA1.k = str16;
                                    c7980zA1.l = str4;
                                    c7980zA1.m = strB;
                                    c7980zA1.p = z3;
                                    c7980zA1.x = 7;
                                    objE = abstractC7770yA5.e(j2, c7980zA1);
                                    if (objE != mn7) {
                                        str19 = strB;
                                        obj7 = objE;
                                        str20 = str4;
                                        dLongValue = ((Number) obj7).longValue();
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str18;
                                        c7980zA1.g = str17;
                                        c7980zA1.h = d12;
                                        c7980zA1.i = str15;
                                        c7980zA1.j = d11;
                                        c7980zA1.k = str16;
                                        c7980zA1.l = str20;
                                        c7980zA1.m = str19;
                                        c7980zA1.p = z3;
                                        c7980zA1.t = dLongValue;
                                        c7980zA1.x = 8;
                                        objF = abstractC7770yA5.f(c7980zA1);
                                        if (objF != mn7) {
                                            String str511 = str15;
                                            str21 = str19;
                                            str22 = str511;
                                            str23 = str18;
                                            d13 = d11;
                                            String str512 = str17;
                                            str24 = str16;
                                            d14 = dLongValue;
                                            str25 = str512;
                                            d15 = d14;
                                            jLongValue = ((Number) objF).longValue();
                                            OM om5 = abstractC7770yA5.p;
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str23;
                                            c7980zA1.g = str25;
                                            c7980zA1.h = d12;
                                            c7980zA1.i = str22;
                                            c7980zA1.j = d13;
                                            c7980zA1.k = str24;
                                            c7980zA1.l = str20;
                                            c7980zA1.m = str21;
                                            c7980zA1.p = z3;
                                            str26 = str22;
                                            str27 = str20;
                                            c7980zA1.t = d15;
                                            c7980zA1.s = jLongValue;
                                            d16 = d12;
                                            c7980zA1.x = 9;
                                            objB = om5.b(d13, c7980zA1);
                                            if (objB != mn7) {
                                                d17 = d15;
                                                j3 = jLongValue;
                                                str28 = str26;
                                                obj8 = objB;
                                                str29 = str23;
                                                d18 = d16;
                                                d19 = (Double) obj8;
                                                j4 = j3;
                                                AbstractC1787Pr.a aVar5 = abstractC7770yA5.j.b;
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str29;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d18;
                                                c7980zA1.i = str28;
                                                c7980zA1.j = d13;
                                                c7980zA1.k = str24;
                                                c7980zA1.l = str27;
                                                c7980zA1.m = str21;
                                                c7980zA1.n = d19;
                                                c7980zA1.p = z3;
                                                c7980zA1.t = d17;
                                                str30 = str28;
                                                str31 = str29;
                                                c7980zA1.s = j4;
                                                c7980zA1.x = 10;
                                                objO4 = C4466ii.o(aVar5, c7980zA1);
                                                mn = mn7;
                                                if (objO4 != mn) {
                                                    j5 = j4;
                                                    mn2 = mn;
                                                    obj9 = objO4;
                                                    str32 = str30;
                                                    d20 = d18;
                                                    d21 = d13;
                                                    str33 = str27;
                                                    str34 = str24;
                                                    str35 = str21;
                                                    z4 = z3;
                                                    d22 = d19;
                                                    str36 = str31;
                                                    d23 = d17;
                                                    iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                                    InterfaceC6396rf0<Boolean> interfaceC6396rf0L3 = abstractC7770yA5.m.l();
                                                    c7980zA1.d = abstractC7770yA5;
                                                    c7980zA1.e = str36;
                                                    c7980zA1.g = str25;
                                                    c7980zA1.h = d20;
                                                    c7980zA1.i = str32;
                                                    c7980zA1.j = d21;
                                                    c7980zA1.k = str34;
                                                    c7980zA1.l = str33;
                                                    c7980zA1.m = str35;
                                                    c7980zA1.n = d22;
                                                    c7980zA1.p = z4;
                                                    c7980zA1.t = d23;
                                                    str37 = str32;
                                                    d24 = d20;
                                                    c7980zA1.s = j5;
                                                    c7980zA1.u = iR;
                                                    c7980zA1.x = 11;
                                                    objO5 = C4466ii.o(interfaceC6396rf0L3, c7980zA1);
                                                    mn = mn2;
                                                    if (objO5 != mn) {
                                                        mn3 = mn;
                                                        d25 = d21;
                                                        d26 = d24;
                                                        i = iR;
                                                        str38 = str37;
                                                        obj10 = objO5;
                                                        str39 = str34;
                                                        str40 = str33;
                                                        str41 = str35;
                                                        d27 = d22;
                                                        z5 = z4;
                                                        d28 = d23;
                                                        j6 = j5;
                                                        Boolean bool6 = (Boolean) obj10;
                                                        j7 = j6;
                                                        zBooleanValue4 = bool6.booleanValue();
                                                        InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled3 = abstractC7770yA5.l.isEnabled();
                                                        c7980zA1.d = abstractC7770yA5;
                                                        c7980zA1.e = str36;
                                                        c7980zA1.g = str25;
                                                        c7980zA1.h = d26;
                                                        c7980zA1.i = str38;
                                                        c7980zA1.j = d25;
                                                        c7980zA1.k = str39;
                                                        c7980zA1.l = str40;
                                                        c7980zA1.m = str41;
                                                        c7980zA1.n = d27;
                                                        c7980zA1.p = z5;
                                                        c7980zA1.t = d28;
                                                        d29 = d25;
                                                        str42 = str39;
                                                        c7980zA1.s = j7;
                                                        i2 = i;
                                                        c7980zA1.u = i2;
                                                        c7980zA1.q = zBooleanValue4;
                                                        c7980zA1.x = 12;
                                                        objO6 = C4466ii.o(interfaceC6396rf0IsEnabled3, c7980zA1);
                                                        mn4 = mn3;
                                                        if (objO6 == mn4) {
                                                            return mn4;
                                                        }
                                                        obj11 = objO6;
                                                        d30 = d27;
                                                        z6 = zBooleanValue4;
                                                        str43 = str40;
                                                        str44 = str42;
                                                        j8 = j7;
                                                        mn5 = mn4;
                                                        d31 = d28;
                                                        i3 = i2;
                                                        d32 = d26;
                                                        str45 = str38;
                                                        d33 = d29;
                                                        Boolean bool7 = (Boolean) obj11;
                                                        z7 = z6;
                                                        zBooleanValue5 = bool7.booleanValue();
                                                        c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                        if (c3279d22 != null || (str46 = c3279d22.l) == null) {
                                                            str46 = "-";
                                                        }
                                                        i4 = i3;
                                                        InterfaceC6396rf0<C1491Lx0> interfaceC6396rf2 = abstractC7770yA5.c.b;
                                                        c7980zA1.d = abstractC7770yA5;
                                                        c7980zA1.e = str36;
                                                        c7980zA1.g = str25;
                                                        c7980zA1.h = d32;
                                                        c7980zA1.i = str45;
                                                        c7980zA1.j = d33;
                                                        c7980zA1.k = str44;
                                                        c7980zA1.l = str43;
                                                        c7980zA1.m = str41;
                                                        c7980zA1.n = d30;
                                                        c7980zA1.o = str46;
                                                        c7980zA1.p = z5;
                                                        c7980zA1.t = d31;
                                                        d34 = d32;
                                                        d35 = d30;
                                                        c7980zA1.s = j8;
                                                        c7980zA1.u = i4;
                                                        c7980zA1.q = z7;
                                                        c7980zA1.r = zBooleanValue5;
                                                        c7980zA1.x = 13;
                                                        objO7 = C4466ii.o(interfaceC6396rf2, c7980zA1);
                                                        mn6 = mn5;
                                                        if (objO7 == mn6) {
                                                            return mn6;
                                                        }
                                                        z8 = zBooleanValue5;
                                                        d36 = d35;
                                                        z9 = z7;
                                                        str47 = str36;
                                                        d37 = d33;
                                                        str48 = str46;
                                                        str49 = str25;
                                                        str50 = str45;
                                                        j9 = j8;
                                                        i5 = i4;
                                                        d38 = d34;
                                                        obj12 = objO7;
                                                        str51 = str41;
                                                        str52 = str44;
                                                        aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                        if (z5) {
                                                            return aVar;
                                                        }
                                                        OM om6 = abstractC7770yA5.p;
                                                        c7980zA1.d = aVar;
                                                        c7980zA1.e = d38;
                                                        c7980zA1.g = null;
                                                        c7980zA1.h = null;
                                                        c7980zA1.i = null;
                                                        c7980zA1.j = null;
                                                        c7980zA1.k = null;
                                                        c7980zA1.l = null;
                                                        c7980zA1.m = null;
                                                        c7980zA1.n = null;
                                                        c7980zA1.o = null;
                                                        c7980zA1.s = 0L;
                                                        c7980zA1.u = 0;
                                                        c7980zA1.x = 14;
                                                        objB2 = om6.b(d38, c7980zA1);
                                                        if (objB2 == mn6) {
                                                            return mn6;
                                                        }
                                                        aVar2 = aVar;
                                                        Double d311 = d38;
                                                        Double d42 = (Double) objB2;
                                                        String assetSelectionOnOff3 = aVar2.a;
                                                        Intrinsics.checkNotNullParameter(assetSelectionOnOff3, "assetSelectionOnOff");
                                                        String assetSelectionName3 = aVar2.b;
                                                        Intrinsics.checkNotNullParameter(assetSelectionName3, "assetSelectionName");
                                                        String tradingStrategy3 = aVar2.c;
                                                        Intrinsics.checkNotNullParameter(tradingStrategy3, "tradingStrategy");
                                                        String tradingAsset3 = aVar2.d;
                                                        Intrinsics.checkNotNullParameter(tradingAsset3, "tradingAsset");
                                                        String currency3 = aVar2.f;
                                                        Intrinsics.checkNotNullParameter(currency3, "currency");
                                                        String technicalIndicator3 = aVar2.g;
                                                        Intrinsics.checkNotNullParameter(technicalIndicator3, "technicalIndicator");
                                                        String profitFilter3 = aVar2.l;
                                                        Intrinsics.checkNotNullParameter(profitFilter3, "profitFilter");
                                                        String startDealId3 = aVar2.q;
                                                        Intrinsics.checkNotNullParameter(startDealId3, "startDealId");
                                                        return new a(assetSelectionOnOff3, assetSelectionName3, tradingStrategy3, tradingAsset3, aVar2.e, currency3, technicalIndicator3, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter3, aVar2.m, d311, d42, aVar2.p, startDealId3);
                                                    }
                                                }
                                                return mn;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return mn7;
            case 1:
                boolean z10 = c7980zA1.q;
                j2 = c7980zA1.s;
                z3 = c7980zA1.p;
                str2 = (String) c7980zA1.h;
                d4 = (Double) c7980zA1.g;
                d3 = (Double) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA6 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                abstractC7770yA1 = abstractC7770yA6;
                z2 = z10;
                obj = objB2;
                str3 = (String) obj;
                zBooleanValue = ((Boolean) abstractC7770yA1.a.e.getValue()).booleanValue();
                c4923kf = abstractC7770yA1.a;
                if (zBooleanValue) {
                    c6945uG3 = (C6945uG) c4923kf.k.getValue();
                    str4 = "off";
                    str5 = "on";
                    if (c6945uG3 != null) {
                        d7 = new Double(c6945uG3.k);
                    } else {
                        d7 = null;
                    }
                    d4 = d3;
                    d6 = d7;
                    c7980zA1.d = abstractC7770yA1;
                    c7980zA1.e = str2;
                    c7980zA1.g = str3;
                    c7980zA1.h = d6;
                    c7980zA1.i = str53;
                    c7980zA1.j = d4;
                    c7980zA1.p = z3;
                    c7980zA1.s = j2;
                    c7980zA1.x = 4;
                    objD = abstractC7770yA1.d(c7980zA1);
                    if (objD != mn7) {
                        str9 = str2;
                        d8 = d6;
                        str10 = str3;
                        obj5 = objD;
                        str11 = str53;
                        d9 = d4;
                        if (((Boolean) obj5).booleanValue()) {
                            str12 = "best_pair";
                        } else {
                            str12 = "manual";
                        }
                        c7980zA1.d = abstractC7770yA1;
                        c7980zA1.e = str9;
                        c7980zA1.g = str10;
                        c7980zA1.h = d8;
                        c7980zA1.i = str11;
                        c7980zA1.j = d9;
                        c7980zA1.k = str12;
                        c7980zA1.p = z3;
                        c7980zA1.s = j2;
                        c7980zA1.x = 5;
                        objD2 = abstractC7770yA1.d(c7980zA1);
                        if (objD2 != mn7) {
                            str13 = str11;
                            d10 = d9;
                            str14 = str12;
                            obj6 = objD2;
                            bool = (Boolean) obj6;
                            Intrinsics.checkNotNullParameter("", "onNull");
                            if (Intrinsics.a(bool, Boolean.TRUE)) {
                                str4 = str5;
                            } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                                str4 = "";
                            }
                            c7980zA1.d = abstractC7770yA1;
                            c7980zA1.e = str9;
                            c7980zA1.g = str10;
                            c7980zA1.h = d8;
                            c7980zA1.i = str13;
                            c7980zA1.j = d10;
                            c7980zA1.k = str14;
                            c7980zA1.l = str4;
                            c7980zA1.p = z3;
                            c7980zA1.s = j2;
                            c7980zA1.x = 6;
                            objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                            if (objO3 != mn7) {
                                String str513 = str14;
                                str15 = str13;
                                str16 = str513;
                                d11 = d10;
                                d12 = d8;
                                str17 = str10;
                                str18 = str9;
                                abstractC7770yA5 = abstractC7770yA1;
                                strB = ((EnumC2644a42) objO3).b();
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str18;
                                c7980zA1.g = str17;
                                c7980zA1.h = d12;
                                c7980zA1.i = str15;
                                c7980zA1.j = d11;
                                c7980zA1.k = str16;
                                c7980zA1.l = str4;
                                c7980zA1.m = strB;
                                c7980zA1.p = z3;
                                c7980zA1.x = 7;
                                objE = abstractC7770yA5.e(j2, c7980zA1);
                                if (objE != mn7) {
                                    str19 = strB;
                                    obj7 = objE;
                                    str20 = str4;
                                    dLongValue = ((Number) obj7).longValue();
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str18;
                                    c7980zA1.g = str17;
                                    c7980zA1.h = d12;
                                    c7980zA1.i = str15;
                                    c7980zA1.j = d11;
                                    c7980zA1.k = str16;
                                    c7980zA1.l = str20;
                                    c7980zA1.m = str19;
                                    c7980zA1.p = z3;
                                    c7980zA1.t = dLongValue;
                                    c7980zA1.x = 8;
                                    objF = abstractC7770yA5.f(c7980zA1);
                                    if (objF != mn7) {
                                        String str514 = str15;
                                        str21 = str19;
                                        str22 = str514;
                                        str23 = str18;
                                        d13 = d11;
                                        String str515 = str17;
                                        str24 = str16;
                                        d14 = dLongValue;
                                        str25 = str515;
                                        d15 = d14;
                                        jLongValue = ((Number) objF).longValue();
                                        OM om7 = abstractC7770yA5.p;
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str23;
                                        c7980zA1.g = str25;
                                        c7980zA1.h = d12;
                                        c7980zA1.i = str22;
                                        c7980zA1.j = d13;
                                        c7980zA1.k = str24;
                                        c7980zA1.l = str20;
                                        c7980zA1.m = str21;
                                        c7980zA1.p = z3;
                                        str26 = str22;
                                        str27 = str20;
                                        c7980zA1.t = d15;
                                        c7980zA1.s = jLongValue;
                                        d16 = d12;
                                        c7980zA1.x = 9;
                                        objB = om7.b(d13, c7980zA1);
                                        if (objB != mn7) {
                                            d17 = d15;
                                            j3 = jLongValue;
                                            str28 = str26;
                                            obj8 = objB;
                                            str29 = str23;
                                            d18 = d16;
                                            d19 = (Double) obj8;
                                            j4 = j3;
                                            AbstractC1787Pr.a aVar6 = abstractC7770yA5.j.b;
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str29;
                                            c7980zA1.g = str25;
                                            c7980zA1.h = d18;
                                            c7980zA1.i = str28;
                                            c7980zA1.j = d13;
                                            c7980zA1.k = str24;
                                            c7980zA1.l = str27;
                                            c7980zA1.m = str21;
                                            c7980zA1.n = d19;
                                            c7980zA1.p = z3;
                                            c7980zA1.t = d17;
                                            str30 = str28;
                                            str31 = str29;
                                            c7980zA1.s = j4;
                                            c7980zA1.x = 10;
                                            objO4 = C4466ii.o(aVar6, c7980zA1);
                                            mn = mn7;
                                            if (objO4 != mn) {
                                                j5 = j4;
                                                mn2 = mn;
                                                obj9 = objO4;
                                                str32 = str30;
                                                d20 = d18;
                                                d21 = d13;
                                                str33 = str27;
                                                str34 = str24;
                                                str35 = str21;
                                                z4 = z3;
                                                d22 = d19;
                                                str36 = str31;
                                                d23 = d17;
                                                iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                                InterfaceC6396rf0<Boolean> interfaceC6396rf0L4 = abstractC7770yA5.m.l();
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str36;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d20;
                                                c7980zA1.i = str32;
                                                c7980zA1.j = d21;
                                                c7980zA1.k = str34;
                                                c7980zA1.l = str33;
                                                c7980zA1.m = str35;
                                                c7980zA1.n = d22;
                                                c7980zA1.p = z4;
                                                c7980zA1.t = d23;
                                                str37 = str32;
                                                d24 = d20;
                                                c7980zA1.s = j5;
                                                c7980zA1.u = iR;
                                                c7980zA1.x = 11;
                                                objO5 = C4466ii.o(interfaceC6396rf0L4, c7980zA1);
                                                mn = mn2;
                                                if (objO5 != mn) {
                                                    mn3 = mn;
                                                    d25 = d21;
                                                    d26 = d24;
                                                    i = iR;
                                                    str38 = str37;
                                                    obj10 = objO5;
                                                    str39 = str34;
                                                    str40 = str33;
                                                    str41 = str35;
                                                    d27 = d22;
                                                    z5 = z4;
                                                    d28 = d23;
                                                    j6 = j5;
                                                    Boolean bool8 = (Boolean) obj10;
                                                    j7 = j6;
                                                    zBooleanValue4 = bool8.booleanValue();
                                                    InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled4 = abstractC7770yA5.l.isEnabled();
                                                    c7980zA1.d = abstractC7770yA5;
                                                    c7980zA1.e = str36;
                                                    c7980zA1.g = str25;
                                                    c7980zA1.h = d26;
                                                    c7980zA1.i = str38;
                                                    c7980zA1.j = d25;
                                                    c7980zA1.k = str39;
                                                    c7980zA1.l = str40;
                                                    c7980zA1.m = str41;
                                                    c7980zA1.n = d27;
                                                    c7980zA1.p = z5;
                                                    c7980zA1.t = d28;
                                                    d29 = d25;
                                                    str42 = str39;
                                                    c7980zA1.s = j7;
                                                    i2 = i;
                                                    c7980zA1.u = i2;
                                                    c7980zA1.q = zBooleanValue4;
                                                    c7980zA1.x = 12;
                                                    objO6 = C4466ii.o(interfaceC6396rf0IsEnabled4, c7980zA1);
                                                    mn4 = mn3;
                                                    if (objO6 == mn4) {
                                                        return mn4;
                                                    }
                                                    obj11 = objO6;
                                                    d30 = d27;
                                                    z6 = zBooleanValue4;
                                                    str43 = str40;
                                                    str44 = str42;
                                                    j8 = j7;
                                                    mn5 = mn4;
                                                    d31 = d28;
                                                    i3 = i2;
                                                    d32 = d26;
                                                    str45 = str38;
                                                    d33 = d29;
                                                    Boolean bool9 = (Boolean) obj11;
                                                    z7 = z6;
                                                    zBooleanValue5 = bool9.booleanValue();
                                                    c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                    if (c3279d22 != null) {
                                                        str46 = "-";
                                                    } else {
                                                        str46 = "-";
                                                    }
                                                    i4 = i3;
                                                    InterfaceC6396rf0<C1491Lx0> interfaceC6396rf3 = abstractC7770yA5.c.b;
                                                    c7980zA1.d = abstractC7770yA5;
                                                    c7980zA1.e = str36;
                                                    c7980zA1.g = str25;
                                                    c7980zA1.h = d32;
                                                    c7980zA1.i = str45;
                                                    c7980zA1.j = d33;
                                                    c7980zA1.k = str44;
                                                    c7980zA1.l = str43;
                                                    c7980zA1.m = str41;
                                                    c7980zA1.n = d30;
                                                    c7980zA1.o = str46;
                                                    c7980zA1.p = z5;
                                                    c7980zA1.t = d31;
                                                    d34 = d32;
                                                    d35 = d30;
                                                    c7980zA1.s = j8;
                                                    c7980zA1.u = i4;
                                                    c7980zA1.q = z7;
                                                    c7980zA1.r = zBooleanValue5;
                                                    c7980zA1.x = 13;
                                                    objO7 = C4466ii.o(interfaceC6396rf3, c7980zA1);
                                                    mn6 = mn5;
                                                    if (objO7 == mn6) {
                                                        return mn6;
                                                    }
                                                    z8 = zBooleanValue5;
                                                    d36 = d35;
                                                    z9 = z7;
                                                    str47 = str36;
                                                    d37 = d33;
                                                    str48 = str46;
                                                    str49 = str25;
                                                    str50 = str45;
                                                    j9 = j8;
                                                    i5 = i4;
                                                    d38 = d34;
                                                    obj12 = objO7;
                                                    str51 = str41;
                                                    str52 = str44;
                                                    aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                    if (z5) {
                                                        return aVar;
                                                    }
                                                    OM om8 = abstractC7770yA5.p;
                                                    c7980zA1.d = aVar;
                                                    c7980zA1.e = d38;
                                                    c7980zA1.g = null;
                                                    c7980zA1.h = null;
                                                    c7980zA1.i = null;
                                                    c7980zA1.j = null;
                                                    c7980zA1.k = null;
                                                    c7980zA1.l = null;
                                                    c7980zA1.m = null;
                                                    c7980zA1.n = null;
                                                    c7980zA1.o = null;
                                                    c7980zA1.s = 0L;
                                                    c7980zA1.u = 0;
                                                    c7980zA1.x = 14;
                                                    objB2 = om8.b(d38, c7980zA1);
                                                    if (objB2 == mn6) {
                                                        return mn6;
                                                    }
                                                    aVar2 = aVar;
                                                    Double d312 = d38;
                                                    Double d43 = (Double) objB2;
                                                    String assetSelectionOnOff4 = aVar2.a;
                                                    Intrinsics.checkNotNullParameter(assetSelectionOnOff4, "assetSelectionOnOff");
                                                    String assetSelectionName4 = aVar2.b;
                                                    Intrinsics.checkNotNullParameter(assetSelectionName4, "assetSelectionName");
                                                    String tradingStrategy4 = aVar2.c;
                                                    Intrinsics.checkNotNullParameter(tradingStrategy4, "tradingStrategy");
                                                    String tradingAsset4 = aVar2.d;
                                                    Intrinsics.checkNotNullParameter(tradingAsset4, "tradingAsset");
                                                    String currency4 = aVar2.f;
                                                    Intrinsics.checkNotNullParameter(currency4, "currency");
                                                    String technicalIndicator4 = aVar2.g;
                                                    Intrinsics.checkNotNullParameter(technicalIndicator4, "technicalIndicator");
                                                    String profitFilter4 = aVar2.l;
                                                    Intrinsics.checkNotNullParameter(profitFilter4, "profitFilter");
                                                    String startDealId4 = aVar2.q;
                                                    Intrinsics.checkNotNullParameter(startDealId4, "startDealId");
                                                    return new a(assetSelectionOnOff4, assetSelectionName4, tradingStrategy4, tradingAsset4, aVar2.e, currency4, technicalIndicator4, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter4, aVar2.m, d312, d43, aVar2.p, startDealId4);
                                                }
                                            }
                                            return mn;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str4 = "off";
                    str5 = "on";
                    value = abstractC7770yA1.e.l().d.getValue();
                    obj2 = EnumC4164hF1.h;
                    str6 = "not activated";
                    interfaceC2152Ui1 = abstractC7770yA1.k;
                    if (value == obj2) {
                        c6945uG2 = (C6945uG) c4923kf.k.getValue();
                        if (c6945uG2 != null) {
                            d6 = new Double(c6945uG2.j);
                        } else {
                            d6 = null;
                        }
                        c7980zA1.d = abstractC7770yA1;
                        c7980zA1.e = str2;
                        c7980zA1.g = str3;
                        c7980zA1.h = d6;
                        c7980zA1.i = d4;
                        c7980zA1.j = abstractC7770yA1;
                        c7980zA1.p = z3;
                        c7980zA1.s = j2;
                        c7980zA1.q = z2;
                        c7980zA1.x = 2;
                        objO2 = C4466ii.o(interfaceC2152Ui1.isEnabled(), c7980zA1);
                        if (objO2 != mn7) {
                            obj4 = objO2;
                            str7 = str3;
                            abstractC7770yA2 = abstractC7770yA1;
                            str8 = str2;
                            abstractC7770yA4 = abstractC7770yA2;
                            zBooleanValue2 = ((Boolean) obj4).booleanValue();
                            abstractC7770yA4.getClass();
                            if (!z2) {
                                str53 = str6;
                            } else if (zBooleanValue2) {
                                str53 = str5;
                            } else {
                                str53 = str4;
                            }
                            str3 = str7;
                            str2 = str8;
                            abstractC7770yA1 = abstractC7770yA2;
                            c7980zA1.d = abstractC7770yA1;
                            c7980zA1.e = str2;
                            c7980zA1.g = str3;
                            c7980zA1.h = d6;
                            c7980zA1.i = str53;
                            c7980zA1.j = d4;
                            c7980zA1.p = z3;
                            c7980zA1.s = j2;
                            c7980zA1.x = 4;
                            objD = abstractC7770yA1.d(c7980zA1);
                            if (objD != mn7) {
                                str9 = str2;
                                d8 = d6;
                                str10 = str3;
                                obj5 = objD;
                                str11 = str53;
                                d9 = d4;
                                if (((Boolean) obj5).booleanValue()) {
                                    str12 = "best_pair";
                                } else {
                                    str12 = "manual";
                                }
                                c7980zA1.d = abstractC7770yA1;
                                c7980zA1.e = str9;
                                c7980zA1.g = str10;
                                c7980zA1.h = d8;
                                c7980zA1.i = str11;
                                c7980zA1.j = d9;
                                c7980zA1.k = str12;
                                c7980zA1.p = z3;
                                c7980zA1.s = j2;
                                c7980zA1.x = 5;
                                objD2 = abstractC7770yA1.d(c7980zA1);
                                if (objD2 != mn7) {
                                    str13 = str11;
                                    d10 = d9;
                                    str14 = str12;
                                    obj6 = objD2;
                                    bool = (Boolean) obj6;
                                    Intrinsics.checkNotNullParameter("", "onNull");
                                    if (Intrinsics.a(bool, Boolean.TRUE)) {
                                        str4 = str5;
                                    } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                                        str4 = "";
                                    }
                                    c7980zA1.d = abstractC7770yA1;
                                    c7980zA1.e = str9;
                                    c7980zA1.g = str10;
                                    c7980zA1.h = d8;
                                    c7980zA1.i = str13;
                                    c7980zA1.j = d10;
                                    c7980zA1.k = str14;
                                    c7980zA1.l = str4;
                                    c7980zA1.p = z3;
                                    c7980zA1.s = j2;
                                    c7980zA1.x = 6;
                                    objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                                    if (objO3 != mn7) {
                                        String str516 = str14;
                                        str15 = str13;
                                        str16 = str516;
                                        d11 = d10;
                                        d12 = d8;
                                        str17 = str10;
                                        str18 = str9;
                                        abstractC7770yA5 = abstractC7770yA1;
                                        strB = ((EnumC2644a42) objO3).b();
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str18;
                                        c7980zA1.g = str17;
                                        c7980zA1.h = d12;
                                        c7980zA1.i = str15;
                                        c7980zA1.j = d11;
                                        c7980zA1.k = str16;
                                        c7980zA1.l = str4;
                                        c7980zA1.m = strB;
                                        c7980zA1.p = z3;
                                        c7980zA1.x = 7;
                                        objE = abstractC7770yA5.e(j2, c7980zA1);
                                        if (objE != mn7) {
                                            str19 = strB;
                                            obj7 = objE;
                                            str20 = str4;
                                            dLongValue = ((Number) obj7).longValue();
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str18;
                                            c7980zA1.g = str17;
                                            c7980zA1.h = d12;
                                            c7980zA1.i = str15;
                                            c7980zA1.j = d11;
                                            c7980zA1.k = str16;
                                            c7980zA1.l = str20;
                                            c7980zA1.m = str19;
                                            c7980zA1.p = z3;
                                            c7980zA1.t = dLongValue;
                                            c7980zA1.x = 8;
                                            objF = abstractC7770yA5.f(c7980zA1);
                                            if (objF != mn7) {
                                                String str517 = str15;
                                                str21 = str19;
                                                str22 = str517;
                                                str23 = str18;
                                                d13 = d11;
                                                String str518 = str17;
                                                str24 = str16;
                                                d14 = dLongValue;
                                                str25 = str518;
                                                d15 = d14;
                                                jLongValue = ((Number) objF).longValue();
                                                OM om9 = abstractC7770yA5.p;
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str23;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d12;
                                                c7980zA1.i = str22;
                                                c7980zA1.j = d13;
                                                c7980zA1.k = str24;
                                                c7980zA1.l = str20;
                                                c7980zA1.m = str21;
                                                c7980zA1.p = z3;
                                                str26 = str22;
                                                str27 = str20;
                                                c7980zA1.t = d15;
                                                c7980zA1.s = jLongValue;
                                                d16 = d12;
                                                c7980zA1.x = 9;
                                                objB = om9.b(d13, c7980zA1);
                                                if (objB != mn7) {
                                                    d17 = d15;
                                                    j3 = jLongValue;
                                                    str28 = str26;
                                                    obj8 = objB;
                                                    str29 = str23;
                                                    d18 = d16;
                                                    d19 = (Double) obj8;
                                                    j4 = j3;
                                                    AbstractC1787Pr.a aVar7 = abstractC7770yA5.j.b;
                                                    c7980zA1.d = abstractC7770yA5;
                                                    c7980zA1.e = str29;
                                                    c7980zA1.g = str25;
                                                    c7980zA1.h = d18;
                                                    c7980zA1.i = str28;
                                                    c7980zA1.j = d13;
                                                    c7980zA1.k = str24;
                                                    c7980zA1.l = str27;
                                                    c7980zA1.m = str21;
                                                    c7980zA1.n = d19;
                                                    c7980zA1.p = z3;
                                                    c7980zA1.t = d17;
                                                    str30 = str28;
                                                    str31 = str29;
                                                    c7980zA1.s = j4;
                                                    c7980zA1.x = 10;
                                                    objO4 = C4466ii.o(aVar7, c7980zA1);
                                                    mn = mn7;
                                                    if (objO4 != mn) {
                                                        j5 = j4;
                                                        mn2 = mn;
                                                        obj9 = objO4;
                                                        str32 = str30;
                                                        d20 = d18;
                                                        d21 = d13;
                                                        str33 = str27;
                                                        str34 = str24;
                                                        str35 = str21;
                                                        z4 = z3;
                                                        d22 = d19;
                                                        str36 = str31;
                                                        d23 = d17;
                                                        iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                                        InterfaceC6396rf0<Boolean> interfaceC6396rf0L5 = abstractC7770yA5.m.l();
                                                        c7980zA1.d = abstractC7770yA5;
                                                        c7980zA1.e = str36;
                                                        c7980zA1.g = str25;
                                                        c7980zA1.h = d20;
                                                        c7980zA1.i = str32;
                                                        c7980zA1.j = d21;
                                                        c7980zA1.k = str34;
                                                        c7980zA1.l = str33;
                                                        c7980zA1.m = str35;
                                                        c7980zA1.n = d22;
                                                        c7980zA1.p = z4;
                                                        c7980zA1.t = d23;
                                                        str37 = str32;
                                                        d24 = d20;
                                                        c7980zA1.s = j5;
                                                        c7980zA1.u = iR;
                                                        c7980zA1.x = 11;
                                                        objO5 = C4466ii.o(interfaceC6396rf0L5, c7980zA1);
                                                        mn = mn2;
                                                        if (objO5 != mn) {
                                                            mn3 = mn;
                                                            d25 = d21;
                                                            d26 = d24;
                                                            i = iR;
                                                            str38 = str37;
                                                            obj10 = objO5;
                                                            str39 = str34;
                                                            str40 = str33;
                                                            str41 = str35;
                                                            d27 = d22;
                                                            z5 = z4;
                                                            d28 = d23;
                                                            j6 = j5;
                                                            Boolean bool10 = (Boolean) obj10;
                                                            j7 = j6;
                                                            zBooleanValue4 = bool10.booleanValue();
                                                            InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled5 = abstractC7770yA5.l.isEnabled();
                                                            c7980zA1.d = abstractC7770yA5;
                                                            c7980zA1.e = str36;
                                                            c7980zA1.g = str25;
                                                            c7980zA1.h = d26;
                                                            c7980zA1.i = str38;
                                                            c7980zA1.j = d25;
                                                            c7980zA1.k = str39;
                                                            c7980zA1.l = str40;
                                                            c7980zA1.m = str41;
                                                            c7980zA1.n = d27;
                                                            c7980zA1.p = z5;
                                                            c7980zA1.t = d28;
                                                            d29 = d25;
                                                            str42 = str39;
                                                            c7980zA1.s = j7;
                                                            i2 = i;
                                                            c7980zA1.u = i2;
                                                            c7980zA1.q = zBooleanValue4;
                                                            c7980zA1.x = 12;
                                                            objO6 = C4466ii.o(interfaceC6396rf0IsEnabled5, c7980zA1);
                                                            mn4 = mn3;
                                                            if (objO6 == mn4) {
                                                                return mn4;
                                                            }
                                                            obj11 = objO6;
                                                            d30 = d27;
                                                            z6 = zBooleanValue4;
                                                            str43 = str40;
                                                            str44 = str42;
                                                            j8 = j7;
                                                            mn5 = mn4;
                                                            d31 = d28;
                                                            i3 = i2;
                                                            d32 = d26;
                                                            str45 = str38;
                                                            d33 = d29;
                                                            Boolean bool11 = (Boolean) obj11;
                                                            z7 = z6;
                                                            zBooleanValue5 = bool11.booleanValue();
                                                            c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                            if (c3279d22 != null) {
                                                                str46 = "-";
                                                            } else {
                                                                str46 = "-";
                                                            }
                                                            i4 = i3;
                                                            InterfaceC6396rf0<C1491Lx0> interfaceC6396rf4 = abstractC7770yA5.c.b;
                                                            c7980zA1.d = abstractC7770yA5;
                                                            c7980zA1.e = str36;
                                                            c7980zA1.g = str25;
                                                            c7980zA1.h = d32;
                                                            c7980zA1.i = str45;
                                                            c7980zA1.j = d33;
                                                            c7980zA1.k = str44;
                                                            c7980zA1.l = str43;
                                                            c7980zA1.m = str41;
                                                            c7980zA1.n = d30;
                                                            c7980zA1.o = str46;
                                                            c7980zA1.p = z5;
                                                            c7980zA1.t = d31;
                                                            d34 = d32;
                                                            d35 = d30;
                                                            c7980zA1.s = j8;
                                                            c7980zA1.u = i4;
                                                            c7980zA1.q = z7;
                                                            c7980zA1.r = zBooleanValue5;
                                                            c7980zA1.x = 13;
                                                            objO7 = C4466ii.o(interfaceC6396rf4, c7980zA1);
                                                            mn6 = mn5;
                                                            if (objO7 == mn6) {
                                                                return mn6;
                                                            }
                                                            z8 = zBooleanValue5;
                                                            d36 = d35;
                                                            z9 = z7;
                                                            str47 = str36;
                                                            d37 = d33;
                                                            str48 = str46;
                                                            str49 = str25;
                                                            str50 = str45;
                                                            j9 = j8;
                                                            i5 = i4;
                                                            d38 = d34;
                                                            obj12 = objO7;
                                                            str51 = str41;
                                                            str52 = str44;
                                                            aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                            if (z5) {
                                                                return aVar;
                                                            }
                                                            OM om10 = abstractC7770yA5.p;
                                                            c7980zA1.d = aVar;
                                                            c7980zA1.e = d38;
                                                            c7980zA1.g = null;
                                                            c7980zA1.h = null;
                                                            c7980zA1.i = null;
                                                            c7980zA1.j = null;
                                                            c7980zA1.k = null;
                                                            c7980zA1.l = null;
                                                            c7980zA1.m = null;
                                                            c7980zA1.n = null;
                                                            c7980zA1.o = null;
                                                            c7980zA1.s = 0L;
                                                            c7980zA1.u = 0;
                                                            c7980zA1.x = 14;
                                                            objB2 = om10.b(d38, c7980zA1);
                                                            if (objB2 == mn6) {
                                                                return mn6;
                                                            }
                                                            aVar2 = aVar;
                                                            Double d313 = d38;
                                                            Double d44 = (Double) objB2;
                                                            String assetSelectionOnOff5 = aVar2.a;
                                                            Intrinsics.checkNotNullParameter(assetSelectionOnOff5, "assetSelectionOnOff");
                                                            String assetSelectionName5 = aVar2.b;
                                                            Intrinsics.checkNotNullParameter(assetSelectionName5, "assetSelectionName");
                                                            String tradingStrategy5 = aVar2.c;
                                                            Intrinsics.checkNotNullParameter(tradingStrategy5, "tradingStrategy");
                                                            String tradingAsset5 = aVar2.d;
                                                            Intrinsics.checkNotNullParameter(tradingAsset5, "tradingAsset");
                                                            String currency5 = aVar2.f;
                                                            Intrinsics.checkNotNullParameter(currency5, "currency");
                                                            String technicalIndicator5 = aVar2.g;
                                                            Intrinsics.checkNotNullParameter(technicalIndicator5, "technicalIndicator");
                                                            String profitFilter5 = aVar2.l;
                                                            Intrinsics.checkNotNullParameter(profitFilter5, "profitFilter");
                                                            String startDealId5 = aVar2.q;
                                                            Intrinsics.checkNotNullParameter(startDealId5, "startDealId");
                                                            return new a(assetSelectionOnOff5, assetSelectionName5, tradingStrategy5, tradingAsset5, aVar2.e, currency5, technicalIndicator5, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter5, aVar2.m, d313, d44, aVar2.p, startDealId5);
                                                        }
                                                    }
                                                    return mn;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c6945uG = (C6945uG) c4923kf.k.getValue();
                        if (c6945uG != null) {
                            d5 = new Double(c6945uG.k);
                        } else {
                            d5 = null;
                        }
                        c7980zA1.d = abstractC7770yA1;
                        c7980zA1.e = str2;
                        c7980zA1.g = str3;
                        c7980zA1.h = d5;
                        c7980zA1.i = d3;
                        c7980zA1.j = abstractC7770yA1;
                        c7980zA1.p = z3;
                        c7980zA1.s = j2;
                        c7980zA1.q = z2;
                        c7980zA1.x = 3;
                        objO = C4466ii.o(interfaceC2152Ui1.isEnabled(), c7980zA1);
                        if (objO != mn7) {
                            d4 = d3;
                            d6 = d5;
                            str7 = str3;
                            obj3 = objO;
                            abstractC7770yA2 = abstractC7770yA1;
                            str8 = str2;
                            abstractC7770yA3 = abstractC7770yA2;
                            zBooleanValue3 = ((Boolean) obj3).booleanValue();
                            abstractC7770yA3.getClass();
                            if (!z2) {
                                str53 = str6;
                            } else if (zBooleanValue3) {
                                str53 = str5;
                            } else {
                                str53 = str4;
                            }
                            str3 = str7;
                            str2 = str8;
                            abstractC7770yA1 = abstractC7770yA2;
                            c7980zA1.d = abstractC7770yA1;
                            c7980zA1.e = str2;
                            c7980zA1.g = str3;
                            c7980zA1.h = d6;
                            c7980zA1.i = str53;
                            c7980zA1.j = d4;
                            c7980zA1.p = z3;
                            c7980zA1.s = j2;
                            c7980zA1.x = 4;
                            objD = abstractC7770yA1.d(c7980zA1);
                            if (objD != mn7) {
                                str9 = str2;
                                d8 = d6;
                                str10 = str3;
                                obj5 = objD;
                                str11 = str53;
                                d9 = d4;
                                if (((Boolean) obj5).booleanValue()) {
                                    str12 = "best_pair";
                                } else {
                                    str12 = "manual";
                                }
                                c7980zA1.d = abstractC7770yA1;
                                c7980zA1.e = str9;
                                c7980zA1.g = str10;
                                c7980zA1.h = d8;
                                c7980zA1.i = str11;
                                c7980zA1.j = d9;
                                c7980zA1.k = str12;
                                c7980zA1.p = z3;
                                c7980zA1.s = j2;
                                c7980zA1.x = 5;
                                objD2 = abstractC7770yA1.d(c7980zA1);
                                if (objD2 != mn7) {
                                    str13 = str11;
                                    d10 = d9;
                                    str14 = str12;
                                    obj6 = objD2;
                                    bool = (Boolean) obj6;
                                    Intrinsics.checkNotNullParameter("", "onNull");
                                    if (Intrinsics.a(bool, Boolean.TRUE)) {
                                        str4 = str5;
                                    } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                                        str4 = "";
                                    }
                                    c7980zA1.d = abstractC7770yA1;
                                    c7980zA1.e = str9;
                                    c7980zA1.g = str10;
                                    c7980zA1.h = d8;
                                    c7980zA1.i = str13;
                                    c7980zA1.j = d10;
                                    c7980zA1.k = str14;
                                    c7980zA1.l = str4;
                                    c7980zA1.p = z3;
                                    c7980zA1.s = j2;
                                    c7980zA1.x = 6;
                                    objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                                    if (objO3 != mn7) {
                                        String str519 = str14;
                                        str15 = str13;
                                        str16 = str519;
                                        d11 = d10;
                                        d12 = d8;
                                        str17 = str10;
                                        str18 = str9;
                                        abstractC7770yA5 = abstractC7770yA1;
                                        strB = ((EnumC2644a42) objO3).b();
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str18;
                                        c7980zA1.g = str17;
                                        c7980zA1.h = d12;
                                        c7980zA1.i = str15;
                                        c7980zA1.j = d11;
                                        c7980zA1.k = str16;
                                        c7980zA1.l = str4;
                                        c7980zA1.m = strB;
                                        c7980zA1.p = z3;
                                        c7980zA1.x = 7;
                                        objE = abstractC7770yA5.e(j2, c7980zA1);
                                        if (objE != mn7) {
                                            str19 = strB;
                                            obj7 = objE;
                                            str20 = str4;
                                            dLongValue = ((Number) obj7).longValue();
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str18;
                                            c7980zA1.g = str17;
                                            c7980zA1.h = d12;
                                            c7980zA1.i = str15;
                                            c7980zA1.j = d11;
                                            c7980zA1.k = str16;
                                            c7980zA1.l = str20;
                                            c7980zA1.m = str19;
                                            c7980zA1.p = z3;
                                            c7980zA1.t = dLongValue;
                                            c7980zA1.x = 8;
                                            objF = abstractC7770yA5.f(c7980zA1);
                                            if (objF != mn7) {
                                                String str5110 = str15;
                                                str21 = str19;
                                                str22 = str5110;
                                                str23 = str18;
                                                d13 = d11;
                                                String str5111 = str17;
                                                str24 = str16;
                                                d14 = dLongValue;
                                                str25 = str5111;
                                                d15 = d14;
                                                jLongValue = ((Number) objF).longValue();
                                                OM om11 = abstractC7770yA5.p;
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str23;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d12;
                                                c7980zA1.i = str22;
                                                c7980zA1.j = d13;
                                                c7980zA1.k = str24;
                                                c7980zA1.l = str20;
                                                c7980zA1.m = str21;
                                                c7980zA1.p = z3;
                                                str26 = str22;
                                                str27 = str20;
                                                c7980zA1.t = d15;
                                                c7980zA1.s = jLongValue;
                                                d16 = d12;
                                                c7980zA1.x = 9;
                                                objB = om11.b(d13, c7980zA1);
                                                if (objB != mn7) {
                                                    d17 = d15;
                                                    j3 = jLongValue;
                                                    str28 = str26;
                                                    obj8 = objB;
                                                    str29 = str23;
                                                    d18 = d16;
                                                    d19 = (Double) obj8;
                                                    j4 = j3;
                                                    AbstractC1787Pr.a aVar8 = abstractC7770yA5.j.b;
                                                    c7980zA1.d = abstractC7770yA5;
                                                    c7980zA1.e = str29;
                                                    c7980zA1.g = str25;
                                                    c7980zA1.h = d18;
                                                    c7980zA1.i = str28;
                                                    c7980zA1.j = d13;
                                                    c7980zA1.k = str24;
                                                    c7980zA1.l = str27;
                                                    c7980zA1.m = str21;
                                                    c7980zA1.n = d19;
                                                    c7980zA1.p = z3;
                                                    c7980zA1.t = d17;
                                                    str30 = str28;
                                                    str31 = str29;
                                                    c7980zA1.s = j4;
                                                    c7980zA1.x = 10;
                                                    objO4 = C4466ii.o(aVar8, c7980zA1);
                                                    mn = mn7;
                                                    if (objO4 != mn) {
                                                        j5 = j4;
                                                        mn2 = mn;
                                                        obj9 = objO4;
                                                        str32 = str30;
                                                        d20 = d18;
                                                        d21 = d13;
                                                        str33 = str27;
                                                        str34 = str24;
                                                        str35 = str21;
                                                        z4 = z3;
                                                        d22 = d19;
                                                        str36 = str31;
                                                        d23 = d17;
                                                        iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                                        InterfaceC6396rf0<Boolean> interfaceC6396rf0L6 = abstractC7770yA5.m.l();
                                                        c7980zA1.d = abstractC7770yA5;
                                                        c7980zA1.e = str36;
                                                        c7980zA1.g = str25;
                                                        c7980zA1.h = d20;
                                                        c7980zA1.i = str32;
                                                        c7980zA1.j = d21;
                                                        c7980zA1.k = str34;
                                                        c7980zA1.l = str33;
                                                        c7980zA1.m = str35;
                                                        c7980zA1.n = d22;
                                                        c7980zA1.p = z4;
                                                        c7980zA1.t = d23;
                                                        str37 = str32;
                                                        d24 = d20;
                                                        c7980zA1.s = j5;
                                                        c7980zA1.u = iR;
                                                        c7980zA1.x = 11;
                                                        objO5 = C4466ii.o(interfaceC6396rf0L6, c7980zA1);
                                                        mn = mn2;
                                                        if (objO5 != mn) {
                                                            mn3 = mn;
                                                            d25 = d21;
                                                            d26 = d24;
                                                            i = iR;
                                                            str38 = str37;
                                                            obj10 = objO5;
                                                            str39 = str34;
                                                            str40 = str33;
                                                            str41 = str35;
                                                            d27 = d22;
                                                            z5 = z4;
                                                            d28 = d23;
                                                            j6 = j5;
                                                            Boolean bool12 = (Boolean) obj10;
                                                            j7 = j6;
                                                            zBooleanValue4 = bool12.booleanValue();
                                                            InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled6 = abstractC7770yA5.l.isEnabled();
                                                            c7980zA1.d = abstractC7770yA5;
                                                            c7980zA1.e = str36;
                                                            c7980zA1.g = str25;
                                                            c7980zA1.h = d26;
                                                            c7980zA1.i = str38;
                                                            c7980zA1.j = d25;
                                                            c7980zA1.k = str39;
                                                            c7980zA1.l = str40;
                                                            c7980zA1.m = str41;
                                                            c7980zA1.n = d27;
                                                            c7980zA1.p = z5;
                                                            c7980zA1.t = d28;
                                                            d29 = d25;
                                                            str42 = str39;
                                                            c7980zA1.s = j7;
                                                            i2 = i;
                                                            c7980zA1.u = i2;
                                                            c7980zA1.q = zBooleanValue4;
                                                            c7980zA1.x = 12;
                                                            objO6 = C4466ii.o(interfaceC6396rf0IsEnabled6, c7980zA1);
                                                            mn4 = mn3;
                                                            if (objO6 == mn4) {
                                                                return mn4;
                                                            }
                                                            obj11 = objO6;
                                                            d30 = d27;
                                                            z6 = zBooleanValue4;
                                                            str43 = str40;
                                                            str44 = str42;
                                                            j8 = j7;
                                                            mn5 = mn4;
                                                            d31 = d28;
                                                            i3 = i2;
                                                            d32 = d26;
                                                            str45 = str38;
                                                            d33 = d29;
                                                            Boolean bool13 = (Boolean) obj11;
                                                            z7 = z6;
                                                            zBooleanValue5 = bool13.booleanValue();
                                                            c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                            if (c3279d22 != null) {
                                                                str46 = "-";
                                                            } else {
                                                                str46 = "-";
                                                            }
                                                            i4 = i3;
                                                            InterfaceC6396rf0<C1491Lx0> interfaceC6396rf5 = abstractC7770yA5.c.b;
                                                            c7980zA1.d = abstractC7770yA5;
                                                            c7980zA1.e = str36;
                                                            c7980zA1.g = str25;
                                                            c7980zA1.h = d32;
                                                            c7980zA1.i = str45;
                                                            c7980zA1.j = d33;
                                                            c7980zA1.k = str44;
                                                            c7980zA1.l = str43;
                                                            c7980zA1.m = str41;
                                                            c7980zA1.n = d30;
                                                            c7980zA1.o = str46;
                                                            c7980zA1.p = z5;
                                                            c7980zA1.t = d31;
                                                            d34 = d32;
                                                            d35 = d30;
                                                            c7980zA1.s = j8;
                                                            c7980zA1.u = i4;
                                                            c7980zA1.q = z7;
                                                            c7980zA1.r = zBooleanValue5;
                                                            c7980zA1.x = 13;
                                                            objO7 = C4466ii.o(interfaceC6396rf5, c7980zA1);
                                                            mn6 = mn5;
                                                            if (objO7 == mn6) {
                                                                return mn6;
                                                            }
                                                            z8 = zBooleanValue5;
                                                            d36 = d35;
                                                            z9 = z7;
                                                            str47 = str36;
                                                            d37 = d33;
                                                            str48 = str46;
                                                            str49 = str25;
                                                            str50 = str45;
                                                            j9 = j8;
                                                            i5 = i4;
                                                            d38 = d34;
                                                            obj12 = objO7;
                                                            str51 = str41;
                                                            str52 = str44;
                                                            aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                            if (z5) {
                                                                return aVar;
                                                            }
                                                            OM om12 = abstractC7770yA5.p;
                                                            c7980zA1.d = aVar;
                                                            c7980zA1.e = d38;
                                                            c7980zA1.g = null;
                                                            c7980zA1.h = null;
                                                            c7980zA1.i = null;
                                                            c7980zA1.j = null;
                                                            c7980zA1.k = null;
                                                            c7980zA1.l = null;
                                                            c7980zA1.m = null;
                                                            c7980zA1.n = null;
                                                            c7980zA1.o = null;
                                                            c7980zA1.s = 0L;
                                                            c7980zA1.u = 0;
                                                            c7980zA1.x = 14;
                                                            objB2 = om12.b(d38, c7980zA1);
                                                            if (objB2 == mn6) {
                                                                return mn6;
                                                            }
                                                            aVar2 = aVar;
                                                            Double d314 = d38;
                                                            Double d45 = (Double) objB2;
                                                            String assetSelectionOnOff6 = aVar2.a;
                                                            Intrinsics.checkNotNullParameter(assetSelectionOnOff6, "assetSelectionOnOff");
                                                            String assetSelectionName6 = aVar2.b;
                                                            Intrinsics.checkNotNullParameter(assetSelectionName6, "assetSelectionName");
                                                            String tradingStrategy6 = aVar2.c;
                                                            Intrinsics.checkNotNullParameter(tradingStrategy6, "tradingStrategy");
                                                            String tradingAsset6 = aVar2.d;
                                                            Intrinsics.checkNotNullParameter(tradingAsset6, "tradingAsset");
                                                            String currency6 = aVar2.f;
                                                            Intrinsics.checkNotNullParameter(currency6, "currency");
                                                            String technicalIndicator6 = aVar2.g;
                                                            Intrinsics.checkNotNullParameter(technicalIndicator6, "technicalIndicator");
                                                            String profitFilter6 = aVar2.l;
                                                            Intrinsics.checkNotNullParameter(profitFilter6, "profitFilter");
                                                            String startDealId6 = aVar2.q;
                                                            Intrinsics.checkNotNullParameter(startDealId6, "startDealId");
                                                            return new a(assetSelectionOnOff6, assetSelectionName6, tradingStrategy6, tradingAsset6, aVar2.e, currency6, technicalIndicator6, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter6, aVar2.m, d314, d45, aVar2.p, startDealId6);
                                                        }
                                                    }
                                                    return mn;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return mn7;
            case 2:
                boolean z11 = c7980zA1.q;
                j2 = c7980zA1.s;
                z3 = c7980zA1.p;
                abstractC7770yA4 = (AbstractC7770yA1) c7980zA1.j;
                d4 = (Double) c7980zA1.i;
                d6 = (Double) c7980zA1.h;
                String str60 = (String) c7980zA1.g;
                str8 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA7 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str4 = "off";
                abstractC7770yA2 = abstractC7770yA7;
                str6 = "not activated";
                str7 = str60;
                z2 = z11;
                obj4 = objB2;
                str5 = "on";
                zBooleanValue2 = ((Boolean) obj4).booleanValue();
                abstractC7770yA4.getClass();
                if (!z2) {
                    str53 = str6;
                } else if (zBooleanValue2) {
                    str53 = str5;
                } else {
                    str53 = str4;
                }
                str3 = str7;
                str2 = str8;
                abstractC7770yA1 = abstractC7770yA2;
                c7980zA1.d = abstractC7770yA1;
                c7980zA1.e = str2;
                c7980zA1.g = str3;
                c7980zA1.h = d6;
                c7980zA1.i = str53;
                c7980zA1.j = d4;
                c7980zA1.p = z3;
                c7980zA1.s = j2;
                c7980zA1.x = 4;
                objD = abstractC7770yA1.d(c7980zA1);
                if (objD != mn7) {
                    str9 = str2;
                    d8 = d6;
                    str10 = str3;
                    obj5 = objD;
                    str11 = str53;
                    d9 = d4;
                    if (((Boolean) obj5).booleanValue()) {
                        str12 = "best_pair";
                    } else {
                        str12 = "manual";
                    }
                    c7980zA1.d = abstractC7770yA1;
                    c7980zA1.e = str9;
                    c7980zA1.g = str10;
                    c7980zA1.h = d8;
                    c7980zA1.i = str11;
                    c7980zA1.j = d9;
                    c7980zA1.k = str12;
                    c7980zA1.p = z3;
                    c7980zA1.s = j2;
                    c7980zA1.x = 5;
                    objD2 = abstractC7770yA1.d(c7980zA1);
                    if (objD2 != mn7) {
                        str13 = str11;
                        d10 = d9;
                        str14 = str12;
                        obj6 = objD2;
                        bool = (Boolean) obj6;
                        Intrinsics.checkNotNullParameter("", "onNull");
                        if (Intrinsics.a(bool, Boolean.TRUE)) {
                            str4 = str5;
                        } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                            str4 = "";
                        }
                        c7980zA1.d = abstractC7770yA1;
                        c7980zA1.e = str9;
                        c7980zA1.g = str10;
                        c7980zA1.h = d8;
                        c7980zA1.i = str13;
                        c7980zA1.j = d10;
                        c7980zA1.k = str14;
                        c7980zA1.l = str4;
                        c7980zA1.p = z3;
                        c7980zA1.s = j2;
                        c7980zA1.x = 6;
                        objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                        if (objO3 != mn7) {
                            String str5112 = str14;
                            str15 = str13;
                            str16 = str5112;
                            d11 = d10;
                            d12 = d8;
                            str17 = str10;
                            str18 = str9;
                            abstractC7770yA5 = abstractC7770yA1;
                            strB = ((EnumC2644a42) objO3).b();
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str18;
                            c7980zA1.g = str17;
                            c7980zA1.h = d12;
                            c7980zA1.i = str15;
                            c7980zA1.j = d11;
                            c7980zA1.k = str16;
                            c7980zA1.l = str4;
                            c7980zA1.m = strB;
                            c7980zA1.p = z3;
                            c7980zA1.x = 7;
                            objE = abstractC7770yA5.e(j2, c7980zA1);
                            if (objE != mn7) {
                                str19 = strB;
                                obj7 = objE;
                                str20 = str4;
                                dLongValue = ((Number) obj7).longValue();
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str18;
                                c7980zA1.g = str17;
                                c7980zA1.h = d12;
                                c7980zA1.i = str15;
                                c7980zA1.j = d11;
                                c7980zA1.k = str16;
                                c7980zA1.l = str20;
                                c7980zA1.m = str19;
                                c7980zA1.p = z3;
                                c7980zA1.t = dLongValue;
                                c7980zA1.x = 8;
                                objF = abstractC7770yA5.f(c7980zA1);
                                if (objF != mn7) {
                                    String str5113 = str15;
                                    str21 = str19;
                                    str22 = str5113;
                                    str23 = str18;
                                    d13 = d11;
                                    String str5114 = str17;
                                    str24 = str16;
                                    d14 = dLongValue;
                                    str25 = str5114;
                                    d15 = d14;
                                    jLongValue = ((Number) objF).longValue();
                                    OM om13 = abstractC7770yA5.p;
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str23;
                                    c7980zA1.g = str25;
                                    c7980zA1.h = d12;
                                    c7980zA1.i = str22;
                                    c7980zA1.j = d13;
                                    c7980zA1.k = str24;
                                    c7980zA1.l = str20;
                                    c7980zA1.m = str21;
                                    c7980zA1.p = z3;
                                    str26 = str22;
                                    str27 = str20;
                                    c7980zA1.t = d15;
                                    c7980zA1.s = jLongValue;
                                    d16 = d12;
                                    c7980zA1.x = 9;
                                    objB = om13.b(d13, c7980zA1);
                                    if (objB != mn7) {
                                        d17 = d15;
                                        j3 = jLongValue;
                                        str28 = str26;
                                        obj8 = objB;
                                        str29 = str23;
                                        d18 = d16;
                                        d19 = (Double) obj8;
                                        j4 = j3;
                                        AbstractC1787Pr.a aVar9 = abstractC7770yA5.j.b;
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str29;
                                        c7980zA1.g = str25;
                                        c7980zA1.h = d18;
                                        c7980zA1.i = str28;
                                        c7980zA1.j = d13;
                                        c7980zA1.k = str24;
                                        c7980zA1.l = str27;
                                        c7980zA1.m = str21;
                                        c7980zA1.n = d19;
                                        c7980zA1.p = z3;
                                        c7980zA1.t = d17;
                                        str30 = str28;
                                        str31 = str29;
                                        c7980zA1.s = j4;
                                        c7980zA1.x = 10;
                                        objO4 = C4466ii.o(aVar9, c7980zA1);
                                        mn = mn7;
                                        if (objO4 != mn) {
                                            j5 = j4;
                                            mn2 = mn;
                                            obj9 = objO4;
                                            str32 = str30;
                                            d20 = d18;
                                            d21 = d13;
                                            str33 = str27;
                                            str34 = str24;
                                            str35 = str21;
                                            z4 = z3;
                                            d22 = d19;
                                            str36 = str31;
                                            d23 = d17;
                                            iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                            InterfaceC6396rf0<Boolean> interfaceC6396rf0L7 = abstractC7770yA5.m.l();
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str36;
                                            c7980zA1.g = str25;
                                            c7980zA1.h = d20;
                                            c7980zA1.i = str32;
                                            c7980zA1.j = d21;
                                            c7980zA1.k = str34;
                                            c7980zA1.l = str33;
                                            c7980zA1.m = str35;
                                            c7980zA1.n = d22;
                                            c7980zA1.p = z4;
                                            c7980zA1.t = d23;
                                            str37 = str32;
                                            d24 = d20;
                                            c7980zA1.s = j5;
                                            c7980zA1.u = iR;
                                            c7980zA1.x = 11;
                                            objO5 = C4466ii.o(interfaceC6396rf0L7, c7980zA1);
                                            mn = mn2;
                                            if (objO5 != mn) {
                                                mn3 = mn;
                                                d25 = d21;
                                                d26 = d24;
                                                i = iR;
                                                str38 = str37;
                                                obj10 = objO5;
                                                str39 = str34;
                                                str40 = str33;
                                                str41 = str35;
                                                d27 = d22;
                                                z5 = z4;
                                                d28 = d23;
                                                j6 = j5;
                                                Boolean bool14 = (Boolean) obj10;
                                                j7 = j6;
                                                zBooleanValue4 = bool14.booleanValue();
                                                InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled7 = abstractC7770yA5.l.isEnabled();
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str36;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d26;
                                                c7980zA1.i = str38;
                                                c7980zA1.j = d25;
                                                c7980zA1.k = str39;
                                                c7980zA1.l = str40;
                                                c7980zA1.m = str41;
                                                c7980zA1.n = d27;
                                                c7980zA1.p = z5;
                                                c7980zA1.t = d28;
                                                d29 = d25;
                                                str42 = str39;
                                                c7980zA1.s = j7;
                                                i2 = i;
                                                c7980zA1.u = i2;
                                                c7980zA1.q = zBooleanValue4;
                                                c7980zA1.x = 12;
                                                objO6 = C4466ii.o(interfaceC6396rf0IsEnabled7, c7980zA1);
                                                mn4 = mn3;
                                                if (objO6 == mn4) {
                                                    return mn4;
                                                }
                                                obj11 = objO6;
                                                d30 = d27;
                                                z6 = zBooleanValue4;
                                                str43 = str40;
                                                str44 = str42;
                                                j8 = j7;
                                                mn5 = mn4;
                                                d31 = d28;
                                                i3 = i2;
                                                d32 = d26;
                                                str45 = str38;
                                                d33 = d29;
                                                Boolean bool15 = (Boolean) obj11;
                                                z7 = z6;
                                                zBooleanValue5 = bool15.booleanValue();
                                                c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                if (c3279d22 != null) {
                                                    str46 = "-";
                                                } else {
                                                    str46 = "-";
                                                }
                                                i4 = i3;
                                                InterfaceC6396rf0<C1491Lx0> interfaceC6396rf6 = abstractC7770yA5.c.b;
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str36;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d32;
                                                c7980zA1.i = str45;
                                                c7980zA1.j = d33;
                                                c7980zA1.k = str44;
                                                c7980zA1.l = str43;
                                                c7980zA1.m = str41;
                                                c7980zA1.n = d30;
                                                c7980zA1.o = str46;
                                                c7980zA1.p = z5;
                                                c7980zA1.t = d31;
                                                d34 = d32;
                                                d35 = d30;
                                                c7980zA1.s = j8;
                                                c7980zA1.u = i4;
                                                c7980zA1.q = z7;
                                                c7980zA1.r = zBooleanValue5;
                                                c7980zA1.x = 13;
                                                objO7 = C4466ii.o(interfaceC6396rf6, c7980zA1);
                                                mn6 = mn5;
                                                if (objO7 == mn6) {
                                                    return mn6;
                                                }
                                                z8 = zBooleanValue5;
                                                d36 = d35;
                                                z9 = z7;
                                                str47 = str36;
                                                d37 = d33;
                                                str48 = str46;
                                                str49 = str25;
                                                str50 = str45;
                                                j9 = j8;
                                                i5 = i4;
                                                d38 = d34;
                                                obj12 = objO7;
                                                str51 = str41;
                                                str52 = str44;
                                                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                if (z5) {
                                                    return aVar;
                                                }
                                                OM om14 = abstractC7770yA5.p;
                                                c7980zA1.d = aVar;
                                                c7980zA1.e = d38;
                                                c7980zA1.g = null;
                                                c7980zA1.h = null;
                                                c7980zA1.i = null;
                                                c7980zA1.j = null;
                                                c7980zA1.k = null;
                                                c7980zA1.l = null;
                                                c7980zA1.m = null;
                                                c7980zA1.n = null;
                                                c7980zA1.o = null;
                                                c7980zA1.s = 0L;
                                                c7980zA1.u = 0;
                                                c7980zA1.x = 14;
                                                objB2 = om14.b(d38, c7980zA1);
                                                if (objB2 == mn6) {
                                                    return mn6;
                                                }
                                                aVar2 = aVar;
                                                Double d315 = d38;
                                                Double d46 = (Double) objB2;
                                                String assetSelectionOnOff7 = aVar2.a;
                                                Intrinsics.checkNotNullParameter(assetSelectionOnOff7, "assetSelectionOnOff");
                                                String assetSelectionName7 = aVar2.b;
                                                Intrinsics.checkNotNullParameter(assetSelectionName7, "assetSelectionName");
                                                String tradingStrategy7 = aVar2.c;
                                                Intrinsics.checkNotNullParameter(tradingStrategy7, "tradingStrategy");
                                                String tradingAsset7 = aVar2.d;
                                                Intrinsics.checkNotNullParameter(tradingAsset7, "tradingAsset");
                                                String currency7 = aVar2.f;
                                                Intrinsics.checkNotNullParameter(currency7, "currency");
                                                String technicalIndicator7 = aVar2.g;
                                                Intrinsics.checkNotNullParameter(technicalIndicator7, "technicalIndicator");
                                                String profitFilter7 = aVar2.l;
                                                Intrinsics.checkNotNullParameter(profitFilter7, "profitFilter");
                                                String startDealId7 = aVar2.q;
                                                Intrinsics.checkNotNullParameter(startDealId7, "startDealId");
                                                return new a(assetSelectionOnOff7, assetSelectionName7, tradingStrategy7, tradingAsset7, aVar2.e, currency7, technicalIndicator7, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter7, aVar2.m, d315, d46, aVar2.p, startDealId7);
                                            }
                                        }
                                        return mn;
                                    }
                                }
                            }
                        }
                    }
                }
                return mn7;
            case 3:
                boolean z12 = c7980zA1.q;
                j2 = c7980zA1.s;
                z3 = c7980zA1.p;
                abstractC7770yA3 = (AbstractC7770yA1) c7980zA1.j;
                d4 = (Double) c7980zA1.i;
                d6 = (Double) c7980zA1.h;
                String str61 = (String) c7980zA1.g;
                str8 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA8 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str4 = "off";
                abstractC7770yA2 = abstractC7770yA8;
                str6 = "not activated";
                str7 = str61;
                z2 = z12;
                obj3 = objB2;
                str5 = "on";
                zBooleanValue3 = ((Boolean) obj3).booleanValue();
                abstractC7770yA3.getClass();
                if (!z2) {
                    str53 = str6;
                } else if (zBooleanValue3) {
                    str53 = str5;
                } else {
                    str53 = str4;
                }
                str3 = str7;
                str2 = str8;
                abstractC7770yA1 = abstractC7770yA2;
                c7980zA1.d = abstractC7770yA1;
                c7980zA1.e = str2;
                c7980zA1.g = str3;
                c7980zA1.h = d6;
                c7980zA1.i = str53;
                c7980zA1.j = d4;
                c7980zA1.p = z3;
                c7980zA1.s = j2;
                c7980zA1.x = 4;
                objD = abstractC7770yA1.d(c7980zA1);
                if (objD != mn7) {
                    str9 = str2;
                    d8 = d6;
                    str10 = str3;
                    obj5 = objD;
                    str11 = str53;
                    d9 = d4;
                    if (((Boolean) obj5).booleanValue()) {
                        str12 = "best_pair";
                    } else {
                        str12 = "manual";
                    }
                    c7980zA1.d = abstractC7770yA1;
                    c7980zA1.e = str9;
                    c7980zA1.g = str10;
                    c7980zA1.h = d8;
                    c7980zA1.i = str11;
                    c7980zA1.j = d9;
                    c7980zA1.k = str12;
                    c7980zA1.p = z3;
                    c7980zA1.s = j2;
                    c7980zA1.x = 5;
                    objD2 = abstractC7770yA1.d(c7980zA1);
                    if (objD2 != mn7) {
                        str13 = str11;
                        d10 = d9;
                        str14 = str12;
                        obj6 = objD2;
                        bool = (Boolean) obj6;
                        Intrinsics.checkNotNullParameter("", "onNull");
                        if (Intrinsics.a(bool, Boolean.TRUE)) {
                            str4 = str5;
                        } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                            str4 = "";
                        }
                        c7980zA1.d = abstractC7770yA1;
                        c7980zA1.e = str9;
                        c7980zA1.g = str10;
                        c7980zA1.h = d8;
                        c7980zA1.i = str13;
                        c7980zA1.j = d10;
                        c7980zA1.k = str14;
                        c7980zA1.l = str4;
                        c7980zA1.p = z3;
                        c7980zA1.s = j2;
                        c7980zA1.x = 6;
                        objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                        if (objO3 != mn7) {
                            String str5115 = str14;
                            str15 = str13;
                            str16 = str5115;
                            d11 = d10;
                            d12 = d8;
                            str17 = str10;
                            str18 = str9;
                            abstractC7770yA5 = abstractC7770yA1;
                            strB = ((EnumC2644a42) objO3).b();
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str18;
                            c7980zA1.g = str17;
                            c7980zA1.h = d12;
                            c7980zA1.i = str15;
                            c7980zA1.j = d11;
                            c7980zA1.k = str16;
                            c7980zA1.l = str4;
                            c7980zA1.m = strB;
                            c7980zA1.p = z3;
                            c7980zA1.x = 7;
                            objE = abstractC7770yA5.e(j2, c7980zA1);
                            if (objE != mn7) {
                                str19 = strB;
                                obj7 = objE;
                                str20 = str4;
                                dLongValue = ((Number) obj7).longValue();
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str18;
                                c7980zA1.g = str17;
                                c7980zA1.h = d12;
                                c7980zA1.i = str15;
                                c7980zA1.j = d11;
                                c7980zA1.k = str16;
                                c7980zA1.l = str20;
                                c7980zA1.m = str19;
                                c7980zA1.p = z3;
                                c7980zA1.t = dLongValue;
                                c7980zA1.x = 8;
                                objF = abstractC7770yA5.f(c7980zA1);
                                if (objF != mn7) {
                                    String str5116 = str15;
                                    str21 = str19;
                                    str22 = str5116;
                                    str23 = str18;
                                    d13 = d11;
                                    String str5117 = str17;
                                    str24 = str16;
                                    d14 = dLongValue;
                                    str25 = str5117;
                                    d15 = d14;
                                    jLongValue = ((Number) objF).longValue();
                                    OM om15 = abstractC7770yA5.p;
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str23;
                                    c7980zA1.g = str25;
                                    c7980zA1.h = d12;
                                    c7980zA1.i = str22;
                                    c7980zA1.j = d13;
                                    c7980zA1.k = str24;
                                    c7980zA1.l = str20;
                                    c7980zA1.m = str21;
                                    c7980zA1.p = z3;
                                    str26 = str22;
                                    str27 = str20;
                                    c7980zA1.t = d15;
                                    c7980zA1.s = jLongValue;
                                    d16 = d12;
                                    c7980zA1.x = 9;
                                    objB = om15.b(d13, c7980zA1);
                                    if (objB != mn7) {
                                        d17 = d15;
                                        j3 = jLongValue;
                                        str28 = str26;
                                        obj8 = objB;
                                        str29 = str23;
                                        d18 = d16;
                                        d19 = (Double) obj8;
                                        j4 = j3;
                                        AbstractC1787Pr.a aVar10 = abstractC7770yA5.j.b;
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str29;
                                        c7980zA1.g = str25;
                                        c7980zA1.h = d18;
                                        c7980zA1.i = str28;
                                        c7980zA1.j = d13;
                                        c7980zA1.k = str24;
                                        c7980zA1.l = str27;
                                        c7980zA1.m = str21;
                                        c7980zA1.n = d19;
                                        c7980zA1.p = z3;
                                        c7980zA1.t = d17;
                                        str30 = str28;
                                        str31 = str29;
                                        c7980zA1.s = j4;
                                        c7980zA1.x = 10;
                                        objO4 = C4466ii.o(aVar10, c7980zA1);
                                        mn = mn7;
                                        if (objO4 != mn) {
                                            j5 = j4;
                                            mn2 = mn;
                                            obj9 = objO4;
                                            str32 = str30;
                                            d20 = d18;
                                            d21 = d13;
                                            str33 = str27;
                                            str34 = str24;
                                            str35 = str21;
                                            z4 = z3;
                                            d22 = d19;
                                            str36 = str31;
                                            d23 = d17;
                                            iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                            InterfaceC6396rf0<Boolean> interfaceC6396rf0L8 = abstractC7770yA5.m.l();
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str36;
                                            c7980zA1.g = str25;
                                            c7980zA1.h = d20;
                                            c7980zA1.i = str32;
                                            c7980zA1.j = d21;
                                            c7980zA1.k = str34;
                                            c7980zA1.l = str33;
                                            c7980zA1.m = str35;
                                            c7980zA1.n = d22;
                                            c7980zA1.p = z4;
                                            c7980zA1.t = d23;
                                            str37 = str32;
                                            d24 = d20;
                                            c7980zA1.s = j5;
                                            c7980zA1.u = iR;
                                            c7980zA1.x = 11;
                                            objO5 = C4466ii.o(interfaceC6396rf0L8, c7980zA1);
                                            mn = mn2;
                                            if (objO5 != mn) {
                                                mn3 = mn;
                                                d25 = d21;
                                                d26 = d24;
                                                i = iR;
                                                str38 = str37;
                                                obj10 = objO5;
                                                str39 = str34;
                                                str40 = str33;
                                                str41 = str35;
                                                d27 = d22;
                                                z5 = z4;
                                                d28 = d23;
                                                j6 = j5;
                                                Boolean bool16 = (Boolean) obj10;
                                                j7 = j6;
                                                zBooleanValue4 = bool16.booleanValue();
                                                InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled8 = abstractC7770yA5.l.isEnabled();
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str36;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d26;
                                                c7980zA1.i = str38;
                                                c7980zA1.j = d25;
                                                c7980zA1.k = str39;
                                                c7980zA1.l = str40;
                                                c7980zA1.m = str41;
                                                c7980zA1.n = d27;
                                                c7980zA1.p = z5;
                                                c7980zA1.t = d28;
                                                d29 = d25;
                                                str42 = str39;
                                                c7980zA1.s = j7;
                                                i2 = i;
                                                c7980zA1.u = i2;
                                                c7980zA1.q = zBooleanValue4;
                                                c7980zA1.x = 12;
                                                objO6 = C4466ii.o(interfaceC6396rf0IsEnabled8, c7980zA1);
                                                mn4 = mn3;
                                                if (objO6 == mn4) {
                                                    return mn4;
                                                }
                                                obj11 = objO6;
                                                d30 = d27;
                                                z6 = zBooleanValue4;
                                                str43 = str40;
                                                str44 = str42;
                                                j8 = j7;
                                                mn5 = mn4;
                                                d31 = d28;
                                                i3 = i2;
                                                d32 = d26;
                                                str45 = str38;
                                                d33 = d29;
                                                Boolean bool17 = (Boolean) obj11;
                                                z7 = z6;
                                                zBooleanValue5 = bool17.booleanValue();
                                                c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                                if (c3279d22 != null) {
                                                    str46 = "-";
                                                } else {
                                                    str46 = "-";
                                                }
                                                i4 = i3;
                                                InterfaceC6396rf0<C1491Lx0> interfaceC6396rf7 = abstractC7770yA5.c.b;
                                                c7980zA1.d = abstractC7770yA5;
                                                c7980zA1.e = str36;
                                                c7980zA1.g = str25;
                                                c7980zA1.h = d32;
                                                c7980zA1.i = str45;
                                                c7980zA1.j = d33;
                                                c7980zA1.k = str44;
                                                c7980zA1.l = str43;
                                                c7980zA1.m = str41;
                                                c7980zA1.n = d30;
                                                c7980zA1.o = str46;
                                                c7980zA1.p = z5;
                                                c7980zA1.t = d31;
                                                d34 = d32;
                                                d35 = d30;
                                                c7980zA1.s = j8;
                                                c7980zA1.u = i4;
                                                c7980zA1.q = z7;
                                                c7980zA1.r = zBooleanValue5;
                                                c7980zA1.x = 13;
                                                objO7 = C4466ii.o(interfaceC6396rf7, c7980zA1);
                                                mn6 = mn5;
                                                if (objO7 == mn6) {
                                                    return mn6;
                                                }
                                                z8 = zBooleanValue5;
                                                d36 = d35;
                                                z9 = z7;
                                                str47 = str36;
                                                d37 = d33;
                                                str48 = str46;
                                                str49 = str25;
                                                str50 = str45;
                                                j9 = j8;
                                                i5 = i4;
                                                d38 = d34;
                                                obj12 = objO7;
                                                str51 = str41;
                                                str52 = str44;
                                                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                                if (z5) {
                                                    return aVar;
                                                }
                                                OM om16 = abstractC7770yA5.p;
                                                c7980zA1.d = aVar;
                                                c7980zA1.e = d38;
                                                c7980zA1.g = null;
                                                c7980zA1.h = null;
                                                c7980zA1.i = null;
                                                c7980zA1.j = null;
                                                c7980zA1.k = null;
                                                c7980zA1.l = null;
                                                c7980zA1.m = null;
                                                c7980zA1.n = null;
                                                c7980zA1.o = null;
                                                c7980zA1.s = 0L;
                                                c7980zA1.u = 0;
                                                c7980zA1.x = 14;
                                                objB2 = om16.b(d38, c7980zA1);
                                                if (objB2 == mn6) {
                                                    return mn6;
                                                }
                                                aVar2 = aVar;
                                                Double d316 = d38;
                                                Double d47 = (Double) objB2;
                                                String assetSelectionOnOff8 = aVar2.a;
                                                Intrinsics.checkNotNullParameter(assetSelectionOnOff8, "assetSelectionOnOff");
                                                String assetSelectionName8 = aVar2.b;
                                                Intrinsics.checkNotNullParameter(assetSelectionName8, "assetSelectionName");
                                                String tradingStrategy8 = aVar2.c;
                                                Intrinsics.checkNotNullParameter(tradingStrategy8, "tradingStrategy");
                                                String tradingAsset8 = aVar2.d;
                                                Intrinsics.checkNotNullParameter(tradingAsset8, "tradingAsset");
                                                String currency8 = aVar2.f;
                                                Intrinsics.checkNotNullParameter(currency8, "currency");
                                                String technicalIndicator8 = aVar2.g;
                                                Intrinsics.checkNotNullParameter(technicalIndicator8, "technicalIndicator");
                                                String profitFilter8 = aVar2.l;
                                                Intrinsics.checkNotNullParameter(profitFilter8, "profitFilter");
                                                String startDealId8 = aVar2.q;
                                                Intrinsics.checkNotNullParameter(startDealId8, "startDealId");
                                                return new a(assetSelectionOnOff8, assetSelectionName8, tradingStrategy8, tradingAsset8, aVar2.e, currency8, technicalIndicator8, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter8, aVar2.m, d316, d47, aVar2.p, startDealId8);
                                            }
                                        }
                                        return mn;
                                    }
                                }
                            }
                        }
                    }
                }
                return mn7;
            case 4:
                j2 = c7980zA1.s;
                boolean z13 = c7980zA1.p;
                d9 = (Double) c7980zA1.j;
                String str62 = (String) c7980zA1.i;
                d8 = (Double) c7980zA1.h;
                String str63 = (String) c7980zA1.g;
                String str64 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA9 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str4 = "off";
                str11 = str62;
                abstractC7770yA1 = abstractC7770yA9;
                z3 = z13;
                str9 = str64;
                obj5 = objB2;
                str5 = "on";
                str10 = str63;
                if (((Boolean) obj5).booleanValue()) {
                    str12 = "best_pair";
                } else {
                    str12 = "manual";
                }
                c7980zA1.d = abstractC7770yA1;
                c7980zA1.e = str9;
                c7980zA1.g = str10;
                c7980zA1.h = d8;
                c7980zA1.i = str11;
                c7980zA1.j = d9;
                c7980zA1.k = str12;
                c7980zA1.p = z3;
                c7980zA1.s = j2;
                c7980zA1.x = 5;
                objD2 = abstractC7770yA1.d(c7980zA1);
                if (objD2 != mn7) {
                    str13 = str11;
                    d10 = d9;
                    str14 = str12;
                    obj6 = objD2;
                    bool = (Boolean) obj6;
                    Intrinsics.checkNotNullParameter("", "onNull");
                    if (Intrinsics.a(bool, Boolean.TRUE)) {
                        str4 = str5;
                    } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                        str4 = "";
                    }
                    c7980zA1.d = abstractC7770yA1;
                    c7980zA1.e = str9;
                    c7980zA1.g = str10;
                    c7980zA1.h = d8;
                    c7980zA1.i = str13;
                    c7980zA1.j = d10;
                    c7980zA1.k = str14;
                    c7980zA1.l = str4;
                    c7980zA1.p = z3;
                    c7980zA1.s = j2;
                    c7980zA1.x = 6;
                    objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                    if (objO3 != mn7) {
                        String str5118 = str14;
                        str15 = str13;
                        str16 = str5118;
                        d11 = d10;
                        d12 = d8;
                        str17 = str10;
                        str18 = str9;
                        abstractC7770yA5 = abstractC7770yA1;
                        strB = ((EnumC2644a42) objO3).b();
                        c7980zA1.d = abstractC7770yA5;
                        c7980zA1.e = str18;
                        c7980zA1.g = str17;
                        c7980zA1.h = d12;
                        c7980zA1.i = str15;
                        c7980zA1.j = d11;
                        c7980zA1.k = str16;
                        c7980zA1.l = str4;
                        c7980zA1.m = strB;
                        c7980zA1.p = z3;
                        c7980zA1.x = 7;
                        objE = abstractC7770yA5.e(j2, c7980zA1);
                        if (objE != mn7) {
                            str19 = strB;
                            obj7 = objE;
                            str20 = str4;
                            dLongValue = ((Number) obj7).longValue();
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str18;
                            c7980zA1.g = str17;
                            c7980zA1.h = d12;
                            c7980zA1.i = str15;
                            c7980zA1.j = d11;
                            c7980zA1.k = str16;
                            c7980zA1.l = str20;
                            c7980zA1.m = str19;
                            c7980zA1.p = z3;
                            c7980zA1.t = dLongValue;
                            c7980zA1.x = 8;
                            objF = abstractC7770yA5.f(c7980zA1);
                            if (objF != mn7) {
                                String str5119 = str15;
                                str21 = str19;
                                str22 = str5119;
                                str23 = str18;
                                d13 = d11;
                                String str51110 = str17;
                                str24 = str16;
                                d14 = dLongValue;
                                str25 = str51110;
                                d15 = d14;
                                jLongValue = ((Number) objF).longValue();
                                OM om17 = abstractC7770yA5.p;
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str23;
                                c7980zA1.g = str25;
                                c7980zA1.h = d12;
                                c7980zA1.i = str22;
                                c7980zA1.j = d13;
                                c7980zA1.k = str24;
                                c7980zA1.l = str20;
                                c7980zA1.m = str21;
                                c7980zA1.p = z3;
                                str26 = str22;
                                str27 = str20;
                                c7980zA1.t = d15;
                                c7980zA1.s = jLongValue;
                                d16 = d12;
                                c7980zA1.x = 9;
                                objB = om17.b(d13, c7980zA1);
                                if (objB != mn7) {
                                    d17 = d15;
                                    j3 = jLongValue;
                                    str28 = str26;
                                    obj8 = objB;
                                    str29 = str23;
                                    d18 = d16;
                                    d19 = (Double) obj8;
                                    j4 = j3;
                                    AbstractC1787Pr.a aVar11 = abstractC7770yA5.j.b;
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str29;
                                    c7980zA1.g = str25;
                                    c7980zA1.h = d18;
                                    c7980zA1.i = str28;
                                    c7980zA1.j = d13;
                                    c7980zA1.k = str24;
                                    c7980zA1.l = str27;
                                    c7980zA1.m = str21;
                                    c7980zA1.n = d19;
                                    c7980zA1.p = z3;
                                    c7980zA1.t = d17;
                                    str30 = str28;
                                    str31 = str29;
                                    c7980zA1.s = j4;
                                    c7980zA1.x = 10;
                                    objO4 = C4466ii.o(aVar11, c7980zA1);
                                    mn = mn7;
                                    if (objO4 != mn) {
                                        j5 = j4;
                                        mn2 = mn;
                                        obj9 = objO4;
                                        str32 = str30;
                                        d20 = d18;
                                        d21 = d13;
                                        str33 = str27;
                                        str34 = str24;
                                        str35 = str21;
                                        z4 = z3;
                                        d22 = d19;
                                        str36 = str31;
                                        d23 = d17;
                                        iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                        InterfaceC6396rf0<Boolean> interfaceC6396rf0L9 = abstractC7770yA5.m.l();
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str36;
                                        c7980zA1.g = str25;
                                        c7980zA1.h = d20;
                                        c7980zA1.i = str32;
                                        c7980zA1.j = d21;
                                        c7980zA1.k = str34;
                                        c7980zA1.l = str33;
                                        c7980zA1.m = str35;
                                        c7980zA1.n = d22;
                                        c7980zA1.p = z4;
                                        c7980zA1.t = d23;
                                        str37 = str32;
                                        d24 = d20;
                                        c7980zA1.s = j5;
                                        c7980zA1.u = iR;
                                        c7980zA1.x = 11;
                                        objO5 = C4466ii.o(interfaceC6396rf0L9, c7980zA1);
                                        mn = mn2;
                                        if (objO5 != mn) {
                                            mn3 = mn;
                                            d25 = d21;
                                            d26 = d24;
                                            i = iR;
                                            str38 = str37;
                                            obj10 = objO5;
                                            str39 = str34;
                                            str40 = str33;
                                            str41 = str35;
                                            d27 = d22;
                                            z5 = z4;
                                            d28 = d23;
                                            j6 = j5;
                                            Boolean bool18 = (Boolean) obj10;
                                            j7 = j6;
                                            zBooleanValue4 = bool18.booleanValue();
                                            InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled9 = abstractC7770yA5.l.isEnabled();
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str36;
                                            c7980zA1.g = str25;
                                            c7980zA1.h = d26;
                                            c7980zA1.i = str38;
                                            c7980zA1.j = d25;
                                            c7980zA1.k = str39;
                                            c7980zA1.l = str40;
                                            c7980zA1.m = str41;
                                            c7980zA1.n = d27;
                                            c7980zA1.p = z5;
                                            c7980zA1.t = d28;
                                            d29 = d25;
                                            str42 = str39;
                                            c7980zA1.s = j7;
                                            i2 = i;
                                            c7980zA1.u = i2;
                                            c7980zA1.q = zBooleanValue4;
                                            c7980zA1.x = 12;
                                            objO6 = C4466ii.o(interfaceC6396rf0IsEnabled9, c7980zA1);
                                            mn4 = mn3;
                                            if (objO6 == mn4) {
                                                return mn4;
                                            }
                                            obj11 = objO6;
                                            d30 = d27;
                                            z6 = zBooleanValue4;
                                            str43 = str40;
                                            str44 = str42;
                                            j8 = j7;
                                            mn5 = mn4;
                                            d31 = d28;
                                            i3 = i2;
                                            d32 = d26;
                                            str45 = str38;
                                            d33 = d29;
                                            Boolean bool19 = (Boolean) obj11;
                                            z7 = z6;
                                            zBooleanValue5 = bool19.booleanValue();
                                            c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                            if (c3279d22 != null) {
                                                str46 = "-";
                                            } else {
                                                str46 = "-";
                                            }
                                            i4 = i3;
                                            InterfaceC6396rf0<C1491Lx0> interfaceC6396rf8 = abstractC7770yA5.c.b;
                                            c7980zA1.d = abstractC7770yA5;
                                            c7980zA1.e = str36;
                                            c7980zA1.g = str25;
                                            c7980zA1.h = d32;
                                            c7980zA1.i = str45;
                                            c7980zA1.j = d33;
                                            c7980zA1.k = str44;
                                            c7980zA1.l = str43;
                                            c7980zA1.m = str41;
                                            c7980zA1.n = d30;
                                            c7980zA1.o = str46;
                                            c7980zA1.p = z5;
                                            c7980zA1.t = d31;
                                            d34 = d32;
                                            d35 = d30;
                                            c7980zA1.s = j8;
                                            c7980zA1.u = i4;
                                            c7980zA1.q = z7;
                                            c7980zA1.r = zBooleanValue5;
                                            c7980zA1.x = 13;
                                            objO7 = C4466ii.o(interfaceC6396rf8, c7980zA1);
                                            mn6 = mn5;
                                            if (objO7 == mn6) {
                                                return mn6;
                                            }
                                            z8 = zBooleanValue5;
                                            d36 = d35;
                                            z9 = z7;
                                            str47 = str36;
                                            d37 = d33;
                                            str48 = str46;
                                            str49 = str25;
                                            str50 = str45;
                                            j9 = j8;
                                            i5 = i4;
                                            d38 = d34;
                                            obj12 = objO7;
                                            str51 = str41;
                                            str52 = str44;
                                            aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                            if (z5) {
                                                return aVar;
                                            }
                                            OM om18 = abstractC7770yA5.p;
                                            c7980zA1.d = aVar;
                                            c7980zA1.e = d38;
                                            c7980zA1.g = null;
                                            c7980zA1.h = null;
                                            c7980zA1.i = null;
                                            c7980zA1.j = null;
                                            c7980zA1.k = null;
                                            c7980zA1.l = null;
                                            c7980zA1.m = null;
                                            c7980zA1.n = null;
                                            c7980zA1.o = null;
                                            c7980zA1.s = 0L;
                                            c7980zA1.u = 0;
                                            c7980zA1.x = 14;
                                            objB2 = om18.b(d38, c7980zA1);
                                            if (objB2 == mn6) {
                                                return mn6;
                                            }
                                            aVar2 = aVar;
                                            Double d317 = d38;
                                            Double d48 = (Double) objB2;
                                            String assetSelectionOnOff9 = aVar2.a;
                                            Intrinsics.checkNotNullParameter(assetSelectionOnOff9, "assetSelectionOnOff");
                                            String assetSelectionName9 = aVar2.b;
                                            Intrinsics.checkNotNullParameter(assetSelectionName9, "assetSelectionName");
                                            String tradingStrategy9 = aVar2.c;
                                            Intrinsics.checkNotNullParameter(tradingStrategy9, "tradingStrategy");
                                            String tradingAsset9 = aVar2.d;
                                            Intrinsics.checkNotNullParameter(tradingAsset9, "tradingAsset");
                                            String currency9 = aVar2.f;
                                            Intrinsics.checkNotNullParameter(currency9, "currency");
                                            String technicalIndicator9 = aVar2.g;
                                            Intrinsics.checkNotNullParameter(technicalIndicator9, "technicalIndicator");
                                            String profitFilter9 = aVar2.l;
                                            Intrinsics.checkNotNullParameter(profitFilter9, "profitFilter");
                                            String startDealId9 = aVar2.q;
                                            Intrinsics.checkNotNullParameter(startDealId9, "startDealId");
                                            return new a(assetSelectionOnOff9, assetSelectionName9, tradingStrategy9, tradingAsset9, aVar2.e, currency9, technicalIndicator9, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter9, aVar2.m, d317, d48, aVar2.p, startDealId9);
                                        }
                                    }
                                    return mn;
                                }
                            }
                        }
                    }
                }
                return mn7;
            case 5:
                j2 = c7980zA1.s;
                boolean z14 = c7980zA1.p;
                str14 = c7980zA1.k;
                Double d49 = (Double) c7980zA1.j;
                String str65 = (String) c7980zA1.i;
                Double d50 = (Double) c7980zA1.h;
                str10 = (String) c7980zA1.g;
                str9 = (String) c7980zA1.e;
                abstractC7770yA1 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str4 = "off";
                d10 = d49;
                str13 = str65;
                d8 = d50;
                z3 = z14;
                obj6 = objB2;
                str5 = "on";
                bool = (Boolean) obj6;
                Intrinsics.checkNotNullParameter("", "onNull");
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    str4 = str5;
                } else if (!Intrinsics.a(bool, Boolean.FALSE)) {
                    str4 = "";
                }
                c7980zA1.d = abstractC7770yA1;
                c7980zA1.e = str9;
                c7980zA1.g = str10;
                c7980zA1.h = d8;
                c7980zA1.i = str13;
                c7980zA1.j = d10;
                c7980zA1.k = str14;
                c7980zA1.l = str4;
                c7980zA1.p = z3;
                c7980zA1.s = j2;
                c7980zA1.x = 6;
                objO3 = C4466ii.o(abstractC7770yA1.g.k(), c7980zA1);
                if (objO3 != mn7) {
                    String str51111 = str14;
                    str15 = str13;
                    str16 = str51111;
                    d11 = d10;
                    d12 = d8;
                    str17 = str10;
                    str18 = str9;
                    abstractC7770yA5 = abstractC7770yA1;
                    strB = ((EnumC2644a42) objO3).b();
                    c7980zA1.d = abstractC7770yA5;
                    c7980zA1.e = str18;
                    c7980zA1.g = str17;
                    c7980zA1.h = d12;
                    c7980zA1.i = str15;
                    c7980zA1.j = d11;
                    c7980zA1.k = str16;
                    c7980zA1.l = str4;
                    c7980zA1.m = strB;
                    c7980zA1.p = z3;
                    c7980zA1.x = 7;
                    objE = abstractC7770yA5.e(j2, c7980zA1);
                    if (objE != mn7) {
                        str19 = strB;
                        obj7 = objE;
                        str20 = str4;
                        dLongValue = ((Number) obj7).longValue();
                        c7980zA1.d = abstractC7770yA5;
                        c7980zA1.e = str18;
                        c7980zA1.g = str17;
                        c7980zA1.h = d12;
                        c7980zA1.i = str15;
                        c7980zA1.j = d11;
                        c7980zA1.k = str16;
                        c7980zA1.l = str20;
                        c7980zA1.m = str19;
                        c7980zA1.p = z3;
                        c7980zA1.t = dLongValue;
                        c7980zA1.x = 8;
                        objF = abstractC7770yA5.f(c7980zA1);
                        if (objF != mn7) {
                            String str51112 = str15;
                            str21 = str19;
                            str22 = str51112;
                            str23 = str18;
                            d13 = d11;
                            String str51113 = str17;
                            str24 = str16;
                            d14 = dLongValue;
                            str25 = str51113;
                            d15 = d14;
                            jLongValue = ((Number) objF).longValue();
                            OM om19 = abstractC7770yA5.p;
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str23;
                            c7980zA1.g = str25;
                            c7980zA1.h = d12;
                            c7980zA1.i = str22;
                            c7980zA1.j = d13;
                            c7980zA1.k = str24;
                            c7980zA1.l = str20;
                            c7980zA1.m = str21;
                            c7980zA1.p = z3;
                            str26 = str22;
                            str27 = str20;
                            c7980zA1.t = d15;
                            c7980zA1.s = jLongValue;
                            d16 = d12;
                            c7980zA1.x = 9;
                            objB = om19.b(d13, c7980zA1);
                            if (objB != mn7) {
                                d17 = d15;
                                j3 = jLongValue;
                                str28 = str26;
                                obj8 = objB;
                                str29 = str23;
                                d18 = d16;
                                d19 = (Double) obj8;
                                j4 = j3;
                                AbstractC1787Pr.a aVar12 = abstractC7770yA5.j.b;
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str29;
                                c7980zA1.g = str25;
                                c7980zA1.h = d18;
                                c7980zA1.i = str28;
                                c7980zA1.j = d13;
                                c7980zA1.k = str24;
                                c7980zA1.l = str27;
                                c7980zA1.m = str21;
                                c7980zA1.n = d19;
                                c7980zA1.p = z3;
                                c7980zA1.t = d17;
                                str30 = str28;
                                str31 = str29;
                                c7980zA1.s = j4;
                                c7980zA1.x = 10;
                                objO4 = C4466ii.o(aVar12, c7980zA1);
                                mn = mn7;
                                if (objO4 != mn) {
                                    j5 = j4;
                                    mn2 = mn;
                                    obj9 = objO4;
                                    str32 = str30;
                                    d20 = d18;
                                    d21 = d13;
                                    str33 = str27;
                                    str34 = str24;
                                    str35 = str21;
                                    z4 = z3;
                                    d22 = d19;
                                    str36 = str31;
                                    d23 = d17;
                                    iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                    InterfaceC6396rf0<Boolean> interfaceC6396rf0L10 = abstractC7770yA5.m.l();
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str36;
                                    c7980zA1.g = str25;
                                    c7980zA1.h = d20;
                                    c7980zA1.i = str32;
                                    c7980zA1.j = d21;
                                    c7980zA1.k = str34;
                                    c7980zA1.l = str33;
                                    c7980zA1.m = str35;
                                    c7980zA1.n = d22;
                                    c7980zA1.p = z4;
                                    c7980zA1.t = d23;
                                    str37 = str32;
                                    d24 = d20;
                                    c7980zA1.s = j5;
                                    c7980zA1.u = iR;
                                    c7980zA1.x = 11;
                                    objO5 = C4466ii.o(interfaceC6396rf0L10, c7980zA1);
                                    mn = mn2;
                                    if (objO5 != mn) {
                                        mn3 = mn;
                                        d25 = d21;
                                        d26 = d24;
                                        i = iR;
                                        str38 = str37;
                                        obj10 = objO5;
                                        str39 = str34;
                                        str40 = str33;
                                        str41 = str35;
                                        d27 = d22;
                                        z5 = z4;
                                        d28 = d23;
                                        j6 = j5;
                                        Boolean bool110 = (Boolean) obj10;
                                        j7 = j6;
                                        zBooleanValue4 = bool110.booleanValue();
                                        InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled10 = abstractC7770yA5.l.isEnabled();
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str36;
                                        c7980zA1.g = str25;
                                        c7980zA1.h = d26;
                                        c7980zA1.i = str38;
                                        c7980zA1.j = d25;
                                        c7980zA1.k = str39;
                                        c7980zA1.l = str40;
                                        c7980zA1.m = str41;
                                        c7980zA1.n = d27;
                                        c7980zA1.p = z5;
                                        c7980zA1.t = d28;
                                        d29 = d25;
                                        str42 = str39;
                                        c7980zA1.s = j7;
                                        i2 = i;
                                        c7980zA1.u = i2;
                                        c7980zA1.q = zBooleanValue4;
                                        c7980zA1.x = 12;
                                        objO6 = C4466ii.o(interfaceC6396rf0IsEnabled10, c7980zA1);
                                        mn4 = mn3;
                                        if (objO6 == mn4) {
                                            return mn4;
                                        }
                                        obj11 = objO6;
                                        d30 = d27;
                                        z6 = zBooleanValue4;
                                        str43 = str40;
                                        str44 = str42;
                                        j8 = j7;
                                        mn5 = mn4;
                                        d31 = d28;
                                        i3 = i2;
                                        d32 = d26;
                                        str45 = str38;
                                        d33 = d29;
                                        Boolean bool111 = (Boolean) obj11;
                                        z7 = z6;
                                        zBooleanValue5 = bool111.booleanValue();
                                        c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                        if (c3279d22 != null) {
                                            str46 = "-";
                                        } else {
                                            str46 = "-";
                                        }
                                        i4 = i3;
                                        InterfaceC6396rf0<C1491Lx0> interfaceC6396rf9 = abstractC7770yA5.c.b;
                                        c7980zA1.d = abstractC7770yA5;
                                        c7980zA1.e = str36;
                                        c7980zA1.g = str25;
                                        c7980zA1.h = d32;
                                        c7980zA1.i = str45;
                                        c7980zA1.j = d33;
                                        c7980zA1.k = str44;
                                        c7980zA1.l = str43;
                                        c7980zA1.m = str41;
                                        c7980zA1.n = d30;
                                        c7980zA1.o = str46;
                                        c7980zA1.p = z5;
                                        c7980zA1.t = d31;
                                        d34 = d32;
                                        d35 = d30;
                                        c7980zA1.s = j8;
                                        c7980zA1.u = i4;
                                        c7980zA1.q = z7;
                                        c7980zA1.r = zBooleanValue5;
                                        c7980zA1.x = 13;
                                        objO7 = C4466ii.o(interfaceC6396rf9, c7980zA1);
                                        mn6 = mn5;
                                        if (objO7 == mn6) {
                                            return mn6;
                                        }
                                        z8 = zBooleanValue5;
                                        d36 = d35;
                                        z9 = z7;
                                        str47 = str36;
                                        d37 = d33;
                                        str48 = str46;
                                        str49 = str25;
                                        str50 = str45;
                                        j9 = j8;
                                        i5 = i4;
                                        d38 = d34;
                                        obj12 = objO7;
                                        str51 = str41;
                                        str52 = str44;
                                        aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                        if (z5) {
                                            return aVar;
                                        }
                                        OM om110 = abstractC7770yA5.p;
                                        c7980zA1.d = aVar;
                                        c7980zA1.e = d38;
                                        c7980zA1.g = null;
                                        c7980zA1.h = null;
                                        c7980zA1.i = null;
                                        c7980zA1.j = null;
                                        c7980zA1.k = null;
                                        c7980zA1.l = null;
                                        c7980zA1.m = null;
                                        c7980zA1.n = null;
                                        c7980zA1.o = null;
                                        c7980zA1.s = 0L;
                                        c7980zA1.u = 0;
                                        c7980zA1.x = 14;
                                        objB2 = om110.b(d38, c7980zA1);
                                        if (objB2 == mn6) {
                                            return mn6;
                                        }
                                        aVar2 = aVar;
                                        Double d318 = d38;
                                        Double d410 = (Double) objB2;
                                        String assetSelectionOnOff10 = aVar2.a;
                                        Intrinsics.checkNotNullParameter(assetSelectionOnOff10, "assetSelectionOnOff");
                                        String assetSelectionName10 = aVar2.b;
                                        Intrinsics.checkNotNullParameter(assetSelectionName10, "assetSelectionName");
                                        String tradingStrategy10 = aVar2.c;
                                        Intrinsics.checkNotNullParameter(tradingStrategy10, "tradingStrategy");
                                        String tradingAsset10 = aVar2.d;
                                        Intrinsics.checkNotNullParameter(tradingAsset10, "tradingAsset");
                                        String currency10 = aVar2.f;
                                        Intrinsics.checkNotNullParameter(currency10, "currency");
                                        String technicalIndicator10 = aVar2.g;
                                        Intrinsics.checkNotNullParameter(technicalIndicator10, "technicalIndicator");
                                        String profitFilter10 = aVar2.l;
                                        Intrinsics.checkNotNullParameter(profitFilter10, "profitFilter");
                                        String startDealId10 = aVar2.q;
                                        Intrinsics.checkNotNullParameter(startDealId10, "startDealId");
                                        return new a(assetSelectionOnOff10, assetSelectionName10, tradingStrategy10, tradingAsset10, aVar2.e, currency10, technicalIndicator10, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter10, aVar2.m, d318, d410, aVar2.p, startDealId10);
                                    }
                                }
                                return mn;
                            }
                        }
                    }
                }
                return mn7;
            case 6:
                j2 = c7980zA1.s;
                boolean z15 = c7980zA1.p;
                String str66 = c7980zA1.l;
                String str67 = c7980zA1.k;
                Double d51 = (Double) c7980zA1.j;
                String str68 = (String) c7980zA1.i;
                Double d52 = (Double) c7980zA1.h;
                String str69 = (String) c7980zA1.g;
                String str70 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA10 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str4 = str66;
                str16 = str67;
                d11 = d51;
                str15 = str68;
                d12 = d52;
                str17 = str69;
                str18 = str70;
                abstractC7770yA5 = abstractC7770yA10;
                z3 = z15;
                objO3 = objB2;
                strB = ((EnumC2644a42) objO3).b();
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str18;
                c7980zA1.g = str17;
                c7980zA1.h = d12;
                c7980zA1.i = str15;
                c7980zA1.j = d11;
                c7980zA1.k = str16;
                c7980zA1.l = str4;
                c7980zA1.m = strB;
                c7980zA1.p = z3;
                c7980zA1.x = 7;
                objE = abstractC7770yA5.e(j2, c7980zA1);
                if (objE != mn7) {
                    str19 = strB;
                    obj7 = objE;
                    str20 = str4;
                    dLongValue = ((Number) obj7).longValue();
                    c7980zA1.d = abstractC7770yA5;
                    c7980zA1.e = str18;
                    c7980zA1.g = str17;
                    c7980zA1.h = d12;
                    c7980zA1.i = str15;
                    c7980zA1.j = d11;
                    c7980zA1.k = str16;
                    c7980zA1.l = str20;
                    c7980zA1.m = str19;
                    c7980zA1.p = z3;
                    c7980zA1.t = dLongValue;
                    c7980zA1.x = 8;
                    objF = abstractC7770yA5.f(c7980zA1);
                    if (objF != mn7) {
                        String str51114 = str15;
                        str21 = str19;
                        str22 = str51114;
                        str23 = str18;
                        d13 = d11;
                        String str51115 = str17;
                        str24 = str16;
                        d14 = dLongValue;
                        str25 = str51115;
                        d15 = d14;
                        jLongValue = ((Number) objF).longValue();
                        OM om111 = abstractC7770yA5.p;
                        c7980zA1.d = abstractC7770yA5;
                        c7980zA1.e = str23;
                        c7980zA1.g = str25;
                        c7980zA1.h = d12;
                        c7980zA1.i = str22;
                        c7980zA1.j = d13;
                        c7980zA1.k = str24;
                        c7980zA1.l = str20;
                        c7980zA1.m = str21;
                        c7980zA1.p = z3;
                        str26 = str22;
                        str27 = str20;
                        c7980zA1.t = d15;
                        c7980zA1.s = jLongValue;
                        d16 = d12;
                        c7980zA1.x = 9;
                        objB = om111.b(d13, c7980zA1);
                        if (objB != mn7) {
                            d17 = d15;
                            j3 = jLongValue;
                            str28 = str26;
                            obj8 = objB;
                            str29 = str23;
                            d18 = d16;
                            d19 = (Double) obj8;
                            j4 = j3;
                            AbstractC1787Pr.a aVar13 = abstractC7770yA5.j.b;
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str29;
                            c7980zA1.g = str25;
                            c7980zA1.h = d18;
                            c7980zA1.i = str28;
                            c7980zA1.j = d13;
                            c7980zA1.k = str24;
                            c7980zA1.l = str27;
                            c7980zA1.m = str21;
                            c7980zA1.n = d19;
                            c7980zA1.p = z3;
                            c7980zA1.t = d17;
                            str30 = str28;
                            str31 = str29;
                            c7980zA1.s = j4;
                            c7980zA1.x = 10;
                            objO4 = C4466ii.o(aVar13, c7980zA1);
                            mn = mn7;
                            if (objO4 != mn) {
                                j5 = j4;
                                mn2 = mn;
                                obj9 = objO4;
                                str32 = str30;
                                d20 = d18;
                                d21 = d13;
                                str33 = str27;
                                str34 = str24;
                                str35 = str21;
                                z4 = z3;
                                d22 = d19;
                                str36 = str31;
                                d23 = d17;
                                iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                                InterfaceC6396rf0<Boolean> interfaceC6396rf0L11 = abstractC7770yA5.m.l();
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str36;
                                c7980zA1.g = str25;
                                c7980zA1.h = d20;
                                c7980zA1.i = str32;
                                c7980zA1.j = d21;
                                c7980zA1.k = str34;
                                c7980zA1.l = str33;
                                c7980zA1.m = str35;
                                c7980zA1.n = d22;
                                c7980zA1.p = z4;
                                c7980zA1.t = d23;
                                str37 = str32;
                                d24 = d20;
                                c7980zA1.s = j5;
                                c7980zA1.u = iR;
                                c7980zA1.x = 11;
                                objO5 = C4466ii.o(interfaceC6396rf0L11, c7980zA1);
                                mn = mn2;
                                if (objO5 != mn) {
                                    mn3 = mn;
                                    d25 = d21;
                                    d26 = d24;
                                    i = iR;
                                    str38 = str37;
                                    obj10 = objO5;
                                    str39 = str34;
                                    str40 = str33;
                                    str41 = str35;
                                    d27 = d22;
                                    z5 = z4;
                                    d28 = d23;
                                    j6 = j5;
                                    Boolean bool112 = (Boolean) obj10;
                                    j7 = j6;
                                    zBooleanValue4 = bool112.booleanValue();
                                    InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled11 = abstractC7770yA5.l.isEnabled();
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str36;
                                    c7980zA1.g = str25;
                                    c7980zA1.h = d26;
                                    c7980zA1.i = str38;
                                    c7980zA1.j = d25;
                                    c7980zA1.k = str39;
                                    c7980zA1.l = str40;
                                    c7980zA1.m = str41;
                                    c7980zA1.n = d27;
                                    c7980zA1.p = z5;
                                    c7980zA1.t = d28;
                                    d29 = d25;
                                    str42 = str39;
                                    c7980zA1.s = j7;
                                    i2 = i;
                                    c7980zA1.u = i2;
                                    c7980zA1.q = zBooleanValue4;
                                    c7980zA1.x = 12;
                                    objO6 = C4466ii.o(interfaceC6396rf0IsEnabled11, c7980zA1);
                                    mn4 = mn3;
                                    if (objO6 == mn4) {
                                        return mn4;
                                    }
                                    obj11 = objO6;
                                    d30 = d27;
                                    z6 = zBooleanValue4;
                                    str43 = str40;
                                    str44 = str42;
                                    j8 = j7;
                                    mn5 = mn4;
                                    d31 = d28;
                                    i3 = i2;
                                    d32 = d26;
                                    str45 = str38;
                                    d33 = d29;
                                    Boolean bool113 = (Boolean) obj11;
                                    z7 = z6;
                                    zBooleanValue5 = bool113.booleanValue();
                                    c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                    if (c3279d22 != null) {
                                        str46 = "-";
                                    } else {
                                        str46 = "-";
                                    }
                                    i4 = i3;
                                    InterfaceC6396rf0<C1491Lx0> interfaceC6396rf10 = abstractC7770yA5.c.b;
                                    c7980zA1.d = abstractC7770yA5;
                                    c7980zA1.e = str36;
                                    c7980zA1.g = str25;
                                    c7980zA1.h = d32;
                                    c7980zA1.i = str45;
                                    c7980zA1.j = d33;
                                    c7980zA1.k = str44;
                                    c7980zA1.l = str43;
                                    c7980zA1.m = str41;
                                    c7980zA1.n = d30;
                                    c7980zA1.o = str46;
                                    c7980zA1.p = z5;
                                    c7980zA1.t = d31;
                                    d34 = d32;
                                    d35 = d30;
                                    c7980zA1.s = j8;
                                    c7980zA1.u = i4;
                                    c7980zA1.q = z7;
                                    c7980zA1.r = zBooleanValue5;
                                    c7980zA1.x = 13;
                                    objO7 = C4466ii.o(interfaceC6396rf10, c7980zA1);
                                    mn6 = mn5;
                                    if (objO7 == mn6) {
                                        return mn6;
                                    }
                                    z8 = zBooleanValue5;
                                    d36 = d35;
                                    z9 = z7;
                                    str47 = str36;
                                    d37 = d33;
                                    str48 = str46;
                                    str49 = str25;
                                    str50 = str45;
                                    j9 = j8;
                                    i5 = i4;
                                    d38 = d34;
                                    obj12 = objO7;
                                    str51 = str41;
                                    str52 = str44;
                                    aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                    if (z5) {
                                        return aVar;
                                    }
                                    OM om112 = abstractC7770yA5.p;
                                    c7980zA1.d = aVar;
                                    c7980zA1.e = d38;
                                    c7980zA1.g = null;
                                    c7980zA1.h = null;
                                    c7980zA1.i = null;
                                    c7980zA1.j = null;
                                    c7980zA1.k = null;
                                    c7980zA1.l = null;
                                    c7980zA1.m = null;
                                    c7980zA1.n = null;
                                    c7980zA1.o = null;
                                    c7980zA1.s = 0L;
                                    c7980zA1.u = 0;
                                    c7980zA1.x = 14;
                                    objB2 = om112.b(d38, c7980zA1);
                                    if (objB2 == mn6) {
                                        return mn6;
                                    }
                                    aVar2 = aVar;
                                    Double d319 = d38;
                                    Double d411 = (Double) objB2;
                                    String assetSelectionOnOff11 = aVar2.a;
                                    Intrinsics.checkNotNullParameter(assetSelectionOnOff11, "assetSelectionOnOff");
                                    String assetSelectionName11 = aVar2.b;
                                    Intrinsics.checkNotNullParameter(assetSelectionName11, "assetSelectionName");
                                    String tradingStrategy11 = aVar2.c;
                                    Intrinsics.checkNotNullParameter(tradingStrategy11, "tradingStrategy");
                                    String tradingAsset11 = aVar2.d;
                                    Intrinsics.checkNotNullParameter(tradingAsset11, "tradingAsset");
                                    String currency11 = aVar2.f;
                                    Intrinsics.checkNotNullParameter(currency11, "currency");
                                    String technicalIndicator11 = aVar2.g;
                                    Intrinsics.checkNotNullParameter(technicalIndicator11, "technicalIndicator");
                                    String profitFilter11 = aVar2.l;
                                    Intrinsics.checkNotNullParameter(profitFilter11, "profitFilter");
                                    String startDealId11 = aVar2.q;
                                    Intrinsics.checkNotNullParameter(startDealId11, "startDealId");
                                    return new a(assetSelectionOnOff11, assetSelectionName11, tradingStrategy11, tradingAsset11, aVar2.e, currency11, technicalIndicator11, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter11, aVar2.m, d319, d411, aVar2.p, startDealId11);
                                }
                            }
                            return mn;
                        }
                    }
                }
                return mn7;
            case 7:
                boolean z16 = c7980zA1.p;
                str19 = c7980zA1.m;
                str20 = c7980zA1.l;
                str16 = c7980zA1.k;
                d11 = (Double) c7980zA1.j;
                str15 = (String) c7980zA1.i;
                Double d53 = (Double) c7980zA1.h;
                str17 = (String) c7980zA1.g;
                str18 = (String) c7980zA1.e;
                abstractC7770yA5 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                d12 = d53;
                z3 = z16;
                obj7 = objB2;
                dLongValue = ((Number) obj7).longValue();
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str18;
                c7980zA1.g = str17;
                c7980zA1.h = d12;
                c7980zA1.i = str15;
                c7980zA1.j = d11;
                c7980zA1.k = str16;
                c7980zA1.l = str20;
                c7980zA1.m = str19;
                c7980zA1.p = z3;
                c7980zA1.t = dLongValue;
                c7980zA1.x = 8;
                objF = abstractC7770yA5.f(c7980zA1);
                if (objF != mn7) {
                    String str51116 = str15;
                    str21 = str19;
                    str22 = str51116;
                    str23 = str18;
                    d13 = d11;
                    String str51117 = str17;
                    str24 = str16;
                    d14 = dLongValue;
                    str25 = str51117;
                    d15 = d14;
                    jLongValue = ((Number) objF).longValue();
                    OM om113 = abstractC7770yA5.p;
                    c7980zA1.d = abstractC7770yA5;
                    c7980zA1.e = str23;
                    c7980zA1.g = str25;
                    c7980zA1.h = d12;
                    c7980zA1.i = str22;
                    c7980zA1.j = d13;
                    c7980zA1.k = str24;
                    c7980zA1.l = str20;
                    c7980zA1.m = str21;
                    c7980zA1.p = z3;
                    str26 = str22;
                    str27 = str20;
                    c7980zA1.t = d15;
                    c7980zA1.s = jLongValue;
                    d16 = d12;
                    c7980zA1.x = 9;
                    objB = om113.b(d13, c7980zA1);
                    if (objB != mn7) {
                        d17 = d15;
                        j3 = jLongValue;
                        str28 = str26;
                        obj8 = objB;
                        str29 = str23;
                        d18 = d16;
                        d19 = (Double) obj8;
                        j4 = j3;
                        AbstractC1787Pr.a aVar14 = abstractC7770yA5.j.b;
                        c7980zA1.d = abstractC7770yA5;
                        c7980zA1.e = str29;
                        c7980zA1.g = str25;
                        c7980zA1.h = d18;
                        c7980zA1.i = str28;
                        c7980zA1.j = d13;
                        c7980zA1.k = str24;
                        c7980zA1.l = str27;
                        c7980zA1.m = str21;
                        c7980zA1.n = d19;
                        c7980zA1.p = z3;
                        c7980zA1.t = d17;
                        str30 = str28;
                        str31 = str29;
                        c7980zA1.s = j4;
                        c7980zA1.x = 10;
                        objO4 = C4466ii.o(aVar14, c7980zA1);
                        mn = mn7;
                        if (objO4 != mn) {
                            j5 = j4;
                            mn2 = mn;
                            obj9 = objO4;
                            str32 = str30;
                            d20 = d18;
                            d21 = d13;
                            str33 = str27;
                            str34 = str24;
                            str35 = str21;
                            z4 = z3;
                            d22 = d19;
                            str36 = str31;
                            d23 = d17;
                            iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                            InterfaceC6396rf0<Boolean> interfaceC6396rf0L12 = abstractC7770yA5.m.l();
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str36;
                            c7980zA1.g = str25;
                            c7980zA1.h = d20;
                            c7980zA1.i = str32;
                            c7980zA1.j = d21;
                            c7980zA1.k = str34;
                            c7980zA1.l = str33;
                            c7980zA1.m = str35;
                            c7980zA1.n = d22;
                            c7980zA1.p = z4;
                            c7980zA1.t = d23;
                            str37 = str32;
                            d24 = d20;
                            c7980zA1.s = j5;
                            c7980zA1.u = iR;
                            c7980zA1.x = 11;
                            objO5 = C4466ii.o(interfaceC6396rf0L12, c7980zA1);
                            mn = mn2;
                            if (objO5 != mn) {
                                mn3 = mn;
                                d25 = d21;
                                d26 = d24;
                                i = iR;
                                str38 = str37;
                                obj10 = objO5;
                                str39 = str34;
                                str40 = str33;
                                str41 = str35;
                                d27 = d22;
                                z5 = z4;
                                d28 = d23;
                                j6 = j5;
                                Boolean bool114 = (Boolean) obj10;
                                j7 = j6;
                                zBooleanValue4 = bool114.booleanValue();
                                InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled12 = abstractC7770yA5.l.isEnabled();
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str36;
                                c7980zA1.g = str25;
                                c7980zA1.h = d26;
                                c7980zA1.i = str38;
                                c7980zA1.j = d25;
                                c7980zA1.k = str39;
                                c7980zA1.l = str40;
                                c7980zA1.m = str41;
                                c7980zA1.n = d27;
                                c7980zA1.p = z5;
                                c7980zA1.t = d28;
                                d29 = d25;
                                str42 = str39;
                                c7980zA1.s = j7;
                                i2 = i;
                                c7980zA1.u = i2;
                                c7980zA1.q = zBooleanValue4;
                                c7980zA1.x = 12;
                                objO6 = C4466ii.o(interfaceC6396rf0IsEnabled12, c7980zA1);
                                mn4 = mn3;
                                if (objO6 == mn4) {
                                    return mn4;
                                }
                                obj11 = objO6;
                                d30 = d27;
                                z6 = zBooleanValue4;
                                str43 = str40;
                                str44 = str42;
                                j8 = j7;
                                mn5 = mn4;
                                d31 = d28;
                                i3 = i2;
                                d32 = d26;
                                str45 = str38;
                                d33 = d29;
                                Boolean bool115 = (Boolean) obj11;
                                z7 = z6;
                                zBooleanValue5 = bool115.booleanValue();
                                c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                                if (c3279d22 != null) {
                                    str46 = "-";
                                } else {
                                    str46 = "-";
                                }
                                i4 = i3;
                                InterfaceC6396rf0<C1491Lx0> interfaceC6396rf11 = abstractC7770yA5.c.b;
                                c7980zA1.d = abstractC7770yA5;
                                c7980zA1.e = str36;
                                c7980zA1.g = str25;
                                c7980zA1.h = d32;
                                c7980zA1.i = str45;
                                c7980zA1.j = d33;
                                c7980zA1.k = str44;
                                c7980zA1.l = str43;
                                c7980zA1.m = str41;
                                c7980zA1.n = d30;
                                c7980zA1.o = str46;
                                c7980zA1.p = z5;
                                c7980zA1.t = d31;
                                d34 = d32;
                                d35 = d30;
                                c7980zA1.s = j8;
                                c7980zA1.u = i4;
                                c7980zA1.q = z7;
                                c7980zA1.r = zBooleanValue5;
                                c7980zA1.x = 13;
                                objO7 = C4466ii.o(interfaceC6396rf11, c7980zA1);
                                mn6 = mn5;
                                if (objO7 == mn6) {
                                    return mn6;
                                }
                                z8 = zBooleanValue5;
                                d36 = d35;
                                z9 = z7;
                                str47 = str36;
                                d37 = d33;
                                str48 = str46;
                                str49 = str25;
                                str50 = str45;
                                j9 = j8;
                                i5 = i4;
                                d38 = d34;
                                obj12 = objO7;
                                str51 = str41;
                                str52 = str44;
                                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                                if (z5) {
                                    return aVar;
                                }
                                OM om114 = abstractC7770yA5.p;
                                c7980zA1.d = aVar;
                                c7980zA1.e = d38;
                                c7980zA1.g = null;
                                c7980zA1.h = null;
                                c7980zA1.i = null;
                                c7980zA1.j = null;
                                c7980zA1.k = null;
                                c7980zA1.l = null;
                                c7980zA1.m = null;
                                c7980zA1.n = null;
                                c7980zA1.o = null;
                                c7980zA1.s = 0L;
                                c7980zA1.u = 0;
                                c7980zA1.x = 14;
                                objB2 = om114.b(d38, c7980zA1);
                                if (objB2 == mn6) {
                                    return mn6;
                                }
                                aVar2 = aVar;
                                Double d3110 = d38;
                                Double d412 = (Double) objB2;
                                String assetSelectionOnOff12 = aVar2.a;
                                Intrinsics.checkNotNullParameter(assetSelectionOnOff12, "assetSelectionOnOff");
                                String assetSelectionName12 = aVar2.b;
                                Intrinsics.checkNotNullParameter(assetSelectionName12, "assetSelectionName");
                                String tradingStrategy12 = aVar2.c;
                                Intrinsics.checkNotNullParameter(tradingStrategy12, "tradingStrategy");
                                String tradingAsset12 = aVar2.d;
                                Intrinsics.checkNotNullParameter(tradingAsset12, "tradingAsset");
                                String currency12 = aVar2.f;
                                Intrinsics.checkNotNullParameter(currency12, "currency");
                                String technicalIndicator12 = aVar2.g;
                                Intrinsics.checkNotNullParameter(technicalIndicator12, "technicalIndicator");
                                String profitFilter12 = aVar2.l;
                                Intrinsics.checkNotNullParameter(profitFilter12, "profitFilter");
                                String startDealId12 = aVar2.q;
                                Intrinsics.checkNotNullParameter(startDealId12, "startDealId");
                                return new a(assetSelectionOnOff12, assetSelectionName12, tradingStrategy12, tradingAsset12, aVar2.e, currency12, technicalIndicator12, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter12, aVar2.m, d3110, d412, aVar2.p, startDealId12);
                            }
                        }
                        return mn;
                    }
                }
                return mn7;
            case 8:
                double d54 = c7980zA1.t;
                boolean z17 = c7980zA1.p;
                String str71 = c7980zA1.m;
                String str72 = c7980zA1.l;
                String str73 = c7980zA1.k;
                Double d55 = (Double) c7980zA1.j;
                String str74 = (String) c7980zA1.i;
                Double d56 = (Double) c7980zA1.h;
                String str75 = (String) c7980zA1.g;
                String str76 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA11 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str25 = str75;
                abstractC7770yA5 = abstractC7770yA11;
                d12 = d56;
                str23 = str76;
                d13 = d55;
                z3 = z17;
                objF = objB2;
                str21 = str71;
                str20 = str72;
                d14 = d54;
                str22 = str74;
                str24 = str73;
                d15 = d14;
                jLongValue = ((Number) objF).longValue();
                OM om115 = abstractC7770yA5.p;
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str23;
                c7980zA1.g = str25;
                c7980zA1.h = d12;
                c7980zA1.i = str22;
                c7980zA1.j = d13;
                c7980zA1.k = str24;
                c7980zA1.l = str20;
                c7980zA1.m = str21;
                c7980zA1.p = z3;
                str26 = str22;
                str27 = str20;
                c7980zA1.t = d15;
                c7980zA1.s = jLongValue;
                d16 = d12;
                c7980zA1.x = 9;
                objB = om115.b(d13, c7980zA1);
                if (objB != mn7) {
                    d17 = d15;
                    j3 = jLongValue;
                    str28 = str26;
                    obj8 = objB;
                    str29 = str23;
                    d18 = d16;
                    d19 = (Double) obj8;
                    j4 = j3;
                    AbstractC1787Pr.a aVar15 = abstractC7770yA5.j.b;
                    c7980zA1.d = abstractC7770yA5;
                    c7980zA1.e = str29;
                    c7980zA1.g = str25;
                    c7980zA1.h = d18;
                    c7980zA1.i = str28;
                    c7980zA1.j = d13;
                    c7980zA1.k = str24;
                    c7980zA1.l = str27;
                    c7980zA1.m = str21;
                    c7980zA1.n = d19;
                    c7980zA1.p = z3;
                    c7980zA1.t = d17;
                    str30 = str28;
                    str31 = str29;
                    c7980zA1.s = j4;
                    c7980zA1.x = 10;
                    objO4 = C4466ii.o(aVar15, c7980zA1);
                    mn = mn7;
                    if (objO4 != mn) {
                        j5 = j4;
                        mn2 = mn;
                        obj9 = objO4;
                        str32 = str30;
                        d20 = d18;
                        d21 = d13;
                        str33 = str27;
                        str34 = str24;
                        str35 = str21;
                        z4 = z3;
                        d22 = d19;
                        str36 = str31;
                        d23 = d17;
                        iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                        InterfaceC6396rf0<Boolean> interfaceC6396rf0L13 = abstractC7770yA5.m.l();
                        c7980zA1.d = abstractC7770yA5;
                        c7980zA1.e = str36;
                        c7980zA1.g = str25;
                        c7980zA1.h = d20;
                        c7980zA1.i = str32;
                        c7980zA1.j = d21;
                        c7980zA1.k = str34;
                        c7980zA1.l = str33;
                        c7980zA1.m = str35;
                        c7980zA1.n = d22;
                        c7980zA1.p = z4;
                        c7980zA1.t = d23;
                        str37 = str32;
                        d24 = d20;
                        c7980zA1.s = j5;
                        c7980zA1.u = iR;
                        c7980zA1.x = 11;
                        objO5 = C4466ii.o(interfaceC6396rf0L13, c7980zA1);
                        mn = mn2;
                        if (objO5 != mn) {
                            mn3 = mn;
                            d25 = d21;
                            d26 = d24;
                            i = iR;
                            str38 = str37;
                            obj10 = objO5;
                            str39 = str34;
                            str40 = str33;
                            str41 = str35;
                            d27 = d22;
                            z5 = z4;
                            d28 = d23;
                            j6 = j5;
                            Boolean bool116 = (Boolean) obj10;
                            j7 = j6;
                            zBooleanValue4 = bool116.booleanValue();
                            InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled13 = abstractC7770yA5.l.isEnabled();
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str36;
                            c7980zA1.g = str25;
                            c7980zA1.h = d26;
                            c7980zA1.i = str38;
                            c7980zA1.j = d25;
                            c7980zA1.k = str39;
                            c7980zA1.l = str40;
                            c7980zA1.m = str41;
                            c7980zA1.n = d27;
                            c7980zA1.p = z5;
                            c7980zA1.t = d28;
                            d29 = d25;
                            str42 = str39;
                            c7980zA1.s = j7;
                            i2 = i;
                            c7980zA1.u = i2;
                            c7980zA1.q = zBooleanValue4;
                            c7980zA1.x = 12;
                            objO6 = C4466ii.o(interfaceC6396rf0IsEnabled13, c7980zA1);
                            mn4 = mn3;
                            if (objO6 == mn4) {
                                return mn4;
                            }
                            obj11 = objO6;
                            d30 = d27;
                            z6 = zBooleanValue4;
                            str43 = str40;
                            str44 = str42;
                            j8 = j7;
                            mn5 = mn4;
                            d31 = d28;
                            i3 = i2;
                            d32 = d26;
                            str45 = str38;
                            d33 = d29;
                            Boolean bool117 = (Boolean) obj11;
                            z7 = z6;
                            zBooleanValue5 = bool117.booleanValue();
                            c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                            if (c3279d22 != null) {
                                str46 = "-";
                            } else {
                                str46 = "-";
                            }
                            i4 = i3;
                            InterfaceC6396rf0<C1491Lx0> interfaceC6396rf12 = abstractC7770yA5.c.b;
                            c7980zA1.d = abstractC7770yA5;
                            c7980zA1.e = str36;
                            c7980zA1.g = str25;
                            c7980zA1.h = d32;
                            c7980zA1.i = str45;
                            c7980zA1.j = d33;
                            c7980zA1.k = str44;
                            c7980zA1.l = str43;
                            c7980zA1.m = str41;
                            c7980zA1.n = d30;
                            c7980zA1.o = str46;
                            c7980zA1.p = z5;
                            c7980zA1.t = d31;
                            d34 = d32;
                            d35 = d30;
                            c7980zA1.s = j8;
                            c7980zA1.u = i4;
                            c7980zA1.q = z7;
                            c7980zA1.r = zBooleanValue5;
                            c7980zA1.x = 13;
                            objO7 = C4466ii.o(interfaceC6396rf12, c7980zA1);
                            mn6 = mn5;
                            if (objO7 == mn6) {
                                return mn6;
                            }
                            z8 = zBooleanValue5;
                            d36 = d35;
                            z9 = z7;
                            str47 = str36;
                            d37 = d33;
                            str48 = str46;
                            str49 = str25;
                            str50 = str45;
                            j9 = j8;
                            i5 = i4;
                            d38 = d34;
                            obj12 = objO7;
                            str51 = str41;
                            str52 = str44;
                            aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                            if (z5) {
                                return aVar;
                            }
                            OM om116 = abstractC7770yA5.p;
                            c7980zA1.d = aVar;
                            c7980zA1.e = d38;
                            c7980zA1.g = null;
                            c7980zA1.h = null;
                            c7980zA1.i = null;
                            c7980zA1.j = null;
                            c7980zA1.k = null;
                            c7980zA1.l = null;
                            c7980zA1.m = null;
                            c7980zA1.n = null;
                            c7980zA1.o = null;
                            c7980zA1.s = 0L;
                            c7980zA1.u = 0;
                            c7980zA1.x = 14;
                            objB2 = om116.b(d38, c7980zA1);
                            if (objB2 == mn6) {
                                return mn6;
                            }
                            aVar2 = aVar;
                            Double d3111 = d38;
                            Double d413 = (Double) objB2;
                            String assetSelectionOnOff13 = aVar2.a;
                            Intrinsics.checkNotNullParameter(assetSelectionOnOff13, "assetSelectionOnOff");
                            String assetSelectionName13 = aVar2.b;
                            Intrinsics.checkNotNullParameter(assetSelectionName13, "assetSelectionName");
                            String tradingStrategy13 = aVar2.c;
                            Intrinsics.checkNotNullParameter(tradingStrategy13, "tradingStrategy");
                            String tradingAsset13 = aVar2.d;
                            Intrinsics.checkNotNullParameter(tradingAsset13, "tradingAsset");
                            String currency13 = aVar2.f;
                            Intrinsics.checkNotNullParameter(currency13, "currency");
                            String technicalIndicator13 = aVar2.g;
                            Intrinsics.checkNotNullParameter(technicalIndicator13, "technicalIndicator");
                            String profitFilter13 = aVar2.l;
                            Intrinsics.checkNotNullParameter(profitFilter13, "profitFilter");
                            String startDealId13 = aVar2.q;
                            Intrinsics.checkNotNullParameter(startDealId13, "startDealId");
                            return new a(assetSelectionOnOff13, assetSelectionName13, tradingStrategy13, tradingAsset13, aVar2.e, currency13, technicalIndicator13, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter13, aVar2.m, d3111, d413, aVar2.p, startDealId13);
                        }
                    }
                    return mn;
                }
                return mn7;
            case 9:
                j3 = c7980zA1.s;
                d17 = c7980zA1.t;
                boolean z18 = c7980zA1.p;
                str21 = c7980zA1.m;
                String str77 = c7980zA1.l;
                str24 = c7980zA1.k;
                d13 = (Double) c7980zA1.j;
                String str78 = (String) c7980zA1.i;
                Double d57 = (Double) c7980zA1.h;
                str25 = (String) c7980zA1.g;
                String str79 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA12 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str28 = str78;
                abstractC7770yA5 = abstractC7770yA12;
                str29 = str79;
                d18 = d57;
                str27 = str77;
                z3 = z18;
                obj8 = objB2;
                d19 = (Double) obj8;
                j4 = j3;
                AbstractC1787Pr.a aVar16 = abstractC7770yA5.j.b;
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str29;
                c7980zA1.g = str25;
                c7980zA1.h = d18;
                c7980zA1.i = str28;
                c7980zA1.j = d13;
                c7980zA1.k = str24;
                c7980zA1.l = str27;
                c7980zA1.m = str21;
                c7980zA1.n = d19;
                c7980zA1.p = z3;
                c7980zA1.t = d17;
                str30 = str28;
                str31 = str29;
                c7980zA1.s = j4;
                c7980zA1.x = 10;
                objO4 = C4466ii.o(aVar16, c7980zA1);
                mn = mn7;
                if (objO4 != mn) {
                    j5 = j4;
                    mn2 = mn;
                    obj9 = objO4;
                    str32 = str30;
                    d20 = d18;
                    d21 = d13;
                    str33 = str27;
                    str34 = str24;
                    str35 = str21;
                    z4 = z3;
                    d22 = d19;
                    str36 = str31;
                    d23 = d17;
                    iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                    InterfaceC6396rf0<Boolean> interfaceC6396rf0L14 = abstractC7770yA5.m.l();
                    c7980zA1.d = abstractC7770yA5;
                    c7980zA1.e = str36;
                    c7980zA1.g = str25;
                    c7980zA1.h = d20;
                    c7980zA1.i = str32;
                    c7980zA1.j = d21;
                    c7980zA1.k = str34;
                    c7980zA1.l = str33;
                    c7980zA1.m = str35;
                    c7980zA1.n = d22;
                    c7980zA1.p = z4;
                    c7980zA1.t = d23;
                    str37 = str32;
                    d24 = d20;
                    c7980zA1.s = j5;
                    c7980zA1.u = iR;
                    c7980zA1.x = 11;
                    objO5 = C4466ii.o(interfaceC6396rf0L14, c7980zA1);
                    mn = mn2;
                    if (objO5 != mn) {
                        mn3 = mn;
                        d25 = d21;
                        d26 = d24;
                        i = iR;
                        str38 = str37;
                        obj10 = objO5;
                        str39 = str34;
                        str40 = str33;
                        str41 = str35;
                        d27 = d22;
                        z5 = z4;
                        d28 = d23;
                        j6 = j5;
                        Boolean bool118 = (Boolean) obj10;
                        j7 = j6;
                        zBooleanValue4 = bool118.booleanValue();
                        InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled14 = abstractC7770yA5.l.isEnabled();
                        c7980zA1.d = abstractC7770yA5;
                        c7980zA1.e = str36;
                        c7980zA1.g = str25;
                        c7980zA1.h = d26;
                        c7980zA1.i = str38;
                        c7980zA1.j = d25;
                        c7980zA1.k = str39;
                        c7980zA1.l = str40;
                        c7980zA1.m = str41;
                        c7980zA1.n = d27;
                        c7980zA1.p = z5;
                        c7980zA1.t = d28;
                        d29 = d25;
                        str42 = str39;
                        c7980zA1.s = j7;
                        i2 = i;
                        c7980zA1.u = i2;
                        c7980zA1.q = zBooleanValue4;
                        c7980zA1.x = 12;
                        objO6 = C4466ii.o(interfaceC6396rf0IsEnabled14, c7980zA1);
                        mn4 = mn3;
                        if (objO6 == mn4) {
                            return mn4;
                        }
                        obj11 = objO6;
                        d30 = d27;
                        z6 = zBooleanValue4;
                        str43 = str40;
                        str44 = str42;
                        j8 = j7;
                        mn5 = mn4;
                        d31 = d28;
                        i3 = i2;
                        d32 = d26;
                        str45 = str38;
                        d33 = d29;
                        Boolean bool119 = (Boolean) obj11;
                        z7 = z6;
                        zBooleanValue5 = bool119.booleanValue();
                        c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                        if (c3279d22 != null) {
                            str46 = "-";
                        } else {
                            str46 = "-";
                        }
                        i4 = i3;
                        InterfaceC6396rf0<C1491Lx0> interfaceC6396rf13 = abstractC7770yA5.c.b;
                        c7980zA1.d = abstractC7770yA5;
                        c7980zA1.e = str36;
                        c7980zA1.g = str25;
                        c7980zA1.h = d32;
                        c7980zA1.i = str45;
                        c7980zA1.j = d33;
                        c7980zA1.k = str44;
                        c7980zA1.l = str43;
                        c7980zA1.m = str41;
                        c7980zA1.n = d30;
                        c7980zA1.o = str46;
                        c7980zA1.p = z5;
                        c7980zA1.t = d31;
                        d34 = d32;
                        d35 = d30;
                        c7980zA1.s = j8;
                        c7980zA1.u = i4;
                        c7980zA1.q = z7;
                        c7980zA1.r = zBooleanValue5;
                        c7980zA1.x = 13;
                        objO7 = C4466ii.o(interfaceC6396rf13, c7980zA1);
                        mn6 = mn5;
                        if (objO7 == mn6) {
                            return mn6;
                        }
                        z8 = zBooleanValue5;
                        d36 = d35;
                        z9 = z7;
                        str47 = str36;
                        d37 = d33;
                        str48 = str46;
                        str49 = str25;
                        str50 = str45;
                        j9 = j8;
                        i5 = i4;
                        d38 = d34;
                        obj12 = objO7;
                        str51 = str41;
                        str52 = str44;
                        aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                        if (z5) {
                            return aVar;
                        }
                        OM om117 = abstractC7770yA5.p;
                        c7980zA1.d = aVar;
                        c7980zA1.e = d38;
                        c7980zA1.g = null;
                        c7980zA1.h = null;
                        c7980zA1.i = null;
                        c7980zA1.j = null;
                        c7980zA1.k = null;
                        c7980zA1.l = null;
                        c7980zA1.m = null;
                        c7980zA1.n = null;
                        c7980zA1.o = null;
                        c7980zA1.s = 0L;
                        c7980zA1.u = 0;
                        c7980zA1.x = 14;
                        objB2 = om117.b(d38, c7980zA1);
                        if (objB2 == mn6) {
                            return mn6;
                        }
                        aVar2 = aVar;
                        Double d3112 = d38;
                        Double d414 = (Double) objB2;
                        String assetSelectionOnOff14 = aVar2.a;
                        Intrinsics.checkNotNullParameter(assetSelectionOnOff14, "assetSelectionOnOff");
                        String assetSelectionName14 = aVar2.b;
                        Intrinsics.checkNotNullParameter(assetSelectionName14, "assetSelectionName");
                        String tradingStrategy14 = aVar2.c;
                        Intrinsics.checkNotNullParameter(tradingStrategy14, "tradingStrategy");
                        String tradingAsset14 = aVar2.d;
                        Intrinsics.checkNotNullParameter(tradingAsset14, "tradingAsset");
                        String currency14 = aVar2.f;
                        Intrinsics.checkNotNullParameter(currency14, "currency");
                        String technicalIndicator14 = aVar2.g;
                        Intrinsics.checkNotNullParameter(technicalIndicator14, "technicalIndicator");
                        String profitFilter14 = aVar2.l;
                        Intrinsics.checkNotNullParameter(profitFilter14, "profitFilter");
                        String startDealId14 = aVar2.q;
                        Intrinsics.checkNotNullParameter(startDealId14, "startDealId");
                        return new a(assetSelectionOnOff14, assetSelectionName14, tradingStrategy14, tradingAsset14, aVar2.e, currency14, technicalIndicator14, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter14, aVar2.m, d3112, d414, aVar2.p, startDealId14);
                    }
                }
                return mn;
            case 10:
                long j10 = c7980zA1.s;
                d17 = c7980zA1.t;
                boolean z19 = c7980zA1.p;
                Double d58 = c7980zA1.n;
                String str80 = c7980zA1.m;
                String str81 = c7980zA1.l;
                String str82 = c7980zA1.k;
                Double d59 = (Double) c7980zA1.j;
                String str83 = (String) c7980zA1.i;
                Double d60 = (Double) c7980zA1.h;
                String str84 = (String) c7980zA1.g;
                String str85 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA13 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                abstractC7770yA5 = abstractC7770yA13;
                d20 = d60;
                str25 = str84;
                d21 = d59;
                str32 = str83;
                str34 = str82;
                str33 = str81;
                str35 = str80;
                d22 = d58;
                z4 = z19;
                obj9 = objB2;
                mn2 = mn7;
                str36 = str85;
                j5 = j10;
                d23 = d17;
                iR = (int) b.r(((b) obj9).d, R40.SECONDS);
                InterfaceC6396rf0<Boolean> interfaceC6396rf0L15 = abstractC7770yA5.m.l();
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str36;
                c7980zA1.g = str25;
                c7980zA1.h = d20;
                c7980zA1.i = str32;
                c7980zA1.j = d21;
                c7980zA1.k = str34;
                c7980zA1.l = str33;
                c7980zA1.m = str35;
                c7980zA1.n = d22;
                c7980zA1.p = z4;
                c7980zA1.t = d23;
                str37 = str32;
                d24 = d20;
                c7980zA1.s = j5;
                c7980zA1.u = iR;
                c7980zA1.x = 11;
                objO5 = C4466ii.o(interfaceC6396rf0L15, c7980zA1);
                mn = mn2;
                if (objO5 != mn) {
                    mn3 = mn;
                    d25 = d21;
                    d26 = d24;
                    i = iR;
                    str38 = str37;
                    obj10 = objO5;
                    str39 = str34;
                    str40 = str33;
                    str41 = str35;
                    d27 = d22;
                    z5 = z4;
                    d28 = d23;
                    j6 = j5;
                    Boolean bool1110 = (Boolean) obj10;
                    j7 = j6;
                    zBooleanValue4 = bool1110.booleanValue();
                    InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled15 = abstractC7770yA5.l.isEnabled();
                    c7980zA1.d = abstractC7770yA5;
                    c7980zA1.e = str36;
                    c7980zA1.g = str25;
                    c7980zA1.h = d26;
                    c7980zA1.i = str38;
                    c7980zA1.j = d25;
                    c7980zA1.k = str39;
                    c7980zA1.l = str40;
                    c7980zA1.m = str41;
                    c7980zA1.n = d27;
                    c7980zA1.p = z5;
                    c7980zA1.t = d28;
                    d29 = d25;
                    str42 = str39;
                    c7980zA1.s = j7;
                    i2 = i;
                    c7980zA1.u = i2;
                    c7980zA1.q = zBooleanValue4;
                    c7980zA1.x = 12;
                    objO6 = C4466ii.o(interfaceC6396rf0IsEnabled15, c7980zA1);
                    mn4 = mn3;
                    if (objO6 == mn4) {
                        return mn4;
                    }
                    obj11 = objO6;
                    d30 = d27;
                    z6 = zBooleanValue4;
                    str43 = str40;
                    str44 = str42;
                    j8 = j7;
                    mn5 = mn4;
                    d31 = d28;
                    i3 = i2;
                    d32 = d26;
                    str45 = str38;
                    d33 = d29;
                    Boolean bool1111 = (Boolean) obj11;
                    z7 = z6;
                    zBooleanValue5 = bool1111.booleanValue();
                    c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                    if (c3279d22 != null) {
                        str46 = "-";
                    } else {
                        str46 = "-";
                    }
                    i4 = i3;
                    InterfaceC6396rf0<C1491Lx0> interfaceC6396rf14 = abstractC7770yA5.c.b;
                    c7980zA1.d = abstractC7770yA5;
                    c7980zA1.e = str36;
                    c7980zA1.g = str25;
                    c7980zA1.h = d32;
                    c7980zA1.i = str45;
                    c7980zA1.j = d33;
                    c7980zA1.k = str44;
                    c7980zA1.l = str43;
                    c7980zA1.m = str41;
                    c7980zA1.n = d30;
                    c7980zA1.o = str46;
                    c7980zA1.p = z5;
                    c7980zA1.t = d31;
                    d34 = d32;
                    d35 = d30;
                    c7980zA1.s = j8;
                    c7980zA1.u = i4;
                    c7980zA1.q = z7;
                    c7980zA1.r = zBooleanValue5;
                    c7980zA1.x = 13;
                    objO7 = C4466ii.o(interfaceC6396rf14, c7980zA1);
                    mn6 = mn5;
                    if (objO7 == mn6) {
                        return mn6;
                    }
                    z8 = zBooleanValue5;
                    d36 = d35;
                    z9 = z7;
                    str47 = str36;
                    d37 = d33;
                    str48 = str46;
                    str49 = str25;
                    str50 = str45;
                    j9 = j8;
                    i5 = i4;
                    d38 = d34;
                    obj12 = objO7;
                    str51 = str41;
                    str52 = str44;
                    aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                    if (z5) {
                        return aVar;
                    }
                    OM om118 = abstractC7770yA5.p;
                    c7980zA1.d = aVar;
                    c7980zA1.e = d38;
                    c7980zA1.g = null;
                    c7980zA1.h = null;
                    c7980zA1.i = null;
                    c7980zA1.j = null;
                    c7980zA1.k = null;
                    c7980zA1.l = null;
                    c7980zA1.m = null;
                    c7980zA1.n = null;
                    c7980zA1.o = null;
                    c7980zA1.s = 0L;
                    c7980zA1.u = 0;
                    c7980zA1.x = 14;
                    objB2 = om118.b(d38, c7980zA1);
                    if (objB2 == mn6) {
                        return mn6;
                    }
                    aVar2 = aVar;
                    Double d3113 = d38;
                    Double d415 = (Double) objB2;
                    String assetSelectionOnOff15 = aVar2.a;
                    Intrinsics.checkNotNullParameter(assetSelectionOnOff15, "assetSelectionOnOff");
                    String assetSelectionName15 = aVar2.b;
                    Intrinsics.checkNotNullParameter(assetSelectionName15, "assetSelectionName");
                    String tradingStrategy15 = aVar2.c;
                    Intrinsics.checkNotNullParameter(tradingStrategy15, "tradingStrategy");
                    String tradingAsset15 = aVar2.d;
                    Intrinsics.checkNotNullParameter(tradingAsset15, "tradingAsset");
                    String currency15 = aVar2.f;
                    Intrinsics.checkNotNullParameter(currency15, "currency");
                    String technicalIndicator15 = aVar2.g;
                    Intrinsics.checkNotNullParameter(technicalIndicator15, "technicalIndicator");
                    String profitFilter15 = aVar2.l;
                    Intrinsics.checkNotNullParameter(profitFilter15, "profitFilter");
                    String startDealId15 = aVar2.q;
                    Intrinsics.checkNotNullParameter(startDealId15, "startDealId");
                    return new a(assetSelectionOnOff15, assetSelectionName15, tradingStrategy15, tradingAsset15, aVar2.e, currency15, technicalIndicator15, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter15, aVar2.m, d3113, d415, aVar2.p, startDealId15);
                }
                return mn;
            case 11:
                int i7 = c7980zA1.u;
                long j11 = c7980zA1.s;
                double d61 = c7980zA1.t;
                boolean z20 = c7980zA1.p;
                Double d62 = c7980zA1.n;
                String str86 = c7980zA1.m;
                String str87 = c7980zA1.l;
                String str88 = c7980zA1.k;
                Double d63 = (Double) c7980zA1.j;
                String str89 = (String) c7980zA1.i;
                d26 = (Double) c7980zA1.h;
                String str90 = (String) c7980zA1.g;
                String str91 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA14 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                abstractC7770yA5 = abstractC7770yA14;
                str39 = str88;
                i = i7;
                d25 = d63;
                obj10 = objB2;
                mn3 = mn7;
                str40 = str87;
                str36 = str91;
                str41 = str86;
                d27 = d62;
                z5 = z20;
                d28 = d61;
                j6 = j11;
                str38 = str89;
                str25 = str90;
                Boolean bool1112 = (Boolean) obj10;
                j7 = j6;
                zBooleanValue4 = bool1112.booleanValue();
                InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled16 = abstractC7770yA5.l.isEnabled();
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str36;
                c7980zA1.g = str25;
                c7980zA1.h = d26;
                c7980zA1.i = str38;
                c7980zA1.j = d25;
                c7980zA1.k = str39;
                c7980zA1.l = str40;
                c7980zA1.m = str41;
                c7980zA1.n = d27;
                c7980zA1.p = z5;
                c7980zA1.t = d28;
                d29 = d25;
                str42 = str39;
                c7980zA1.s = j7;
                i2 = i;
                c7980zA1.u = i2;
                c7980zA1.q = zBooleanValue4;
                c7980zA1.x = 12;
                objO6 = C4466ii.o(interfaceC6396rf0IsEnabled16, c7980zA1);
                mn4 = mn3;
                if (objO6 == mn4) {
                    return mn4;
                }
                obj11 = objO6;
                d30 = d27;
                z6 = zBooleanValue4;
                str43 = str40;
                str44 = str42;
                j8 = j7;
                mn5 = mn4;
                d31 = d28;
                i3 = i2;
                d32 = d26;
                str45 = str38;
                d33 = d29;
                Boolean bool1113 = (Boolean) obj11;
                z7 = z6;
                zBooleanValue5 = bool1113.booleanValue();
                c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                if (c3279d22 != null) {
                    str46 = "-";
                } else {
                    str46 = "-";
                }
                i4 = i3;
                InterfaceC6396rf0<C1491Lx0> interfaceC6396rf15 = abstractC7770yA5.c.b;
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str36;
                c7980zA1.g = str25;
                c7980zA1.h = d32;
                c7980zA1.i = str45;
                c7980zA1.j = d33;
                c7980zA1.k = str44;
                c7980zA1.l = str43;
                c7980zA1.m = str41;
                c7980zA1.n = d30;
                c7980zA1.o = str46;
                c7980zA1.p = z5;
                c7980zA1.t = d31;
                d34 = d32;
                d35 = d30;
                c7980zA1.s = j8;
                c7980zA1.u = i4;
                c7980zA1.q = z7;
                c7980zA1.r = zBooleanValue5;
                c7980zA1.x = 13;
                objO7 = C4466ii.o(interfaceC6396rf15, c7980zA1);
                mn6 = mn5;
                if (objO7 == mn6) {
                    return mn6;
                }
                z8 = zBooleanValue5;
                d36 = d35;
                z9 = z7;
                str47 = str36;
                d37 = d33;
                str48 = str46;
                str49 = str25;
                str50 = str45;
                j9 = j8;
                i5 = i4;
                d38 = d34;
                obj12 = objO7;
                str51 = str41;
                str52 = str44;
                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                if (z5) {
                    return aVar;
                }
                OM om119 = abstractC7770yA5.p;
                c7980zA1.d = aVar;
                c7980zA1.e = d38;
                c7980zA1.g = null;
                c7980zA1.h = null;
                c7980zA1.i = null;
                c7980zA1.j = null;
                c7980zA1.k = null;
                c7980zA1.l = null;
                c7980zA1.m = null;
                c7980zA1.n = null;
                c7980zA1.o = null;
                c7980zA1.s = 0L;
                c7980zA1.u = 0;
                c7980zA1.x = 14;
                objB2 = om119.b(d38, c7980zA1);
                if (objB2 == mn6) {
                    return mn6;
                }
                aVar2 = aVar;
                Double d3114 = d38;
                Double d416 = (Double) objB2;
                String assetSelectionOnOff16 = aVar2.a;
                Intrinsics.checkNotNullParameter(assetSelectionOnOff16, "assetSelectionOnOff");
                String assetSelectionName16 = aVar2.b;
                Intrinsics.checkNotNullParameter(assetSelectionName16, "assetSelectionName");
                String tradingStrategy16 = aVar2.c;
                Intrinsics.checkNotNullParameter(tradingStrategy16, "tradingStrategy");
                String tradingAsset16 = aVar2.d;
                Intrinsics.checkNotNullParameter(tradingAsset16, "tradingAsset");
                String currency16 = aVar2.f;
                Intrinsics.checkNotNullParameter(currency16, "currency");
                String technicalIndicator16 = aVar2.g;
                Intrinsics.checkNotNullParameter(technicalIndicator16, "technicalIndicator");
                String profitFilter16 = aVar2.l;
                Intrinsics.checkNotNullParameter(profitFilter16, "profitFilter");
                String startDealId16 = aVar2.q;
                Intrinsics.checkNotNullParameter(startDealId16, "startDealId");
                return new a(assetSelectionOnOff16, assetSelectionName16, tradingStrategy16, tradingAsset16, aVar2.e, currency16, technicalIndicator16, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter16, aVar2.m, d3114, d416, aVar2.p, startDealId16);
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                boolean z21 = c7980zA1.q;
                int i8 = c7980zA1.u;
                long j12 = c7980zA1.s;
                double d64 = c7980zA1.t;
                z5 = c7980zA1.p;
                Double d65 = c7980zA1.n;
                str41 = c7980zA1.m;
                String str92 = c7980zA1.l;
                str44 = c7980zA1.k;
                Double d66 = (Double) c7980zA1.j;
                str45 = (String) c7980zA1.i;
                Double d67 = (Double) c7980zA1.h;
                String str93 = (String) c7980zA1.g;
                String str94 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA15 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                d32 = d67;
                j8 = j12;
                d31 = d64;
                str43 = str92;
                abstractC7770yA5 = abstractC7770yA15;
                i3 = i8;
                d30 = d65;
                d33 = d66;
                z6 = z21;
                str25 = str93;
                obj11 = objB2;
                mn5 = mn7;
                str36 = str94;
                Boolean bool1114 = (Boolean) obj11;
                z7 = z6;
                zBooleanValue5 = bool1114.booleanValue();
                c3279d22 = (C3279d22) abstractC7770yA5.d.f.d.getValue();
                if (c3279d22 != null) {
                    str46 = "-";
                } else {
                    str46 = "-";
                }
                i4 = i3;
                InterfaceC6396rf0<C1491Lx0> interfaceC6396rf16 = abstractC7770yA5.c.b;
                c7980zA1.d = abstractC7770yA5;
                c7980zA1.e = str36;
                c7980zA1.g = str25;
                c7980zA1.h = d32;
                c7980zA1.i = str45;
                c7980zA1.j = d33;
                c7980zA1.k = str44;
                c7980zA1.l = str43;
                c7980zA1.m = str41;
                c7980zA1.n = d30;
                c7980zA1.o = str46;
                c7980zA1.p = z5;
                c7980zA1.t = d31;
                d34 = d32;
                d35 = d30;
                c7980zA1.s = j8;
                c7980zA1.u = i4;
                c7980zA1.q = z7;
                c7980zA1.r = zBooleanValue5;
                c7980zA1.x = 13;
                objO7 = C4466ii.o(interfaceC6396rf16, c7980zA1);
                mn6 = mn5;
                if (objO7 == mn6) {
                    return mn6;
                }
                z8 = zBooleanValue5;
                d36 = d35;
                z9 = z7;
                str47 = str36;
                d37 = d33;
                str48 = str46;
                str49 = str25;
                str50 = str45;
                j9 = j8;
                i5 = i4;
                d38 = d34;
                obj12 = objO7;
                str51 = str41;
                str52 = str44;
                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                if (z5) {
                    return aVar;
                }
                OM om1110 = abstractC7770yA5.p;
                c7980zA1.d = aVar;
                c7980zA1.e = d38;
                c7980zA1.g = null;
                c7980zA1.h = null;
                c7980zA1.i = null;
                c7980zA1.j = null;
                c7980zA1.k = null;
                c7980zA1.l = null;
                c7980zA1.m = null;
                c7980zA1.n = null;
                c7980zA1.o = null;
                c7980zA1.s = 0L;
                c7980zA1.u = 0;
                c7980zA1.x = 14;
                objB2 = om1110.b(d38, c7980zA1);
                if (objB2 == mn6) {
                    return mn6;
                }
                aVar2 = aVar;
                Double d3115 = d38;
                Double d417 = (Double) objB2;
                String assetSelectionOnOff17 = aVar2.a;
                Intrinsics.checkNotNullParameter(assetSelectionOnOff17, "assetSelectionOnOff");
                String assetSelectionName17 = aVar2.b;
                Intrinsics.checkNotNullParameter(assetSelectionName17, "assetSelectionName");
                String tradingStrategy17 = aVar2.c;
                Intrinsics.checkNotNullParameter(tradingStrategy17, "tradingStrategy");
                String tradingAsset17 = aVar2.d;
                Intrinsics.checkNotNullParameter(tradingAsset17, "tradingAsset");
                String currency17 = aVar2.f;
                Intrinsics.checkNotNullParameter(currency17, "currency");
                String technicalIndicator17 = aVar2.g;
                Intrinsics.checkNotNullParameter(technicalIndicator17, "technicalIndicator");
                String profitFilter17 = aVar2.l;
                Intrinsics.checkNotNullParameter(profitFilter17, "profitFilter");
                String startDealId17 = aVar2.q;
                Intrinsics.checkNotNullParameter(startDealId17, "startDealId");
                return new a(assetSelectionOnOff17, assetSelectionName17, tradingStrategy17, tradingAsset17, aVar2.e, currency17, technicalIndicator17, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter17, aVar2.m, d3115, d417, aVar2.p, startDealId17);
            case 13:
                boolean z22 = c7980zA1.r;
                boolean z23 = c7980zA1.q;
                int i9 = c7980zA1.u;
                long j13 = c7980zA1.s;
                double d68 = c7980zA1.t;
                boolean z24 = c7980zA1.p;
                String str95 = c7980zA1.o;
                Double d69 = c7980zA1.n;
                String str96 = c7980zA1.m;
                str43 = c7980zA1.l;
                String str97 = c7980zA1.k;
                Double d70 = (Double) c7980zA1.j;
                String str98 = (String) c7980zA1.i;
                Double d71 = (Double) c7980zA1.h;
                String str99 = (String) c7980zA1.g;
                String str100 = (String) c7980zA1.e;
                AbstractC7770yA1 abstractC7770yA16 = (AbstractC7770yA1) c7980zA1.d;
                C1795Pt1.b(objB2);
                str52 = str97;
                d37 = d70;
                str50 = str98;
                str49 = str99;
                str47 = str100;
                z8 = z22;
                z9 = z23;
                i5 = i9;
                str51 = str96;
                j9 = j13;
                d31 = d68;
                str48 = str95;
                d36 = d69;
                abstractC7770yA5 = abstractC7770yA16;
                z5 = z24;
                obj12 = objB2;
                mn6 = mn7;
                d38 = d71;
                aVar = new a(str43, str52, str51, str48, j9, str49, ((C1491Lx0) obj12).f, i5, d37, d36, z8, str50, new Double(d31), null, null, z9, str47);
                if (z5) {
                    return aVar;
                }
                OM om1111 = abstractC7770yA5.p;
                c7980zA1.d = aVar;
                c7980zA1.e = d38;
                c7980zA1.g = null;
                c7980zA1.h = null;
                c7980zA1.i = null;
                c7980zA1.j = null;
                c7980zA1.k = null;
                c7980zA1.l = null;
                c7980zA1.m = null;
                c7980zA1.n = null;
                c7980zA1.o = null;
                c7980zA1.s = 0L;
                c7980zA1.u = 0;
                c7980zA1.x = 14;
                objB2 = om1111.b(d38, c7980zA1);
                if (objB2 == mn6) {
                    return mn6;
                }
                aVar2 = aVar;
                Double d3116 = d38;
                Double d418 = (Double) objB2;
                String assetSelectionOnOff18 = aVar2.a;
                Intrinsics.checkNotNullParameter(assetSelectionOnOff18, "assetSelectionOnOff");
                String assetSelectionName18 = aVar2.b;
                Intrinsics.checkNotNullParameter(assetSelectionName18, "assetSelectionName");
                String tradingStrategy18 = aVar2.c;
                Intrinsics.checkNotNullParameter(tradingStrategy18, "tradingStrategy");
                String tradingAsset18 = aVar2.d;
                Intrinsics.checkNotNullParameter(tradingAsset18, "tradingAsset");
                String currency18 = aVar2.f;
                Intrinsics.checkNotNullParameter(currency18, "currency");
                String technicalIndicator18 = aVar2.g;
                Intrinsics.checkNotNullParameter(technicalIndicator18, "technicalIndicator");
                String profitFilter18 = aVar2.l;
                Intrinsics.checkNotNullParameter(profitFilter18, "profitFilter");
                String startDealId18 = aVar2.q;
                Intrinsics.checkNotNullParameter(startDealId18, "startDealId");
                return new a(assetSelectionOnOff18, assetSelectionName18, tradingStrategy18, tradingAsset18, aVar2.e, currency18, technicalIndicator18, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter18, aVar2.m, d3116, d418, aVar2.p, startDealId18);
            case 14:
                d38 = (Double) c7980zA1.e;
                aVar2 = (a) c7980zA1.d;
                C1795Pt1.b(objB2);
                Double d3117 = d38;
                Double d419 = (Double) objB2;
                String assetSelectionOnOff19 = aVar2.a;
                Intrinsics.checkNotNullParameter(assetSelectionOnOff19, "assetSelectionOnOff");
                String assetSelectionName19 = aVar2.b;
                Intrinsics.checkNotNullParameter(assetSelectionName19, "assetSelectionName");
                String tradingStrategy19 = aVar2.c;
                Intrinsics.checkNotNullParameter(tradingStrategy19, "tradingStrategy");
                String tradingAsset19 = aVar2.d;
                Intrinsics.checkNotNullParameter(tradingAsset19, "tradingAsset");
                String currency19 = aVar2.f;
                Intrinsics.checkNotNullParameter(currency19, "currency");
                String technicalIndicator19 = aVar2.g;
                Intrinsics.checkNotNullParameter(technicalIndicator19, "technicalIndicator");
                String profitFilter19 = aVar2.l;
                Intrinsics.checkNotNullParameter(profitFilter19, "profitFilter");
                String startDealId19 = aVar2.q;
                Intrinsics.checkNotNullParameter(startDealId19, "startDealId");
                return new a(assetSelectionOnOff19, assetSelectionName19, tradingStrategy19, tradingAsset19, aVar2.e, currency19, technicalIndicator19, aVar2.h, aVar2.i, aVar2.j, aVar2.k, profitFilter19, aVar2.m, d3117, d419, aVar2.p, startDealId19);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public abstract C8145zz0 b(@NotNull a aVar);

    @Nullable
    public abstract C0640Az0 c(@NotNull a aVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LM lm) {
        AA1 aa1;
        if (lm instanceof AA1) {
            aa1 = (AA1) lm;
            int i = aa1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aa1.g = i - Integer.MIN_VALUE;
            } else {
                aa1 = new AA1(this, lm);
            }
        } else {
            aa1 = new AA1(this, lm);
        }
        Object objO = aa1.d;
        MN mn = MN.d;
        int i2 = aa1.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = this.n.l();
            aa1.g = 1;
            objO = C4466ii.o(interfaceC6396rf0L, aa1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        return Boolean.valueOf(!((Boolean) objO).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r10 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r8, defpackage.LM r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.BA1
            if (r0 == 0) goto L13
            r0 = r10
            BA1 r0 = (defpackage.BA1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            BA1 r0 = new BA1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            long r8 = r0.e
            defpackage.C1795Pt1.b(r10)
            goto L8a
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            long r8 = r0.e
            defpackage.C1795Pt1.b(r10)
            goto L74
        L3d:
            long r8 = r0.e
            yA1 r2 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L5c
        L45:
            defpackage.C1795Pt1.b(r10)
            O3 r10 = r7.e
            rf0 r10 = r10.k()
            r0.d = r7
            r0.e = r8
            r0.i = r5
            java.lang.Object r10 = defpackage.C4466ii.o(r10, r0)
            if (r10 != r1) goto L5b
            goto L89
        L5b:
            r2 = r7
        L5c:
            hF1 r5 = defpackage.EnumC4164hF1.g
            r6 = 0
            if (r10 != r5) goto L77
            Ui1 r10 = r2.k
            rf0 r10 = r10.a()
            r0.d = r6
            r0.e = r8
            r0.i = r4
            java.lang.Object r10 = defpackage.C4466ii.o(r10, r0)
            if (r10 != r1) goto L74
            goto L89
        L74:
            java.lang.Long r10 = (java.lang.Long) r10
            goto L8c
        L77:
            Ui1 r10 = r2.k
            rf0 r10 = r10.b()
            r0.d = r6
            r0.e = r8
            r0.i = r3
            java.lang.Object r10 = defpackage.C4466ii.o(r10, r0)
            if (r10 != r1) goto L8a
        L89:
            return r1
        L8a:
            java.lang.Long r10 = (java.lang.Long) r10
        L8c:
            if (r10 == 0) goto L92
            long r8 = r10.longValue()
        L92:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7770yA1.e(long, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r8 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.LM r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.CA1
            if (r0 == 0) goto L13
            r0 = r8
            CA1 r0 = (defpackage.CA1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            CA1 r0 = new CA1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            defpackage.C1795Pt1.b(r8)
            goto La2
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            yA1 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L89
        L3f:
            yA1 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L75
        L45:
            yA1 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L60
        L4b:
            defpackage.C1795Pt1.b(r8)
            O3 r8 = r7.e
            rf0 r8 = r8.k()
            r0.d = r7
            r0.h = r6
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L5f
            goto La1
        L5f:
            r2 = r7
        L60:
            hF1 r6 = defpackage.EnumC4164hF1.g
            if (r8 != r6) goto L78
            rX r8 = r2.i
            rf0 r8 = r8.k()
            r0.d = r2
            r0.h = r5
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L75
            goto La1
        L75:
            java.lang.Long r8 = (java.lang.Long) r8
            goto L8b
        L78:
            Wn1 r8 = r2.h
            rf0 r8 = r8.k()
            r0.d = r2
            r0.h = r4
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L89
            goto La1
        L89:
            java.lang.Long r8 = (java.lang.Long) r8
        L8b:
            if (r8 == 0) goto L92
            long r0 = r8.longValue()
            goto La7
        L92:
            kf r8 = r2.a
            GP1 r8 = r8.b
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r8 = defpackage.C7236vf0.a(r8, r0)
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            FF r8 = (defpackage.FF) r8
            int r8 = r8.k
            long r0 = (long) r8
        La7:
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7770yA1.f(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0130  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:47:0x0170 A[PHI: r0 r2 r3 r4 r15
      0x0170: PHI (r0v20 java.lang.Object) = (r0v19 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x016d, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r2v20 com.api.feature.analytics.reporters.ReporterApi) = (r2v17 com.api.feature.analytics.reporters.ReporterApi), (r2v25 com.api.feature.analytics.reporters.ReporterApi) binds: [B:45:0x016d, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r3v17 yA1$a) = (r3v14 yA1$a), (r3v19 yA1$a) binds: [B:45:0x016d, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r4v11 yA1) = (r4v9 yA1), (r4v12 yA1) binds: [B:45:0x016d, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r15v25 l80) = (r15v23 l80), (r15v29 l80) binds: [B:45:0x016d, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x01be  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public final Object g(@NotNull EnumC4164hF1 enumC4164hF1, @Nullable Double d, @Nullable Double d2, long j, @NotNull String str, @NotNull LM lm) {
        DA1 da1;
        AbstractC7770yA1 abstractC7770yA1;
        a aVar;
        C6120qK1 c6120qK1;
        Unit unit;
        a aVar2;
        ReporterApi reporterApi;
        EnumC5028l80 enumC5028l80;
        C8145zz0 c8145zz0B;
        ReporterApi reporterApi2;
        EnumC5028l80 enumC5028l81;
        a aVar3;
        AbstractC7770yA1 abstractC7770yA2;
        ReporterApi reporterApi3;
        EnumC5028l80 enumC5028l82;
        C0640Az0 c0640Az0C;
        ReporterApi reporterApi4;
        EnumC5028l80 enumC5028l83;
        AbstractC7770yA1 abstractC7770yA3;
        AbstractC7770yA1 abstractC7770yA4;
        ReporterApi reporterApi5;
        EnumC5028l80 enumC5028l84;
        C8145zz0 c8145zz0B2;
        a aVar4;
        EnumC5028l80 enumC5028l85;
        ReporterApi reporterApi6;
        EnumC5028l80 enumC5028l86;
        ReporterApi reporterApi7;
        EnumC5028l80 enumC5028l87;
        C8145zz0 c8145zz0B3;
        ReporterApi reporterApi8;
        EnumC5028l80 enumC5028l88;
        int iOrdinal;
        String str2;
        if (lm instanceof DA1) {
            da1 = (DA1) lm;
            int i = da1.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                da1.k = i - Integer.MIN_VALUE;
            } else {
                da1 = new DA1(this, lm);
            }
        } else {
            da1 = new DA1(this, lm);
        }
        DA1 da2 = da1;
        Object objA = da2.i;
        MN mn = MN.d;
        switch (da2.k) {
            case 0:
                C1795Pt1.b(objA);
                da2.d = this;
                da2.e = enumC4164hF1;
                da2.k = 1;
                objA = a(true, d, d2, j, str, da2);
                if (objA != mn) {
                    abstractC7770yA1 = this;
                    aVar = (a) objA;
                    if (enumC4164hF1 == EnumC4164hF1.h) {
                        reporterApi = abstractC7770yA1.b;
                        enumC5028l80 = EnumC5028l80.R;
                        da2.d = abstractC7770yA1;
                        da2.e = aVar;
                        da2.g = reporterApi;
                        da2.h = enumC5028l80;
                        da2.k = 2;
                        c8145zz0B = abstractC7770yA1.b(aVar);
                        if (c8145zz0B != mn) {
                            AbstractC7770yA1 abstractC7770yA5 = abstractC7770yA1;
                            reporterApi2 = reporterApi;
                            enumC5028l81 = enumC5028l80;
                            aVar3 = aVar;
                            objA = c8145zz0B;
                            abstractC7770yA2 = abstractC7770yA5;
                            reporterApi2.h(enumC5028l81, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                            reporterApi3 = abstractC7770yA2.b;
                            enumC5028l82 = EnumC5028l80.R;
                            da2.d = abstractC7770yA2;
                            da2.e = reporterApi3;
                            da2.g = enumC5028l82;
                            da2.h = null;
                            da2.k = 3;
                            c0640Az0C = abstractC7770yA2.c(aVar3);
                            if (c0640Az0C != mn) {
                                reporterApi4 = reporterApi3;
                                enumC5028l83 = enumC5028l82;
                                objA = c0640Az0C;
                                abstractC7770yA3 = abstractC7770yA2;
                                ReporterApi.a.b(reporterApi4, enumC5028l83, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                C5189lv.k(C3784fT.a, null, new EA1(abstractC7770yA3, null), 3);
                                ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                                return Unit.a;
                            }
                        }
                    } else {
                        c6120qK1 = abstractC7770yA1.o.F;
                        unit = Unit.a;
                        da2.d = abstractC7770yA1;
                        da2.e = aVar;
                        da2.k = 4;
                        if (c6120qK1.a(unit, da2) != mn) {
                            aVar2 = aVar;
                            abstractC7770yA4 = abstractC7770yA1;
                            reporterApi5 = abstractC7770yA4.b;
                            enumC5028l84 = EnumC5028l80.Q;
                            da2.d = abstractC7770yA4;
                            da2.e = aVar2;
                            da2.g = reporterApi5;
                            da2.h = enumC5028l84;
                            da2.k = 5;
                            c8145zz0B2 = abstractC7770yA4.b(aVar2);
                            if (c8145zz0B2 != mn) {
                                aVar4 = aVar2;
                                enumC5028l85 = enumC5028l84;
                                objA = c8145zz0B2;
                                reporterApi5.h(enumC5028l85, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                                reporterApi6 = abstractC7770yA4.b;
                                enumC5028l86 = EnumC5028l80.Q;
                                da2.d = abstractC7770yA4;
                                da2.e = aVar4;
                                da2.g = reporterApi6;
                                da2.h = enumC5028l86;
                                da2.k = 6;
                                objA = abstractC7770yA4.c(aVar4);
                                if (objA != mn) {
                                    ReporterApi.a.b(reporterApi6, enumC5028l86, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                    C5189lv.k(C3784fT.a, null, new FA1(abstractC7770yA4, null), 3);
                                    reporterApi7 = abstractC7770yA4.b;
                                    enumC5028l87 = EnumC5028l80.Q;
                                    da2.d = abstractC7770yA4;
                                    da2.e = reporterApi7;
                                    da2.g = enumC5028l87;
                                    da2.h = null;
                                    da2.k = 7;
                                    c8145zz0B3 = abstractC7770yA4.b(aVar4);
                                    if (c8145zz0B3 != mn) {
                                        reporterApi8 = reporterApi7;
                                        enumC5028l88 = enumC5028l87;
                                        objA = c8145zz0B3;
                                        abstractC7770yA3 = abstractC7770yA4;
                                        P80 p80 = (P80) objA;
                                        EnumC5028l80 event = EnumC5028l80.Q;
                                        Intrinsics.checkNotNullParameter(event, "event");
                                        iOrdinal = event.ordinal();
                                        if (iOrdinal != 9) {
                                            str2 = AFInAppEventType.COMPLETE_REGISTRATION;
                                        } else if (iOrdinal != 41) {
                                            str2 = AFInAppEventType.LEVEL_ACHIEVED;
                                        } else if (iOrdinal != 14) {
                                            str2 = AFInAppEventType.LOGIN;
                                        } else if (iOrdinal != 15) {
                                            str2 = null;
                                        } else {
                                            str2 = AFInAppEventType.ADD_TO_WISH_LIST;
                                        }
                                        reporterApi8.g(enumC5028l88, p80, str2);
                                        ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                                        return Unit.a;
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 1:
                enumC4164hF1 = (EnumC4164hF1) da2.e;
                abstractC7770yA1 = da2.d;
                C1795Pt1.b(objA);
                aVar = (a) objA;
                if (enumC4164hF1 == EnumC4164hF1.h) {
                    reporterApi = abstractC7770yA1.b;
                    enumC5028l80 = EnumC5028l80.R;
                    da2.d = abstractC7770yA1;
                    da2.e = aVar;
                    da2.g = reporterApi;
                    da2.h = enumC5028l80;
                    da2.k = 2;
                    c8145zz0B = abstractC7770yA1.b(aVar);
                    if (c8145zz0B != mn) {
                        AbstractC7770yA1 abstractC7770yA6 = abstractC7770yA1;
                        reporterApi2 = reporterApi;
                        enumC5028l81 = enumC5028l80;
                        aVar3 = aVar;
                        objA = c8145zz0B;
                        abstractC7770yA2 = abstractC7770yA6;
                        reporterApi2.h(enumC5028l81, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                        reporterApi3 = abstractC7770yA2.b;
                        enumC5028l82 = EnumC5028l80.R;
                        da2.d = abstractC7770yA2;
                        da2.e = reporterApi3;
                        da2.g = enumC5028l82;
                        da2.h = null;
                        da2.k = 3;
                        c0640Az0C = abstractC7770yA2.c(aVar3);
                        if (c0640Az0C != mn) {
                            reporterApi4 = reporterApi3;
                            enumC5028l83 = enumC5028l82;
                            objA = c0640Az0C;
                            abstractC7770yA3 = abstractC7770yA2;
                            ReporterApi.a.b(reporterApi4, enumC5028l83, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                            C5189lv.k(C3784fT.a, null, new EA1(abstractC7770yA3, null), 3);
                            ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                            return Unit.a;
                        }
                    }
                } else {
                    c6120qK1 = abstractC7770yA1.o.F;
                    unit = Unit.a;
                    da2.d = abstractC7770yA1;
                    da2.e = aVar;
                    da2.k = 4;
                    if (c6120qK1.a(unit, da2) != mn) {
                        aVar2 = aVar;
                        abstractC7770yA4 = abstractC7770yA1;
                        reporterApi5 = abstractC7770yA4.b;
                        enumC5028l84 = EnumC5028l80.Q;
                        da2.d = abstractC7770yA4;
                        da2.e = aVar2;
                        da2.g = reporterApi5;
                        da2.h = enumC5028l84;
                        da2.k = 5;
                        c8145zz0B2 = abstractC7770yA4.b(aVar2);
                        if (c8145zz0B2 != mn) {
                            aVar4 = aVar2;
                            enumC5028l85 = enumC5028l84;
                            objA = c8145zz0B2;
                            reporterApi5.h(enumC5028l85, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                            reporterApi6 = abstractC7770yA4.b;
                            enumC5028l86 = EnumC5028l80.Q;
                            da2.d = abstractC7770yA4;
                            da2.e = aVar4;
                            da2.g = reporterApi6;
                            da2.h = enumC5028l86;
                            da2.k = 6;
                            objA = abstractC7770yA4.c(aVar4);
                            if (objA != mn) {
                                ReporterApi.a.b(reporterApi6, enumC5028l86, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                C5189lv.k(C3784fT.a, null, new FA1(abstractC7770yA4, null), 3);
                                reporterApi7 = abstractC7770yA4.b;
                                enumC5028l87 = EnumC5028l80.Q;
                                da2.d = abstractC7770yA4;
                                da2.e = reporterApi7;
                                da2.g = enumC5028l87;
                                da2.h = null;
                                da2.k = 7;
                                c8145zz0B3 = abstractC7770yA4.b(aVar4);
                                if (c8145zz0B3 != mn) {
                                    reporterApi8 = reporterApi7;
                                    enumC5028l88 = enumC5028l87;
                                    objA = c8145zz0B3;
                                    abstractC7770yA3 = abstractC7770yA4;
                                    P80 p81 = (P80) objA;
                                    EnumC5028l80 event2 = EnumC5028l80.Q;
                                    Intrinsics.checkNotNullParameter(event2, "event");
                                    iOrdinal = event2.ordinal();
                                    if (iOrdinal != 9) {
                                        str2 = AFInAppEventType.COMPLETE_REGISTRATION;
                                    } else if (iOrdinal != 41) {
                                        str2 = AFInAppEventType.LEVEL_ACHIEVED;
                                    } else if (iOrdinal != 14) {
                                        str2 = AFInAppEventType.LOGIN;
                                    } else if (iOrdinal != 15) {
                                        str2 = null;
                                    } else {
                                        str2 = AFInAppEventType.ADD_TO_WISH_LIST;
                                    }
                                    reporterApi8.g(enumC5028l88, p81, str2);
                                    ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                                    return Unit.a;
                                }
                            }
                        }
                    }
                }
                return mn;
            case 2:
                enumC5028l81 = da2.h;
                reporterApi2 = (ReporterApi) da2.g;
                aVar3 = (a) da2.e;
                abstractC7770yA2 = da2.d;
                C1795Pt1.b(objA);
                reporterApi2.h(enumC5028l81, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                reporterApi3 = abstractC7770yA2.b;
                enumC5028l82 = EnumC5028l80.R;
                da2.d = abstractC7770yA2;
                da2.e = reporterApi3;
                da2.g = enumC5028l82;
                da2.h = null;
                da2.k = 3;
                c0640Az0C = abstractC7770yA2.c(aVar3);
                if (c0640Az0C != mn) {
                    reporterApi4 = reporterApi3;
                    enumC5028l83 = enumC5028l82;
                    objA = c0640Az0C;
                    abstractC7770yA3 = abstractC7770yA2;
                    ReporterApi.a.b(reporterApi4, enumC5028l83, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                    C5189lv.k(C3784fT.a, null, new EA1(abstractC7770yA3, null), 3);
                    ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                    return Unit.a;
                }
                return mn;
            case 3:
                enumC5028l83 = (EnumC5028l80) da2.g;
                reporterApi4 = (ReporterApi) da2.e;
                abstractC7770yA3 = da2.d;
                C1795Pt1.b(objA);
                ReporterApi.a.b(reporterApi4, enumC5028l83, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                C5189lv.k(C3784fT.a, null, new EA1(abstractC7770yA3, null), 3);
                ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                return Unit.a;
            case 4:
                aVar2 = (a) da2.e;
                abstractC7770yA1 = da2.d;
                C1795Pt1.b(objA);
                abstractC7770yA4 = abstractC7770yA1;
                reporterApi5 = abstractC7770yA4.b;
                enumC5028l84 = EnumC5028l80.Q;
                da2.d = abstractC7770yA4;
                da2.e = aVar2;
                da2.g = reporterApi5;
                da2.h = enumC5028l84;
                da2.k = 5;
                c8145zz0B2 = abstractC7770yA4.b(aVar2);
                if (c8145zz0B2 != mn) {
                    aVar4 = aVar2;
                    enumC5028l85 = enumC5028l84;
                    objA = c8145zz0B2;
                    reporterApi5.h(enumC5028l85, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                    reporterApi6 = abstractC7770yA4.b;
                    enumC5028l86 = EnumC5028l80.Q;
                    da2.d = abstractC7770yA4;
                    da2.e = aVar4;
                    da2.g = reporterApi6;
                    da2.h = enumC5028l86;
                    da2.k = 6;
                    objA = abstractC7770yA4.c(aVar4);
                    if (objA != mn) {
                        ReporterApi.a.b(reporterApi6, enumC5028l86, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                        C5189lv.k(C3784fT.a, null, new FA1(abstractC7770yA4, null), 3);
                        reporterApi7 = abstractC7770yA4.b;
                        enumC5028l87 = EnumC5028l80.Q;
                        da2.d = abstractC7770yA4;
                        da2.e = reporterApi7;
                        da2.g = enumC5028l87;
                        da2.h = null;
                        da2.k = 7;
                        c8145zz0B3 = abstractC7770yA4.b(aVar4);
                        if (c8145zz0B3 != mn) {
                            reporterApi8 = reporterApi7;
                            enumC5028l88 = enumC5028l87;
                            objA = c8145zz0B3;
                            abstractC7770yA3 = abstractC7770yA4;
                            P80 p82 = (P80) objA;
                            EnumC5028l80 event3 = EnumC5028l80.Q;
                            Intrinsics.checkNotNullParameter(event3, "event");
                            iOrdinal = event3.ordinal();
                            if (iOrdinal != 9) {
                                str2 = AFInAppEventType.COMPLETE_REGISTRATION;
                            } else if (iOrdinal != 41) {
                                str2 = AFInAppEventType.LEVEL_ACHIEVED;
                            } else if (iOrdinal != 14) {
                                str2 = AFInAppEventType.LOGIN;
                            } else if (iOrdinal != 15) {
                                str2 = null;
                            } else {
                                str2 = AFInAppEventType.ADD_TO_WISH_LIST;
                            }
                            reporterApi8.g(enumC5028l88, p82, str2);
                            ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                            return Unit.a;
                        }
                    }
                }
                return mn;
            case 5:
                enumC5028l85 = da2.h;
                reporterApi5 = (ReporterApi) da2.g;
                aVar4 = (a) da2.e;
                abstractC7770yA4 = da2.d;
                C1795Pt1.b(objA);
                reporterApi5.h(enumC5028l85, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                reporterApi6 = abstractC7770yA4.b;
                enumC5028l86 = EnumC5028l80.Q;
                da2.d = abstractC7770yA4;
                da2.e = aVar4;
                da2.g = reporterApi6;
                da2.h = enumC5028l86;
                da2.k = 6;
                objA = abstractC7770yA4.c(aVar4);
                if (objA != mn) {
                    ReporterApi.a.b(reporterApi6, enumC5028l86, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                    C5189lv.k(C3784fT.a, null, new FA1(abstractC7770yA4, null), 3);
                    reporterApi7 = abstractC7770yA4.b;
                    enumC5028l87 = EnumC5028l80.Q;
                    da2.d = abstractC7770yA4;
                    da2.e = reporterApi7;
                    da2.g = enumC5028l87;
                    da2.h = null;
                    da2.k = 7;
                    c8145zz0B3 = abstractC7770yA4.b(aVar4);
                    if (c8145zz0B3 != mn) {
                        reporterApi8 = reporterApi7;
                        enumC5028l88 = enumC5028l87;
                        objA = c8145zz0B3;
                        abstractC7770yA3 = abstractC7770yA4;
                        P80 p83 = (P80) objA;
                        EnumC5028l80 event4 = EnumC5028l80.Q;
                        Intrinsics.checkNotNullParameter(event4, "event");
                        iOrdinal = event4.ordinal();
                        if (iOrdinal != 9) {
                            str2 = AFInAppEventType.COMPLETE_REGISTRATION;
                        } else if (iOrdinal != 41) {
                            str2 = AFInAppEventType.LEVEL_ACHIEVED;
                        } else if (iOrdinal != 14) {
                            str2 = AFInAppEventType.LOGIN;
                        } else if (iOrdinal != 15) {
                            str2 = null;
                        } else {
                            str2 = AFInAppEventType.ADD_TO_WISH_LIST;
                        }
                        reporterApi8.g(enumC5028l88, p83, str2);
                        ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                        return Unit.a;
                    }
                }
                return mn;
            case 6:
                enumC5028l86 = da2.h;
                reporterApi6 = (ReporterApi) da2.g;
                aVar4 = (a) da2.e;
                abstractC7770yA4 = da2.d;
                C1795Pt1.b(objA);
                ReporterApi.a.b(reporterApi6, enumC5028l86, (P80) objA, WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                C5189lv.k(C3784fT.a, null, new FA1(abstractC7770yA4, null), 3);
                reporterApi7 = abstractC7770yA4.b;
                enumC5028l87 = EnumC5028l80.Q;
                da2.d = abstractC7770yA4;
                da2.e = reporterApi7;
                da2.g = enumC5028l87;
                da2.h = null;
                da2.k = 7;
                c8145zz0B3 = abstractC7770yA4.b(aVar4);
                if (c8145zz0B3 != mn) {
                    reporterApi8 = reporterApi7;
                    enumC5028l88 = enumC5028l87;
                    objA = c8145zz0B3;
                    abstractC7770yA3 = abstractC7770yA4;
                    P80 p84 = (P80) objA;
                    EnumC5028l80 event5 = EnumC5028l80.Q;
                    Intrinsics.checkNotNullParameter(event5, "event");
                    iOrdinal = event5.ordinal();
                    if (iOrdinal != 9) {
                        str2 = AFInAppEventType.COMPLETE_REGISTRATION;
                    } else if (iOrdinal != 41) {
                        str2 = AFInAppEventType.LEVEL_ACHIEVED;
                    } else if (iOrdinal != 14) {
                        str2 = AFInAppEventType.LOGIN;
                    } else if (iOrdinal != 15) {
                        str2 = null;
                    } else {
                        str2 = AFInAppEventType.ADD_TO_WISH_LIST;
                    }
                    reporterApi8.g(enumC5028l88, p84, str2);
                    ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                    return Unit.a;
                }
                return mn;
            case 7:
                enumC5028l88 = (EnumC5028l80) da2.g;
                reporterApi8 = (ReporterApi) da2.e;
                abstractC7770yA3 = da2.d;
                C1795Pt1.b(objA);
                P80 p85 = (P80) objA;
                EnumC5028l80 event6 = EnumC5028l80.Q;
                Intrinsics.checkNotNullParameter(event6, "event");
                iOrdinal = event6.ordinal();
                if (iOrdinal != 9) {
                    str2 = AFInAppEventType.COMPLETE_REGISTRATION;
                } else if (iOrdinal != 41) {
                    str2 = AFInAppEventType.LEVEL_ACHIEVED;
                } else if (iOrdinal != 14) {
                    str2 = AFInAppEventType.LOGIN;
                } else if (iOrdinal != 15) {
                    str2 = null;
                } else {
                    str2 = AFInAppEventType.ADD_TO_WISH_LIST;
                }
                reporterApi8.g(enumC5028l88, p85, str2);
                ReporterApi.a.b(abstractC7770yA3.b, EnumC5028l80.T, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 10);
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
    
        if (r1 == r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
    
        if (r1 == r8) goto L43;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull defpackage.EnumC4164hF1 r17, @org.jetbrains.annotations.Nullable java.lang.Double r18, @org.jetbrains.annotations.Nullable java.lang.Double r19, long r20, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull defpackage.LM r23) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7770yA1.h(hF1, java.lang.Double, java.lang.Double, long, java.lang.String, LM):java.lang.Object");
    }
}
