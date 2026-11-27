package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {70, 82}, m = "invokeSuspend")
public final class C3029bq0 extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1782Pp0 h;
    public final /* synthetic */ AbstractC3447dq0 i;

    /* JADX INFO: renamed from: bq0$a */
    public static final class a extends ML0 implements Function1<Throwable, Unit> {
        public final /* synthetic */ C1782Pp0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1782Pp0 c1782Pp0, AbstractC5391mr0 abstractC5391mr0) {
            super(1);
            this.d = c1782Pp0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            if (th != null) {
                this.d.n.a(ED.i);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3029bq0(C1782Pp0 c1782Pp0, AbstractC3447dq0 abstractC3447dq0, JM jm) {
        super(3, jm);
        this.h = c1782Pp0;
        this.i = abstractC3447dq0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01af, code lost:
    
        if (r8.d(r18, r9) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3029bq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
        AbstractC3447dq0 abstractC3447dq0 = this.i;
        C3029bq0 c3029bq0 = new C3029bq0(this.h, abstractC3447dq0, jm);
        c3029bq0.e = abstractC1121Hd1;
        c3029bq0.g = obj;
        return c3029bq0.invokeSuspend(Unit.a);
    }
}
