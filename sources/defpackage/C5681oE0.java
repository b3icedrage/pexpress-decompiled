package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5681oE0 {

    @NotNull
    public final HO0 a;

    public C5681oE0(@NotNull HO0 packageFragmentProvider) {
        JE0.a javaResolverCache = JE0.a;
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.a = packageFragmentProvider;
    }

    @Nullable
    public final FC a(@NotNull InterfaceC2902bE0 javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        C1758Ph0 c1758Ph0C = javaClass.c();
        if (c1758Ph0C != null) {
            OP0[] op0Arr = OP0.d;
        }
        C7065up1 c7065up1T = javaClass.t();
        if (c7065up1T != null) {
            FC fcA = a(c7065up1T);
            QY0 qy0E0 = fcA != null ? fcA.E0() : null;
            InterfaceC5044lD interfaceC5044lDF = qy0E0 != null ? qy0E0.f(javaClass.getName(), S41.l) : null;
            if (interfaceC5044lDF instanceof FC) {
                return (FC) interfaceC5044lDF;
            }
        } else if (c1758Ph0C != null) {
            C1758Ph0 c1758Ph0E = c1758Ph0C.e();
            Intrinsics.checkNotNullExpressionValue(c1758Ph0E, "parent(...)");
            GO0 go0 = (GO0) CollectionsKt.firstOrNull(this.a.a(c1758Ph0E));
            if (go0 != null) {
                Intrinsics.checkNotNullParameter(javaClass, "jClass");
                KO0 ko0 = go0.n.d;
                ko0.getClass();
                Intrinsics.checkNotNullParameter(javaClass, "javaClass");
                return ko0.v(javaClass.getName(), javaClass);
            }
        }
        return null;
    }
}
