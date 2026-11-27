package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0939Ev implements Function1 {
    public static final C0939Ev e = new C0939Ev(0);
    public static final C0939Ev g = new C0939Ev(1);
    public final /* synthetic */ int d;

    public /* synthetic */ C0939Ev(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC1490Lx it = (InterfaceC1490Lx) obj;
                int i = C1095Gv.l;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(CollectionsKt.z(C6132qO1.f, C3689f01.b(it)));
            default:
                InterfaceC3765fM1 selectMostSpecificInEachOverridableGroup = (InterfaceC3765fM1) obj;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
        }
    }
}
