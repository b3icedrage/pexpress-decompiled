package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KY {

    public static final class a extends KY {

        @NotNull
        public static final a a = new a();
        public static final int b;

        static {
            LY.a aVar = LY.c;
            aVar.getClass();
            int i = LY.k;
            aVar.getClass();
            int i2 = LY.i;
            aVar.getClass();
            b = (~(LY.j | i2)) & i;
        }

        @Override // defpackage.KY
        public final int a() {
            return b;
        }
    }

    public static final class b extends KY {

        @NotNull
        public static final b a = new b();

        @Override // defpackage.KY
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
