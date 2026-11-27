package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class R62 implements SJ0 {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public final RI0 a;

    @NotNull
    public final List<KTypeProjection> b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2920bK0.values().length];
            try {
                EnumC2920bK0 enumC2920bK0 = EnumC2920bK0.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC2920bK0 enumC2920bK1 = EnumC2920bK0.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC2920bK0 enumC2920bK2 = EnumC2920bK0.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public R62() {
        throw null;
    }

    public R62(@NotNull RI0 classifier, @NotNull List arguments) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.a = classifier;
        this.b = arguments;
    }

    @Override // defpackage.SJ0
    public final boolean a() {
        return false;
    }

    public final String c(boolean z) {
        String name;
        RI0 ri0 = this.a;
        RI0 ri1 = ri0 != null ? ri0 : null;
        Class clsG = ri1 != null ? C7279vr.g(ri1) : null;
        if (clsG == null) {
            name = ri0.toString();
        } else if (clsG.isArray()) {
            if (clsG.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (clsG.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (clsG.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (clsG.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (clsG.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (clsG.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (clsG.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else {
                name = clsG.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
            }
        } else if (z && clsG.isPrimitive()) {
            Intrinsics.c(ri0, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = C7279vr.h(ri0).getName();
        } else {
            name = clsG.getName();
        }
        return C2629a1.b(name, this.b.isEmpty() ? "" : CollectionsKt.J(this.b, ", ", "<", ">", new C4421iV0(this, 1), 24), "");
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof R62)) {
            return false;
        }
        R62 r62 = (R62) obj;
        return Intrinsics.a(this.a, r62.a) && Intrinsics.a(this.b, r62.b);
    }

    @Override // defpackage.SJ0
    @NotNull
    public final List<KTypeProjection> f() {
        return this.b;
    }

    @Override // defpackage.SJ0
    @NotNull
    public final InterfaceC4853kJ0 g() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + C5491nL.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        return c(false) + " (Kotlin reflection is not available)";
    }
}
