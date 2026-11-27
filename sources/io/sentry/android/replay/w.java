package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.EnumC4403iP0;
import defpackage.ML0;
import defpackage.XO0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class w {

    @NotNull
    public static final Object a;

    @NotNull
    public static final Object b;

    @NotNull
    public static final Object c;

    public static final class a extends ML0 implements Function0<Field> {
        public static final a d = new a(0);

        /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() throws NoSuchFieldException {
            Class cls = (Class) w.a.getValue();
            if (cls == null) {
                return null;
            }
            Field declaredField = cls.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    public static final class b extends ML0 implements Function0<Class<?>> {
        public static final b d = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Class<?> invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static final class c extends ML0 implements Function0<Object> {
        public static final c d = new c(0);

        /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class cls = (Class) w.a.getValue();
            if (cls == null || (method = cls.getMethod("getInstance", new Class[0])) == null) {
                return null;
            }
            return method.invoke(null, new Object[0]);
        }
    }

    static {
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.e;
        a = XO0.a(enumC4403iP0, b.d);
        b = XO0.a(enumC4403iP0, c.d);
        c = XO0.a(enumC4403iP0, a.d);
    }
}
