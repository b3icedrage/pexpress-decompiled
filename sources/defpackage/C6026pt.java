package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.BodyProgress$handle$1", f = "BodyProgress.kt", l = {38}, m = "invokeSuspend")
public final class C6026pt extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC1121Hd1 abstractC1121Hd1 = this.e;
            Object obj2 = this.g;
            InterfaceC1060Gj0 interfaceC1060Gj0 = (InterfaceC1060Gj0) ((C3032br0) abstractC1121Hd1.d).f.e(C6445rt.a);
            if (interfaceC1060Gj0 == null) {
                return Unit.a;
            }
            Intrinsics.c(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
            C2883b81 c2883b81 = new C2883b81((AbstractC1112Ha1) obj2, ((C3032br0) abstractC1121Hd1.d).e, interfaceC1060Gj0);
            this.e = null;
            this.d = 1;
            if (abstractC1121Hd1.d(this, c2883b81) == mn) {
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

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
        C6026pt c6026pt = new C6026pt(3, jm);
        c6026pt.e = abstractC1121Hd1;
        c6026pt.g = obj;
        return c6026pt.invokeSuspend(Unit.a);
    }
}
