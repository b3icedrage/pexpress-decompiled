package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", l = {151, 152}, m = "invokeSuspend")
public final class C1312Jp0 extends AW1 implements InterfaceC1060Gj0<JF1, C3032br0, JM<? super C2250Vp0>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public /* synthetic */ C3032br0 g;
    public final /* synthetic */ C1390Kp0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312Jp0(C1390Kp0 c1390Kp0, JM<? super C1312Jp0> jm) {
        super(3, jm);
        this.h = c1390Kp0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            JF1 jf1 = (JF1) this.e;
            C3032br0 c3032br0 = this.g;
            this.e = null;
            this.d = 1;
            obj = jf1.a(c3032br0, this);
            if (obj != mn) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2250Vp0 c2250Vp0 = (C2250Vp0) this.e;
            C1795Pt1.b(obj);
            return c2250Vp0;
        }
        C1795Pt1.b(obj);
        C2250Vp0 c2250Vp1 = (C2250Vp0) obj;
        AbstractC5391mr0 abstractC5391mr0D = c2250Vp1.d();
        this.e = c2250Vp1;
        this.d = 2;
        return C1390Kp0.b(this.h, abstractC5391mr0D, this) == mn ? mn : c2250Vp1;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(JF1 jf1, C3032br0 c3032br0, JM<? super C2250Vp0> jm) {
        C1312Jp0 c1312Jp0 = new C1312Jp0(this.h, jm);
        c1312Jp0.e = jf1;
        c1312Jp0.g = c3032br0;
        return c1312Jp0.invokeSuspend(Unit.a);
    }
}
