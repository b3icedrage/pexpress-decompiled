package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HI0 {

    @NotNull
    public static final c a = new c(DI0.BOOLEAN);

    @NotNull
    public static final c b = new c(DI0.CHAR);

    @NotNull
    public static final c c = new c(DI0.BYTE);

    @NotNull
    public static final c d = new c(DI0.SHORT);

    @NotNull
    public static final c e = new c(DI0.INT);

    @NotNull
    public static final c f = new c(DI0.FLOAT);

    @NotNull
    public static final c g = new c(DI0.LONG);

    @NotNull
    public static final c h = new c(DI0.DOUBLE);

    public static final class a extends HI0 {

        @NotNull
        public final HI0 i;

        public a(@NotNull HI0 elementType) {
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.i = elementType;
        }
    }

    public static final class b extends HI0 {

        @NotNull
        public final String i;

        public b(@NotNull String internalName) {
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            this.i = internalName;
        }
    }

    public static final class c extends HI0 {

        @Nullable
        public final DI0 i;

        public c(@Nullable DI0 di0) {
            this.i = di0;
        }
    }

    @NotNull
    public final String toString() {
        return II0.c(this);
    }
}
