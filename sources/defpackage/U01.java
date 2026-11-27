package defpackage;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class U01 {

    @NotNull
    public static final U01 a = new U01();

    @NotNull
    public static final a b = new a(null, null, null);

    @Nullable
    public static a c;

    public static final class a {

        @Nullable
        public final Method a;

        @Nullable
        public final Method b;

        @Nullable
        public final Method c;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }
}
