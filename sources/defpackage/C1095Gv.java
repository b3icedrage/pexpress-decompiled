package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1095Gv extends C6132qO1 {
    public static final /* synthetic */ int l = 0;

    @Nullable
    public static final InterfaceC2076Tj0 a(@NotNull InterfaceC2076Tj0 functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        C5638o21 name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (b(name)) {
            return (InterfaceC2076Tj0) C4900kZ.b(functionDescriptor, C0939Ev.e);
        }
        return null;
    }

    public static boolean b(@NotNull C5638o21 c5638o21) {
        Intrinsics.checkNotNullParameter(c5638o21, "<this>");
        return C6132qO1.e.contains(c5638o21);
    }
}
