package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6072q6 implements InterfaceC5862p6 {

    @NotNull
    public final C1699On1 a;

    /* JADX INFO: renamed from: q6$a */
    @InterfaceC3368dU(c = "com.base.feature.activation.providers.ActivationStateProviderBase$currentActivationState$1", f = "ActivationStateProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<Boolean, C6106qG, Boolean, JM<? super AbstractC5652o6>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        public a(JM<? super a> jm) {
            super(4, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            boolean z = this.d;
            boolean z2 = this.e;
            C6072q6 c6072q6 = C6072q6.this;
            if (z && z2) {
                return new AbstractC5652o6.a(c6072q6.b());
            }
            return z2 ? new AbstractC5652o6.b(c6072q6.b()) : new AbstractC5652o6.c();
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(Boolean bool, C6106qG c6106qG, Boolean bool2, JM<? super AbstractC5652o6> jm) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = C6072q6.this.new a(jm);
            aVar.d = zBooleanValue;
            aVar.e = zBooleanValue2;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public C6072q6(@NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = C4466ii.E(C4466ii.k(appDataRepository.e, appDataRepository.c, new C4250hg0(appDataRepository.d, 0), new a(null)), C3784fT.a, IK1.a.a, null);
    }

    @Override // defpackage.InterfaceC5862p6
    @NotNull
    public final C1699On1 a() {
        return this.a;
    }

    @NotNull
    public String b() {
        throw null;
    }
}
