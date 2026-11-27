package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AB1 {
    public static final AB1 a;

    public static final class a extends AB1 {
    }

    public static final class b extends AB1 {
        @Override // defpackage.AB1
        @NotNull
        public final Object a(@NotNull Method method, @NotNull Object proxy, @NotNull Object[]... args) throws Throwable {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(InterfaceC5125ld.class, "declaringClass");
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(args, "args");
            Constructor constructor = C4633jG.b().getDeclaredConstructor(Class.class, Integer.TYPE);
            Intrinsics.checkNotNullExpressionValue(constructor, "constructor");
            constructor.setAccessible(true);
            Object objInvokeWithArguments = C6480s30.b(constructor.newInstance(InterfaceC5125ld.class, -1)).unreflectSpecial(method, InterfaceC5125ld.class).bindTo(proxy).invokeWithArguments(args);
            Intrinsics.checkNotNullExpressionValue(objInvokeWithArguments, "constructor.newInstance(…invokeWithArguments(args)");
            return objInvokeWithArguments;
        }

        @Override // defpackage.AB1
        public final boolean b(@NotNull Method method) {
            Intrinsics.checkNotNullParameter(method, "method");
            return method.isDefault();
        }
    }

    static {
        AB1 aVar;
        try {
            Class.forName("java.util.Optional");
            aVar = new b();
        } catch (ClassNotFoundException unused) {
            aVar = new a();
        }
        a = aVar;
    }

    @NotNull
    public Object a(@NotNull Method method, @NotNull Object proxy, @NotNull Object[]... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(InterfaceC5125ld.class, "declaringClass");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException();
    }

    public boolean b(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return false;
    }
}
