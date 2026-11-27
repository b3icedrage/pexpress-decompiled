package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1783Pp1 {

    @NotNull
    public static final Set<Class<?>> a;

    static {
        Class[] elements = {Integer.class, Character.class, Byte.class, Long.class, Short.class, Boolean.class, Double.class, Float.class, int[].class, char[].class, byte[].class, long[].class, short[].class, boolean[].class, double[].class, float[].class, Class.class, String.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
    }
}
