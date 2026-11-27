package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", f = "HttpRedirect.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT, 69}, m = "invokeSuspend")
public final class C2439Xq0 extends AW1 implements InterfaceC1060Gj0<JF1, C3032br0, JM<? super C2250Vp0>, Object> {
    public int d;
    public /* synthetic */ JF1 e;
    public /* synthetic */ C3032br0 g;
    public final /* synthetic */ C2253Vq0 h;
    public final /* synthetic */ C1782Pp0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2439Xq0(C2253Vq0 c2253Vq0, C1782Pp0 c1782Pp0, JM<? super C2439Xq0> jm) {
        super(3, jm);
        this.h = c2253Vq0;
        this.i = c1782Pp0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C3032br0 c3032br0;
        JF1 jf1;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            JF1 jf2 = this.e;
            c3032br0 = this.g;
            this.e = jf2;
            this.g = c3032br0;
            this.d = 1;
            Object objA = jf2.a(c3032br0, this);
            if (objA != mn) {
                jf1 = jf2;
                obj = objA;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        c3032br0 = this.g;
        JF1 jf3 = this.e;
        C1795Pt1.b(obj);
        jf1 = jf3;
        C3032br0 c3032br1 = c3032br0;
        C2250Vp0 c2250Vp0 = (C2250Vp0) obj;
        this.h.getClass();
        if (!C2517Yq0.a.contains(c2250Vp0.c().G())) {
            return c2250Vp0;
        }
        C2253Vq0.b bVar = C2253Vq0.a;
        this.e = null;
        this.g = null;
        this.d = 2;
        Object objC = C2253Vq0.b.c(bVar, jf1, c3032br1, c2250Vp0, this.i, this);
        return objC == mn ? mn : objC;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(JF1 jf1, C3032br0 c3032br0, JM<? super C2250Vp0> jm) {
        C2439Xq0 c2439Xq0 = new C2439Xq0(this.h, this.i, jm);
        c2439Xq0.e = jf1;
        c2439Xq0.g = c3032br0;
        return c2439Xq0.invokeSuspend(Unit.a);
    }
}
