package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {99}, m = "invokeSuspend")
public final class C2819aq0 extends AW1 implements Function2<KN, JM<? super C5811or0>, Object> {
    public int d;
    public final /* synthetic */ InterfaceC2514Yp0 e;
    public final /* synthetic */ C3241cr0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2819aq0(InterfaceC2514Yp0 interfaceC2514Yp0, C3241cr0 c3241cr0, JM<? super C2819aq0> jm) {
        super(2, jm);
        this.e = interfaceC2514Yp0;
        this.g = c3241cr0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C2819aq0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C5811or0> jm) {
        return ((C2819aq0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        InterfaceC2514Yp0 interfaceC2514Yp0 = this.e;
        XF0 xf0 = (XF0) interfaceC2514Yp0.getE().p(XF0.a.d);
        if (!(xf0 != null ? xf0.g() : false)) {
            throw new DD("Client already closed");
        }
        this.d = 1;
        Object objH0 = interfaceC2514Yp0.h0(this.g, this);
        return objH0 == mn ? mn : objH0;
    }
}
