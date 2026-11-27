package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5233m60 implements InterfaceC2586Zn0 {

    @NotNull
    public static final C5233m60 c = new C5233m60();

    @Override // defpackage.InterfaceC7404wS1
    @NotNull
    public final Set<Map.Entry<String, List<String>>> a() {
        return C6702t60.d;
    }

    @Override // defpackage.InterfaceC7404wS1
    public final void b(@NotNull Function2<? super String, ? super List<String>, Unit> function2) {
        C7824yS1 body = (C7824yS1) function2;
        Intrinsics.checkNotNullParameter(body, "body");
        InterfaceC7404wS1.a.a(this, body);
    }

    @Override // defpackage.InterfaceC7404wS1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC7404wS1
    @Nullable
    public final String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @NotNull
    public final String toString() {
        return "Headers " + C6702t60.d;
    }
}
