package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: s32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6482s32<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ D32 d;

    /* JADX INFO: renamed from: s32$a */
    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$listenForNetworkReopen$2", f = "TradingNotificationController.kt", l = {97}, m = "emit")
    public static final class a extends LM {
        public D32 d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C6482s32<T> g;
        public int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C6482s32<? super T> c6482s32, JM<? super a> jm) {
            super(jm);
            this.g = c6482s32;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return this.g.a(null, this);
        }
    }

    public C6482s32(D32 d32) {
        this.d = d32;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(EnumC3495e41 enumC3495e41, JM<? super Unit> jm) {
        a aVar;
        D32 d32;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object objE = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            if (enumC3495e41 == EnumC3495e41.e) {
                d32 = this.d;
                aVar.d = d32;
                aVar.h = 1;
                objE = d32.e(aVar);
                if (objE == mn) {
                    return mn;
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d32 = aVar.d;
        C1795Pt1.b(objE);
        C2255Vr c2255Vr = (C2255Vr) objE;
        d32.getClass();
        d32.d.c(c2255Vr.a, c2255Vr.b, c2255Vr.c, null);
        return Unit.a;
    }
}
