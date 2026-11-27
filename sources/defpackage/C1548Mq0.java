package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1548Mq0 {
    @Nullable
    public static final C4651jM a(@NotNull InterfaceC1393Kq0 interfaceC1393Kq0) {
        Intrinsics.checkNotNullParameter(interfaceC1393Kq0, "<this>");
        InterfaceC2586Zn0 interfaceC2586Zn0A = interfaceC1393Kq0.a();
        List<String> list = C1159Hq0.a;
        String str = interfaceC2586Zn0A.get("Content-Type");
        if (str == null) {
            return null;
        }
        C4651jM c4651jM = C4651jM.e;
        return C4651jM.b.a(str);
    }

    @Nullable
    public static final C4651jM b(@NotNull InterfaceC1471Lq0 interfaceC1471Lq0) {
        Intrinsics.checkNotNullParameter(interfaceC1471Lq0, "<this>");
        C3441do0 c3441do0A = interfaceC1471Lq0.a();
        List<String> list = C1159Hq0.a;
        String strF = c3441do0A.f("Content-Type");
        if (strF == null) {
            return null;
        }
        C4651jM c4651jM = C4651jM.e;
        return C4651jM.b.a(strF);
    }
}
