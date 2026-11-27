package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: f12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$getFilteredResponses$2", f = "Trader.kt", l = {985, 1005}, m = "invokeSuspend")
public final class C3694f12 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super ResultOk<? extends AbstractC7783yF>>, ResultOk<? extends AbstractC7783yF>, JM<? super Boolean>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public /* synthetic */ ResultOk g;
    public final /* synthetic */ S02<H32> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3694f12(S02<H32> s02, JM<? super C3694f12> jm) {
        super(3, jm);
        this.h = s02;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        InterfaceC6606sf0 interfaceC6606sf0;
        ResultOk resultOk;
        ResultOk resultOk2;
        String str;
        AbstractC7783yF abstractC7783yF;
        C5141lh c5141lh;
        ResultOk resultOk3;
        MN mn = MN.d;
        int i = this.d;
        Long l = null;
        S02<H32> s02 = this.h;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                resultOk2 = this.g;
                interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
                C1795Pt1.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resultOk3 = (ResultOk) this.e;
                C1795Pt1.b(obj);
            }
            z = resultOk3.a() instanceof C2337Wr;
            return Boolean.valueOf(z);
        }
        C1795Pt1.b(obj);
        interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
        resultOk = this.g;
        String.valueOf(CommonResultKt.b(resultOk));
        if (!s02.t((AbstractC7783yF) resultOk.a())) {
            this.e = interfaceC6606sf0;
            this.g = resultOk;
            this.d = 1;
            Boolean bool = Boolean.FALSE;
            if (bool != mn) {
                resultOk2 = resultOk;
                obj = bool;
            }
            return mn;
        }
        if (s02.t((AbstractC7783yF) resultOk.a())) {
            str = "another_bet_closed";
        } else {
            str = "another_asset_opened";
        }
        abstractC7783yF = (AbstractC7783yF) resultOk.a();
        if (abstractC7783yF instanceof C2337Wr) {
            l = new Long(((C2337Wr) abstractC7783yF).a);
        } else if (abstractC7783yF instanceof C0849Dr) {
            l = new Long(((C0849Dr) abstractC7783yF).a);
        } else if (abstractC7783yF instanceof C0771Cr) {
            ((C0771Cr) abstractC7783yF).getClass();
            l = (Long) CollectionsKt.firstOrNull(null);
        }
        c5141lh = U0.y;
        if (c5141lh != null) {
            c5141lh.invoke(str, l);
        }
        return Boolean.valueOf(z);
        if (!((Boolean) obj).booleanValue()) {
            this.e = resultOk2;
            this.g = null;
            this.d = 2;
            if (interfaceC6606sf0.a(resultOk2, this) != mn) {
                resultOk3 = resultOk2;
                z = resultOk3.a() instanceof C2337Wr;
                return Boolean.valueOf(z);
            }
            return mn;
        }
        resultOk = resultOk2;
        if (s02.t((AbstractC7783yF) resultOk.a())) {
            str = "another_bet_closed";
        } else {
            str = "another_asset_opened";
        }
        abstractC7783yF = (AbstractC7783yF) resultOk.a();
        if (abstractC7783yF instanceof C2337Wr) {
            l = new Long(((C2337Wr) abstractC7783yF).a);
        } else if (abstractC7783yF instanceof C0849Dr) {
            l = new Long(((C0849Dr) abstractC7783yF).a);
        } else if (abstractC7783yF instanceof C0771Cr) {
            ((C0771Cr) abstractC7783yF).getClass();
            l = (Long) CollectionsKt.firstOrNull(null);
        }
        c5141lh = U0.y;
        if (c5141lh != null) {
            c5141lh.invoke(str, l);
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<? super ResultOk<? extends AbstractC7783yF>> interfaceC6606sf0, ResultOk<? extends AbstractC7783yF> resultOk, JM<? super Boolean> jm) {
        C3694f12 c3694f12 = new C3694f12(this.h, jm);
        c3694f12.e = interfaceC6606sf0;
        c3694f12.g = resultOk;
        return c3694f12.invokeSuspend(Unit.a);
    }
}
