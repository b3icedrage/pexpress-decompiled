package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataUpdatersStarter$2", f = "AppDataUpdatersStarter.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend")
public final class C0891Ef extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1281Jf e;

    /* JADX INFO: renamed from: Ef$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C1281Jf d;

        public a(C1281Jf c1281Jf) {
            this.d = c1281Jf;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            C1281Jf c1281Jf = this.d;
            c1281Jf.a();
            if (!c1281Jf.d) {
                c1281Jf.d = true;
                C5189lv.k(c1281Jf.e, null, new C1125Hf(c1281Jf, null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0891Ef(C1281Jf c1281Jf, JM<? super C0891Ef> jm) {
        super(2, jm);
        this.e = c1281Jf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0891Ef(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
        ((C0891Ef) create(kn, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw EK.c(obj);
        }
        C1795Pt1.b(obj);
        C1281Jf c1281Jf = this.e;
        C6120qK1 c6120qK1B = c1281Jf.c.b();
        a aVar = new a(c1281Jf);
        this.d = 1;
        c6120qK1B.c(aVar, this);
        return mn;
    }
}
