package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3962gI0 implements Function1 {
    public static final C3962gI0 e = new C3962gI0(0);
    public static final C3962gI0 g = new C3962gI0(1);
    public final /* synthetic */ int d;

    public /* synthetic */ C3962gI0(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                S01 module = (S01) obj;
                C4172hI0.a aVar = C4172hI0.d;
                Intrinsics.checkNotNullParameter(module, "module");
                List<InterfaceC2392Xa1> listO = module.A0(C4172hI0.f).O();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listO) {
                    if (obj2 instanceof InterfaceC8132zv) {
                        arrayList.add(obj2);
                    }
                }
                return (InterfaceC8132zv) CollectionsKt.F(arrayList);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return Boolean.valueOf(simpleName.length() == 0);
        }
    }
}
