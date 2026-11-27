package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1299Jl implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C1299Jl(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC4358iA0 initializeExecutorUseCase = (InterfaceC4358iA0) this.b.get();
                Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
                return new C1221Il(initializeExecutorUseCase);
            case 1:
                return new C8074ze1((C4923kf) this.b.get());
            default:
                return new C6356rT1((US1) this.b.get());
        }
    }
}
