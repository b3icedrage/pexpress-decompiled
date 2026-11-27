package defpackage;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ua0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2127Ua0 {

    @NotNull
    public static final List<CL0> a;

    static {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(CL0.class, CL0.class.getClassLoader());
        Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(it, it.classLoader)");
        a = CollectionsKt.e0(serviceLoaderLoad);
    }
}
