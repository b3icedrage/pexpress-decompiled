package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", f = "HttpRequestLifecycle.kt", l = {38}, m = "invokeSuspend")
public final class C3450dr0 extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1782Pp0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3450dr0(C1782Pp0 c1782Pp0, JM<? super C3450dr0> jm) {
        super(3, jm);
        this.g = c1782Pp0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FG fg;
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fg = (FG) this.e;
            try {
                C1795Pt1.b(obj);
                fg.X();
                return Unit.a;
            } catch (Throwable th) {
                th = th;
                try {
                    fg.k(th);
                    throw th;
                } catch (Throwable th2) {
                    fg.X();
                    throw th2;
                }
            }
        }
        C1795Pt1.b(obj);
        AbstractC1121Hd1 abstractC1121Hd1 = (AbstractC1121Hd1) this.e;
        C4002gV1 c4002gV1 = new C4002gV1(((C3032br0) abstractC1121Hd1.d).e);
        CoroutineContext.Element elementP = this.g.h.p(XF0.a.d);
        Intrinsics.checkNotNull(elementP);
        FS0 fs0 = C4290hr0.a;
        c4002gV1.W(new C3870fr0(((XF0) elementP).W(new C4080gr0(c4002gV1, 0))));
        try {
            C3032br0 c3032br0 = (C3032br0) abstractC1121Hd1.d;
            c3032br0.getClass();
            Intrinsics.checkNotNullParameter(c4002gV1, "<set-?>");
            c3032br0.e = c4002gV1;
            this.e = c4002gV1;
            this.d = 1;
            if (abstractC1121Hd1.c(this) == mn) {
                return mn;
            }
            fg = c4002gV1;
            fg.X();
            return Unit.a;
        } catch (Throwable th3) {
            th = th3;
            fg = c4002gV1;
            fg.k(th);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
        C3450dr0 c3450dr0 = new C3450dr0(this.g, jm);
        c3450dr0.e = abstractC1121Hd1;
        return c3450dr0.invokeSuspend(Unit.a);
    }
}
