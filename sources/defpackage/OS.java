package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
public final class OS extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ IS<Object> e;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ IS<T> d;

        public a(IS<T> is) {
            this.d = is;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            IS<T> is = this.d;
            if (is.h.a() instanceof C7649xd0) {
                return Unit.a;
            }
            Object objE = IS.e(is, true, jm);
            return objE == MN.d ? objE : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OS(IS<Object> is, JM<? super OS> jm) {
        super(2, jm);
        this.e = is;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new OS(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((OS) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r6.c(r1, r5) == r0) goto L18;
     */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            MN r0 = defpackage.MN.d
            int r1 = r5.d
            IS<java.lang.Object> r2 = r5.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L4e
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L33
        L1e:
            defpackage.C1795Pt1.b(r6)
            r5.d = r4
            IS<T>$a r6 = r2.i
            DG r6 = r6.b
            java.lang.Object r6 = r6.z(r5)
            if (r6 != r0) goto L2e
            goto L30
        L2e:
            kotlin.Unit r6 = kotlin.Unit.a
        L30:
            if (r6 != r0) goto L33
            goto L4d
        L33:
            SB0 r6 = r2.g()
            fC1 r6 = r6.d()
            r1 = -1
            rf0 r6 = defpackage.C4466ii.g(r6, r1)
            OS$a r1 = new OS$a
            r1.<init>(r2)
            r5.d = r3
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OS.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
