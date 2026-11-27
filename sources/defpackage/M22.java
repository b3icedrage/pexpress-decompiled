package defpackage;

import com.api.core.backend.domain.models.requestModels.GetCandlesToTimestampRequestApi;
import com.api.core.backend.domain.models.requestModels.MakeABetRequestApi;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.modelsRequest.CandlesHistorySubscribeRequest;
import com.impl.core.backend.modelsRequest.MakeABetRequestImpl;
import com.impl.core.backend.modelsRequest.SubscribeForAssetRequestImpl;
import com.impl.core.backend.modelsRequest.UnSubscribeForAssetRequestImpl;
import com.impl.core.backend.modelsResponse.BetClosedResponseImpl;
import com.impl.core.backend.modelsResponse.BetOpenFailedResponseImpl;
import com.impl.core.backend.modelsResponse.BetOpenedResponseImpl;
import com.impl.core.backend.modelsResponse.CandlesHistoryResponseImpl;
import com.impl.core.backend.modelsResponse.MinMaxBetAmountResponseImpl;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class M22 extends L22 {

    @NotNull
    public final Vg2 b;

    @NotNull
    public final C3836fh2 c;

    @NotNull
    public final Object d;

    @NotNull
    public final Object e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MakeABetRequestImpl.AccountTypeImpl.values().length];
            try {
                iArr[MakeABetRequestImpl.AccountTypeImpl.DEMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MakeABetRequestImpl.AccountTypeImpl.REAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M22(@NotNull Vg2 executor, @NotNull C3836fh2 secondExecutor, @NotNull InterfaceC7007ua1 ourSideHttpService) {
        super(ourSideHttpService);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(secondExecutor, "secondExecutor");
        Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
        this.b = executor;
        this.c = secondExecutor;
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        this.d = XO0.a(enumC4403iP0, new C6693t4(this, 6));
        this.e = XO0.a(enumC4403iP0, new C6819tg(this, 4));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.K22
    @Nullable
    public final Object a(@NotNull GetCandlesToTimestampRequestApi getCandlesToTimestampRequestApi, @NotNull LM lm) {
        N22 n22;
        InterfaceC6396rf0<JsonElement> interfaceC6396rf0D;
        if (lm instanceof N22) {
            n22 = (N22) lm;
            int i = n22.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                n22.g = i - Integer.MIN_VALUE;
            } else {
                n22 = new N22(this, lm);
            }
        } else {
            n22 = new N22(this, lm);
        }
        N22 n23 = n22;
        Object objB = n23.d;
        MN mn = MN.d;
        int i2 = n23.g;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            Intrinsics.c(getCandlesToTimestampRequestApi, "null cannot be cast to non-null type com.api.core.backend.repositories.trading.models.common.CommonGetCandlesToTimestampRequest");
            YF request = (YF) getCandlesToTimestampRequestApi;
            CandlesHistorySubscribeRequest.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            String str = request.a;
            CandlesHistorySubscribeRequest candlesHistorySubscribeRequest = new CandlesHistorySubscribeRequest(str, request.b);
            UnSubscribeForAssetRequestImpl unSubscribeForAssetRequestImpl = new UnSubscribeForAssetRequestImpl(str);
            SubscribeForAssetRequestImpl subscribeForAssetRequestImpl = new SubscribeForAssetRequestImpl(str);
            CandlesHistoryResponseImpl.INSTANCE.getClass();
            String str2 = CandlesHistoryResponseImpl.responseName;
            InterfaceC5125ld interfaceC5125ldF = f();
            String str3 = CandlesHistoryResponseImpl.responseName;
            InterfaceC5125ld interfaceC5125ld = (InterfaceC5125ld) this.e.getValue();
            C3735fC1 c3735fC1B = C7683xl2.b(str3, new TypeToken<CandlesHistoryResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$historyCandleToTimestamp$$inlined$getRightMessages$1
            }, interfaceC5125ldF.d());
            TypeToken<CandlesHistoryResponseImpl> typeToken = new TypeToken<CandlesHistoryResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$historyCandleToTimestamp$$inlined$getRightMessages$2
            };
            if (interfaceC5125ld == null || (interfaceC6396rf0D = interfaceC5125ld.d()) == null) {
                interfaceC6396rf0D = C5020l60.d;
            }
            C3098cA c3098cAX = C4466ii.x(c3735fC1B, C7683xl2.b(str3, typeToken, interfaceC6396rf0D));
            String str4 = CandlesHistoryResponseImpl.responseName;
            O22 o22 = new O22(this, candlesHistorySubscribeRequest, unSubscribeForAssetRequestImpl, subscribeForAssetRequestImpl, null);
            n23.g = 1;
            int i3 = Fg2.w;
            objB = this.b.B(str2, c3098cAX, str2, str4, o22, n23);
            if (objB == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objB);
        }
        CommonResult commonResult = (CommonResult) objB;
        Intrinsics.checkNotNullParameter(commonResult, "<this>");
        Object objB2 = CommonResultKt.b(commonResult);
        if (objB2 != null) {
            return objB2;
        }
        throw new IllegalStateException("No result as this is ResultError");
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.K22
    @Nullable
    public final C2201Uz b(@NotNull MakeABetRequestApi makeABetRequestApi) {
        Vg2 vg2;
        InterfaceC6396rf0<JsonElement> interfaceC6396rf0D;
        InterfaceC6396rf0<JsonElement> interfaceC6396rf0D2;
        InterfaceC6396rf0<JsonElement> interfaceC6396rf0D3;
        Intrinsics.c(makeABetRequestApi, "null cannot be cast to non-null type com.impl.core.backend.modelsRequest.MakeABetRequestImpl");
        MakeABetRequestImpl makeABetRequestImpl = (MakeABetRequestImpl) makeABetRequestApi;
        int i = a.a[makeABetRequestImpl.getAccountType().ordinal()];
        if (i == 1) {
            vg2 = this.b;
        } else {
            if (i != 2) {
                throw new C6489s51();
            }
            vg2 = this.c;
        }
        Vg2 vg3 = vg2;
        InterfaceC5125ld interfaceC5125ldF = f();
        ?? r13 = this.e;
        InterfaceC5125ld interfaceC5125ld = (InterfaceC5125ld) r13.getValue();
        C3735fC1 c3735fC1B = C7683xl2.b(BetOpenedResponseImpl.NAME, new TypeToken<BetOpenedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$makeABet$$inlined$getRightMessages$1
        }, interfaceC5125ldF.d());
        TypeToken<BetOpenedResponseImpl> typeToken = new TypeToken<BetOpenedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$makeABet$$inlined$getRightMessages$2
        };
        InterfaceC6396rf0<JsonElement> interfaceC6396rf0 = C5020l60.d;
        if (interfaceC5125ld == null || (interfaceC6396rf0D = interfaceC5125ld.d()) == null) {
            interfaceC6396rf0D = interfaceC6396rf0;
        }
        InterfaceC6396rf0 interfaceC6396rf0D4 = Fg2.D(vg3, "openOrder", C4466ii.x(c3735fC1B, C7683xl2.b(BetOpenedResponseImpl.NAME, typeToken, interfaceC6396rf0D)), BetOpenedResponseImpl.NAME, String.valueOf(makeABetRequestImpl.g().getRequestId()), 4);
        InterfaceC5125ld interfaceC5125ldF2 = f();
        InterfaceC5125ld interfaceC5125ld2 = (InterfaceC5125ld) r13.getValue();
        C3735fC1 c3735fC1B2 = C7683xl2.b(BetClosedResponseImpl.NAME, new TypeToken<BetClosedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$makeABet$$inlined$getRightMessages$3
        }, interfaceC5125ldF2.d());
        TypeToken<BetClosedResponseImpl> typeToken2 = new TypeToken<BetClosedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$makeABet$$inlined$getRightMessages$4
        };
        if (interfaceC5125ld2 == null || (interfaceC6396rf0D2 = interfaceC5125ld2.d()) == null) {
            interfaceC6396rf0D2 = interfaceC6396rf0;
        }
        CommonResultKt$okFilter$$inlined$filterIsInstance$1 commonResultKt$okFilter$$inlined$filterIsInstance$1C = CommonResultKt.c(Fg2.D(vg3, "", C4466ii.x(c3735fC1B2, C7683xl2.b(BetClosedResponseImpl.NAME, typeToken2, interfaceC6396rf0D2)), BetClosedResponseImpl.NAME, null, 20), "trading.closed_deals");
        R22 r22 = new R22(2, null);
        int i2 = C2220Vf0.a;
        Q22 q22 = new Q22(new C6759tO(new C6339rO(commonResultKt$okFilter$$inlined$filterIsInstance$1C, r22, 1), 1));
        InterfaceC5125ld interfaceC5125ldF3 = f();
        InterfaceC5125ld interfaceC5125ld3 = (InterfaceC5125ld) r13.getValue();
        C3735fC1 c3735fC1B3 = C7683xl2.b(BetOpenFailedResponseImpl.NAME, new TypeToken<BetOpenFailedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$makeABet$$inlined$getRightMessages$5
        }, interfaceC5125ldF3.d());
        TypeToken<BetOpenFailedResponseImpl> typeToken3 = new TypeToken<BetOpenFailedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$makeABet$$inlined$getRightMessages$6
        };
        if (interfaceC5125ld3 != null && (interfaceC6396rf0D3 = interfaceC5125ld3.d()) != null) {
            interfaceC6396rf0 = interfaceC6396rf0D3;
        }
        C3098cA c3098cAX = C4466ii.x(interfaceC6396rf0D4, q22, Fg2.D(vg3, "", C4466ii.x(c3735fC1B3, C7683xl2.b(BetOpenFailedResponseImpl.NAME, typeToken3, interfaceC6396rf0)), BetOpenFailedResponseImpl.NAME, null, 20));
        P22 sendRequest = new P22(vg3, makeABetRequestApi, null);
        Intrinsics.checkNotNullParameter(c3098cAX, "<this>");
        Intrinsics.checkNotNullParameter(sendRequest, "sendRequest");
        return new C2201Uz(new C2339Wr1(new AtomicBoolean(false), sendRequest, c3098cAX, null), e.d, -2, EnumC1796Pu.d);
    }

    @Override // defpackage.K22
    @Nullable
    public final C7532x31 c() {
        int i = 1;
        InterfaceC5125ld interfaceC5125ldF = f();
        InterfaceC6396rf0<? extends JsonElement> interfaceC6396rf0D = C7683xl2.b;
        if (interfaceC6396rf0D == null) {
            interfaceC6396rf0D = interfaceC5125ldF.d();
        }
        C7683xl2.b = interfaceC6396rf0D;
        InterfaceC6396rf0<JsonElement> interfaceC6396rf0D2 = interfaceC5125ldF.d();
        C5020l60 c5020l60 = C5020l60.d;
        return new C7532x31(C4466ii.x(C7683xl2.c(new TypeToken<List<? extends BetClosedResponseImpl.ClosedBetImpl>>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$subscribeToClosedDemoDeals$$inlined$getRightMessagesFromList$default$1
        }, new TypeToken<BetClosedResponseImpl.ClosedBetImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$subscribeToClosedDemoDeals$$inlined$getRightMessagesFromList$default$2
        }, BetClosedResponseImpl.HISTORY_NAME, C4466ii.x(interfaceC6396rf0D2, c5020l60)), new C2844ay1(C4466ii.x(C7683xl2.b(BetClosedResponseImpl.NAME, new TypeToken<BetClosedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$subscribeToClosedDemoDeals$$inlined$getRightMessages$default$1
        }, f().d()), C7683xl2.b(BetClosedResponseImpl.NAME, new TypeToken<BetClosedResponseImpl>() { // from class: com.impl.core.backend.data_sources.TradingDataSourceImpl$subscribeToClosedDemoDeals$$inlined$getRightMessages$default$2
        }, c5020l60)), i)), 1);
    }

    @Override // defpackage.K22
    @Nullable
    public final C0658Bf0 e() {
        return new C0658Bf0(new ResultOk(new MinMaxBetAmountResponseImpl()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    public final InterfaceC5125ld f() {
        return (InterfaceC5125ld) this.d.getValue();
    }
}
