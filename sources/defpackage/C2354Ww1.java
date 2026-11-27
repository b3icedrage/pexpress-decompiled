package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Ww1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2354Ww1 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2354Ww1(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            case 1:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            default:
                return (Wd2) ((C0938Eu1) this.e).invoke();
        }
    }
}
