package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FH0 {
    public static final void a(@NotNull AbstractC5267mG0 json, @NotNull IH0 sb, @NotNull RJ0 serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        EnumC3852fl2 mode = EnumC3852fl2.OBJ;
        VG0[] modeReuseCache = new VG0[EnumC3852fl2.l.b()];
        Intrinsics.checkNotNullParameter(sb, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        C7577xG0 c7577xG0 = json.a;
        new C3783fS1(new C7789yH(sb), json, mode, modeReuseCache).f(serializer, obj);
    }
}
