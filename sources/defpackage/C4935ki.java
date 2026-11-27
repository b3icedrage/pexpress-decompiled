package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4935ki implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C4935ki(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                PA0 pa0 = (PA0) ((C3027bp1) this.e).d;
                InterfaceC3208ci interfaceC3208ci = ((C5358mi) this.g).d;
                if (pa0 != null) {
                    interfaceC3208ci.e(pa0);
                }
                interfaceC3208ci.b();
                return Unit.a;
            default:
                AbstractC4300hu1 abstractC4300hu1 = (AbstractC4300hu1) this.e;
                abstractC4300hu1.getClass();
                InterfaceC1442Lg1 interfaceC1442Lg1 = (InterfaceC1442Lg1) this.g;
                Intrinsics.checkNotNullParameter(interfaceC1442Lg1, "<this>");
                return new AbstractC4300hu1.a(interfaceC1442Lg1.a(abstractC4300hu1));
        }
    }
}
