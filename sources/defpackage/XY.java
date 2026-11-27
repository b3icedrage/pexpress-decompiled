package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class XY {

    @NotNull
    public static final C2964bZ a;

    @NotNull
    public static final C2964bZ b;

    @NotNull
    public static final C2964bZ c;

    public static final class a {
        @NotNull
        public static C2964bZ a(@NotNull Function1 changeOptions) {
            Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
            C3802fZ c3802fZ = new C3802fZ();
            changeOptions.invoke(c3802fZ);
            c3802fZ.a = true;
            return new C2964bZ(c3802fZ);
        }
    }

    public interface b {

        public static final class a implements b {

            @NotNull
            public static final a a = new a();

            @Override // XY.b
            public final void a(@NotNull Xc2 parameter, int i, int i2, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (i != i2 - 1) {
                    builder.append(", ");
                }
            }

            @Override // XY.b
            public final void b(@NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append("(");
            }

            @Override // XY.b
            public final void c(@NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append(")");
            }

            @Override // XY.b
            public final void d(@NotNull Xc2 parameter, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
            }
        }

        void a(@NotNull Xc2 xc2, int i, int i2, @NotNull StringBuilder sb);

        void b(@NotNull StringBuilder sb);

        void c(@NotNull StringBuilder sb);

        void d(@NotNull Xc2 xc2, @NotNull StringBuilder sb);
    }

    static {
        a.a(MY.e);
        a.a(OY.e);
        a.a(PY.e);
        a.a(QY.e);
        a.a(RY.e);
        a.a(SY.e);
        a = a.a(TY.e);
        a.a(UY.d);
        b = a.a(VY.d);
        c = a.a(WY.e);
        a.a(NY.e);
    }
}
