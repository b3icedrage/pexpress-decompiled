package defpackage;

import com.api.core.ActivityStateProvider;
import com.api.feature.analytics.reporters.ReporterApi;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Y12 extends S02<I32> {

    @NotNull
    public final C1281Jf v0;

    @NotNull
    public final C6206qk w0;

    @NotNull
    public final InterfaceC3207ch2 x0;

    @NotNull
    public final CZ1 y0;

    @NotNull
    public final InterfaceC1375Kk0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y12(@NotNull C1281Jf appDataUpdatersStarter, @NotNull C6206qk assetsUpdater, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull C4923kf appData, @NotNull UV0 makeABetRequestBuilder, @NotNull C4934kh2 webSocketServiceProvider, @NotNull ActivityStateProvider activityStateProvider, @NotNull ReporterApi reporter, @NotNull G41 nextBetStateManager, @NotNull NQ currentIndicatorProvider, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider, @NotNull InterfaceC4824k92 unsentBetIdsUseCase, @NotNull U7 addRobotBetIdUseCase, @NotNull OM convertCurrencyUseCase, @NotNull InterfaceC3012bl0 getCurrencyRatesUseCase, @NotNull L32 tradingRepository, @NotNull C3149cR currentStrategyProvider, @NotNull C6348rR customIndicatorsExperimentProviderApi, @NotNull U22 tradingDefaultsProvider, @NotNull InterfaceC3207ch2 requestIdProviderApi, @NotNull CZ1 timeZoneOffsetProviderApi, @NotNull InterfaceC1375Kk0 getBetMinMaxValuesUseCase, @NotNull C4612j90 eventsFlowsProvider, @NotNull S12 betRequestIdHolder) {
        super(tradingAssetsProvider, timeSelectionsProvider, appData, makeABetRequestBuilder, webSocketServiceProvider, activityStateProvider, reporter, nextBetStateManager, currentIndicatorProvider, accountModeSelectionUseCase, currencySignProvider, unsentBetIdsUseCase, addRobotBetIdUseCase, convertCurrencyUseCase, getCurrencyRatesUseCase, tradingRepository, currentStrategyProvider, customIndicatorsExperimentProviderApi, tradingDefaultsProvider, eventsFlowsProvider);
        Intrinsics.checkNotNullParameter(appDataUpdatersStarter, "appDataUpdatersStarter");
        Intrinsics.checkNotNullParameter(assetsUpdater, "assetsUpdater");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(makeABetRequestBuilder, "makeABetRequestBuilder");
        Intrinsics.checkNotNullParameter(webSocketServiceProvider, "webSocketServiceProvider");
        Intrinsics.checkNotNullParameter(activityStateProvider, "activityStateProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nextBetStateManager, "nextBetStateManager");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(unsentBetIdsUseCase, "unsentBetIdsUseCase");
        Intrinsics.checkNotNullParameter(addRobotBetIdUseCase, "addRobotBetIdUseCase");
        Intrinsics.checkNotNullParameter(convertCurrencyUseCase, "convertCurrencyUseCase");
        Intrinsics.checkNotNullParameter(getCurrencyRatesUseCase, "getCurrencyRatesUseCase");
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        Intrinsics.checkNotNullParameter(currentStrategyProvider, "currentStrategyProvider");
        Intrinsics.checkNotNullParameter(customIndicatorsExperimentProviderApi, "customIndicatorsExperimentProviderApi");
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(requestIdProviderApi, "requestIdProviderApi");
        Intrinsics.checkNotNullParameter(timeZoneOffsetProviderApi, "timeZoneOffsetProviderApi");
        Intrinsics.checkNotNullParameter(getBetMinMaxValuesUseCase, "getBetMinMaxValuesUseCase");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(betRequestIdHolder, "betRequestIdHolder");
        this.v0 = appDataUpdatersStarter;
        this.w0 = assetsUpdater;
        this.x0 = requestIdProviderApi;
        this.y0 = timeZoneOffsetProviderApi;
        this.z0 = getBetMinMaxValuesUseCase;
        this.m0 = betRequestIdHolder;
    }

    @Override // defpackage.S02
    @Nullable
    public final Object F(@NotNull LM lm) {
        this.z0.c();
        Boolean bool = Boolean.TRUE;
        return bool == MN.d ? bool : Unit.a;
    }

    @Override // defpackage.S02
    @Nullable
    public final Unit G() {
        C1281Jf c1281Jf = this.v0;
        c1281Jf.getClass();
        C6206qk appDataUpdater = this.w0;
        Intrinsics.checkNotNullParameter(appDataUpdater, "appDataUpdater");
        Object obj = null;
        C2936bP1 c2936bP1J = C5189lv.j(c1281Jf.e, C6266r20.c, ON.e, new C0969Ff(appDataUpdater, null));
        for (Object obj2 : c1281Jf.b) {
            if (((InterfaceC0735Cf) obj2).a(appDataUpdater)) {
                obj = obj2;
                break;
            }
        }
        InterfaceC0735Cf interfaceC0735Cf = (InterfaceC0735Cf) obj;
        if (interfaceC0735Cf != null) {
            c1281Jf.f.put(interfaceC0735Cf, c2936bP1J);
        }
        c2936bP1J.start();
        return Unit.a;
    }

    @Override // defpackage.S02
    public final void Q(@NotNull C2099Tr betErrorResponse) {
        Intrinsics.checkNotNullParameter(betErrorResponse, "betErrorResponse");
    }

    @Override // defpackage.S02
    @Nullable
    public final Unit Z() {
        return Unit.a;
    }

    @Override // defpackage.S02
    @Nullable
    public final Object a0(@NotNull L12 l12) {
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.S02
    @Nullable
    public final Object f(@NotNull C3279d22 c3279d22, @NotNull LM lm) {
        U12 u12;
        if (lm instanceof U12) {
            u12 = (U12) lm;
            int i = u12.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                u12.h = i - Integer.MIN_VALUE;
            } else {
                u12 = new U12(this, lm);
            }
        } else {
            u12 = new U12(this, lm);
        }
        Object objA = u12.e;
        MN mn = MN.d;
        int i2 = u12.h;
        boolean z = true;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            u12.d = c3279d22;
            u12.h = 1;
            objA = this.b.a(u12);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3279d22 = u12.d;
            C1795Pt1.b(objA);
        }
        boolean z2 = ((C1709Or) objA).c;
        if ((!c3279d22.e || !z2) && (!c3279d22.d || z2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.S02
    @Nullable
    public final Object h(int i, @NotNull LM lm) {
        V12 v12;
        int i2;
        Object objO;
        Y12 y12;
        int i3;
        Y12 y13;
        C3279d22 c3279d22;
        long j;
        long j2;
        Y12 y14;
        Object objI;
        if (lm instanceof V12) {
            v12 = (V12) lm;
            int i4 = v12.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                v12.k = i4 - Integer.MIN_VALUE;
            } else {
                v12 = new V12(this, lm);
            }
        } else {
            v12 = new V12(this, lm);
        }
        Object objA = v12.i;
        MN mn = MN.d;
        int i5 = v12.k;
        if (i5 == 0) {
            C1795Pt1.b(objA);
            v12.d = this;
            i2 = i;
            v12.g = i2;
            v12.k = 1;
            objO = C4466ii.o(this.I, v12);
            if (objO != mn) {
                y12 = this;
            }
            return mn;
        }
        if (i5 == 1) {
            int i6 = v12.g;
            y12 = v12.d;
            C1795Pt1.b(objA);
            objO = objA;
            i2 = i6;
        } else {
            if (i5 == 2) {
                i3 = v12.g;
                C3279d22 c3279d23 = v12.e;
                Y12 y15 = v12.d;
                C1795Pt1.b(objA);
                c3279d22 = c3279d23;
                y13 = y15;
                j = ((C1709Or) objA).a;
                v12.d = y13;
                v12.e = c3279d22;
                v12.g = i3;
                v12.h = j;
                v12.k = 3;
                objA = y13.b.a(v12);
                if (objA != mn) {
                    j2 = j;
                    I10 i10 = new I10(c3279d22, j2, (InterfaceC2441Xr) null, (H32.a) null, ((C1709Or) objA).c, false, 108);
                    v12.d = y13;
                    v12.e = null;
                    v12.g = i3;
                    v12.k = 4;
                    objA = y13.e(i10, v12);
                    if (objA != mn) {
                        y14 = y13;
                    }
                }
                return mn;
            }
            if (i5 == 3) {
                long j3 = v12.h;
                i3 = v12.g;
                c3279d22 = v12.e;
                Y12 y16 = v12.d;
                C1795Pt1.b(objA);
                j2 = j3;
                y13 = y16;
                I10 i11 = new I10(c3279d22, j2, (InterfaceC2441Xr) null, (H32.a) null, ((C1709Or) objA).c, false, 108);
                v12.d = y13;
                v12.e = null;
                v12.g = i3;
                v12.k = 4;
                objA = y13.e(i11, v12);
                if (objA != mn) {
                    y14 = y13;
                }
                return mn;
            }
            if (i5 != 4) {
                if (i5 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objA);
                return objA;
            }
            i3 = v12.g;
            y14 = v12.d;
            C1795Pt1.b(objA);
        }
        v12.d = null;
        v12.k = 5;
        objI = y14.i(i3, (H32.a) objA, v12);
        if (objI != mn) {
            return mn;
        }
        return objI;
        C3279d22 c3279d24 = (C3279d22) objO;
        v12.d = y12;
        v12.e = c3279d24;
        v12.g = i2;
        v12.k = 2;
        Object objA2 = y12.b.a(v12);
        if (objA2 != mn) {
            i3 = i2;
            objA = objA2;
            y13 = y12;
            c3279d22 = c3279d24;
            j = ((C1709Or) objA).a;
            v12.d = y13;
            v12.e = c3279d22;
            v12.g = i3;
            v12.h = j;
            v12.k = 3;
            objA = y13.b.a(v12);
            if (objA != mn) {
                j2 = j;
                I10 i12 = new I10(c3279d22, j2, (InterfaceC2441Xr) null, (H32.a) null, ((C1709Or) objA).c, false, 108);
                v12.d = y13;
                v12.e = null;
                v12.g = i3;
                v12.k = 4;
                objA = y13.e(i12, v12);
                if (objA != mn) {
                    y14 = y13;
                    v12.d = null;
                    v12.k = 5;
                    objI = y14.i(i3, (H32.a) objA, v12);
                    if (objI != mn) {
                        return objI;
                    }
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.S02
    @Nullable
    public final Object i(int i, @NotNull H32.a aVar, @NotNull LM lm) {
        W12 w12;
        H32.a aVar2;
        int i2;
        int i3;
        Y12 y12;
        String str;
        int i4;
        Y12 y13;
        H32.a aVar3;
        int i5;
        boolean z;
        if (lm instanceof W12) {
            w12 = (W12) lm;
            int i6 = w12.l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                w12.l = i6 - Integer.MIN_VALUE;
            } else {
                w12 = new W12(this, lm);
            }
        } else {
            w12 = new W12(this, lm);
        }
        Object obj = w12.j;
        MN mn = MN.d;
        int i7 = w12.l;
        if (i7 == 0) {
            C1795Pt1.b(obj);
            int i8 = this.f0 != EnumC4164hF1.h ? 1 : 0;
            w12.d = this;
            aVar2 = aVar;
            w12.e = aVar2;
            i2 = i;
            w12.h = i2;
            w12.i = i8;
            w12.l = 1;
            Object objO = C4466ii.o(this.I, w12);
            if (objO != mn) {
                i3 = i8;
                obj = objO;
                y12 = this;
            }
            return mn;
        }
        if (i7 == 1) {
            int i9 = w12.i;
            i2 = w12.h;
            H32.a aVar4 = w12.e;
            y12 = w12.d;
            C1795Pt1.b(obj);
            i3 = i9;
            aVar2 = aVar4;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = w12.i;
            int i10 = w12.h;
            String str2 = w12.g;
            H32.a aVar5 = w12.e;
            y13 = w12.d;
            C1795Pt1.b(obj);
            i5 = i10;
            str = str2;
            aVar3 = aVar5;
        }
        long j = ((C1709Or) obj).a;
        String strA = y13.x0.a();
        if (i4 != 0) {
            z = true;
        } else {
            z = false;
        }
        return new I32(aVar3, i5, z, str, j, strA);
        String str3 = ((C3279d22) obj).l;
        w12.d = y12;
        w12.e = aVar2;
        w12.g = str3;
        w12.h = i2;
        w12.i = i3;
        w12.l = 2;
        Object objA = y12.b.a(w12);
        if (objA != mn) {
            str = str3;
            obj = objA;
            i4 = i3;
            y13 = y12;
            aVar3 = aVar2;
            i5 = i2;
            long j2 = ((C1709Or) obj).a;
            String strA2 = y13.x0.a();
            if (i4 != 0) {
                z = true;
            } else {
                z = false;
            }
            return new I32(aVar3, i5, z, str, j2, strA2);
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.S02
    @Nullable
    public final Object m(@NotNull LM lm) {
        X12 x12;
        if (lm instanceof X12) {
            x12 = (X12) lm;
            int i = x12.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                x12.g = i - Integer.MIN_VALUE;
            } else {
                x12 = new X12(this, lm);
            }
        } else {
            x12 = new X12(this, lm);
        }
        Object objO = x12.d;
        MN mn = MN.d;
        int i2 = x12.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C4250hg0 value = this.y0.getValue();
            x12.g = 1;
            objO = C4466ii.o(value, x12);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        return new Long(System.currentTimeMillis() - ((long) (((Number) objO).intValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));
    }
}
