package defpackage;

import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OD0 {

    @Nullable
    public static a a;

    public static final class a {

        @Nullable
        public final Method a;

        @Nullable
        public final Method b;

        @Nullable
        public final Method c;

        @Nullable
        public final Method d;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3, @Nullable Method method4) {
            this.a = method;
            this.b = method2;
            this.c = method3;
            this.d = method4;
        }
    }

    public static a a() {
        a aVar;
        a aVar2 = a;
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            aVar = new a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            aVar = new a(null, null, null, null);
        }
        a = aVar;
        return aVar;
    }
}
