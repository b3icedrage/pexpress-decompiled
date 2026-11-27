package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PD0 {

    @NotNull
    public static final PD0 a = new PD0();

    @Nullable
    public static a b;

    public static final class a {

        @Nullable
        public final Method a;

        @Nullable
        public final Method b;

        public a(@Nullable Method method, @Nullable Method method2) {
            this.a = method;
            this.b = method2;
        }
    }

    @NotNull
    public static a a(@NotNull Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), C4753jp1.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }
}
