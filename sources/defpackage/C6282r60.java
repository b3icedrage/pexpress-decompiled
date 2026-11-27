package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: r60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6282r60 implements InterfaceC2131Ub1 {

    @NotNull
    public static final C6282r60 c = new C6282r60();

    @Override // defpackage.InterfaceC7404wS1
    @NotNull
    public final Set<Map.Entry<String, List<String>>> a() {
        return C6702t60.d;
    }

    @Override // defpackage.InterfaceC7404wS1
    public final void b(@NotNull Function2<? super String, ? super List<String>, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        InterfaceC7404wS1.a.a(this, body);
    }

    @Override // defpackage.InterfaceC7404wS1
    public final boolean c() {
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof InterfaceC2131Ub1) && ((InterfaceC2131Ub1) obj).isEmpty();
    }

    @Override // defpackage.InterfaceC7404wS1
    public final boolean isEmpty() {
        return true;
    }

    @NotNull
    public final String toString() {
        return "Parameters " + C6702t60.d;
    }
}
