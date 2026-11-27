package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.AssetsUpdater$start$2", f = "AssetsUpdater.kt", l = {}, m = "invokeSuspend")
public final class C5996pk extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ C6206qk e;

    /* JADX INFO: renamed from: pk$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.updaters.AssetsUpdater$start$2$1", f = "AssetsUpdater.kt", l = {37}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C6206qk e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6206qk c6206qk, JM<? super a> jm) {
            super(2, jm);
            this.e = c6206qk;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (C6206qk.d(this.e, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5996pk(C6206qk c6206qk, JM<? super C5996pk> jm) {
        super(2, jm);
        this.e = c6206qk;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C5996pk c5996pk = new C5996pk(this.e, jm);
        c5996pk.d = obj;
        return c5996pk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5996pk) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        KN kn = (KN) this.d;
        C2936bP1 c2936bP1 = this.e.d;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        C6206qk c6206qk = this.e;
        c6206qk.d = C5189lv.k(kn, null, new a(c6206qk, null), 3);
        return Unit.a;
    }
}
