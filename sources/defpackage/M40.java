package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class M40 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC5331mb0 c;

    public /* synthetic */ M40(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase = (InterfaceC1767Pk0) this.b.get();
                InterfaceC6065q40 duoAuthCallbacks = (InterfaceC6065q40) ((C2949bU) this.c).get();
                Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
                Intrinsics.checkNotNullParameter(duoAuthCallbacks, "duoAuthCallbacks");
                return new L40(getCodeIfNeededFromDuoAuthUseCase, duoAuthCallbacks);
            default:
                return new K41((C4923kf) this.b.get(), (Context) ((C6) this.c).get());
        }
    }
}
