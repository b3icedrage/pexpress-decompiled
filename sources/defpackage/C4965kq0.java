package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4965kq0 {

    @NotNull
    public static final C2498Yk<InterfaceC2576Zk> a = new C2498Yk<>("ApplicationPluginRegistry");

    @NotNull
    public static final Object a(@NotNull C1782Pp0 c1782Pp0) {
        C6860tr0.d plugin = C6860tr0.b;
        Intrinsics.checkNotNullParameter(c1782Pp0, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Object objB = b(c1782Pp0, plugin);
        if (objB != null) {
            return objB;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + C6860tr0.c + ")` in client config first.");
    }

    @Nullable
    public static final <B, F> F b(@NotNull C1782Pp0 c1782Pp0, @NotNull InterfaceC4755jq0<? extends B, F> plugin) {
        Intrinsics.checkNotNullParameter(c1782Pp0, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        InterfaceC2576Zk interfaceC2576Zk = (InterfaceC2576Zk) c1782Pp0.m.e(a);
        if (interfaceC2576Zk != null) {
            return (F) interfaceC2576Zk.e(plugin.getKey());
        }
        return null;
    }
}
