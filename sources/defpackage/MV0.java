package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivityViewModel$startNavigationListener$1", f = "MainActivityViewModel.kt", l = {95}, m = "invokeSuspend")
public final class MV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ IV0 e;
    public final /* synthetic */ C4250hg0 g;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ IV0 d;

        public a(IV0 iv0) {
            this.d = iv0;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003f  */
        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            boolean z;
            C2343Wt c2343Wt = (C2343Wt) obj;
            IV0 iv0 = this.d;
            if (iv0.p) {
                Integer numD = iv0.l.d();
                C4612j90 c4612j90 = iv0.e;
                if (((numD != null && numD.intValue() == 32) || !((Boolean) c4612j90.m.d.getValue()).booleanValue()) && !((Boolean) c4612j90.k.d.getValue()).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            c2343Wt.b = z;
            iv0.n.i(c2343Wt);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MV0(IV0 iv0, C4250hg0 c4250hg0, JM jm) {
        super(2, jm);
        this.e = iv0;
        this.g = c4250hg0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new MV0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((MV0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            IV0 iv0 = this.e;
            iv0.getClass();
            HV0 hv0 = new HV0(this.g, iv0);
            C4612j90 c4612j90 = iv0.e;
            C3098cA c3098cAX = C4466ii.x(hv0, new C1596Nf0(c4612j90.i, iv0), new JV0(c4612j90.m, iv0), new KV0(c4612j90.k, iv0));
            a aVar = new a(iv0);
            this.d = 1;
            if (c3098cAX.c(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
