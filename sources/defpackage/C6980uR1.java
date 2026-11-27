package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: uR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6980uR1 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6980uR1(InterfaceC3770fO0 interfaceC3770fO0, int i) {
        super(0);
        this.d = i;
        this.e = interfaceC3770fO0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                break;
        }
        return ((Wd2) this.e.getValue()).getViewModelStore();
    }
}
