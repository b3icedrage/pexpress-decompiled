package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1017Fv implements Function1 {
    public static final C1017Fv e = new C1017Fv(0);
    public static final C1017Fv g = new C1017Fv(1);
    public static final C1017Fv h = new C1017Fv(2);
    public final /* synthetic */ int d;

    public /* synthetic */ C1017Fv(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.d) {
            case 0:
                InterfaceC1490Lx it = (InterfaceC1490Lx) obj;
                int i = C1095Gv.l;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof InterfaceC2076Tj0) {
                    if (CollectionsKt.z(C6132qO1.f, C3689f01.b(it))) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ParameterizedType it2 = (ParameterizedType) obj;
                List<RI0<? extends Object>> list = C4753jp1.a;
                Intrinsics.checkNotNullParameter(it2, "it");
                Type ownerType = it2.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 2:
                InterfaceC0671Bj1 selectMostSpecificInEachOverridableGroup = (InterfaceC0671Bj1) obj;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            default:
                return (InterfaceC1490Lx) obj;
        }
    }
}
