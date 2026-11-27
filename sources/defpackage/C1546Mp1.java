package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1546Mp1 {
    /* JADX WARN: Type inference failed for: r1v3, types: [fO0, java.lang.Object] */
    @Nullable
    public static final Field a(@NotNull IJ0<?> ij0) {
        Intrinsics.checkNotNullParameter(ij0, "<this>");
        OJ0<?> oj0C = C7437wc2.c(ij0);
        if (oj0C != null) {
            return (Field) oj0C.m.getValue();
        }
        return null;
    }

    @Nullable
    public static final Method b(@NotNull InterfaceC6325rJ0<?> interfaceC6325rJ0) {
        InterfaceC2355Wx<?> interfaceC2355WxI;
        Intrinsics.checkNotNullParameter(interfaceC6325rJ0, "<this>");
        PI0 pi0A = C7437wc2.a(interfaceC6325rJ0);
        Member memberC = (pi0A == null || (interfaceC2355WxI = pi0A.i()) == null) ? null : interfaceC2355WxI.c();
        if (memberC instanceof Method) {
            return (Method) memberC;
        }
        return null;
    }
}
